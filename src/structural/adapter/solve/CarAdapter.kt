package structural.adapter.solve

import structural.adapter.base.Car
import structural.adapter.base.Train

class CarAdapter(private val train: Train) : Car {

    override fun move() = train.moveOnTrail()

}