package com.translaTOR;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final  int DATABASE_VERSION =1;
    public static final String DATABASE_NAME = "wordsBD";
    public static final String TABLE_EVENTS = "words";
    public static final String KEY_ID = "_id";
    public static final String KEY_ORIG = "orig";
    public static final String KEY_TRANS = "trans";

    public DBHelper(@Nullable Context context, @Nullable String name, int version) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ TABLE_EVENTS+"("+ KEY_ID
                +" integer primary key,"+KEY_ORIG+" text,"+KEY_TRANS+" text"+")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

}
