package com.pmdm.virgen.tutorial.interfaces

interface IntegranteSeleccionFutbol {
    var anio : Int  //puedo definir una propiedad de interfaz.
    //entrenar
    fun training()  //métodos que deberán sobreescribir

    //viajar
    fun travel(): Unit  //método que deberá de sobreescribir

    fun concentrarse(){ //puedo definir un método de interfaz
        println("Estamos concentrados desde la interfaz")
    }
}