package creational.factory.worker

object WorkerFactory {
    fun createWorker(resWorkType: String): Worker = when (resWorkType) {
        "fullTime" -> FullTimeWorker()
        "partTime" -> PartTimeWorker()
        else -> throw IllegalArgumentException("생성할 수 있는 객체명이 아닙니다.")
    }
}