package structural.decorator

import structural.decorator.concreate.RoadDisplay
import structural.decorator.decorate.LaneDecorator
import structural.decorator.decorate.TrafficDecorator
import structural.decorator.decorate2.LaneDecorator2
import structural.decorator.decorate2.TrafficDecorator2

fun main(){
    val road = RoadDisplay()
    road.draw()

    val roadWithLane = LaneDecorator(road)
    roadWithLane.draw()

    val roadWithTraffic = TrafficDecorator(road)
    roadWithTraffic.draw()

    val roadWithLaneAndTraffic = TrafficDecorator(LaneDecorator(RoadDisplay()))
    roadWithLaneAndTraffic.draw()

    println("Kotlin Delegate func by")

    val roadWithLane2 = LaneDecorator2(road)
    roadWithLane2.draw()

    val roadWithTraffic2 = TrafficDecorator2(road)
    roadWithTraffic2.draw()

    val roadWithLaneAndTraffic2 = TrafficDecorator2(LaneDecorator2(RoadDisplay()))
    roadWithLaneAndTraffic2.draw()

}