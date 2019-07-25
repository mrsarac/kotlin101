import Profile

object Main {
    @JvmStatic
    fun main(args: Array<String>){
        println("Hello kotlin, my name is mustafa.")
        println(getUser1())
        println(getUser2())
    }

    fun getUser1(): String{
        var name = "Mustafa"
        var age = 36

        // old way
        // var lastname = getLastName()

        // new way
        name += " ${getLastName()}"

        return "$name, $age"
    }

    fun getUser2(): String {
        val person = "${Profile().getFirstName()} ${getLastName()}, ${Profile().getAge()}"
        return "$person"
    }
}