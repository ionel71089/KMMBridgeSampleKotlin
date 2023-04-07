class Shared {
    fun getString(): String {
        println("Running in Shared")
        return "There are only ${daysUntilNewYear()} days left until New Year! 🍌"
    }
}