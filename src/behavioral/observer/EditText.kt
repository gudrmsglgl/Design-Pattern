package behavioral.observer

import kotlin.properties.Delegates

class EditText {

    val listeners = mutableListOf<TextChangeListener>()

    var text: String by Delegates.observable(""){ _, old, new ->
        if (old.isNotEmpty())
            listeners.forEach { it.onTextChanged(old, new) }
    }

}