//package com.example.myapplication;
//
//import android.app.Service;
//import android.content.Intent;
//import android.os.IBinder;
//import android.os.RemoteException;
//import android.util.Log;
//
//public class AidlStatusService extends Service {
//    public AidlStatusService() {
//    }
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        // TODO: Return the communication channel to the service.
////        throw new UnsupportedOperationException("Not yet implemented");
//        return binder;
//    }
//    private final AidlStatusInterface.Stub binder = new AidlStatusInterface.Stub() {
//        @Override
//        public String getStatus() throws RemoteException {
//            Log.e("my app", "This is from main activity");
//            String a = "This is from main activity";
////            return getStatus()
//              return a;
//        }
//    };
//}