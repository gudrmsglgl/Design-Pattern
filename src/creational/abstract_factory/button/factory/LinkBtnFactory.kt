package creational.abstract_factory.button.factory

import creational.abstract_factory.button.click.OnClick
import creational.abstract_factory.button.click.SingleClick
import creational.abstract_factory.button.shape.Shape
import creational.abstract_factory.button.shape.Transparent
import creational.abstract_factory.button.text.H3Text
import creational.abstract_factory.button.text.Text

class LinkBtnFactory : ButtonFactory {
    override fun click(): OnClick {
        return SingleClick()
    }

    override fun getShape(): Shape {
        return Transparent()
    }

    override fun getText(): Text {
        return H3Text()
    }
}