package info.entom.plugin;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.res.Resources;

public class Statusbarheight extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("read")) {
            int result = 0;
            int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId > 0) {
                result = getResources().getDimensionPixelSize(resourceId);
                result = (int) (result / Resources.getSystem().getDisplayMetrics().density);
            }

            String message = "{height: '"+result+"'}";
            callbackContext.success(message);

            return true;
        } else {
            return false;
        }
    }
}
