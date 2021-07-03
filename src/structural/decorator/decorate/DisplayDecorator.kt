package structural.decorator.decorate

import structural.decorator.component.Display

abstract class DisplayDecorator(private val display: Display) : Display {

    override fun draw() {
        this.display.draw()
    }

}