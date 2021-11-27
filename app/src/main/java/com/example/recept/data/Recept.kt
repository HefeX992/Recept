package com.example.recept.data

import androidx.room.ColumnInfo
import androidx.room.Entity


import androidx.room.PrimaryKey
import androidx.room.TypeConverter


@Entity(tableName = "recept")
data class Recept(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) var id: Long? = null,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "time") var time: Int,
  //  @ColumnInfo(name = "indegredients") var indegredients: MutableList<String>,
  //  @ColumnInfo(name = "howto") var howto: MutableList<String>,
    @ColumnInfo(name = "comment") var comment: String,
    @ColumnInfo(name = "image") var image: Int,
    @ColumnInfo(name = "fav") var fav: Boolean)
{




//    var name =""
//    var time =0
//    var indegredients: MutableList<String> = mutableListOf()
//    var howto: MutableList<String> = mutableListOf()
//    var comment = ""
//    var image = ""

//
//    fun addIndegredient(ind: String){
//        indegredients.add(ind)
//    }
//
//    fun addHowTo(how: String)
//    {
//        howto.add(how)
//    }
//
//    fun getIndegredient(ind: Int): String
//    {
//        return indegredients.get(ind)
//    }
//
//    fun getHowTo(ind: Int): String
//    {
//        return howto.get(ind)
//    }


}

class TypeConverters{

    fun getList()
    {

    }



}