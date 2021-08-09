package br.com.fiap.transicaodojavaparakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

var nome : String? = null
val contador : Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 
        var pessoaJava = PessoaJava("Cleiton", "fiap@gmail.com")
    }

    fun soma(a:Int,  b:Int):Int{
        return a+b
    }
}

class Pessoa(var nome:String, var email:String)