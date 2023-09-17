package com.pmdm.virgen.srodenas.tutorial.funciones

fun primeraFuncion(){
    println("Esto es nuestra primera función")
}

fun realizaSuma(a: Int, b: Int): Int{
    return a+b
}


fun devuelveSumaArray(myArray: IntRange):Int{
    var suma=0
    for (x in myArray)
        suma+=x

    return suma
}
fun devuelveSumaArray2(myArray: Array<Int>):Int{
    var suma=0
    for (x in myArray)
        suma+=x

    return suma
}

/*
Aquí añadiremos las expresiones lambda.
1.- Expresiones lambda
2.- Pasar funciones a variables.
3.- Funciones que aceptan como parámetros otras funciones.
4.- Variables que devuelven funciones.
5.- Funciones de orden superior. Ejemplo
6.- Ejemplo de llamadas asíncronas.
 */