package org.kane.plugin.hello;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;


public class HelloWorld extends CordovaPlugin {

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    	
        Activity activity = this.cordova.getActivity();
        
        if (action.equals("getExtra")) {
        
        	Intent i = activity.getIntent();
            
        	if ( i.hasExtra(Intent.EXTRA_TEXT) ) {
            
        		//callbackContext.success(i.getStringExtra(Intent.EXTRA_TEXT));
        		callbackContext.success("hello world successed.");
            
        	} else {
            
        		callbackContext.error("hello world failed.");
            
        	}
            
        	return true;
        
        }
        
        return false;
    
    }
}
