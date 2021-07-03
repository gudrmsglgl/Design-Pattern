package structural.decorator.decorate2

import structural.decorator.component.Display

class TrafficDecorator2(private val display: Display) : Display by display {

    override fun draw() {
        display.draw()
        drawTraffic()
    }

    private fun drawTraffic() {
        println("\t교툥량 표시")
    }
}