package com.pmdm.virgen.tutorial.interfaces

class Entrenador : SeleccionFutbol, IntegranteSeleccionFutbol {

    constructor(id : Int, name : String, surname : String, age: Int, idFede : String, anio : Int ) :
            super(id, name, surname, age)  //obligamos a crear un entrenador con esos cuatro atributos.
            {
                this.idFederacion = idFede
                this.anio = anio
            }

    //otro constructor, pero sin el anio.
    constructor(id : Int, name : String, surname : String, age: Int, idFede : String ) :
            super(id, name, surname, age)  //obligamos a crear un entrenador con esos cuatro atributos.
    {
        this.idFederacion = idFede
    }


/*
No tenemos por qué inicializar las propiedades de idFederacion y anio. Para ello tengo init.
 */
    var idFederacion : String

    override var anio: Int


    init {
        idFederacion = ""  //es lo mismo que inicializarlo en la propir var.
        anio = 2023
    }



    override fun training() {
        println ("El entrenador con nombre $name esta entrenando")    }


    override fun travel() {
        println ("El entrenador con nombre $name esta entrenando")    }


    override fun toString() =  super.toString() +  " con id federacion $idFederacion"


}