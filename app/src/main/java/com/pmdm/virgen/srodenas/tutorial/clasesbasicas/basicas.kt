package com.pmdm.virgen.srodenas.tutorial.clasesbasicas

/*Forma más sencilla de declarar una clase. Lleva aparejado un constructor por defecto (primario)

Todo lo que se defina dentro del () en la definición del class, se considera constructor primario
El constructor que se defina después, será el secundario.
 */
class P (var a: Int )

//Cuando se crea el objeto, no se le pasan argumentos. Se inicializan los atributos directamente.
class P0{
    var a: Int = 10
}
/*
Igual que el anterior.
 */
class P1(){
    var a: Int = 20
}


/*
Al NO existir constructor primario, el secundario se considera como constructor por defecto.
Primero se inicializa el atributo a a 50 y después entra el contructor con a = 30

 */
class P1_1{
    var a: Int = 50

    constructor(){  //secundario
        a = 30   //Al final se queda con este valor.
    }


}

/*
Igual que el anterior.  No existe constructor primario, sólo dos secundarios.
 */
class P2{
    var a: Int = 50

    constructor(){  //secundario
        a = 30
    }

    constructor(a: Int){ //secundario
        this.a = a
    }


}


/*
Esto sería mas correcto. Es tontería inicializar a 50
 */

class P3{
    var a : Int //no hace falta inicializarlo.

    //constructor principal
    constructor(){
        a = 30
    }

    //Definimos un segundo constructor. En este caso es secundario.
    constructor(a: Int){
        this.a = a
    }

}

// Definimos la clase y declaramos la propiedad que tendrá. No podremos crearlo con P4(), sino con P4(valor)
class P4 constructor(var a: Int)


/*
Aquí tengo un constructor primario y un secundario con más atributos. Debo delegar al primario con this.
 */
class P5 (var a: Int){
    var b: Int = 0  //tengo que inicializarlo por narices. ¿Qué pasa si sólo utilizo el primario?

    constructor( a: Int, b: Int) : this(a){
        //tengo que delegar  el atributo a, al primario.
        this.b= b
    }
}


class P6{
    var a: Int

    init {
        this.a = 0
    }
}

class P7(){  //() es el constructor primario
    var a: Int

    init {
        this.a = 0
    }
}

class P8 (a: Int){  //recibo un parámetro, pero no significa que sea un atributo.
    var a : Int  //Por narizes tendría que inicializarlo, ya que recibo un parámetro.

    init {
        this.a = a  //De esta forma, puedo dejar sin inicializar el atributo a.
    }
}

class P9 (){
    var a: Int

    init {
        this.a = 0
    }

    constructor(a: Int) : this() { //Porque debe delegar al constructor primario ()
        this.a = a
    }

}

/*
En este caso, fijaros como primero se inicializa el atributo a a 100 y luego extiende con el init.
 */
class P10{
    var a: Int = 100

    init {
        a = 200
    }
}
