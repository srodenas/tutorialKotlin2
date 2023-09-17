package com.pmdm.virgen.tutorial.interfaces

open class SeleccionFutbol {
    protected var id : Int = 0

    protected var name : String?= null
        set(value) {
            value?.let {
                field = value.uppercase()
            }
        }

    protected var surname : String?= null
        set(value) {
            value?.let {
                field = value.uppercase()
            }
        }

    protected var age : Int = 0

    constructor(id : Int, name: String?, surname: String?, age : Int){
        this.id = id
        this.name = name
        this.surname = surname
        this.age = age
    }

    override fun toString() : String = "integrante con id= $id, nombre es $name, $surname, con edad $age"
}