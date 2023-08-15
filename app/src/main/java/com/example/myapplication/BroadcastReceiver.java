//package com.example.myapplication;
//
//import android.content.Context;
//import android.content.Intent;
//import android.util.Log;
//import android.widget.Toast;
//
//import com.google.android.material.snackbar.Snackbar;
//
//public class BroadcastReceiver extends android.content.BroadcastReceiver {
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        if(intent.getAction().equals("com.ingenico.template")){
//            String data = intent.getStringExtra("State");
////            String a = intent.getAction();
//            Log.d("my app","hey hey hey");
//            Log.i("myapp", "Data received: "+data);
//            Toast.makeText(context,data, Toast.LENGTH_LONG).show();
//        }
//    }
//}
