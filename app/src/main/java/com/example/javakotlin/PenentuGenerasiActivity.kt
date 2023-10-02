package com.example.javakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PenentuGenerasiActivity : AppCompatActivity(), View.OnClickListener {

    //inisiasi tipe data
    private lateinit var btnMoveActivity: Button
    private lateinit var inputTgl : EditText
    private  lateinit var submit : Button
    private  lateinit var  hasil : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penentu_generasi)

        //inisiasi variable
        btnMoveActivity = findViewById(R.id.btn_move_activity)
        inputTgl = findViewById(R.id.inputTanggal)
        hasil = findViewById(R.id.hasil)
        submit = findViewById(R.id.submit)

        //ditekan
        submit.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.submit){
            //diubah ke int
            val inputTanggal = inputTgl.text.toString().trim()
            //dicetak hitung ke int
            val hasilHitung =  when ( inputTanggal.toInt() ){
                in 1924..1964 -> "Baby Boommers"
                in 1965..1980 -> "X"
                in 1981..1995 ->"Millineal"
                in 1995..2002->"Z"
                else -> "KAMU BARU NAK!!"

            }
            hasil.text = "Kamu adalah generasi $hasilHitung"

        }
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@PenentuGenerasiActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

        }
    }
}