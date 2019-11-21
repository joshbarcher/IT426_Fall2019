package edu.greenriver.it.viewtemplatesexample.services

import edu.greenriver.it.viewtemplatesexample.model.Product
import edu.greenriver.it.viewtemplatesexample.repositories.IProductRepository
import org.springframework.stereotype.Service

//business logic and validation goes in here
@Service
class ProductService(val repo: IProductRepository)
{
    fun getProducts(): List<Product>
    {
        return repo.findAll().toList()
    }

    fun getProductByName(name: String)
    {
        val product = repo.getByName(name)
    }
}