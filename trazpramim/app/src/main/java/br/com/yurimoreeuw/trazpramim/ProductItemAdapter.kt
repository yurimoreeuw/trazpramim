package br.com.yurimoreeuw.trazpramim

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//adapter using viewbinding because it is the convention nowadays

//class of the adapter, this will hold a list with all product items with vals defined on ProductItem.kt
class ProductItemAdapter(private val products: List<ProductItem>)
    :RecyclerView.Adapter<ProductItemAdapter.ProductItemViewHolder>() {

    //create the list with itens inflated of product_search.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        //binding not recognizing my file MUST REVIEW
        val binding = ProductSearch
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductItemViewHolder(binding)
    }

    //adapter gets how many items in my list
    override fun getItemCount() = products.size

    //view holder to read all my ids inside of product_search.xml
    //here i'll set the clicklisten function to send the user to product tab
    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        with(holder){
            with(products[position]) {
                //not working
                binding.produc
                //binding.topLearnerName.text = name
                /*
                val hours = "$hours learning hours, $country"
                binding.topLearnerTime.text = hours
                GlideApp.with(holder.itemView.context)
                    .load(badgeUrl)
                    .into(binding.topLearnerImage)

                holder.itemView.setOnClickListener {
                    Toast.makeText(holder.itemView.context, hours,
                        Toast.LENGTH_SHORT).show()
                }
                */

            }
        }
    }

    //NEED TO BIND MY .XML FILE TO THIS BINDING
    inner class ProductItemViewHolder(val binding: ProductSearch)
        :RecyclerView.ViewHolder(binding.root)

}






/*
class ProductItemAdapter (
    private val products: MutableList<ProductItem>
        ): RecyclerView.Adapter<ProductItemAdapter.ProductItemViewHolder>(){

    class ProductItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
       return ProductItemViewHolder(
           LayoutInflater.from(parent.context).inflate(
               R.layout.product_search,
               parent,
               false
           )
       )
    }

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        val currentProductItem = products[position]
        holder.itemView.apply {
            prod
        }
        //(holder.itemView as TextView).text = products[position].toString()
    }

    override fun getItemCount(): Int {
        return products.size
    }
}
*/