package com.example.annotations



// @Target(AnnotationTarget.CLASS)  Tells that this annotation is only applicable to the classes
@Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION)  //Tells that this annotation is applicable to both classes and functions
//@Retention(AnnotationRetention.SOURCE) //Scope of the annotations weather it is visible during the compile time or run time. Here the annotation will
// be showed during the Compile Time
@Retention(AnnotationRetention.SOURCE) //Scope of the annotations weather it is visible during the compile time or run time. Here the annotation will
// be showed during the Run Time
annotation class Smartphone(){

}