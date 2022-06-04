package com.example.sqliteex;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDB extends SQLiteOpenHelper {

    public static String DB_NAME = "contacts.db";
    public static String TABLE_NAME = "CONTACT";
    public static String COL1 = "ID";
    public static String COL2 = "Nom";
    public static String COL3 = "PRENOM";
    public static String COL4 = "mail";
    public static String COL5 = "tel";


    public MyDB(Context c){
        super(c,DB_NAME,null,2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table " + TABLE_NAME + "("+ COL1 +" integer primary key autoincrement, "
                +COL2+" TEXT,"
                +COL3+" TEXT,"
                +COL4+" TEXT,"
                +COL5+" TEXT)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE " + TABLE_NAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }

    public static long Insert_Contact(SQLiteDatabase sqLiteDatabase,Contact c){
        ContentValues content = new ContentValues();
        content.put(COL2, c.getNom());
        content.put(COL3, c.getPrenom());
        content.put(COL4, c.getMail());
        content.put(COL5, c.getTel());
        return sqLiteDatabase.insert(TABLE_NAME,null,content);
    }
}
