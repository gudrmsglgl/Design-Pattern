package creational.abstract_factory.button.factory

import creational.abstract_factory.button.click.OnClick
import creational.abstract_factory.button.click.ToggleClick
import creational.abstract_factory.button.shape.Rectangle
import creational.abstract_factory.button.shape.Shape
import creational.abstract_factory.button.text.DefaultText
import creational.abstract_factory.button.text.Text

class ToggleBtnFactory : ButtonFactory {
    override fun click(): OnClick {
        return ToggleClick()
    }

    override fun getShape(): Shape {
        return Rectangle()
    }

    override fun getText(): Text {
        return DefaultText()
    }
}