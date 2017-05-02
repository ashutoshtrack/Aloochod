package com.example.ashutosh.aloochod;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ashutosh on 5/1/2017.
 */

/*public class MyDBHandler extends SQLiteOpenHelper {

    public static  final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ReminderTasks.db";
    public static final String TABLE_TASKS = "Tasks";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TASKSNAME = "_papu";



    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE"+TABLE_TASKS+"("+COLUMN_ID+"INTEGER PRIMARY KEY AUTOINCREMENT"
        +COLUMN_TASKSNAME+"TEXT"+");";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP_TABLE_IF_EXISTS" + TABLE_TASKS);
            onCreate(db);
    }

  /*  public void addtask(Gazar gazar){
        ContentValues val = new ContentValues();
        val.put(COLUMN_TASKSNAME,gazar.get_papu());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_TASKS,null,val);
        db.close();

    }

    public void deletetask(String gazarmata){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM"+TABLE_TASKS+"WHERE"+COLUMN_TASKSNAME+ "=\""+gazarmata+"\";" );
    }
    public String dbtoaStr(){

        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();

        String query = "SELECT * FROM" + TABLE_TASKS+"WHERE 1";
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();

        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("gazarmata"))!=null)
            {
                dbString += c.getString(c.getColumnIndex("gazarmata"));
                dbString += "\n";
            }
        }
        db.close();
        return dbString;

    }

}*/
