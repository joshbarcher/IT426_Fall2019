package edu.greenriver.it.mvcexample.controllers

class CookingTipsController
{
    private val tipsByType = mutableMapOf<String, List<String>>(
        "grilling" to listOf<String>(
            "Preheat the Grill.",
            "Keep it Clean.",
            "Oil the Food, ArithmeticOpTable.UnaryOp.Not the Grate.",
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
}