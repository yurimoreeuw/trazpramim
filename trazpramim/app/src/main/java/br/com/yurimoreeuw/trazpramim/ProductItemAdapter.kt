package br.com.yurimoreeuw.trazpramim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

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