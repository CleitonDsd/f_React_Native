package br.com.fiap.jogodedados

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imgJogador01 : ImageView
    lateinit var imgJogador02: ImageView

    val imgs = intArrayOf(
            R.drawable.d01,
            R.drawable.d02,
            R.drawable.d03,
            R.drawable.d04,
            R.drawable.d05,
            R.drawable.d06
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgJogador01 = findViewById(R.id.imgJogador01)
        imgJogador02 = findViewById(R.id.imgJogador02)
    }

    fun jogar(view: View) {
        val x = Random.nextInt(imgs.size)
        val y = Random.nextInt(imgs.size)

        imgJogador01.setImageResource(imgs[x])
        imgJogador02.setImageResource(imgs[y])

        var msg = "deu EMPATE"
        if(x > y){
            msg = "JOGADOR 1, VENCEU!"
        }else if(y > x){
            msg = "JOGADOR 2, VENCEU!"
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}