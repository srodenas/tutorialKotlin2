//clase chorra
/*class S (_a: Int){

    var a : Int = _a
        set(value){
            if (value %2  == 0)
             field++
        }

    var b : Int = 0


    constructor(_a:Int, _b: Int):this(_a){
        a = _a
        b = _b
    }

}
*/

package com.pmdm.virgen.tutorial.herencia

/*
Clase Padre
 */

open class SeleccionFutbol  {
    protected var id : Int = 0

    protected var name : String?= null
        set(value) {
            if (value!= null){
                if (value.isNotEmpty())
                    field= value.uppercase()
            }else{
                println("El nombre no puede ser nulo")
                field = ""
            }
        }


    protected var surname : String?= null
        set(value) {
            if (value!= null){
                if (value.isNotEmpty())
                    field = value.uppercase()

            }else{
                println("El apellido no puede ser nulo")
                field = ""
            }
        }


    protected var age : Int = 0

    constructor(id : Int, name: String?, surname: String?, age : Int) {
        this.id = id
        this.name = name
        this.surname = surname
        this.age = age
    }

    //concentrarse
    fun concentrate(): Unit{
        println("El integrante se está concentrando")
    }

    //viajar
    fun travel(): Unit{
        println("El integrante está viajando")
    }

    override fun toString() = "integrante con id= $id, nombre es $name, $surname, con edad $age"
}


open class SeleccionFutbol1 (_id : Int, _name:String?, _surname: String?, _age:Int)  {
    protected var id : Int = _id

    protected var name : String?=_name
        set(value) {
            if (value!= null){
                if (value.isNotEmpty())
                    field= value.uppercase()
            }else{
                println("El nombre no puede ser nulo")
                field = ""
            }
        }


    protected var surname : String?= _surname
        set(value) {
            if (value!= null){
                if (value.isNotEmpty())
                    field = value.uppercase()

            }else{
                println("El apellido no puede ser nulo")
                field = ""
            }
        }


    protected var age : Int = _age


    //concentrarse
    fun concentrate(): Unit{
        println("El integrante se está concentrando")
    }

    //viajar
    fun travel(): Unit{
        println("El integrante está viajando")
    }

    override fun toString() = "integrante con id= $id, nombre es $name, $surname, con edad $age"
}