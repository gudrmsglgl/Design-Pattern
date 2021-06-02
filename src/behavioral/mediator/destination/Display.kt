package behavioral.mediator.destination

class Display : Destination {
    override fun receiveEvent(from: String, event: String) {
        println("[Display] from: $from, event => $event")
    }
}