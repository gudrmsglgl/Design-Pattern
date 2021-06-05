package creational.factory.worker

class FullTimeWorker : Worker {
    override fun work(): String = "주 5일 근무 입니다."

    override fun quitTime(): String = "7시 퇴근 입니다."
}