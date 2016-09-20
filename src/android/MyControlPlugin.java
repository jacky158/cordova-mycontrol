package com.younetco.support;

import android.content.Context;

import com.younetco.support.WebAppInterface;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PermissionHelper;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by namnv on 9/15/16.
 */
public class MyControlPlugin extends CordovaPlugin {
    private static final String TAG = "MyControlPlugin";
    CallbackContext context;
    static private WebAppInterface webAppInterface = new WebAppInterface();

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        // your init code here
    }

    // Used when instantiated via reflection by PluginManager
    public MyControlPlugin() {
    }
    // These can be used by embedders to allow Java-configuration of whitelists.
    public MyControlPlugin(Context context) {

    }


    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        context = callbackContext;
        if(action.equals("toggleLeftMenu"))
        {
            webAppInterface.toggleLeftMenu();
        }else if (action.equals("closeLeftMenu")){
            webAppInterface.closeLeftMenu();
        }else if(action.equals("openLeftMenu")){
            webAppInterface.openLeftMenu();
        }else if(action.equals("toggleRightMenu")){
            webAppInterface.toggleRightMenu();
        }else if(action.equals("openRightMenu")){
            webAppInterface.openRightMenu();
        }else if(action.equals("closeRightMenu")){
            webAppInterface.closeRightMenu();
        }else{
            return false;
        }
        return true;
    }
}
