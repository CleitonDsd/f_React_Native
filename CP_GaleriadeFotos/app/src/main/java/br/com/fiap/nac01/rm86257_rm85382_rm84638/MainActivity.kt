package br.com.fiap.nac01.rm86257_rm85382_rm84638

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imagem : ImageView

    val imgs = intArrayOf(
        R.drawable.p0,
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagem = findViewById(R.id.imagem)
    }
    var index = 0

    val indexValue = if (index == 0){ }
    fun nextImage(view: View) {
    val index = when()

    }
}