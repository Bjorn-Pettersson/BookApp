package com.example.sqlitebooklibraryapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sqlitebooklibraryapp.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var bookTitles = arrayOf("The four hour work week", "Pride and prejudice", "The butterfly effect", "Sapiens", "Rich dad Poor Dad", "The Stranger", "The plauge", "Pippi långstrump")
    private var authors = arrayOf("Tim Ferris", "Jane Austin", "Unknown", "Unknown", "Robert Kawasaki", "Kamys", "Kamys", "Astrid Lindgren")


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        // allows us to initilize the parameters form the xml cardview, by first passing in the finlated view, from onCreateViewHolder
        var bookTitle: TextView? = null
        var author: TextView? = null
        var btnAdd: Button? = null
        var btnDel: Button? = null

        init {
            this.bookTitle = itemView.findViewById(R.id.tvBookName)
            this.author = itemView.findViewById(R.id.tvAuthorName)
            //this.btnAdd = itemView.findViewById(R.id.btnAdd)
            this.btnDel = itemView.findViewById(R.id.btnDel)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the cardview and returns a viewholder object with the card view
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // populate our data to our cardview
        holder.bookTitle?.text = bookTitles[position]
        holder.author?.text = authors[position]
    }

    override fun getItemCount(): Int {
        // identiy how many items we are passing to our viewholder.
        return bookTitles.size
    }
}