package com.example.groupb17;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// extend to SQLiteOpenHelper to create a Constructor
public class userDB extends SQLiteOpenHelper {
    //Create public static final String method for database
    public static final String DBNAME = "userData.db";
    //Include database name with CursorFactory as null and version 1 inside super
    public userDB(Context context) {
        super(context, "userData.db", null, 1);
    }
    //Method auto implemented as onCreate
    @Override
    public void onCreate(SQLiteDatabase userDatabase) {
        //Create a table for database
        userDatabase.execSQL("create Table users(username TEXT primary key, password TEXT)");
    }
    //Method auto implemented as onUpgrade
    @Override
    public void onUpgrade(SQLiteDatabase userDatabase, int i, int i1) {
        //Drop table when application is upgraded
        userDatabase.execSQL("drop Table if exists users");
    }
    // Write a public boolean method to insert Data to database
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
    // Write a public boolean method to check if username exist in database for registration
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
    // Write a public boolean method to check if username and password exist in database for login
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





