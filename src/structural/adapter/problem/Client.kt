package structural.adapter.problem

import structural.adapter.base.Car
import structural.adapter.base.Train

class Client(private val car: Car, private val train: Train) {

    fun moveViaCar() = car.move()

    fun moveViaTrain() = train.moveOnTrail()

}