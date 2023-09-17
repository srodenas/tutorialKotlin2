package com.pmdm.virgen.tutorial.polimorfismo_abstractas

class Masajista : SeleccionFutbol {

    var title : String = ""

    var ageExperience : Int? = null

    get(){
        field.let {
            return field
        }?: run {
            println ("El masajista debe tener un mínimo de 5 años de experiencia...")
        }
    }

    set(value) {
        if (value != null)
            if (value >= 5)
                field = ageExperience
            else{
                field = value
                println ("Este entrenador no tiene años de experiencia suficiente.")
            }
        else{
            println ("El masajista debe tener un mínimo de 5 años de experiencia ")
        }

    }

    constructor(id : Int, name: String, surname: String, age : Int, title : String, ageExperience : Int) :
            super(
        id, name, surname, age)
    {
        this.title = title
        this.ageExperience = ageExperience
    }

    fun giveMassage() : Unit {
        println( "El masajista con nombre $name, está dando un masaje")
    }

    override fun training() {
        println("El masajista con nombre $name está entrenando")
    }

    override fun toString() = "Masajista con id= $id, nombre es $name, $surname, con edad $age titulacion de $title y experiencia $ageExperience"

}