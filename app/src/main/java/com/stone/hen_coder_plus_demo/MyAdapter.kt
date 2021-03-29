package com.stone.hen_coder_plus_demo

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.stone.hen_coder_plus_demo.databinding.RecyclerItemBinding

class MyAdapter(data: MutableList<String>) :
    BaseQuickAdapter<String, BaseDataBindingHolder<RecyclerItemBinding>>(
        R.layout.recycler_item,
        data
    ) {


    override fun onItemViewHolderCreated(
        viewHolder: BaseDataBindingHolder<RecyclerItemBinding>,
        viewType: Int
    ) {
        DataBindingUtil.bind<RecyclerItemBinding>(viewHolder.itemView)
    }

    override fun convert(holder: BaseDataBindingHolder<RecyclerItemBinding>, item: String) {
        val dataBinding = holder.dataBinding
        dataBinding?.button?.text = item
    }


}