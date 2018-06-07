package com.example.admin.broadcastreceiverandroid;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SingAsongReceiver singAsongReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singAsongReceiver = new SingAsongReceiver();
        IntentFilter intentFilter = new IntentFilter("singASong");
        registerReceiver(singAsongReceiver, intentFilter);

    }

    public void singASong(View view) {
        Intent intent = new Intent();
        intent.setAction("singASong");
        sendBroadcast(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (singAsongReceiver != null) {
            unregisterReceiver(singAsongReceiver);
        }

    }
}
