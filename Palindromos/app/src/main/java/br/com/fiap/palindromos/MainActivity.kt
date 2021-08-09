package br.com.fiap.palindromos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edtFrase : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtFrase = findViewById(R.id.edtFrase)
    }

    fun verificar(view : View){
        var txt = edtFrase.text.toString().trim().toLowerCase()

        if(txt.length < 3){
            Toast.makeText(this, "Informe corretamente uma frase", Toast.LENGTH_SHORT).show()
            return
        }

        txt = removerCarecteresEspeciais(txt).toString()
        val regex = "[^a-z]".toRegex()
        txt = regex.replace(txt, "")

        val frase = if (txt.equals(txt.reversed())){
            "É um Palíndromo"
        }else{
            "Não é um Palíndromo"
        }
        toast(frase)
    }

    fun toast(frase : String){
        Toast.makeText(this, frase, Toast.LENGTH_SHORT).show()
    }

    fun  removerCarecteresEspeciais(txt : String) {
        val txt = txt.replace("á", "a")
            .replace("â", "a")
            .replace("à", "a")
            .replace("ã", "a")
            .replace("é", "a")
            .replace("ê", "a")
            .replace("í", "i")
            .replace("ì", "i")
            .replace("ó", "o")
            .replace("ô", "o")
            .replace("ò", "o")
            .replace("õ", "o")
            .replace("", "o")
            .replace("ó", "o")
            .replace("ç", "c")
        return
    }
}