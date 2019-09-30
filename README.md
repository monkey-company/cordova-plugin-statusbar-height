# Ionic Cordova Statusbar Height Plugin

Get statusbar height in px.

**forked from entom/cordova-plugin-statusbar-height**

Fix phonegap build

## Using
    
Install the plugin

    $ cd your_project_name
    $ cordova plugin add https://github.com/monkey-company/cordova-plugin-statusbar-height.git
    
Edit `config.xml`

```xml
<plugin name="info.entom.cordova-plugin-statusbar-height" spec="https://github.com/monkey-company/cordova-plugin-statusbar-height.git" />
```

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling Plugin");
    }

    clearnotification.clear(100, success, failure);
```
