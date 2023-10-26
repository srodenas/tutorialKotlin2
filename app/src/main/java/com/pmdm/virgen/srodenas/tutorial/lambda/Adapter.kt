package com.pmdm.virgen.srodenas.tutorial.lambda

class Adapter (var modules : List<String>,
    val onUpdateClick: (Int) -> Unit,
    val onDeleteClick: (Int) -> Unit

)
{
    private lateinit var myView : ViewHolderExample

    init {
        for(i in 1..modules.size-1){
            paintView(i)
        }

    }

    private fun paintView(pos:Int) {
        val myView = ViewHolderExample(
            pos,
            onUpdateClick,
            onDeleteClick
        )
    }

}