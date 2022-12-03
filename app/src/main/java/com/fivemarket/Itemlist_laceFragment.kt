package com.fivemarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.fivemarket.databinding.FragmentItemlistLaceBinding
import com.fivemarket.viewmodel.ItemViewModel

// 레이스 카테고리 목록 프래그먼트!!
class Itemlist_laceFragment : Fragment() {

    var binding: FragmentItemlistLaceBinding? = null
    private val itemViewModel by activityViewModels<ItemViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemlistLaceBinding.inflate(layoutInflater)
        binding?.recItemsLace?.layoutManager = LinearLayoutManager(context)
        binding?.recItemsLace?.adapter = ItemsAdapter(itemViewModel.items_lace)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}