package com.miguelsantos.livediobanco

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miguelsantos.livediobanco.model.MenuItem

class MenuItemAdapter : RecyclerView.Adapter<MenuItemAdapter.MenuItemViewHolder>() {

    private val list = mutableListOf<MenuItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MenuItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card_item, parent, false)
        )

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun setItemsList(list: List<MenuItem>) {
        this.list.clear()
        this.list.addAll(list)
    }

    inner class MenuItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dataSet: MenuItem) {
            itemView.findViewById<TextView>(R.id.txt_item_title).text = dataSet.title
            itemView.findViewById<ImageView>(R.id.image_item_icon).setImageResource(dataSet.icon)
        }
    }

}
