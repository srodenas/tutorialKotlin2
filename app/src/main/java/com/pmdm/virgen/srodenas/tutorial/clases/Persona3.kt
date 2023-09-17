package com.pmdm.virgen.tutorial.clases

/*
Seguiremos trabajando con los Enum, añadiendo más funcionalidad
Por ejemplo, añadimos a nuestra Persona, un enum que sólo podrá contener
nacionalidades del tipo Sp, Ing, Ale, Fra, Ita. Queremos una función que nos
diga en español qué nacionalidad es.

 */
class Persona3(var name:String,
               age:Int,
               val jobs:Array<Jobs>,
               val friends: Array<Persona3> ? = null, //Puede no tener amigos
               var nacionality: Nacionality = Nacionality.sp)  //Por defecto que sea española
{

    //Aseguramos un tipo de Jobs.
    enum class Jobs{
        Camarero, Programador, Mecanico, Albañil, Investigador, Ingeniero;
    }

    //Aseguramos un tipo de Nacionalidad
    enum class Nacionality{
        sp, ing, al, fr, ita;

        //Método dentro del enum class, que nos diga de qué nacionalidad es
        fun description() : String{
            return when(this){
                    Nacionality.sp-> "Nacionalidad española"
                    ing->"Nacionalidad inglesa"  //podemos simplificar sólo con el tipo
                    al->"Nacionalidad alemana"
                    fr-> "Nacionalidad francesa"
                    ita-> "Nacionalidad Italiana"
            }
        }
    }

    fun impJobs(){
        jobs.forEach {
            println(it)
        }
    }

    fun impFriends(){
        friends?.forEach {
            println(it.name)
        }
    }


}//fin clase {
