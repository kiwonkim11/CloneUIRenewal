package com.example.cloneui

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cloneui.databinding.FoodRecyclerviewBinding
import java.text.DecimalFormat

class FoodAdapter (private val mFoods: MutableList<Food>) : RecyclerView.Adapter<FoodAdapter.Holder>() {

    interface FoodClick {
        fun onClick (view: View, position: Int)
    }
    val foodClick: FoodClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = FoodRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener{
            foodClick?.onClick(it, position)
        }

        holder.icon.setImageResource(mFoods[position].Image)
        holder.title.text = mFoods[position].Title
        holder.score.text ="${mFoods[position].Score}"
        holder.detail.text = mFoods[position].Detail
        holder.time.text = mFoods[position].Time
        holder.tip.text = mFoods[position].Tip

        val price = mFoods[position].MinPrice
        holder.minPrice.text = DecimalFormat("#,###").format(price) + "원"

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getItemCount(): Int {
        return mFoods.size
    }

    inner class Holder(private val binding: FoodRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root){
        val icon = binding.ivShop
        val title = binding.txtTitle
        val score = binding.txtScore
        val detail = binding.txtDetail
        val time = binding.txtTime
        val tip = binding.txtTip
        val minPrice = binding.txtMinprice
    }
}