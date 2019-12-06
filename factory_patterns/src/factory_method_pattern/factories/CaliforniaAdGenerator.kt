package factory_method_pattern.factories

import factory_method_pattern.advertisements.CaliforniaAds
import factory_method_pattern.advertisements.IRegionalAdGenerator

class CaliforniaAdGenerator : AdGenerator()
{
    override fun getRegionalAdGenerator(): IRegionalAdGenerator
    {
        return CaliforniaAds()
    }
}