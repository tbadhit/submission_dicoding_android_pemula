package com.tbadhit.submissionandroidpemuladicoding.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tbadhit.submissionandroidpemuladicoding.R

class DetailPhoneActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_phone)

        val imgItemPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvName: TextView =  findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)

        val img = intent.getIntExtra(EXTRA_IMAGE, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        Glide.with(this)
            .load(img)
            .apply(RequestOptions())
            .into(imgItemPhoto)

        tvName.text = name
        tvDetail.text = detail

        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}