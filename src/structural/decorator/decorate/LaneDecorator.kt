package structural.decorator.decorate

import structural.decorator.component.Display

class LaneDecorator(private val display: Display) : DisplayDecorator(display) {

    override fun draw() {
        super.draw()
        drawLane()
    }

    private fun drawLane() {
        println("\t차선 표시")
    }

}