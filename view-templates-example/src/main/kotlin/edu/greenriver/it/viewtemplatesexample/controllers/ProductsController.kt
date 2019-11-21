package edu.greenriver.it.viewtemplatesexample.controllers

import edu.greenriver.it.viewtemplatesexample.model.Product
import edu.greenriver.it.viewtemplatesexample.model.SaleType
import edu.greenriver.it.viewtemplatesexample.services.ProductService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class ProductsController(val service: ProductService)
{
    var fakeProducts = mutableListOf<Product>(
        Product(0, "Surfboard", 99.99, "A board to surf upon", false),
        Product(0, "Bowling Ball", 19.99, "A ball to bowl with", true),
        Product(0, "Bicycle", 199.99, "A bike", false),
        Product(0, "Rocketship", 7.99, "A kid's rocket", true)
    )

    @RequestMapping("/products/afew")
    fun aFewProducts(model: Model): String
    {
        model.addAttribute("product1", fakeProducts[0])
        model.addAttribute("product2", fakeProducts[1])
        return "products/a_few_products"
    }

    @RequestMapping("products/all")
    fun allProducts(model: Model): String
    {
        model.addAttribute("products", fakeProducts)
        return "products/all_products"
    }

    @RequestMapping("/products/{name}")
    fun product(@PathVariable name: String,
                model: Model): String
    {
        //find the product
        for (product in fakeProducts)
        {
            if (product.name == name)
            {
                model.addAttribute("product", product)
            }
        }

        //assume we found it...

        //load the view
        return "products/product"
    }

    @GetMapping("/products/add")
    fun showAddForm(model: Model): String
    {
        model.addAttribute("product", Product())
        return "products/add_product_form"
    }

    @PostMapping("/products/add")
    fun handleAddForm(@ModelAttribute product: Product,
                      model: Model): String
    {
        //save the data...
        fakeProducts.add(product)

        //test to make sure we got it...
        println(product)

        return "redirect:/products/" + product.name
    }

    @GetMapping("/products/edit/{id}")
    fun showEditForm(@PathVariable id: Int,
                     model: Model): String
    {
        val product = fakeProducts[id]
        model.addAttribute("product", product)
        return "products/add_product_form"
    }
}













