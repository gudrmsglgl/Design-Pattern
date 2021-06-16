package creational.abstract_factory.button.factory

import creational.abstract_factory.button.click.OnClick
import creational.abstract_factory.button.shape.Shape
import creational.abstract_factory.button.text.Text

interface ButtonFactory {
    fun click(): OnClick
    fun getShape(): Shape
    fun getText(): Text
}