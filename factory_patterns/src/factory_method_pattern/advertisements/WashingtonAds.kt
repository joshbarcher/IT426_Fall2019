package factory_method_pattern.advertisements

class WashingtonAds : IRegionalAdGenerator
{
    override fun getAppropriateAds(): List<Advertisement>
    {
        return listOf<Advertisement>(
            Advertisement("Come visit Mount Rainier"),
            Advertisement("Seattle Starbucks is great!"),
            Advertisement("The Seahawks are headed to the Super Bowl!")
        )
    }
}