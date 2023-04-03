import com.suparnatural.core.fs.FileSystem

class Shared {
    fun getString(): String {
        val documentsDirectory = FileSystem.contentsDirectory
        val isFileCreated = FileSystem.touch(documentsDirectory.absolutePath?.byAppending("test.txt")!!)
        println("Running in Shared $isFileCreated")
        return "Hello from Sprint Review! $isFileCreated"
    }
}