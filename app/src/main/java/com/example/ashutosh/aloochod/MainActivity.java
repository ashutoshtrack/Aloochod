package com.example.ashutosh.aloochod;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlarmManager myAlarmManager;
    EditText talk;

    // MyDBHandler mydbhandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAlarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        talk =(EditText)findViewById(R.id.t1);
        //mydbhandler = new MyDBHandler(this,null,null,1);


    }

public String returnData(){
    return talk.getText().toString();
}

    public void startThis(View view) {
      
        String s1 = talk.getText().toString();
        String so =  new String(s1);
        so.replace(this.getString(R.string.gol),s1);


        Intent i1 = new Intent();
        i1.setAction("com.Ashu.gazar.reciever.Message");
        i1.addCategory("android.intent.category.DEFAULT");

        PendingIntent pid = PendingIntent.getBroadcast(this,1,i1,0);


        myAlarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),100*20,pid);



    }

    public void stopThis(View view) {
        Intent i1 = new Intent();
        i1.setAction("com.Ashu.gazar.reciever.Message");
        i1.addCategory("android.intent.category.DEFAULT");

//         String delte =  talk.getText().toString();
     //   mydbhandler.deletetask(delte);

        PendingIntent pid = PendingIntent.getBroadcast(this,1,i1,0);



        myAlarmManager.cancel(pid);
        Toast.makeText(this, "Stopped the Alarm", Toast.LENGTH_SHORT).show();

    }

  //  public void savu(View view) {
    //    Gazar gazar = new Gazar(talk.getText().toString());
      //  mydbhandler.addtask(gazar);

    //}
}
