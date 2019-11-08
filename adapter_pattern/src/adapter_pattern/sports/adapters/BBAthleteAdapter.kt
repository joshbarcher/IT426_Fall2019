package adapter_pattern.sports.adapters

import adapter_pattern.sports.athletes.BaseballAthlete
import adapter_pattern.sports.news.IAthlete

class BBAthleteAdapter(val bbAthlete: BaseballAthlete) : IAthlete
{
    override fun getFullName(): String
    {
        return "${bbAthlete.fName} ${bbAthlete.lName}"
    }

    override fun getStats(): Array<String>
    {
        //don't know how many stats...
        val list = mutableListOf<String>()

        for (i in bbAthlete.statNames.indices)
        {
            val statName = bbAthlete.statNames[i]
            val statValue = bbAthlete.statValues[i]

            //add a single string stat
            list.add("$statName: $statValue")
        }

        return list.toTypedArray()
    }
}