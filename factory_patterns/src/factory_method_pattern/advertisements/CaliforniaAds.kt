package factory_method_pattern.advertisements

import factory_method_pattern.advertisements.Advertisement
import factory_method_pattern.advertisements.IRegionalAdGenerator

class CaliforniaAds : IRegionalAdGenerator
{
    override fun getAppropriateAds(): List<Advertisement>
    {
        return listOf<Advertisement>(
            Advertisement("Disneyland, the happiest place on earth"),
            Advertisement("Visit Catalina Island!"),
            Advertisement("Beachfront property!")
        )
    }
}