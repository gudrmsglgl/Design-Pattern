package behavioral.observer

class PrintTextLengthListener : TextChangeListener {

    private var result = ""

    override fun onTextChanged(oldText: String, newText: String) {
        result = "oldText size: ${oldText.length} -> newText size: ${newText.length}"
        println(result)
    }
}