package com.example.kotlin12hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin12hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var listPictures = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addPictures()
        submitPicture()
        randomPicture()
    }
    private fun submitPicture() {
        binding.btnSubmit.setOnClickListener {
            listPictures.add(binding.etUrl.text.toString())
            binding.ivUrl.loadImage(binding.etUrl.text.toString())
        }
    }

    private fun randomPicture() {
        binding.btnRandom.setOnClickListener {
            binding.ivUrl.loadImage(listPictures.random())
        }
    }

    private fun addPictures() {
        listPictures.add("https://static3.cbrimages.com/wordpress/wp-content/uploads/2021/09/Son-Goku-Goes-On-An-Adventure-In-Dragon-Ball.jpg")
        listPictures.add("https://cdn.vox-cdn.com/thumbor/CNQHq68Me9dMYgerR7MYy4ng89M=/0x0:1524x948/920x613/filters:focal(641x353:883x595):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/69966666/goku_from_db_super_super_hero.0.jpg")
        listPictures.add("https://play-lh.googleusercontent.com/fj_UheAIn8lnBNJS76EvygkoXKLna4pgdomkyqgbDSQ8EznIAb1mTBY04xCDx1ZQpg")
        listPictures.add("https://stickershop.line-scdn.net/stickershop/v1/product/3065/LINEStorePC/main.png;compress=true")
        listPictures.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFPhdfH3OCpyTeuK_YpxlcnpNBfY_R3ozmUw&usqp=CAU")
    }
}