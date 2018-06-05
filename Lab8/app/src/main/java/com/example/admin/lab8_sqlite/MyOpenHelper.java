package com.example.admin.lab8_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Admin on 24.04.2018.
 */

public class MyOpenHelper extends SQLiteOpenHelper {
    public String TABLE_NAME ="first_table";
    public String FIELD_NAME_1 ="first_field";
    public String FIELD_NAME_2 ="second_field";
    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="create table "+ TABLE_NAME +
                " (_id integer primary key autoincrement, "+
                FIELD_NAME_1 +" TEXT, "+ FIELD_NAME_2 +" TEXT)";
                db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("MyLogs","|Upgrade"+db.toString());

    }
}
