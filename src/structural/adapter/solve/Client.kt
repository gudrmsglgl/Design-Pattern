package structural.adapter.solve

import structural.adapter.base.Car

class Client(private val car: Car) {
    fun move() = car.move()
}