package com.example.lapormasyarakat.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.lapormasyarakat.dao.DatabaseDao;
import com.example.lapormasyarakat.model.ModelDatabase;


@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class   AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
