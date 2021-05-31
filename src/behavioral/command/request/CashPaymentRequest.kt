package behavioral.command.request

import behavioral.command.force.Force
import behavioral.command.receivers.Cashier

class CashPaymentRequest(private val cashier: Cashier) : Request {

    override fun execute() {
        cashier.open()
    }

}