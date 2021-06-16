package creational.abstract_factory.button.text

class H1Text : Text {
    override fun textSize(): String = "textSize: 30"

    override fun style(): String = "textStyle: Bold"
}