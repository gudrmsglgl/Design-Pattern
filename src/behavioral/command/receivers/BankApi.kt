package behavioral.command.receivers

class BankApi {
    fun request(price: Int){
        println("${price}원 결제 요청 되었습니다.")
    }
}