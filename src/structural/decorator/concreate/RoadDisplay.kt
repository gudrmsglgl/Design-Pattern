package structural.decorator.concreate

import structural.decorator.component.Display

class RoadDisplay : Display {
    override fun draw() {
        println("기본 도로 표시")
    }
}