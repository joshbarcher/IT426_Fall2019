package adapter.sports.athletes

class FootballAthlete(
    val first: String,
    val middle: Char,
    val last: String
)
{
    val stats = mutableMapOf<String, Any>()

    fun newStat(name: String, value: Any)
    {
        stats[name] = value
    }
}

