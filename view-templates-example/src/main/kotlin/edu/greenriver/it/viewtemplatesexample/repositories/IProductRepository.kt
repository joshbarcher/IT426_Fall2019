package edu.greenriver.it.viewtemplatesexample.repositories

import edu.greenriver.it.viewtemplatesexample.model.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IProductRepository : CrudRepository<Product, Long>
{
    fun getByName(name: String): Optional<Product>
    fun getByDescription(description: String): Optional<Product>
}