object Main {
    @JvmStatic
    fun main(args: Array<String>){
        println("Hello kotlin, my name is mustafa.")
        println(getUser())
    }

    fun getUser(): String{
        var name = "Mustafa Saraç"
        var age = 36

        return "$name $age"
    }
}