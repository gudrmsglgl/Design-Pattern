package behavioral.command

import behavioral.command.force.Force
import behavioral.command.menu.Americano
import behavioral.command.menu.Latte
import behavioral.command.menu.MocaCoffee
import behavioral.command.menu.option.DecafImpl
import behavioral.command.menu.option.ExtraShotImpl
import behavioral.command.menu.option.NoneOptImpl
import behavioral.command.receivers.BankApi
import behavioral.command.receivers.Cooker
import behavioral.command.receivers.Deliver
import behavioral.command.request.CardProcessRequest
import behavioral.command.request.CookRequest
import behavioral.command.request.DeliverCallRequest

fun main(){

    val force = Force()

    with (force) {
        addMenu(
            Americano(2, DecafImpl(), ExtraShotImpl(2)),
            Latte(1, ExtraShotImpl(2)),
            MocaCoffee(1, NoneOptImpl())
        )

        process(
            CardProcessRequest(BankApi(), totalPrice()),
            DeliverCallRequest(Deliver()),
            CookRequest(Cooker())
        )
    }

}