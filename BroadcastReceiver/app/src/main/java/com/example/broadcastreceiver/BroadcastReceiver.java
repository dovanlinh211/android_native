package com.example.broadcastreceiver;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class BroadcastReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            if(isNetWorkAvaiable()){
                Toast.makeText(context, "Internet connected", Toast.LENGTH_SHORT).show();
            }

        }
    }

    private boolean isNetWorkAvaiable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService
    }
}
