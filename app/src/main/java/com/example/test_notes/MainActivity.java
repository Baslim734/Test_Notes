package com.example.test_notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotes;
    private ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);
        notes.add(new Note("Test1", "Test Desc","day0", 9));
        notes.add(new Note("Test2", "Test Desc1","day1", 5));
        notes.add(new Note("Test3", "Test Desc2","day2", 4));
        notes.add(new Note("Test4", "Test Desc3","day3", 3));
        notes.add(new Note("Test5", "Test Desc4","day4", 2));
        notes.add(new Note("Test6", "Test Desc5","day5", 1));
        notes.add(new Note("Test7", "Test Desc6","day6", 6));
        notes.add(new Note("Test8", "Test Desc7","day7", 7));
        notes.add(new Note("Test9", "Test Desc8","day8", 8));
        notes.add(new Note("Test10", "Test Desc91","day9", 10));
        notes.add(new Note("Test11", "Test Desc2","day01", 9));
        notes.add(new Note("Test22", "Test Desc13","day11", 5));
        notes.add(new Note("Test33", "Test Desc24","day22", 4));
        notes.add(new Note("Test44", "Test Desc35","day33", 3));
        notes.add(new Note("Test55", "Test Desc46","day44", 2));
        notes.add(new Note("Test66", "Test Desc57","day55", 1));
        notes.add(new Note("Test77", "Test Desc68","day66", 6));
        notes.add(new Note("Test88", "Test Desc79","day77", 7));
        notes.add(new Note("Test99", "Test Desc80","day88", 8));
        notes.add(new Note("Test100", "Test Desc91","day99", 10));
        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new GridLayoutManager(this,3));
        recyclerViewNotes.setAdapter(adapter);
    }
}