package com.example.juego_del_triqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.lineatres.R
import com.example.lineatres.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var turno = "X"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun actionClic(view: View) {
        val imageView = view as ImageView

        if (imageView.tag == null) {
            if (turno == "X") {
                imageView.setImageResource(R.drawable.x1)
                turno = "O"
            } else {
                imageView.setImageResource(R.drawable.o1)
                turno = "X"
            }
            // Marcar la celda como ocupada
            imageView.tag = turno
        }
    }

    fun reiniciar(view: View) {
        val imageView1 = findViewById<ImageView>(R.id.image1)
        val imageView2 = findViewById<ImageView>(R.id.image2)
        val imageView3 = findViewById<ImageView>(R.id.image3)
        val imageView4 = findViewById<ImageView>(R.id.image4)
        val imageView5 = findViewById<ImageView>(R.id.image5)
        val imageView6 = findViewById<ImageView>(R.id.image6)
        val imageView7 = findViewById<ImageView>(R.id.image7)
        val imageView8 = findViewById<ImageView>(R.id.image8)
        val imageView9 = findViewById<ImageView>(R.id.image9)

        val imageViews = arrayOf(
            imageView1, imageView2, imageView3, imageView4, imageView5,
            imageView6, imageView7, imageView8, imageView9
        )

        for (imageView in imageViews) {
            imageView.setImageResource(R.drawable.vacio)
            imageView.tag = null
        }
        turno = "X"
    }
}
