package factory_method_pattern.advertisements

interface IRegionalAdGenerator
{
    fun getAppropriateAds(): List<Advertisement>
}
