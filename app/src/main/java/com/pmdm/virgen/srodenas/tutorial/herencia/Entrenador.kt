package com.pmdm.virgen.tutorial.herencia

class Entrenador : SeleccionFutbol{

    var idFederacion : String = ""

    constructor(id : Int, name: String?, surname: String?, age : Int, idFede : String):
            super(id, name, surname, age){
                this.idFederacion = idFede
            }


    init {
        idFederacion+="-ES"
    }

    fun leadGame(): Unit{
        println("El entrenador con nombre $name está dirigiendo un partido de futbol")
    }

    fun leadTraining(): Unit{
        println("El entrenador con nombre $name está dirigiendo un entrenamiento")
    }


}