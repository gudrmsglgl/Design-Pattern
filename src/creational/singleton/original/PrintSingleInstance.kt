package creational.singleton.original

class PrintSingleInstance private constructor(private val param: String) {
    companion object {
        @Volatile
        private var instance: PrintSingleInstance? = null

        @Synchronized
        fun getInstance(param: String) = instance
            ?: PrintSingleInstance(param).also { instance = it }
    }
    fun print() = "Type: Parameter($param) -> Like Java Singleton"
}