package behavioral.command.request

import behavioral.command.force.Force
import behavioral.command.receivers.Cashier

class CashRequest(private val cashier: Cashier) : Request {

    override fun execute() {
        cashier.open()
    }

}