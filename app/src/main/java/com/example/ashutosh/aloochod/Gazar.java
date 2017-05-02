package com.example.ashutosh.aloochod;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.StringDef;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by Ashutosh on 4/30/2017.
 */

public class Gazar extends BroadcastReceiver {
    String s ;
  /* private int _id;
    private String _papu;
    MyDBHandler mydbhandler;

    public Gazar(){


    }


    public  Gazar(String papu){
        this._papu = papu;
    }

    public int get_id() {
        return _id;
    }

    public String get_papu() {
        return _papu;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_papu(String _papu) {
        this._papu = _papu;
    }
*/


    @Override
    public void onReceive(Context context, Intent intent) {


        NotificationManagerCompat myManager = NotificationManagerCompat.from(context);
        NotificationCompat.Builder myNoti = new NotificationCompat.Builder(context);
        myNoti.setContentText("go");
        myNoti.setContentTitle("hello");
        myNoti.setSmallIcon(R.drawable.tasks);
        myNoti.setAutoCancel(true);
        myNoti.setTicker("dder");
        myNoti.build();
       // myNoti.setContentIntent(pidi);
        myManager.notify(1,myNoti.build());


    }
    public void getData(String data){
        s=data;
        Log.v("Dtaa","What "+data);
    }

   /* private String getdata() {
     return mydbhandler.dbtoaStr();

    }
*/

    //private void createnotification(Context context, String timesup, String s, String alert) {
        //PendingIntent pidi =
    // PendingIntent.getActivity(context,1,new Intent(context,MainActivity.class),0);

    //createnotification(context,"timesup","state","crox");



    //}


}
