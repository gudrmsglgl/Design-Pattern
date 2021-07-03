package structural.decorator.decorate2

import structural.decorator.component.Display

abstract class DisplayDecorator2(private val display: Display) : Display by display