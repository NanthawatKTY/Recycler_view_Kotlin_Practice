package com.example.recycler_view_kotlin_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_conduit.view.*

class ConduitAdapter (var conduits: List<Conduits>):RecyclerView.Adapter<ConduitAdapter.ConduitViewHolder>() {
    inner class ConduitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConduitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_conduit, parent,false)
        return ConduitViewHolder(view)
    }

    override fun onBindViewHolder(holder: ConduitViewHolder, position: Int) {
        holder.itemView.apply {
            tvTitleType.text = conduits[position].title_type
            tvTitleSize.text = conduits[position].title_size.toString()
            tvTitleAmount.text = conduits[position].title_amount.toString()
        }
    }

    override fun getItemCount(): Int {
        return conduits.size
    }
}