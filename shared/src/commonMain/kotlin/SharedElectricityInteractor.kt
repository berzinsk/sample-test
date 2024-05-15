data class Electric(
    val id: String,
    val objectName: String,
    val consumption: Double
)

class SharedElectricityInteractor {
    fun getElectricity(): List<Electric> {
        val object1 = Electric(id = getRandomString(), objectName = "Object 1", consumption = 234.00)
        val object2 = Electric(id = getRandomString(), objectName = "Object 2", consumption = 426.00)
        val object3 = Electric(id = getRandomString(), objectName = "Object 3", consumption = 138.00)

        return listOf(object1, object2, object3)
    }

    fun getRandomString() : String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..10)
            .map { allowedChars.random() }
            .joinToString("")
    }
}
