//package com.example.hospital.Adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.hospital.HospitalListFragment
//import com.example.hospital.HospitalModel.hospitalData
//import com.example.hospital.R
//
//
//class HospitalAdapter(private val context: HospitalListFragment, private val dataOfHospital:List<hospitalData>):
//    RecyclerView.Adapter<HospitalAdapter.ItemViewHolder>() {
//
//    inner  class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {   //made inner class
//        var hospitalName: TextView = view.findViewById(R.id.tvOfHospitalName)
//        var Speciality: TextView = view.findViewById(R.id.tvOfSpeciality)
//
//
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        val adapterLayout = LayoutInflater.from(parent.context)
//            .inflate(R.layout.hospitallistview, parent, false)
//
//
//
//        return ItemViewHolder(adapterLayout)
//    }
//
//
//    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//
//        val Hospitals=dataOfHospital[position]
//       holder.hospitalName.text=Hospitals.name
//        holder.Speciality.text=Hospitals.Speciality
////        holder.deleteItem(position)  //passing value of position to deleteItem function
//
//    }
//
//
//    override fun getItemCount(): Int {
//        return  dataOfHospital.size
//    }
//
//
//
//}