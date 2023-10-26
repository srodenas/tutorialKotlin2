package com.pmdm.virgen.srodenas.tutorial.lambda

class ViewHolderExample (val pos: Int,
    val onUpdateClick: (Int) -> Unit,
    val onDeleteClick: (Int) -> Unit
){
   init {
       initEvent()
   }

    private fun initEvent(){
        try{
            val v = (1..10).toList().random()
            when (v){
                in 1..5-> {
                    Thread.sleep(5000)
                    onUpdateClick(pos)
                }

                in 6..10-> {
                    Thread.sleep(3000)
                    onDeleteClick(pos)
                }

            }
        }catch(e: InterruptedException){
            e.printStackTrace()
        }
    }
}