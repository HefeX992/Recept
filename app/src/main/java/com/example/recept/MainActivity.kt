package com.example.recept

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recept.data.Recept
import com.example.recept.data.ReceptAdapter
import com.example.recept.feature.ReceptClickListener

class MainActivity : AppCompatActivity(), ReceptClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<Recept>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
//            var rec = Recept("Rakottkrumpli"+i, 1, mutableListOf("a","b"), mutableListOf("z","y"),"",2)
            var rec = Recept(i.toLong(), "Rakottkrumpli"+i,2,"", 3,true)
            data.add(rec)
        }

        // This will pass the ArrayList to our Adapter
        val adapter = ReceptAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }

    override fun onClick(recept: Recept) {
//        val intent = Intent(applicationContext, DetailActivity::class.java)
//        intent.putExtra("RECEPT_ID_EXTRA", recept.id)
//        startActivity(intent)


    }
}
