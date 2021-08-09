package br.com.fiap.inverterimagens

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgShape01 : ImageView
    lateinit var imgShape02 : ImageView

    var inverter = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun trocarImagem(view: View) {

        inverter = !inverter

        if (inverter){
            val img01 = if(inverter) R.drawable.triangulo else R.drawable.quadrado
            val img02 = if(inverter) R.drawable.quadrado else R.drawable.triangulo

            imgShape01.setImageResource(img01)
            imgShape02.setImageResource(img02)
        }

    }
}