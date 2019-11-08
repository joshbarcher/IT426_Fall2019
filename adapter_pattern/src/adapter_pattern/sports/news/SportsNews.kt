package adapter_pattern.sports.news

class SportsNews {
    private val athletes = mutableListOf<IAthlete>()

    fun trackAthlete(athlete: IAthlete) {
        athletes.add(athlete)
    }

    fun printStats() {
        for (athlete in athletes) {
            val name = athlete.getFullName()
            val stats = athlete.getStats()

            println("Athlete: $name")
            println("*******************")
            for (stat in stats) {
                println(stat)
            }
            println("*******************")
            println()
        }
    }
}

