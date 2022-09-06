package com.jane.mycookingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.jane.mycookingapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
lateinit var tvstart:TextView
lateinit var imgchef:ImageView
lateinit var btnget:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Start()
        btnget.setOnClickListener {
            var intent = Intent(this,RecipesActivity::class.java)
            startActivity(intent)
        }
    }
    fun Start(){
        tvstart=findViewById(R.id.tvstart)
        imgchef = findViewById(R.id.imgchef)
        btnget = findViewById(R.id.btnget)
    }
}