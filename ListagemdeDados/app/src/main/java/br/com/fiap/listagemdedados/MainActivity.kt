package br.com.fiap.listagemdedados

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var lstPaises : ListView

    val paises = arrayOf(
        "Alemanha",
        "Argentina",
        "Árgelia",
        "Bélgica",
        "Brasil",
        "Bulgária",
        "Canadá",
        "Colômbia",
        "Cazaquistão",
        "Dinamarca",
        "Djibout",
        "Dominica",
        "Eslovênia",
        "Espanha",
        "Estônia",
        "Filipinas",
        "Finlândia",
        "França",
        "Geórgia",
        "Grécia",
        "Guatemala",
        "Haiti",
        "Holanda",
        "Honduras",
        "Islândia",
        "Israel",
        "Itália",
        "Jamaica",
        "Japão",
        "Jordânia",
        "Kiribati",
        "Kosovo",
        "Kuwait",
        "Líbano",
        "Líbia",
        "Lituânia",
        "Maldivas",
        "Madagascar",
        "Marrocos",
        "Nova Zelândia",
        "Noruega",
        "Nepal",
        "Omã",
        "Paquistão",
        "Paraguai",
        "Polônia",
        "Qatar",
        "Quênia",
        "Quirguistão",
        "Romênia",
        "Rússia",
        "Ruanda",
        "Sérvia",
        "Somália",
        "Suécia",
        "Tailândia",
        "Tunísia",
        "Turquia",
        "Ucrânia",
        "Uganda",
        "Uruguai",
        "Vaticano",
        "Venezuela",
        "Vietnã",
        "Zimbábue",
        "Zâmbia"
    );

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lstPaises = findViewById(R.id.lstPaises)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, paises)
        lstPaises.adapter = adapter

        lstPaises.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this, position.toString(), Toast.LENGTH_SHORT).show()
            val it = Intent(this, PaisActivity::class.java)
            it.putExtra("nome", paises[position])
            it.putExtra("posicao", position)
        }
    }
}

