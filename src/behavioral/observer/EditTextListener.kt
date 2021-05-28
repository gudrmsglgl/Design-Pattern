package behavioral.observer

class EditTextListener : TextChangeListener {

    private var result: String = ""

    override fun onTextChanged(oldText: String, newText: String) {
        result = "oldText: $oldText -> newText: $newText"
        println(result)
    }
}