package com.pmdm.virgen.tutorial.callback

/*
Una función callback, es asíncrona. Quiere decir que no sabemos el tiempo que tardará la función
en ejecutarse. En un flujo normal y corriente, hasta que una función no devuelva la lógica que implemente,
el cuerpo principal sigue un orden secuencial. En este caso, intentaremos que no sera así. Para ello, la fumnción
saludar, se ejecutará en un nuevo hilo de ejecución.

fun myAsynFun(name : String, saludar: (String) -> Unit){
    val myCad = "Hola $name"
    Thread{
        Thread.sleep(3000)
        saludar (myCad)  //Lo devolvemos asociado a otra función. No sabemos lo que tardará saludar en ejecutarse.
    }
}


*/

