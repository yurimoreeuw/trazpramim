package br.com.yurimoreeuw.trazpramim

data class ProductItem(
    //product name to be displayed
    val productName: String,
    //val to fill the stars

    //product price to be displayed
    val productPrice: String,
    //location to be displayed
    val productPlace: String,
    //the date that will be delivered to be displayed
    val productDue: String,
    //name of the vendor to be displayed
    val productVendor: String,
)