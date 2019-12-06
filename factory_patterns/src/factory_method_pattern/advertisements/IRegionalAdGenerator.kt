package factory_method_pattern.advertisements

import factory_method_pattern.advertisements.Advertisement

interface IRegionalAdGenerator
{
    fun getAppropriateAds(): List<Advertisement>
}
