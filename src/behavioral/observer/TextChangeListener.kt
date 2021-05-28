package behavioral.observer

interface TextChangeListener {
    fun onTextChanged(oldText: String, newText: String)
}