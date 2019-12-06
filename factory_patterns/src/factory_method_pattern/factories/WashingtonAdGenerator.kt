package factory_method_pattern.factories

import factory_method_pattern.advertisements.CaliforniaAds
import factory_method_pattern.advertisements.IRegionalAdGenerator
import factory_method_pattern.advertisements.WashingtonAds

class WashingtonAdGenerator : AdGenerator()
{
    override fun getRegionalAdGenerator(): IRegionalAdGenerator
    {
        return WashingtonAds()
    }
}