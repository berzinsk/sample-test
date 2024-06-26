import kotlin.random.Random

data class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
)

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"

        return firstWord
    }

    fun getNameFor(person: Person): String {
        return person.firstName + " " + person.lastName
    }

    fun test() {
        
    }

    fun createRandomPerson(): Person {
        return Person(firstName = "John", lastName = "Doe", age = 30)
    }
}
