package com.example.hospital

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hospital.Adapter.HospitalAdapter
import com.example.hospital.model.HospitalData
import com.example.hospital.model.SharedViewModel

//import com.example.hospital.model.FragmentViewModel

class HospitalFragment : Fragment() {


    //private  val fragmentViewModel: FragmentViewModel by viewModels()
    //lateinit var hospitalName:String
     //var hn="zs"

    private lateinit var recyclerView:RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as AppCompatActivity).supportActionBar?.title = "Hospitals"
        // Inflate the layout for this fragment
        val view:View= inflater.inflate(R.layout.fragment_hospital, container, false)
        recyclerView=view.findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(context);
//        val adapter=HospitalAdapter(this,
//            SharedViewModel.hospitalDataStoredList as List<HospitalData>
//        )
//        recyclerView.adapter=adapter


        setHasOptionsMenu(true)

        return view
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        recyclerView.layoutManager = LinearLayoutManager(context);

       model.hospitalDataStoredList.observe(viewLifecycleOwner, Observer {
           val adapter= model.hospitalDataStoredList.value?.let { HospitalAdapter(this, it) }
            recyclerView.adapter=adapter
           Log.i("arraylist", it.toString())

       })




    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.addhospital, menu)

    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

//

}