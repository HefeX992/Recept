package com.example.recept.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Recept::class], version = 1)
abstract class ReceptDataBase : RoomDatabase() {
    abstract fun receptDao() : ReceptDao

    companion object{
        fun getDatabase(applicationContext: Context): ReceptDataBase {
            return Room.databaseBuilder(
                applicationContext,
                ReceptDataBase::class.java,
                "ReceptDB"
            ).build()
        }
    }
}