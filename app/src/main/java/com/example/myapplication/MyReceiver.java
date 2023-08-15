package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String data = intent.getStringExtra("Status");
        intent.getSerializableExtra("tag");
        //get gson string data
//        try {
//            JSONObject jsonObject = new JSONObject(data);
//
//        } catch (JSONException e) {
//            throw new RuntimeException(e);
//        }

        Toast.makeText(context,"User Cancelled",Toast.LENGTH_LONG).show();
        Toast.makeText(context,data, Toast.LENGTH_LONG).show();
    }
}