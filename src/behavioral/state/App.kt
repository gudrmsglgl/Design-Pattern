package behavioral.state

import behavioral.state.delivery.Delivery

fun main(){
    val delivery = Delivery()

    with (delivery) {
        println("현재 배달 상태: ${status.name} \n")
        println("배달 상태 다음단계로 변경: ${forwardStatus()}")
        println("배달 상태 다음단계로 변경: ${forwardStatus()}")
        println("배달 상태 다음단계로 변경: ${forwardStatus()}")
        println("배달 상태 이전단계로 변경: ${backwardStatus()} \n")
        println("현재 배달 상태: ${status.name}")
    }
}