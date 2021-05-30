package behavioral.command.request

import behavioral.command.receivers.Cooker

class CookRequest(private val cooker: Cooker) : Request {
    override fun execute() {
        cooker.cook()
    }
}