package com.pmdm.virgen.srodenas.tutorial.lambda

import com.pmdm.virgen.srodenas.tutorial.lambda.Repository.myListModules

class Controller {
    private lateinit var adapter: Adapter
    private lateinit var myList: MutableList<String>

    init {
        println("Lanzamos el ejemplo")
        myList = myListModules.toMutableList()

        adapter = Adapter(myList,
            {
                    position-> println("Modifico el módulo ${myList[position]}")
            },
            {
                    position-> println("Elimino el módulo ${myList[position]}")

            }
        )
    }
}