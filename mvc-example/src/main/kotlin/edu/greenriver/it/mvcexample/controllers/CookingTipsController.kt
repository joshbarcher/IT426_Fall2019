package edu.greenriver.it.mvcexample.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/cooking")
class CookingTipsController
{
    private val tipsByType = mutableMapOf<String, List<String>>(
        "grilling" to listOf<String>(
            "Preheat the Grill.",
            "Keep it Clean.",
            "Oil the Food, Not the Grate.",
            "Keep the Lid Down.",
            "Time and Temperature.",
            "Know When to Be Direct, Know When to be Indirect.",
            "Maintaining Temperatures.",
            "Tame the Flame."
        ),
        "baking" to listOf(
            "Always Have the Correct Butter Consistency.",
            "Room Temperature is KEY.",
            "Read the Recipe Before Beginning.",
            "Always Have Ingredients Prepped.",
            "Learn How to Measure.",
            "Weigh Your Ingredients.",
            "Get an Oven Thermometer.",
            "Keep Your Oven Door Closed."
        ),
        "steaming" to listOf(
            "Don’t Add Too Much Water.",
            "Boil the Water First.",
            "Don’t Steam For Too Long.",
            "Enhance the Steam By Using Stock & Herbs.",
            "Make Sure the Seal is Air-Tight.",
            "Prepare the Food Before Steaming."
        )
    )

    @RequestMapping("/grilling/random")
    @ResponseBody
    fun randomGrillingTip(): String
    {
        val listOfTips = tipsByType.get("grilling")
        val tip = listOfTips?.random()
        return "<h1>A random tip</h1><p>$tip</p>"
    }

    @RequestMapping(path = ["/grilling", "/cooking/grilling/all"])
    @ResponseBody
    fun grillTips(): String
    {
        val listOfTips = tipsByType.get("grilling")
        var results = "<h1>Grilling tips!</h1><ul>"

        if (listOfTips != null)
        {
            for (tip in listOfTips)
            {
                results += "<li>$tip</li>"
            }
        }
        results += "</ul>"

        return results
    }

    @RequestMapping("/grilling/num_tips")
    @ResponseBody
    fun numGrillingTips(): String
    {
        val tips = tipsByType.get("grilling")!!
        return "<h1>Grilling Tips</h1><p>There are ${tips.size} tips"
    }

    @RequestMapping("/baking/num_tips")
    @ResponseBody
    fun numBakingTips(): String
    {
        val tips = tipsByType.get("baking")!!
        return "<h1>Baking Tips</h1><p>There are ${tips.size} tips"
    }

    @RequestMapping("/all_tips")
    @ResponseBody
    fun allTips(): String
    {
        val tips = mutableListOf<String>()

        for (key in tipsByType.keys)
        {
            tips.addAll(tipsByType.get(key)!!)
        }

        var results = "<h1>All tips!</h1><ul>"
        for (tip in tips)
        {
            results += "<li>$tip</li>"
        }
        results += "</ul>"
        return results
    }

    @RequestMapping("/grilling/{id}")
    @ResponseBody
    fun getGrillingTipById(@PathVariable id: Int): String
    {
        val tips = tipsByType.get("grilling")!!

        //double check that I have a good index
        if (id >= 0 && id < tips.size)
        {
            return "<h1>Tip at index - $id</h1><p>${tips[id]}</p>"
        }
        return "<h1>Index $id is not valid!</h1>"
    }

    @RequestMapping("/print/{type}/{emphasis}")
    @ResponseBody
    fun emphasizeTips(@PathVariable type: String,
                      @PathVariable emphasis: Boolean): String
    {
        val tips = tipsByType.get(type)

        if (tips != null)
        {
            var results = "<h1>All tips!</h1><ul>"
            for (tip in tips)
            {
                if (emphasis)
                {
                    results += "<li>${tip.toUpperCase()}</li>"
                }
                else
                {
                    results += "<li>$tip</li>"
                }
            }
            results += "</ul>"
            return results
        }
        return "<h1>Cooking type $type not recognized</h1>"
    }
}














