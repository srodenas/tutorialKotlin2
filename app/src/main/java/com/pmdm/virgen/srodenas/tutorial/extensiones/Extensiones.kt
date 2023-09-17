package com.pmdm.virgen.tutorial.extensiones

import java.text.SimpleDateFormat
import java.util.*

/*  EXTENSIONES DE CLASE
Date representa fechas.
1.- Expecificamos un patrón con SimpleDateFormat
2.- A nuestro myFormat, le pasamos nuestro objeto base this (Date) y con su función format, retorna un String
 */
fun Date?.myFormat():String?{  //Puede ser nulo el Date y en ese caso, también puedo devolver un null en vez de un String.
    val myFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    if (this != null)
        return myFormat.format(this)
    else
        return null  //porque Date es nulo

}

val Date?.formatSize : Int
    get() = this.myFormat()?.length ?: 0  //con ?: en el caso de que sea nulo, retornamos un 0.


fun Date?.changeToUpper() = myFormat()?.uppercase() ?: null
