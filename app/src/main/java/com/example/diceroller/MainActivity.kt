package com.example.diceroller

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.material.shape.ShapePath.PathOperation
import java.io.File
import kotlin.io.path.Path
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generate_Button:Button=findViewById(R.id.generate_button)
        generate_Button.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val randomInt= Random.nextInt(6)+1

        val drawable_resoure=when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage:ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drawable_resoure);

    }
}