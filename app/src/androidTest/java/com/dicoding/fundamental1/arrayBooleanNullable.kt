package com.dicoding.fundamental1

fun main(){
 openKantor(7,18,8)
    Array()
}
fun openKantor(officeOpen : Int , officeClosed:Int , now : Int){
    if(now >= officeOpen && now <= officeClosed){
        true
        println("Kantor Buka")
    }else{
        false
        println("Kantor Tutup")
    }
}

fun Array (){
    //mix array
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)
    //mencetak semua isi array
    //akan diloop dulu dan dicetak berdasarkan tipe data, jika Int maka dicetak...
    //is untuk memastikan tipe data sesuai
    for (i in mixArray){
        when(i){
            is Int -> print("$i\t")
            is String -> print("$i\t")
            is Boolean -> print("$i\t\n")
            else -> println("Tipe data tidak dikenal")
        }

    }

    //int array
    val intArray = intArrayOf(1, 3, 5, 7)
    println(intArray[2])
}

