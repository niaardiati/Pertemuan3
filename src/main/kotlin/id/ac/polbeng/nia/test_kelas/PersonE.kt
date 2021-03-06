package id.ac.polbeng.nia.test_kelas
class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
// this(_firstName, _lastName) akan dipanggil terlebih dahulu
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }

  //kode dieksekusi.
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main(){
    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()
    println()
    val budi = PersonE("Budi", "Gunawan", 21)
    budi.cetakInfo()
}
