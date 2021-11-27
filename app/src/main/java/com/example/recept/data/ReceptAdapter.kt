package com.example.recept.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recept.R
import android.widget.Toast
import androidx.test.core.app.ApplicationProvider

import androidx.test.core.app.ApplicationProvider.getApplicationContext




class ReceptAdapter (private val mList: List<Recept>) : RecyclerView.Adapter<ReceptAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val Recept = mList[position]

        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(Recept.image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = Recept.name

        holder.textView.setOnClickListener(View.OnClickListener {
            val toast = Toast.makeText(
                ApplicationProvider.getApplicationContext<Context>(),
                "Hello Javatpoint",
                Toast.LENGTH_SHORT
            )
            toast.setMargin(50f, 50f)
            toast.show()
        })


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}
