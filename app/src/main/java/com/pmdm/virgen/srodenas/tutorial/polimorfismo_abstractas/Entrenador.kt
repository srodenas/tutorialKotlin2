package com.pmdm.virgen.tutorial.polimorfismo_abstractas

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

    //hay que forzosamente sobreescribir este método.
    override fun training() {
        println("El entrenador con nombre $name está entrenando")
    }

    override fun toString() = "Entrenador con id= $id, nombre es $name, $surname, con edad $age y codigo de federacion: $idFederacion"


}