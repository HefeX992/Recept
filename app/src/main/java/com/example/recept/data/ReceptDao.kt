package com.example.recept.data

import androidx.room.*

@Dao
interface ReceptDao {

    @Query("SELECT * FROM recept")
    fun getAll(): List<Recept>

    @Insert
    fun insert(recept: Recept): Long

    @Update
    fun update(recept: Recept)

    @Delete
    fun deleteItem(recept: Recept)
}