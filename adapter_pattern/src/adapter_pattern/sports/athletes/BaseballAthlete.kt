package adapter_pattern.sports.athletes

class BaseballAthlete(
    val fName: String,
    val lName: String
)
{
    val statNames = arrayListOf<String>()
    val statValues = arrayListOf<Any>()

    fun addStat(name: String, value: Any)
    {
        statNames.add(name)
        statValues.add(value)
    }
}

