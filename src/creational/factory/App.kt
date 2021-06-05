package creational.factory

import creational.factory.worker.WorkerFactory

fun main(){
    val worker = WorkerFactory.createWorker(getWorkType("F"))
    println("근무: ${worker.work()}\n퇴근시간: ${worker.quitTime()}")
}

private fun getWorkType(request: String) = when (request) {
    "F" -> "fullTime"
    "P" -> "partTime"
    else -> "nightTime"
}