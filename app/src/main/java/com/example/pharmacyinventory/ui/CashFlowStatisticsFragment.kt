package com.example.pharmacyinventory.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pharmacyinventory.databinding.FragmentCashFlowStatisticsBinding

class CashFlowStatisticsFragment : Fragment() {

    private var _binding: FragmentCashFlowStatisticsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCashFlowStatisticsBinding.inflate(inflater, container, false)
        return binding.root
    }
}