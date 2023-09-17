package com.pmdm.virgen.tutorial.lambda

/*
En kotlin, una variable puede almacenar no sólo un valor, sino también una función.
 */
fun ejemplo(){
    println("Cuerpo de funcion")
}

fun lambda(){
    val variableFunction = ::ejemplo  //almaceno la función como valor
    variableFunction() 	//llamo a la función mediante la variable
    println("Ahora utilizaremos lambda")

    /*
     * Creo una función lambda, dentro de una variable.
     * Las variables pueden contener funciones.
     */
    val variableLambda = {
        println("Estamos dentro de una lambda")
    }

    variableLambda() //invocamos al cuerpo de la función lampda

    //almaceno la variable que contiene la lambda en otra variable.
    val variableLambda2 = variableLambda
    variableLambda2() //invoco al cuerpo de la lambda desde la variable.

}


/*
Una lambda, nos permite almacenar en una variable, funciones.
 */

fun lambda1(){
    val myList = arrayListOf(0,1,2,3,4,5,6,7,8,9,10)
    val myNewFilter = myList.filter {myInt->  //puedo redefinir el parametro it, con el nombre myInt
        //devuelve un nuevo listado teniendo en cuenta la condición que le pondremos.
        //Nosotros definiremos en código la operación de filtrado. Por tanto una lambda

        println(myInt)
        if (myInt == 1){
            return@filter true  //de esta forma, retornamos también que el 1 es válido.
        }
        myInt > 5  //ultima sentencia, es lo que devuelve
    }
    println(myNewFilter)

}



fun lambda2(){
    val mySumFun = fun (a:Int, b: Int): Int{
        return a + b
    }

    val mySumFun2 = fun (a: Int, b: Int) : Int = a + b  //lo mismo que la anterior
    val myMulFun  = fun (a: Int, b: Int) : Int = a * b

    val res = myOperationFun(2,4, myMulFun)   //estamos pasándole los dos enteros y la función.
    val res2 = myOperationFun(3,4, mySumFun2)
    println("Operacion de multiplicación: " + res)
    println("Operacion de suma $res2")

    println("Operacion de resta será " + myOperationFun(5,4, {
            a,b -> a - b

    }))

    val res3 = myOperationFun(2,3){
            a,b -> a + b
    }
    println("Otra operacion de suma cuyo valor es $res3")

    val res4 = myOperationFun2(2,3,
        {a,b -> a+b},
        {a,b -> a*b})
    println("Otra operacion con el paso de dos funiones es $res4")
}

/*
Función que acepta dos enteros y una función del tipo: int, int -> int. No sabemos lo que hace
simplemente la llamamos con los parámetros que le pasamos.
 */
fun myOperationFun (a: Int, b: Int, operation: (Int, Int) -> Int) : Int {
    return operation (a, b)

}

fun myOperationFun2 (a : Int, b: Int,
                     operation1: (Int, Int) -> Int,
                     operation2: (Int, Int) -> Int ): Int{
    return operation1 (a,b) + operation2(a,b)
}
