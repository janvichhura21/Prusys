package com.example.prusys

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.prusys.adapter.HomeAdapter
import com.example.prusys.databinding.FragmentHomeBinding
import com.example.prusys.model.Info

class HomeFragment : Fragment() {
    lateinit var binding:FragmentHomeBinding
    lateinit var homeAdapter:HomeAdapter
    var info:ArrayList<Info> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        info.addAll(listOf(Info("27\nM/KG",R.drawable.moisture,"Soil Moisture"),
            Info("29°C",R.drawable.temperature,"Temperature"),
            Info("87%",R.drawable.hygrometer,"Humidity"),
            Info("20°C",R.drawable.torrential_rain,"Rainfall"),
            Info("100\nnm",R.drawable.rain_light_sensor,"Light_PAR"),
            Info("17\nKM/H",R.drawable.wind,"Speed")
            ))
        setRv()
    }

    private fun setRv() {
        binding.rv.apply {
            layoutManager=GridLayoutManager(requireContext(),2)
            homeAdapter= HomeAdapter(requireContext(),info)
            adapter=homeAdapter
        }
    }
}