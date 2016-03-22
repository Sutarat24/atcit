package com.example.com1test.myapplication2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper {
    //ประกาศตัวแปร
    public static final String database_name = "Atc.db"; //ชื่อ database
    private static final int database_version = 1; //กำหนด version
    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key," +
            "User text," +
            "Password text," +
            "Name text);";//การสร้างตาราง userTABLE

    private static final String create_food_table = "create table foodTABLE (" +
            "_id integer primary key," +
            "Food text," +
            "price text," +
            "Source text);";//การสร้างตาราง foodTABLE



    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);

    }//constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_food_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//main class
