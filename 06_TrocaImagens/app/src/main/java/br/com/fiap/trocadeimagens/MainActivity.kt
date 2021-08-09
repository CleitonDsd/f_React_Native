package br.com.fiap.trocadeimagens

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgIcon : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgIcon = findViewById(R.id.imgIcon)
    }

    fun changeImage(view: View) {
       val imagem = when (view.id){
           R.id.btnIcon1 -> R.drawable.d1
           R.id.btnIcon2 -> R.drawable.d2
           else -> R.drawable.d3
       }
        imgIcon.setImageResource(imagem)
    }

}
