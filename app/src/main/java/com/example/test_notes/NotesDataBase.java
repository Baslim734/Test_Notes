package com.example.test_notes;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * Created by Nikita Biryukov on 11.09.2021.
 */
@Database(entities = {Note.class}, version = 1 , exportSchema = false)
public abstract class NotesDataBase extends RoomDatabase {
    private static NotesDataBase database;
    private static final String DB_NAME = "notes2.db";
    public static final Object LOCK = new Object();

    public static NotesDataBase getInstance(Context context){
        synchronized(LOCK){
        if(database == null){
            database = Room.databaseBuilder(context, NotesDataBase.class, DB_NAME)
                    .build();
             }
        }
        return database;
  }
  public abstract NotesDao notesDao();
}
