package creational.abstract_factory.button.factory

import creational.abstract_factory.button.click.OnClick
import creational.abstract_factory.button.click.SelectorClick
import creational.abstract_factory.button.shape.Oval
import creational.abstract_factory.button.shape.Shape
import creational.abstract_factory.button.text.DefaultText
import creational.abstract_factory.button.text.Text

class SelectBtnFactory : ButtonFactory {
    override fun click(): OnClick {
        return SelectorClick()
    }

    override fun getShape(): Shape {
        return Oval()
    }

    override fun getText(): Text {
        return DefaultText()
    }
}