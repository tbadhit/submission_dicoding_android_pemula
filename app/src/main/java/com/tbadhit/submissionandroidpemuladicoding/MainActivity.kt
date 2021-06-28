package com.tbadhit.submissionandroidpemuladicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tbadhit.submissionandroidpemuladicoding.about.AboutActivity
import com.tbadhit.submissionandroidpemuladicoding.model.Phone
import com.tbadhit.submissionandroidpemuladicoding.model.PhoneData

class MainActivity : AppCompatActivity() {
    private lateinit var rvPhone: RecyclerView;
    private var list: ArrayList<Phone> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPhone = findViewById(R.id.rv_phone)
        rvPhone.setHasFixedSize(true)

        list.addAll(PhoneData.listData)

        showRecyclerCardView()
        supportActionBar?.title = "Home"
    }

    private fun showRecyclerCardView() {
        rvPhone.layoutManager = LinearLayoutManager(this)
        val cardViewPhoneAdapter = CardViewPhoneAdapter(list)
        rvPhone.adapter = cardViewPhoneAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.i_about -> {
                val iAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(iAbout)
            }
        }
    }
}