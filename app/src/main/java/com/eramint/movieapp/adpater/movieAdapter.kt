package com.eramint.movieapp.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eramint.movieapp.databinding.MovieListRowBinding
import com.eramint.movieapp.model.MovieItem


class MovieAdapter(
    private var listener: ClickListener
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list = ArrayList<MovieItem>()

    override fun getItemCount(): Int {
        return list.size
    }

    fun setAppList(Offers: ArrayList<MovieItem>) {
        list.clear()
        list.addAll(Offers)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        (holder as RecyclerHolderCatIcon).bind(item)
        holder.itemView.setOnClickListener {v->
            listener.onRowClick(v,item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RecyclerHolderCatIcon(MovieListRowBinding.inflate(layoutInflater, parent, false))
    }

    interface ClickListener {
        fun onRowClick(v: View, MovieItem: MovieItem)
    }


    inner class RecyclerHolderCatIcon(private val binding: MovieListRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: MovieItem) {
            binding.listItem = movie
        }


    }
}