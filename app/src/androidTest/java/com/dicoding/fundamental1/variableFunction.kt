package com.dicoding.fundamental1

fun main (){
    val nama : String = "elsy"
    println(nama)
    println(nama[0])


    val a : Int = 20
    val b : Int = 2
    print (a+b)

    // fungsi untuk hitung luas
    var L :Int
    L= hitung(5,6,null)
    cetak(L,"Luas")

    var V :Int
    V = hitung(5,7,9)
    cetak(V,"Volume")

    var pl : Int
    pl = hitung(6,null,8)
    cetak(pl,"persegi panjang")

    var p : Int
    p= hitung(null,6,6)
    cetak(p,"persegi")
}

//fungsi untuk menghitung dan mencetak data

fun hitung (a:Int?, b :Int? , c :Int?) : Int {
    if (a == null && b == null && c == null) {
        println("Semua parameter tidak boleh kosong.")
    }

    if (a == null ){
        return c!! * b!!
        //tanda seru ganda (!!) adalah operator yang digunakan dalam Kotlin yang disebut "operator non-null assertion." Operator ini digunakan untuk mengatakan kepada Kotlin bahwa kita yakin bahwa nilai yang kita sebutkan tidak akan nul
    }
    if(b == null){
        return a!! * c!!
    }
    if (c == null){
        return a!! * b!!
    }

    return a!!*b!!*c!!
}
fun cetak (c:Int, name:String) {
    println("Hasil hitung $name adalah $c")
}



