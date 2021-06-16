package creational.abstract_factory.button.text

class H3Text : Text {
    override fun textSize(): String = "textSize: 20"

    override fun style(): String = "textStyle: Bold"
}