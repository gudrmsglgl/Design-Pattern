package behavioral.command.menu.option

class ExtraShotImpl(private val num: Int) : Option {
    override val additional: Int = 500 * num
    override fun toString(): String = "샷: $num"
}