package com.pmdm.virgen.tutorial.clases

/*
De esta forma, estamos sobreescribiendo los getters y setters.
1.- Cuando definimos el constructor por defecto, no se llaman a los setters. Se utilizan
la inicialización de var name : String?null y la de var edad : Int = 0
2.- Cuando definimos el constructor secundario, recibimos los dos parámetros. Se debe delegar
con this al constructor por defecto, los parmetros que queramos. En nuestro caso no tiene ninguno.
En la llamada al constructor por secundario, se llaman directamente a los setters.
 */

public class PersonaGetSet(){

    //define ya su constructor por defecto con los ()
//----------------------------propiedad nombre------------------------------------

    var name : String?=null //para el constructor por defecto. Sin parámetros.

        set(value){  //setters
            if (value != null) {
                if (value.isEmpty()) {
                    println("El valor debe contener texto")
                }
                else {
                    field = value
                }
            }
            else {
                println("Has pasado un null al nombre y no esta permitido")
               
            }
        }
        get(){
            field?.let{
                return field
            }?: run{
                return "<Sin nombre>"
            }
        }  //getter

    //----------------------------propiedad edad------------------------------------
    var age : Int = 1 //para el constructor por defecto. Sin parámetros.

        set(value){
            if (value >= 18)
                field = value
            else
                field = 0
        }
        get()=field



    constructor(_name: String?, _age: Int) : this() {
        /*
        Cuando se modifican los parámetros, se llaman directamente a los setters.
         */
        name = _name
        age = _age
    }
}




/*
1.- Si definimos constructor por defecto con dos parámetros, no podemos sobreescribir con
constructor (val _name:String?, val _age:Int). Estaríamos creando conflicto.
2.- Si queremos extender al constructor por defecto, podemos hacer una extensión con el
init. Dentro del init, si hacemos un name = _name, se llamará al setters, por tanto cumpliría
nuestra funcionalidad.
 */
public class PersonaGetSet1(_name:String?,  _age:Int) {

//----------------------------propiedad nombre------------------------------------

   var name : String?=_name //para el constructor por defecto. Permitimos nulo

   set(value){  //setters
      if (value!!.isEmpty())
          println("El valor debe contener texto")
       else
           field = value
   }
   get()=  field  //getter

//----------------------------propiedad edad------------------------------------
   var age : Int = _age  //para el constructor por defecto

   set(value){
       if (value >= 18)
           field = value
       else
           field = 0
   }
   get()=field


    //Extensión al constructor por defecto. Se llamarán a los setters.
    init{
        name =_name
        age = _age
    }

}  //fin clase.
