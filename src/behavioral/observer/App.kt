package behavioral.observer

fun main(){

    val editText = EditText().apply {
        listeners.add(EditTextListener())
        listeners.add(PrintTextLengthListener())
    }

    with (editText) {
        text = "$41"
        text = "LA Town"
    }
}