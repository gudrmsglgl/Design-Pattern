package behavioral.command.menu

import behavioral.command.menu.option.Option

class Latte(private val num: Int, private vararg val option: Option) : Menu {

    override val price: Int = option
        .map { it.additional }
        .reduce { sum, element -> sum + element }
        .plus(3500)

    override fun totalPrice(): Int = num * price

    override fun toString(): String = "음료: 라떼(${num}잔) { 옵션: ${option.joinToString(separator = ", ") { it.toString() }} }, 가격: ${totalPrice()}"

}