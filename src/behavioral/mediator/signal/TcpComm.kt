package behavioral.mediator.signal

import behavioral.mediator.Mediator

class TcpComm(private val mediator: Mediator) : Signal {

    override fun eventEmit(event: String) = mediator
        .onEvent(
            from = this.toString(),
            event = event
        )

    override fun toString(): String = "Tcp"

}