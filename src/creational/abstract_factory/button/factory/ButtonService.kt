package creational.abstract_factory.button.factory

class ButtonService(private val btnFactory: ButtonFactory) {
    fun makeButton(): String =
        btnFactory.getShape().shape() + ", " +
                btnFactory.getText().style() + ", " + btnFactory.getText().textSize() + ", " +
                btnFactory.click().onClick()
}