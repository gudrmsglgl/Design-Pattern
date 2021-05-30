package behavioral.command.force

import behavioral.command.menu.Menu
import behavioral.command.request.Request

class Force {

    private val menus: MutableList<Menu> = mutableListOf()

    fun process(vararg requests: Request) {
        requests.forEach { it.execute() }
        menus.clear()
    }

    fun addMenu(vararg param: Menu) {
        menus.addAll(param)
        showOrder()
    }

    private fun showOrder() {
        menus.forEach { println(it) }
        println("총 가격: ${menus
            .map { it.totalPrice() }
            .reduce { sum, element -> sum + element }
        }")
        println()
    }

    fun totalPrice(): Int =
        menus
            .map { it.totalPrice() }
            .reduce { sum, element -> sum + element }

}