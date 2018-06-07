package com.example.admin.broadcastreceiverandroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * The type Sing asong receiver.
 */
public class SingAsongReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (intent.getAction()) {
            case "singASong":
                Toast.makeText(context, "sing a song", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
