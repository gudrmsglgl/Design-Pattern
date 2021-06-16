package creational.abstract_factory.button.text

class DefaultText : Text {
    override fun textSize(): String = "textSize: 15"

    override fun style(): String = "textStyle: normal"
}