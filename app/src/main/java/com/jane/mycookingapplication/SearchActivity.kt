package com.jane.mycookingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SearchActivity : AppCompatActivity() {
    lateinit var imgbreak:ImageView
    lateinit var imgpetite:ImageView
    lateinit var imglunch:ImageView
    lateinit var imgdinner:ImageView
    lateinit var imgclose:ImageView
    lateinit var tvbreak:TextView
    lateinit var tvapetite:TextView
    lateinit var tvlunch:TextView
    lateinit var tvdinner:TextView
    lateinit var tvrecipe:TextView
    lateinit var tvmeals:TextView
    lateinit var tvfavorites:TextView
    lateinit var tvcuisines:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchrecipe)
        Search()
        imgclose.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun Search(){
        imgbreak = findViewById(R.id.imgbreak)
        imgpetite = findViewById(R.id.imgpetite)
        imglunch = findViewById(R.id.imglunch)
        imgdinner = findViewById(R.id.imgdinner)
        tvbreak = findViewById(R.id.tvbreak)
        tvapetite = findViewById(R.id.tvapetite)
        tvlunch = findViewById(R.id.tvlunch)
        tvdinner = findViewById(R.id.tvdinner)
        tvrecipe = findViewById(R.id.tvrecipe)
        tvmeals = findViewById(R.id.tvmeals)
        tvfavorites = findViewById(R.id.tvfavorites)
        tvcuisines = findViewById(R.id.tvcuisines)
        imgclose = findViewById(R.id.imgclose)

    }
}