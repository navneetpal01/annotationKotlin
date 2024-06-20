package com.example.annotations



@Smartphone(os = "Android")
@Smartphone(os = "ios")
class Phone{

    @set : Smartphone(os = "Android")
    var display1 : String = "landscape"
    @get : Smartphone(os = "Android")
    var display2 : String = "landscape"


    @Smartphone("Android")
    @Smartphone("Android")
    fun camera(){


    }

}