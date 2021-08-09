package br.com.fiap.nac01.rmXXXXX_rmXXXXX

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /**
     * Representa o componente ImageView principal
     */
    lateinit var imgGaleria : ImageView

    /**
     * Posição da imagem atual do array a ser exibida
     */
    var posicao = 0

    /**
     * Imagens disponíveis para a galeria
     */
    val imagens = intArrayOf(
        R.drawable.p0,
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5,
        R.drawable.p6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgGaleria = findViewById(R.id.imgGaleria)
    }

    /**
     * Evento para calcular qual a imagem anterior
     *
     * @param view Componente que disparou o evento
     */
    fun retroceder(view: View) {
        posicao--

        if ( posicao < 0 ) {
            posicao = imagens.size - 1
        }

        trocarImagem(posicao)
    }

    /**
     * Evento para calcular a próxima imagem
     *
     * @param view Componente que disparou o evento
     */
    fun avancar(view: View) {
        posicao++

        if ( posicao >= imagens.size ) {
            posicao = 0
        }

        trocarImagem(posicao)
    }

    /**
     * Troca a imagem do ImageView principal
     * baseado na posição recebida
     *
     * @param posicao
     */
    fun trocarImagem( posicao : Int ) {
        imgGaleria.setImageResource( imagens[posicao] )

        Toast.makeText(this, "Imagem ${posicao + 1}", Toast.LENGTH_SHORT).show()
    }
}