package com.example.test_notes;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikita Biryukov on 11.09.2021.
 */

@Dao
public interface NotesDao {
    @Query("SELECT * FROM notes ORDER BY priority")
    List<Note> getAllNotes();

    @Insert
    void insertNote(Note note);

    @Delete
    void deleteNote(Note note);

    @Query("DELETE FROM notes")
    void deleteAllNotes();
}
