package creational.singleton

import creational.singleton.`object`.PrintInstance
import creational.singleton.original.PrintSingleInstance

fun main(){
    println("Singleton Pattern: ${PrintInstance.print()}")
    println("Singleton Pattern: ${PrintSingleInstance.getInstance("싱글톤패턴").print()}")
}