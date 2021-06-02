package behavioral.mediator

import behavioral.mediator.destination.Destination

class Mediator {
    private val destinations = mutableListOf<Destination>()

    fun addDestination(vararg params: Destination) {
        destinations.addAll(params)
    }

    fun onEvent(from: String, event: String){
        destinations.forEach {
            it.receiveEvent(from, event)
        }
    }
}