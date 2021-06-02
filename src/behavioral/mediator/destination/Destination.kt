package behavioral.mediator.destination

interface Destination {
    fun receiveEvent(from: String, event: String)
}