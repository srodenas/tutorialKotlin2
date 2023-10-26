package com.pmdm.virgen.srodenas.tutorial

import android.os.Build.VERSION_CODES.S
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pmdm.virgen.srodenas.tutorial.clasesbasicas.*
import com.pmdm.virgen.srodenas.tutorial.funciones.devuelveSumaArray
import com.pmdm.virgen.srodenas.tutorial.funciones.devuelveSumaArray2
import com.pmdm.virgen.srodenas.tutorial.funciones.primeraFuncion
import com.pmdm.virgen.srodenas.tutorial.lambda.Adapter
import com.pmdm.virgen.srodenas.tutorial.lambda.Controller
import com.pmdm.virgen.tutorial.clases.*
import com.pmdm.virgen.tutorial.clases_internas.Calculadora
import com.pmdm.virgen.tutorial.dataclases.Worker
import com.pmdm.virgen.tutorial.herencia.*
import com.pmdm.virgen.tutorial.interfaces.IntegranteSeleccionFutbol
import com.pmdm.virgen.tutorial.interfaces.Jugador

import java.util.Date
import kotlin.concurrent.thread

import com.pmdm.virgen.tutorial.polimorfismo_abstractas.SeleccionFutbol as SeleccionFutbolAbstracta
import com.pmdm.virgen.tutorial.polimorfismo_abstractas.Entrenador as EntrenadorAbstracta
import com.pmdm.virgen.tutorial.polimorfismo_abstractas.Futbolista as FutbolistaAbstracta
import com.pmdm.virgen.tutorial.polimorfismo_abstractas.Masajista as MasajistaAbstracta


typealias MyTypesDepartaments = MutableMap<Int, ArrayList<String>>  //Creo un tipo para Map


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "hola mundo")
        pruebaMetodos()
    }



    private fun pruebaMetodos() {

        //tipoDeDatos()
        //sentenciaIfElse()
        //sentenciaWhen()
        //arrays()
        //listas()
       // diccionarios()
       // bucles()
       // nullPointer()
       // probarFunciones()
       // pruebaClasesIniciales()
       // pruebaClasesIniciales1()
       // pruebaClasesIniciales2()
       // pruebaClases()
       // pruebaClasesAnidadas()
        //pruebaHerencia()
        //probarPolimorfismo()
        // probarInterfaces()
        //dataClases()
       // probarTypeAlias()
        //probarLambda()
       // probarCallBack()
        emularListener()
    }




    private fun tipoDeDatos() {
        val myInt : Int = 1  //definimos variable de tipo entero y lo inicializamos a 1
        val myInt2 = 2 //por defecto, kotlin entiende que es de tipo entero
        val myInt3 = myInt * myInt2  //ya sabemos el resultado

        val myDouble : Double = 1.0//definimos variable de tipo real
        val myDouble2 = 2.0
        val myDouble3 : Double
        val myDouble4 = 3  //realmente es de tipo entero

        myDouble3 = myDouble + myDouble4 * myDouble2  //kotlin hace las conversiones directamente

        val myString = "Santi"
        val myString1 : String = "soy " + myString

        val myBool = true
        var myBool1 = myBool && true
        myBool1 = myBool1 && false

        Log.d("TAG", "Estamos repasando de kotlin y $myString1")
        println("Tipos enteros: $myInt3")
        println("Tipos reales: $myDouble3")
        println("Tipos booleanos: $myBool1")
    }


    private fun sentenciaIfElse(){
        val myInt = 9

        if (myInt < 0)
            println("Numero negativo , es $myInt")
        else
            if (myInt <=10 && myInt != 5)
                println("Numero entre 0 y 10 y distinto de 5 es, $myInt")
            else
                if (myInt == 5)
                    println("Número igual a 5")
                else
                    println("Número mayor que 10 es, $myInt")
    }


    private fun sentenciaWhen(){
        val pais : String = "España"
        var moneda = ""

        when(pais){
            "España" ->{
                moneda ="Euro"
            }
            "Francia" ->{
                moneda ="Euro"
            }
            "Alemania" ->{
                moneda ="Euro"
            }
            "EEUU" ->{
                moneda ="Dolar"
            }
            "Italia" ->{
                moneda ="Euro"
            }
            "Venezuela" ->{
                moneda ="Bolibar"
            }
            else -> {
                moneda = "N.I."
            }
        }

        println("La moneda del pais $pais es $moneda")

        when(pais){
            "España", "Francia", "Alemania" , "Italia" ->
                moneda ="Euro"
            "EEUU" ->
                moneda ="Dolar"
            "Venezuela" ->
                moneda ="Bolibar"
            else ->
                moneda = "N.I."
        }

        val sueldo = 1000
        when (sueldo){
            in 700 .. 900 ->
                println("Sueldo de 700 a 900")
            in 901 ..1200 ->
                println("Sueldo de 901 a 1200")
            in 1201 .. 2000 ->
                println("Sueldo de menos de 2000")
            else ->
                println("Otro sueldo")
        }
    }


    private fun arrays(){
        //Los arrays son de tamaño fijo. No pueden añadirse más elementos una vez definidos.
        //Si podemos cambiar sus valores en posición.
        var myArray = arrayOf("lunes", "Martes", "Miercoles", "jueves", "Viernes", "Sabado", "Domingo")
        val martes = myArray[1]
        val miercoles = myArray.get(2)
        myArray[3] = "Jueves"
        myArray.set(0, "Lunes")
        myArray.forEach {
            if (it == "Sabado")
                println("Sabado, el mejor día de la semana")
            else
                println(it)
        }
        //Los arrays tienen limitaciones que se podrán solucionar con las listas

        var myArray2 = 0..10   //Me declaro y defino un array con 10 elementos
        /*
        Diferentes formas de recorrer un array.
         */

        //Como recorro facilmente un array de enteros.
        for (x in myArray2)
            println(x)

        //Lo más parecido a otros lenguajes imperativos. for i=0; i<=7; i++
        for (i in 0..myArray.size -1)
            print(myArray[i]+" ")

        //Lo más parecido a for i=0; i<= 7; i+2
        for (i in 0..myArray.size -1 step 2){
            print(myArray[i]+" ")
        }

        //lo más parecido a for i =2; i<=7; i++
        for (i in 2 until  myArray.size -1){
            print(myArray[i]+" ")

        }

        //lo más parecido a for i=7; i>=0; i--
        for (i in myArray.size -1 downTo 0 )
            print(myArray[i]+" ")




        //bucle for, mas elemental
        for (valor in myArray){
            println(valor+" ")
        }

        //bucle for. (Recorremos por índice)
        for (pos in myArray.indices)
            println(myArray.get(pos)+" ")

        //bucle for (clave, valor).
        for ( (pos, valor) in myArray.withIndex())
            println("La posicion $pos tiene de valor $valor")


        //Otra forma de iterar con foreach.
        myArray.forEach {
            println(it)
        }

    }



    private fun listas() {
        //arrayListOf<String> función que devuelve un ArrayList<String>
        var myList = arrayListOf<String>()  //Así nos declaramos un array de String. Lo mismo que ArrayList en java
        myList.add("Santi")
        myList.add("Sonia")
        println(myList)

        var myList2 : ArrayList<String> = ArrayList<String>()  //Así nos declaramos un ArrayList
        myList2.add("Santi")
        myList2.add("Sonia")

        myList.addAll(
            listOf(
                "guille",
                "diego"
            )
        ) //añado un conjunto de datos mediante una lista o colección.
        println(myList)
        myList.add("David")
        println("Ahora imprimo la primera posición${myList[0]} y última  ${myList[myList.size - 1]}")
        myList.removeAt(0)
        println("He eliminado el primero, por tanto ahora el primero es ${myList[0]}")

        println("Ahora voy a recorrer el array completo")
        myList.forEach() {
            println(it)
        }
        println("Es lo mismo ${myList.count()} que con el atributo size  ${myList.size}")
        println("Ahora lo borro")
        myList.clear()
        println("Ahora tengo ${myList.count()} elementos")

        /*
        Ahora trabajaremos con listas inmutables y mutables.
        1. La interfaz List, implementa sólo lectura cuando se inicializa con listOf y será de lectura/escritura
        cuando se inicializa con mutableListOf.
        2.- Un ArrayList y un MutableList, en esencia será lo mismo, la única diferencia está en la incorporación de
        algunos métodos que hay en ArrayList y no en MutableList. Como consejo, utilizaremos MutableList, cuando sólo
        nos preocupemos de interacturar con los objetos de la colección.
        3.-La interfaz MutableList, hace que la colección pueda modificarse, pero List se utiliza generalmente cuando queramos
        una colección inmutable. Por tanto, no utilizaremos la interfaz List, cuando queramos dinamicidad.
        4.- Utilizaremos siempre en inmutables la opción val nombre = listOf(....) y en mutables la opción
         var nombre = mutableListOf(.....).
         */
        val myInmutableList : List<String> = listOf("Santi", "Sonia", "Guille", "Diego")
        val myInmutableList2 =  listOf("Santi", "Sonia", "Guille", "Diego")  //es lo mismo que lo anterior. Forma que utilizaremos
        //No puedo hacer cosas como myInmutableList.add("Otro")
        var myMutableList : List<String> = mutableListOf("Santi", "Sonia", "Guille", "Diego")
        var myMutableList2 : MutableList<String> = mutableListOf("Santi", "Sonia", "Guille", "Diego")
        var myMutableList3 = mutableListOf<String>("Santi", "Sonia", "Guille", "Diego")  //Esta es la forma que utilizaremos

        myMutableList3.add("David")
        myMutableList3.forEach(){
            print("Persona ->: $it")
        }
        println()
    }



    private fun diccionarios(){
        /*
        Los datos se agrupan a partir de clave -> valor. Todas las claves deen ser
        del mismo tipo de dato. No pueden existir claves repetidas. Dos claves diferentes,
        si podrán tener el mismo valor. La crearemos y la inicializaremos. Por defecto, los diccionarios
        no son ordenados.
        Con mapOf () Creamos un mapa no MUTABLE.

        1.- La interfaz Map, por defecto es de sólo lectura. Recibe tanto mapOf como mutableMapOf. Si se inicializa
        con mapOf, será de sólo lectura. Si se inicializa con mutableMapOf, será lectura/escritura.
        2.- Si utilizamos la interfaz MutableMap, por defecto es de lectura/escritura. Por tanto será la que utilzaremos.
         */

        var myMap : Map<String, String> = mapOf()//tendremos un mapa de clave string y de valor string
        println(myMap)
        //Añadir elementos. Hemos borrado y asignado tres elementos.
        myMap = mapOf("1111" to "Santi", "2222" to "Sonia", "3333" to "Guille")

        println(myMap)
        //Añadimos un sólo valor. Con myMap["4444"] = "Diego" daría error porque es no Mutable.
        myMap = mutableMapOf("1111" to "Santi", "2222" to "Sonia", "3333" to "Guille")  //Ahora hacemos nuestro map mutable (es decir, que pueda cambiar)
        myMap["4444"] = "Diego"
        println(myMap)
        //Otra forma para añadir valores
        myMap.put("5555", "David")  //Esta la considero mas acertada.
        println(myMap)

        //¿Qué pasará si añadimos un nuevo cuya clave ya exista?  Pues que se actualiza el valor.
        myMap.put("1111", "Pedro")
        println(myMap)

        //¿Cómo accedmos al valor de manera rápida?
        println("El nombre del dni 2222 es ${myMap["2222"]}")

        //¿Cómo borramos un valor
        myMap.remove("1111")
        myMap.forEach(){
            println("clave ${it.key} y su valor es ${it.value}")
        }

    }
    private fun bucles(){
        /*
        Creamos dos listas (colecciones)
         */
        val myListInMutable = listOf("Estamos", "en clase de", "santi con", "PMDM")  //sólo lectura
        var myMap: MutableMap<String, String> = mutableMapOf("1111" to "Santi", "2222" to "Sonia", "3333" to "Guille") //lectura y escritura

        //bucle for
        for (elemento in myListInMutable){
            println(elemento)
        }

        for (elemento in myMap){
            println ("La clave ${elemento.key} tiene como valor ${elemento.value}")
        }

        println("Ahora while")

        //Bucle while. Igual que en Java.
        var x=0
        while (x<10){
            print(" $x ")
            x+=2
        }

        println("\nAhora do-while")
        //Bucle do while. Igual que en java.
        x=0
        do{
            print(" $x ")
            x+=2
        }while(x<10)
        println()
    }

    private fun nullPointer(){
        //famoso NullPointerException. Java debe controlarlo pero Kotlin lo puede prevenir muy fácilmente.
        /*
        queremos evitar esto:
        var myVar = null
        println (myVar)  -->Generará un error de compilación, no lo ejecutará, cosa que Java si lo hará con excepción.
        1.- Esto lo controlamos de la forma:   var nombre:<tipo>? = "valor/null"    Con la ?, decimos que será una variable null Safety
        2.- Ahora, kotlin mostrará null cuando el valor sea null. No generará la exceptión.
        3.- Si queremos trabjar con variables que no sean nulos, no pondremos la ? y cuando lo tengas claro, no le pongas la ?
         */
        var mySafety : String ? = "tengo algo"
        println(mySafety)
        mySafety = null
        println("Mira ahora el valor de la variable: $mySafety")

        /*
        ¿Qué sucede si queremos verificar si una variable safety no es null?
         */
        if (mySafety!=null) //forma tradicional.
            println(mySafety.length)


        println(mySafety?.length)  //forma actual. Imprimirá null, pero no dará error.


        /*
        Una forma más elegante es con let. Que haga lo que queramos siempre que no sea nula la variable safery de la forma
        mySafety?.let{
            //codigo que quiero que se ejecute, cuando no sea nulo
        }?: run{
            //codigo que quiero que se ejecute, cuando sea nulo.
        }
         */

        //mySafety = "Santi"
        mySafety?.let{
            println("El numero de caracteres de la variables es ${mySafety.length}")
        }?: run{
            println("Ejemplo de lo que quiero que haga cuando sea nulo.")
        }
    }




    fun probarFunciones(){
        primeraFuncion()
        println("La suma del array es ${devuelveSumaArray(0..10)}")
        println("Otra forma, sin rangos")
        println("La suma del array es ${devuelveSumaArray2(arrayOf(0,1,2,3,4,5,6,7,8,9,10))}")
    }


    private fun pruebaClasesIniciales(){
        println("hola clases iniciales")
        val p = P(2)
        println(p.a)

        val p0= P0()
        println(p0.a)

        val p1 = P1()
        println(p1.a)

        val p1_1 = P1_1()
        println(p1_1.a)

        val p2_1 = P2()
        println(p2_1.a)

        val p2_2 = P2(10)
        println(p2_2.a)

        val p4 = P4(40)
        println (p4.a)

        val p5_1 = P5(50)
        println (p5_1.a)

        val p5_2 = P5(50, 60)
        println ("$p5_2.a y $p5_2.b")

        val p6_1 = P6()
        val p7_2 = P7()
        val p8 = P8(80)

        val p10 = P10()
        Log.d("TAG","${p10.a}")
    }

    /*
   Ejemplo de clase Alumno, con una lista de objetos.
    */
    private fun pruebaClasesIniciales1(){
        var myAlum = Alumno()
        var myAlum2 = Alumno("1234","Santi",40, "953 45 76 56")
        var listAlum : MutableList<Alumno> = mutableListOf()
        listAlum.add(myAlum)
        listAlum.add(myAlum2)
        listAlum.add(Alumno("2222", "paco", 30, "953 55 33 22"))
        listAlum.add(Alumno("3222", "lucia", 30, "953 66 33 22"))
        listAlum.add(Alumno("4222", "antonio", 30, "953 77 33 22"))
        listAlum.add(Alumno("5222", "jose", 30, "953 44 88 22"))

        listAlum.forEach(){
            println("Alumno: $it")
        }
    }


    private fun pruebaClasesIniciales2(){
        println("Creamos objeto")
        val per = PersonaGetSet("santi", 10)
        per.name=null
        println("Datos de persona ${per.name} con una edad ${per.age}")
        val per1 = PersonaGetSet()
        println("Datos de persona ${per1.name} con una edad ${per1.age}")
        val per2 = PersonaGetSet1("paco", 30)
        println("Datos de persona ${per2.name} con una edad ${per2.age}")
    }



    /*
   Método que prueba las clases Persona, Persona2 y Persona3
    */
    private fun pruebaClases(){
        var per1 = Persona("Paco", 40, arrayOf("camarero","programador junio"," analista programador"))

        /*
        Sólo puedo acceder a los miembros que se declaran con var o val. No podría hacer un per1.edad, pero si el resto
         */
        println(per1.name)
        per1.name = "Jose"
        println("Hemos cambiado el nombre a  ${per1.name}")



        //******************Probaremos una clase con seguridad en sus atributos, mediante un enum class
        var per2 = Persona2("Lucia", 25, arrayOf(
            Persona2.Jobs.Programador, Persona2.Jobs.Investigadora
        ))


        var per3 = Persona2("Guille", 23, arrayOf(
            Persona2.Jobs.Programador, Persona2.Jobs.Ingeniero
        ), arrayOf(
            per2
        ))

        println("El primer amigo de ${per3.name} es ${per3.friends?.first()?.name}")

        //*********** Ahora añadiremos un Enum Nacionalidad con un método ***************************
        //Me creo una per4, que tenga de trabajo Ingeniero, ningun amigo y de nacionalidad española
        var per4 = Persona3("Marcos", 26,
            arrayOf(Persona3.Jobs.Ingeniero),
            null,
            Persona3.Nacionality.sp )

        var naciona : Persona3.Nacionality
        naciona = Persona3.Nacionality.ing
        println("Una " + naciona.description())

        println("La persona de nombre ${per4.name}, tiene una ${per4.nacionality.description()}")
        var per5 = Persona3("David", 30,  arrayOf(
            Persona3.Jobs.Programador, Persona3.Jobs.Ingeniero, Persona3.Jobs.Investigador
        ), arrayOf(
            per4
        ), Persona3.Nacionality.ing)
        println("La nacionalidad de ${per5.name} es ${per5.nacionality}")
        per5.nacionality = Persona3.Nacionality.sp
        println("Hemos cambiado la nacionalidad de ${per5.name} a ${per5.nacionality}")

        //************* Probaremos a asociar a nuestro enum class Nacionality un valor para cada tipo.
        var per6 = Persona4(
            "santi", 40, arrayOf(
                Persona4.Jobs.Albañil, Persona4.Jobs.Ingeniero, Persona4.Jobs.Programador
            ),
            null,
            Persona4.Nacionality.sp
        )
        println("El código de la nacionalidad de ${per6.name} es ${per6.nacionality.codNacionality}")

    }



    /*
Son necesarias para mantener mayor seguridad, eficiencia y estructurado.
nested o inner class
1.- Nested significa clase dentro de otra clase
2.- inner significa
*/
    private fun pruebaClasesAnidadas(){

        val cal = Calculadora.Operacion()
        println("La suma de 1 y de 2 es ${cal.suma(1,2)}")
        println("La resta de 5 y de 7 es ${cal.resta(cal.suma(3,2), 7)}")
        println("****Ahora probaremos las clases inner")

        var cal2 = Calculadora(2,3) //creamos nuestro objeto Calculadora
        cal2.OperacionInner().suma() //modificamos resut, a partir de la inner

        println("La operacion suma es ${cal2.resul}")

    }

    private fun pruebaHerencia(){
        val iniesta = Futbolista(1, "Andrés", "Iniesta", 25, 9,"central")
        val yo = Futbolista(2, "Santi", "Rodebnas", 20, 5, "defensa")
        val vicente = Entrenador(3, "Vicente", "Del Bosque", 50, "1234")
        val raul = Masajista(4, "Raul", "Martinez", 40, "Fisioterapeuta", 6)
        var listIntegrantes : MutableList<SeleccionFutbol> = mutableListOf(
            iniesta, yo, vicente, raul
        )

        //imprimir todos los integrantes.
        for (integrante in listIntegrantes){
            println (integrante)
        }

        //voy a hacer lo mismo,  pero comprobando su instancia.
        for (integrante in listIntegrantes)
            when(integrante){
                is Futbolista -> {
                    integrante.playGame()
                }

                is Entrenador -> {
                    integrante.leadGame()
                    integrante.leadTraining()
                }

                is Masajista -> {
                    integrante.giveMassage()
                }
            }
    }

    private fun probarPolimorfismo(){
        val iniesta = FutbolistaAbstracta(1, "Andrés", "Iniesta", 25
            , 9,null)
        val demar = iniesta.demarcacion
        val yo = FutbolistaAbstracta(2, "Santi", "Rodebnas", 20, 5, "defensa")
        val vicente = EntrenadorAbstracta(3, "Vicente", "Del Bosque", 50, "1234")
        val raul = MasajistaAbstracta(4, "Raul", "Martinez", 40, "Fisioterapeuta", 6)
        var listIntegrantes : MutableList<SeleccionFutbolAbstracta> = mutableListOf(
            iniesta, yo, vicente, raul
        )
        //imprimir todos los integrantes, probando las clases abstractas.
        for (integrante in listIntegrantes){
            println(integrante.training())  //método abstracto que lo tienen todas las subclases.
            println(integrante)
        }
    }

    private fun probarInterfaces(){
        var listIntegrantes : MutableList<IntegranteSeleccionFutbol> = mutableListOf(
            Jugador(1, "Andrés", "Iniesta", 25
                , 9,"central"),
            com.pmdm.virgen.tutorial.interfaces.Entrenador(3, "Vicente", "Del Bosque", 50, "1234")
        )
        listIntegrantes.add(Jugador(2, "Santi", "Rodenas", 20, 5, "defensa"))

        for (integrante in listIntegrantes){
            println(integrante)
            println(integrante.training())
            println(integrante.travel())
            println(integrante.concentrarse())
        }
    }

    private fun dataClases(){
        //crearemos un objeto trabajador
        val santi = Worker("santi", 30, "profesor")
        santi.lastWork = "programador"
        santi.anioLastWork = 2001
        val jose = Worker()

        if (santi.equals(jose)){
            println ("Son iguales")
        }else{
            println ("No son iguales")
        }

        val srodenas = Worker("santi", 30, "profesor")
        if (santi.equals(srodenas)){
            println ("Son iguales")
        }else{
            println ("No son iguales")
        }

        //también uso de la opción copy. También me cambio la edad.
        val santiActual = santi.copy(age = 45)
        println(santi.toString())
        println(santiActual.toString())

        //Operaciones componentN. Descomponemos el objeto en dos componentes y asignamos a una constante de tipo tupla.
        val (name, age) = santi
        println("El nombre es $name y la edad es $age")

    }

    private var myDepartaments :  MutableMap<Int, ArrayList<String>> = mutableMapOf()  //Me declaro una propiedad

    private fun probarTypeAlias(){
        var myNewMapDepartaments : MutableMap<Int, ArrayList<String>> = mutableMapOf()
        myNewMapDepartaments.put(1, arrayListOf("Informatica", "Tecnologia", "Robotica"))
        myNewMapDepartaments.put(2, arrayListOf("Matematicas", "Estadistica"))
        myNewMapDepartaments.put(3, arrayListOf("Filosofía", "Debate"))
        myDepartaments = myNewMapDepartaments  //Asigno a mi propiedad el objeto creado.

        /*
        Utilizo ahora el typeAlias
         */
        var myOtherMapDepartaments : MyTypesDepartaments = mutableMapOf()
        myOtherMapDepartaments.put(1, arrayListOf("Informatica", "Tecnologia", "Robotica"))
        myOtherMapDepartaments.put(2, arrayListOf("Matematicas", "Estadistica"))
        myOtherMapDepartaments.put(3, arrayListOf("Filosofía", "Debate"))
        myDepartaments = myOtherMapDepartaments
        for (departaments in myDepartaments)
            println(departaments)
    }

    /*
    Ejemplo de extensiones.
    Podemos añadir extensiones de funcionalidad a clases que no son nuestras. Por ejemplo. Vamos a añadir
    una exensión de formato personalizado a la clase Date. Si nos damos cuenta, al hacer extensiones, esos métodos
    quedan como si fueran propios de la misma implementación de la clase Date.
     */
   /* private fun probarExtensiones(){
        val myDate = Date()
        println("Fecha: " + myDate.changeToUpper() +" con ${myDate.formatSize} caracteres")

        val myDateNullable : Date? = null
        println ("Fecha: " + myDateNullable.changeToUpper() +" con ${myDateNullable.formatSize} caracteres")


    }*/


    private fun probarLambda() {

    }


    private fun probarCallBack(){
        /*
       Probaremos también la llamada síncrona
        */
        mySynFun("Santi",{ myParam->
            println(myParam+" que tal")
            println("De cojones")

        })

        println("Esto cuando se ejecuta en un flujo normal, con llamadas síncronas")
        println ("...........Ahora veremos como se puede intepretar un callback")

        myAsynFun("Santi", {
            println("......Comienza la ejecución asíncrona")
            println(it.uppercase())
            println("......Fin ejecución callback asíncrona")
        })
        println("¿Ves por qué es asíncrono?, no he tenido que esperar a que finalice el callback")
        println("¿Qué has visto en la ejecución anormal?")


    }



    private fun mySynFun(name : String, saludar: (String) -> Unit){
        val myCad = "Hola $name"
        saludar (myCad)

    }


    /*
    Una función callback, es asíncrona. Quiere decir que no sabemos el tiempo que tardará la función
    en ejecutarse. En un flujo normal y corriente, hasta que una función no devuelva la lógica que implemente,
    el cuerpo principal sigue un orden secuencial. En este caso, intentaremos que no sera así. Para ello, la fumnción
    saludar, se ejecutará en un nuevo hilo de ejecución.
    ESTO ES LO QUE SUCEDE EN UNA PETICIÓN DE DATOS A UN BACKEND. ES PREFERIBLE ASÍNCRONA.
     */
    private fun myAsynFun ( name : String, saludar : (String) -> Unit){
        val myCad =  "Hola $name"
        thread{
            Thread.sleep(4000)
            saludar (myCad)  //Lo devolvemos asociado a otra función. No sabemos lo que tardará saludar en ejecutarse.
        }

        thread{
            Thread.sleep(2000)
            saludar ("Hola $name 2")  //Lo devolvemos asociado a otra función. No sabemos lo que tardará saludar en ejecutarse.
        }


        thread{
            Thread.sleep(6000)
            saludar ("Hola $name 3")  //Lo devolvemos asociado a otra función. No sabemos lo que tardará saludar en ejecutarse.
        }
    }


    private fun emularListener() {
        val controller = Controller()
    }
}