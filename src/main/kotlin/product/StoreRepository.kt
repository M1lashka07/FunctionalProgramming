package product

import kotlinx.serialization.json.Json
import java.io.File

object StoreRepository {

    private val file = File("products.json")

    private val _products = loadAllProducts()
    val products: List<ProductCard>
        get() = _products.toList()

    private fun loadAllProducts(): List<ProductCard> {

        return Json.decodeFromString(file.readText().trim())

    }

}