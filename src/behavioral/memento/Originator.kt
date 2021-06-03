package behavioral.memento

class Originator(
    private var state1: String,
    private var state2: String
) {

    fun createMemento() = Memento(state1, state2)

    fun restoreMemento(memento: Memento) {
        this.state1 = memento.state1
        this.state2  = memento.state2
    }

    fun modifyState(state1: String, state2: String) {
        this.state1 = state1
        this.state2 = state2
    }

    override fun toString(): String = "Originator($state1, $state2)"
}