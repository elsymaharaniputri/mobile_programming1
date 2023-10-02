package com.example.javakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var panjang :EditText
    private lateinit var lebar : EditText
    private  lateinit var tinggi : EditText
    private lateinit var submit : Button
    private lateinit var result : TextView
    private lateinit var moveButton:Button

    //    TAMBAHAN SUPAYA TETAP HASIL RESULT ITU
    companion object{
        private const val STATE_RESULT = "state_result"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisiasi variabel
        panjang = findViewById(R.id.Panjang)
        lebar = findViewById(R.id.Lebar)
        tinggi = findViewById(R.id.Tinggi)
        submit = findViewById(R.id.button)
        result = findViewById(R.id.result)
        moveButton=findViewById(R.id.btn_move_activity)
        submit.setOnClickListener  (this)
        moveButton.setOnClickListener(this)

        if (savedInstanceState != null) {
            val resultState = savedInstanceState.getString(STATE_RESULT)
            result.text = resultState
        }

    }

//    TAMBAHAN SUPAYA TETAP HASIL RESULT ITU WALAUPUN LANDSCAPE
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, result.text.toString())
    }
    override fun onClick(v: View?) {
        if (v?.id == R.id.button){
            val inputPanjang = panjang.text.toString().trim()
            val inputLebar = lebar.text.toString().trim()
            val inputTinggi = tinggi.text.toString().trim()

            var iniKosong = false
            //  PENYELEKSIAN
            if (inputPanjang.isEmpty()){
                iniKosong = true
                panjang.error = "Harap isi panjangnya"
            }
            if(inputLebar.isEmpty()){
                iniKosong=true
                lebar.error = "Harap isi lebarnya"
            }
            if(inputTinggi.isEmpty()){
                iniKosong = true
                tinggi.error = "Harap isi tingginya"
            }
            if(!iniKosong){
                val hitung = inputPanjang.toDouble()*inputLebar.toDouble()*inputTinggi.toDouble()
                // mencetak ke layar
                result.text = hitung.toString()
            }


        }

        when (v?.id) {
            R.id.btn_move_activity -> {
              val moveIntent = Intent(this@MainActivity,PenentuGenerasiActivity::class.java)
                startActivity(moveIntent)
            }

        }
    }

}