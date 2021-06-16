package creational.abstract_factory.button

import creational.abstract_factory.button.factory.ButtonService
import creational.abstract_factory.button.factory.LinkBtnFactory
import creational.abstract_factory.button.factory.SelectBtnFactory
import creational.abstract_factory.button.factory.ToggleBtnFactory

fun main(){
    val linkButton = ButtonService(LinkBtnFactory())
    println(linkButton.makeButton())

    val selectButton = ButtonService(SelectBtnFactory())
    println(selectButton.makeButton())

    val toggleButton = ButtonService(ToggleBtnFactory())
    println(toggleButton.makeButton())
}