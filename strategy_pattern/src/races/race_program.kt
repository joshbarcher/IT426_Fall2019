package races

fun main()
{
    val runners = arrayOf(
        Runner("Stan Williams",
            arrayOf(Document("Fall Registration"))
        ),
        Runner("Michelle Smith",
            arrayOf(Document("Fall Registration"))
        ),
        Runner("Tyler Patrick", arrayOf()),
        Runner("Jean Davis", arrayOf(
                Document("Summer Registration"),
                Document("Liability waiver"))
        ),
        Runner("Susie Brown", arrayOf(
                Document("Summer Registration"),
                Document("Liability waiver"))
        ),
        Runner("Terry Wilson",
            arrayOf(Document("Summer Registration"))
        )
    )

    //we have a race and a registration object
    val fallRace = Race("Mud Runner 2000", SummerRegistration())

    //register all runners and start the race
    runners.forEach {
        fallRace.register(it)
    }
    fallRace.raceDay()
}

data class Document(val name: String)
data class Runner(val name: String,
                  val documents: Array<Document>)

interface Registration
{
    fun validate(runners: MutableSet<Runner>): MutableSet<Runner>
}

class Race (name: String, register: Registration) {
    val name = name
    var runners = mutableSetOf<Runner>()
    val register: Registration = register

    fun register(runner: Runner) {
        if (!runners.contains(runner)) {
            runners.add(runner)
        }
    }

    fun raceDay()
    {
        //welcome everyone
        println("Welcome to the $name race!")
        println("**************************")

        //this part is configurable
        runners = register.validate(runners)

        println("Running today: ")
        runners.forEach { println(it.name) }
        println()

        val winner = waitForWinner()
        println("${winner.name} wins the race")
        println()
    }

    fun waitForWinner() : Runner
    {
        return runners.random()
    }
}

class FallRegistration : Registration {
    override fun validate(runners: MutableSet<Runner>): MutableSet<Runner> {
        val referenceDoc = Document("Fall Registration")
        return runners.filter {
            it.documents.contains(referenceDoc)
        }.toMutableSet()
    }
}

class SummerRegistration : Registration {
    //winter requires a winter registration and
    override fun validate(runners: MutableSet<Runner>): MutableSet<Runner> {
        val referenceDoc1 = Document("Summer Registration")
        val referenceDoc2 = Document("Liability waiver")
        return runners.filter {
            it.documents.contains(referenceDoc1) &&
            it.documents.contains(referenceDoc2)
        }.toMutableSet()
    }
}

