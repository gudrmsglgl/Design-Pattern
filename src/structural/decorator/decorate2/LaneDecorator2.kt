package structural.decorator.decorate2

import structural.decorator.component.Display

class LaneDecorator2(private val display: Display) : Display by display {
    override fun draw() {
        display.draw()
        drawLane()
    }
    private fun drawLane() {
        println("\t차선 표시")
    }
}