package behavioral.command.menu.option

class NoneOptImpl : Option {
    override val additional: Int = 0
    override fun toString(): String = "없음"
}