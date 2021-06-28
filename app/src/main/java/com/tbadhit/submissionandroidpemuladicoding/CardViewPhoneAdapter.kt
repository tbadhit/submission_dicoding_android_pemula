package com.tbadhit.submissionandroidpemuladicoding

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tbadhit.submissionandroidpemuladicoding.detail.DetailPhoneActivity
import com.tbadhit.submissionandroidpemuladicoding.model.Phone

class CardViewPhoneAdapter(private val listPhone: ArrayList<Phone>) : RecyclerView.Adapter<CardViewPhoneAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_phone, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val phone = listPhone[position]
        Glide.with(holder.itemView.context)
            .load(phone.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text = phone.name
        holder.tvDetail.text = phone.detail

        val mContext = holder.itemView.context

        holder.btnDetail.setOnClickListener {
            val moveDetail = Intent(mContext, DetailPhoneActivity::class.java)
            moveDetail.putExtra(DetailPhoneActivity.EXTRA_IMAGE, phone.photo)
            moveDetail.putExtra(DetailPhoneActivity.EXTRA_NAME, phone.name)
            moveDetail.putExtra(DetailPhoneActivity.EXTRA_DETAIL, phone.detail)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listPhone.size
    }

}