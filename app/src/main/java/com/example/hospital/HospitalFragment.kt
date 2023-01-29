package com.example.hospital

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.RecyclerView
import com.example.hospital.model.HospitalData
import com.example.hospital.model.SharedViewModel

//import com.example.hospital.model.FragmentViewModel

class HospitalFragment : Fragment() {

    //private  val fragmentViewModel: FragmentViewModel by viewModels()
    //lateinit var hospitalName:String
     //var hn="zs"
    lateinit var hospitalDataStoredList: ArrayList<HospitalData>
    lateinit var recyclerView:RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as AppCompatActivity).supportActionBar?.title = "Hospitals"
        // Inflate the layout for this fragment
        val view:View= inflater.inflate(R.layout.fragment_hospital, container, false)

        setHasOptionsMenu(true)
       //  val hospitalName= arguments?.getString("hospitalName").toString()
//             fragmentViewModel.hospitalName.observe(viewLifecycleOwner) {
//                 //Log.i("NAME", it)
//                 hospitalName=it
//                 Log.i("Name",hospitalName)
//
//
//             }
// Log.i("Name",hospitalName)
        //Log.i("nnnn",hn)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView=view.findViewById(R.id.recyclerView)
        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        val tv:TextView=view.findViewById(R.id.textView3)
        model.hospitalData.observe(viewLifecycleOwner, Observer {
            addingItemToList(it)
        })



    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.addhospital, menu)

    }

//    override fun onResume() {
//        super.onResume()
//        Log.i("nnnnn",hn)
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

    fun addingItemToList(hospitalData:HospitalData): ArrayList<HospitalData> {
        hospitalDataStoredList.add(HospitalData(hospitalData.hospitalName,hospitalData.hospitalSpeciality,hospitalData.hospitalLocation))
        return hospitalDataStoredList
    }

}