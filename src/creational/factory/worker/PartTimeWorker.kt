package creational.factory.worker

class PartTimeWorker : Worker {
    override fun work(): String = "주 3일 근무 입니다."

    override fun quitTime(): String = "5시 퇴근 입니다. "
}