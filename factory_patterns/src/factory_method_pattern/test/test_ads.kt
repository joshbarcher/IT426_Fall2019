package factory_method_pattern.test

import factory_method_pattern.factories.AdGenerator
import factory_method_pattern.factories.CaliforniaAdGenerator

fun main()
{
    val generator: AdGenerator = CaliforniaAdGenerator() //WashingtonAdGenerator()

    for (ad in generator.getAllAds()!!)
    {
        println(ad.message)
    }
}