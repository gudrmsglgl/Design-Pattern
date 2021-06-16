package creational.abstract_factory.button.text

class H2Text : Text {
    override fun textSize(): String = "textSize: 25"

    override fun style(): String = "textStyle: Bold"
}