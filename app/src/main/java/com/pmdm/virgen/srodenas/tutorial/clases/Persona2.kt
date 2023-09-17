package com.pmdm.virgen.tutorial.clases

/*
Clases con tipado seguro. Con los enum, nos aseguramos que cogerán los datos
que queremos que hagan.
 */
class Persona2(var name:String,
               age:Int,
               val jobs:Array<Jobs>,  //que acepte un array de Jobs.
               val friends: Array<Persona2> ? = null) //Puede no tener amigos
{

    //Aseguramos un tipo de Jobs.
    enum class Jobs{
        Camarero, Programador, Mecanico, Albañil, Investigadora, Ingeniero;
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


}//fin clase