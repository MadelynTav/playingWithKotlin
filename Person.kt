package kotlin.collections.*

/**
 * Created by mtavarez on 10/17/17.
 */
class Person(val name: String, val middleName : String?, var age: Int){

    var _personName : String?
    fun getPersonName() = _personName

    fun tryItOut (){
        mutableListOf<String>("Hello", "Goodbye", "Guy")

    }
}

