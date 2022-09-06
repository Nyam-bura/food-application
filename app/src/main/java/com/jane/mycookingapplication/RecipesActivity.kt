package com.jane.mycookingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RecipesActivity : AppCompatActivity() {
    lateinit var tvcook:TextView
    lateinit var imgsearch:ImageView
    lateinit var tvsearch:TextView
    lateinit var tvcategories:TextView
    lateinit var imgbeef:ImageView
    lateinit var imgchicken:ImageView
    lateinit var imgposho:ImageView
    lateinit var imgrice:ImageView
    lateinit var tvbeef:TextView
    lateinit var tvchicken:TextView
    lateinit var tvposho:TextView
    lateinit var tvrice:TextView
    lateinit var imgnext:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)
        performActivity()
        imgnext.setOnClickListener {
            var intent = Intent(this,SearchActivity::class.java)
            startActivity(intent)
        }
    }
    fun performActivity(){
        tvcook = findViewById(R.id.tvcook)
        imgsearch = findViewById(R.id.imgsearch)
        tvsearch = findViewById(R.id.tvsearch)
        tvcategories = findViewById(R.id.tvcategories)
        imgbeef = findViewById(R.id.imgbeef)
        imgchicken = findViewById(R.id.imgchicken)
        imgposho = findViewById(R.id.imgposho)
        imgrice = findViewById(R.id.imgrice)
        tvbeef = findViewById(R.id.tvbeef)
        tvchicken = findViewById(R.id.tvchicken)
        tvposho = findViewById(R.id.tvposho)
        tvrice = findViewById(R.id.tvrice)
        imgnext = findViewById(R.id.imgnext)
    }
}