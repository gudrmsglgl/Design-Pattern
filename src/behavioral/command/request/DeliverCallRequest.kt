package behavioral.command.request

import behavioral.command.receivers.Deliver

class DeliverCallRequest(private val deliver: Deliver) : Request {

    override fun execute() {
        deliver.call()
    }

}