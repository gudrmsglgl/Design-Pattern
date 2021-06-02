package behavioral.mediator

import behavioral.mediator.destination.Display
import behavioral.mediator.destination.Logger
import behavioral.mediator.signal.SystemSignal
import behavioral.mediator.signal.TcpComm

fun main(){
    val mediator = Mediator().apply {
        addDestination(Display(), Logger())
    }
    val tcp = TcpComm(mediator)
    val sysSignal = SystemSignal(mediator)

    tcp.eventEmit("Connect")
    tcp.eventEmit("[Chat] this is MediatorPattern")
    sysSignal.eventEmit("Chat message emitted")
    tcp.eventEmit("Disconnect")
}