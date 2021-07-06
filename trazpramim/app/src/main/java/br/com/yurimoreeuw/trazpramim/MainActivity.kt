package br.com.yurimoreeuw.trazpramim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //adapter val to hold my adapter list
    private val adapter = ProductItemAdapter(products = )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //create adapter to recycleview work
        product_search.adapter = adapter
    }

    //set clicklisten to all buttons
    //set clicklisten to search bar
    //set clicklisten to product itens

    //create a .kt to implement search filters


}