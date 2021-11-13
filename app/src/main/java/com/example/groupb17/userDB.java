package com.example.groupb17;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class userDB extends SQLiteOpenHelper {
    public static final String DBNAME = "userData.db";
    public userDB(Context context) {
        super(context, "userData.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase userDatabase) {
        userDatabase.execSQL("create Table users(username TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase userDatabase, int i, int i1) {
        userDatabase.execSQL("drop Table if exists users");
    }

    public Boolean insertUserData(String username, String password){
        SQLiteDatabase userDatabase = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = userDatabase.insert("users", null, contentValues);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public Boolean usernameVerification (String username) {
        SQLiteDatabase userDatabase = this.getWritableDatabase();
        Cursor cursor = userDatabase.rawQuery("Select * from users where username = ?", new String[]{username});
        if (cursor.getCount() > 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean usernamePasswordVerification(String username, String password){
        SQLiteDatabase userDatabase = this.getWritableDatabase();
        Cursor cursor = userDatabase.rawQuery("Select * from users where username = ? and password = ?", new String[] {username,password});
        if(cursor.getCount()>0) {
            return true;
        }
        else {
            return false;
        }
    }
}





