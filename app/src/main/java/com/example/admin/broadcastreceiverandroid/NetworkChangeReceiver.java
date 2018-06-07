package com.example.admin.broadcastreceiverandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * @author Hà Quang Trung
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created 6/7/2018
 * @updated 6/7/2018
 * @modified by
 * @updated on 6/7/2018
 * @since 1.0
 */
public class NetworkChangeReceiver extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Network is turned ON/OF", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onReceive: ");
    }
}
