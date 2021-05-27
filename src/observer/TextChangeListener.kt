package observer

interface TextChangeListener {
    fun onTextChanged(oldText: String, newText: String)
}