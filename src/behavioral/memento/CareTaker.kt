package behavioral.memento

class CareTaker {

    private val mementos = mutableListOf<Memento>()

    fun saving(originator: Originator) {
        mementos.add(originator.createMemento())
    }

    fun restoring(originator: Originator) {
        if (this.mementos.size == 0) return

        originator.restoreMemento(this.mementos.last())
    }
}