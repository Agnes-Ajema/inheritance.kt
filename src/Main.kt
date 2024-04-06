fun main(){
val Ajema = teacher("Ajema",22)
    Ajema.teachStudent("Agnes","Chemistry")
    Ajema.cook()
    Ajema.talk("kukurukakara")
    Ajema.walk("patapata")
}



 open class person (name:String,age:Int){

  open fun walk(steps:String) {
      println(steps)
  }
     open fun talk(words:String){
         println(words)
     }

     fun cook (){
         println("krrrkraaaakruuu")
     }
}

class teacher (name: String,age: Int):person(name, age){
    fun teachStudent(student:String,lesson:String){
      println("Teach $student $lesson")
    }

    override fun walk(steps: String) {
        super.walk(steps)
        println("The doctor is walking $steps")
    }

    override fun talk(words: String) {
        super.talk(words)
        println("The doctor said that she heard the child say $words ")
    }
}