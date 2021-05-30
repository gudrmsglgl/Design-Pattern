package behavioral.command.menu

interface Menu {
    val price: Int
    fun totalPrice(): Int
}