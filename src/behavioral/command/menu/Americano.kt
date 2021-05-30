package behavioral.command.menu

import behavioral.command.menu.option.Option

class Americano(private val num: Int, private vararg val option: Option): Menu {

    override val price: Int = option
        .map { it.additional }
        .reduce { sum, element -> sum + element }
        .plus(2500)

    override fun totalPrice(): Int = price * num

    override fun toString(): String = "음료: 아메리카노(${num}잔) { 옵션: ${option.joinToString(separator = ", ") { it.toString() }} }, 가격: ${totalPrice()}"
}