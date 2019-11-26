package factory_method_pattern.advertisements

//the job of this class is to provide ads, but
//it needs a secondary object to give location-appropriate
//ads
abstract class AdGenerator
{
    var ads: List<Advertisement>? = null

    abstract fun getRegionalAdGenerator(): IRegionalAdGenerator

    fun showRandomAd(): Advertisement?
    {
        loadAds()
        return ads?.random()
    }

    fun getAllAds(): List<Advertisement>?
    {
        loadAds()
        return ads
    }

    private fun loadAds()
    {
        //lazy initialization of our ads list
        if (ads == null)
        {
            val generator = getRegionalAdGenerator()
            ads = generator.getAppropriateAds()
        }
    }
}