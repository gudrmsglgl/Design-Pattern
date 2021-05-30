package behavioral.command.request

import behavioral.command.force.Force

class CancelRequest() : Request {

    override fun execute() {
        println("취소 되었습니다.")
    }

}