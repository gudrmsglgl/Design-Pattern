package behavioral.command.request

import behavioral.command.receivers.BankApi

class CardPaymentRequest(private val bankApi: BankApi, private val price: Int) : Request {

    override fun execute() {
        bankApi.request(price)
    }

}