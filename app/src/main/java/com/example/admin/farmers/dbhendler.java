package com.example.admin.farmers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by daksh on 02/11/15.
 */
public class dbhendler extends SQLiteOpenHelper {

    private static String dbname="farmer.db";

    public dbhendler(Context context){
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String str1="create table user (user_id Integer PRIMARY KEY AUTOINCREMENT, first_name Text, last_name Text, mobile Text, address Text,Email Text, adhara_no Text,status Integer)";
        db.execSQL(str1);
        String str2="create table skills (id Integer PRIMARY KEY AUTOINCREMENT,skills Text,user_id Integer)";
        db.execSQL(str2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
