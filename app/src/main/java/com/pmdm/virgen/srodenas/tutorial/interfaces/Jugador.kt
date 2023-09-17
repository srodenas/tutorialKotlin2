package com.pmdm.virgen.tutorial.interfaces

class Jugador : SeleccionFutbol, IntegranteSeleccionFutbol {
    constructor(id : Int, name: String?, surname: String?, age : Int, dorsal : Int, demarcacion : String?)
            : super(id, name, surname, age)
    {
        this.demarcacion = demarcacion
    }

    //Obligados a sobreescribir los atributos de la interfaz.
    override var anio: Int = 2023 //Lo ponemos por defecto.

    var dorsal : Int = 0

    var demarcacion : String?
        set(value) {
            value?.let {
                field = value
            }?: run{
                println("Este jugador no tiene ninguna demarcación, hay que ponerle una.")
            }

        }
        get() {
            field?.let {
                return field
            }?: run {
                field = "Sin demarcacion..."
                return field
        }
   }

//Estos métodos son los que deben implementar de la interfaz.
    override fun training() {
        println ("El jugador con nombre $name esta entrenando")
   }

    override fun travel() {
        println ("El jugador con nombre $name esta viajando")
    }

    override fun toString() =  super.toString() +  " con dorsal $dorsal y demarcacion $demarcacion"

}