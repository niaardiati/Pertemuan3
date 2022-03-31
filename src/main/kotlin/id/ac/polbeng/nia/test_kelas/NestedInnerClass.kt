package id.ac.polbeng.nia.test_kelas

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

fun main(args: Array<String>) {
    // mengakses anggota Nested Class
    println(Outer.Nested().b)

    //Membuat Objek dari Nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}