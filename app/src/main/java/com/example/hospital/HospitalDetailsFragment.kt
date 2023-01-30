package com.example.hospital

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.hospital.model.HospitalData
import com.example.hospital.model.SharedViewModel


class HospitalDetailsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity).supportActionBar?.title = "Add Hospital"
        val view=inflater.inflate(R.layout.fragment_hospital_details, container, false)
       //val position= arguments?.getInt("position")
        //Log.i("position", position.toString())
        return  view
    }

}