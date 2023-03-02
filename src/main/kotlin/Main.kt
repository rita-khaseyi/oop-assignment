fun main(){
    val girl=Human("zippy",57,20)
    girl.speak("Hello how are you?")
    girl.Name
    girl.weight
    girl.eat(1)
    println(girl.weight)
    girl.Age
    girl.birthday()
    println(girl.Age)


    val person=User("Trishia","waweru","trishia@gmail.com","0700334455","3344")
    println(person.phoneNumber)
    println(person.lastName)

}


class Human(var Name:String,var weight:Int, var Age:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        Age++
    }


}
data class User (var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String