package com.pmdm.virgen.tutorial.clases

//Añadimos a Persona4, la posibilidad de una propiedad codNacionality para su enum class Nacionality
class Persona4 (
    var name:String,
    var age: Int,
    var jobs: Array<Jobs>,
    var friends : Array<Persona4>?,  //puede no tener amigos
    var nacionality: Nacionality)
{

    enum class Jobs {
        Camarero, Programador, Mecanico, Albañil, Investigador_a, Ingeniero;

    }


    /*
    También podemos asociar una propiedad a la enum y es por medio de un entero.
    Quiere decir, que cada tipo, se le asociará un entero, de forma que cada nacionalidad
    tiene un valor entero diferente.
     */
    enum class Nacionality(val codNacionality: Int){
        sp(1), ing(2), al(3), fr(4), ita(5);

        fun description() : String{
            return when(this){
                sp-> "Nacionalidad española"
                ing ->"Nacionalidad inglesa"  //podemos simplificar sólo con el tipo
                al ->"Nacionalidad alemana"
                fr -> "Nacionalidad francesa"
                ita -> "Nacionalidad Italiana"
            }
        }
    }


}//fin de clase Persona4