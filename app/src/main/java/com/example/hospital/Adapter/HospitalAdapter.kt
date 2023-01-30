package com.example.hospital.Adapter

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.hospital.HospitalDetailsFragment
import com.example.hospital.HospitalFragment
//import com.example.hospital.HospitalListFragment
//import com.example.hospital.HospitalModel.hospitalData
import com.example.hospital.R
import com.example.hospital.model.HospitalData


class HospitalAdapter(private val context: HospitalFragment, private val dataOfHospital: ArrayList<HospitalData>):
    RecyclerView.Adapter<HospitalAdapter.ItemViewHolder>() {


    inner  class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {   //made inner class
        var hospitalName: TextView = view.findViewById(R.id.tvOfHospitalName)
        var speciality: TextView = view.findViewById(R.id.tvOfSpeciality)

        fun onClick(index: Int){
            var onClickView: CardView =view.findViewById(R.id.cardViewHospital)
            onClickView.setOnClickListener {
//                val bundle=Bundle()
//                bundle.putInt("position",index)
//                 val hospitalDetailsFragment=HospitalDetailsFragment()
//                hospitalDetailsFragment.arguments=bundle


                view.findNavController().navigate(R.id.action_hospitalFragment_to_hospitalDetailsFragment)
                // Log.i("position", index.toString())
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.hospitallistview, parent, false)



        return ItemViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val hospitals=dataOfHospital[position]
       holder.hospitalName.text=hospitals.hospitalName
        holder.speciality.text=hospitals.hospitalSpeciality
        holder.onClick(position)  //passing value of position to onClick function

    }


    override fun getItemCount(): Int {
        return  dataOfHospital.size
    }



}