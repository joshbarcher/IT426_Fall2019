package driver

class CalculateChange(var cents: Int)
{
    //list to store the coins
    var coins = mutableListOf<String>()

    //returns the list of coins
    fun coins(): MutableList<String>
    {
        return coins;
    }
}