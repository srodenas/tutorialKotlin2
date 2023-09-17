package com.pmdm.virgen.tutorial.clases

class Alumno (){

    var dni : String = ""
    var name : String = ""
        //Actualizamos un setters, para que tenga otra lógica de comportamiento.
        set (value){
            if (value.isNotEmpty())
                field = value.uppercase()

        }

    var age: Int = 0
    var phone : String = ""

    //Utilizará el setters para cada miembro.
    constructor(dni: String, name : String, age: Int, phone: String) : this() {
        this.dni = dni
        this.name = name
        this.age = age
        this.phone = phone
    }

    //Extensión del contructor por defecto.
    init{
        println ("Extensión contructor por defecto. No responde a una extesión de constructor secundario")
    }

    //sobreescribiremos el toString
    override fun toString(): String = "Dni: ${name}, nombre: ${name}, edad: ${age}, telefono: ${phone}"

}