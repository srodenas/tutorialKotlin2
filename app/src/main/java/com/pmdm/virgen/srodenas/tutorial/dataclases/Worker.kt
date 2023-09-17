package com.pmdm.virgen.tutorial.dataclases

data class Worker(val name: String = "", val age : Int = 20, val work : String = ""){
    var lastWork : String = "" //podemos seguir añadiendo propiedades
    var anioLastWork : Int

    init {
        this.anioLastWork = 2023
    }
}
