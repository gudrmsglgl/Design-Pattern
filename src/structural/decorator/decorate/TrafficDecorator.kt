package structural.decorator.decorate

import structural.decorator.component.Display

class TrafficDecorator(private val display: Display) : DisplayDecorator(display) {
    override fun draw() {
        super.draw()
        drawTraffic()
    }

    private fun drawTraffic() {
        println("\t교툥량 표시")
    }
}