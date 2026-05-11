package product

fun main() {

    StoreRepository.products
        .filter { it.productCategory == ProductCategory.CLOTHING }
        .transformed { it.copy(productPrice = it.productPrice * 2) }
        .transformed { "${it.id} - ${it.productName} - ${it.productPrice}" }
        .forEach(::println)

}

fun <R> List<ProductCard>.transformed(operation: (ProductCard) -> R) : List<R> {

    val result = mutableListOf<R>()

    this.forEach {
        result.add(operation(it))
    }

    return result
}

fun List<ProductCard>.filter(isSuitable: (ProductCard) -> Boolean): List<ProductCard> {

    val result = mutableListOf<ProductCard>()

    this.forEach {product ->
        if (isSuitable(product)) result.add(product)
    }

    return result
}