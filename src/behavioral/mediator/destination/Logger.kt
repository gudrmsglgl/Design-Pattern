package behavioral.mediator.destination

class Logger : Destination {
    override fun receiveEvent(from: String, event: String) {
        println("[Logger] from: $from, event => $event")
    }
}