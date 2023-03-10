package com.example.hospital

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.hospital.model.HospitalData
import com.example.hospital.model.SharedViewModel

//import com.example.hospital.model.FragmentViewModel


class AddHospitalFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as AppCompatActivity).supportActionBar?.title = "Add Hospital"
        // Inflate the layout for this fragment
        // hospitalName=view.findViewById(R.id.etHospitalName)


        // nameOfHospital=hospitalName.text.toString()
        //Log.i("name",nameOfHospital)
//        val hospitalSpeciality=speciality.text
//        val hospitalLocation=location.text

        // val bundle=Bundle()
        //bundle.put...
        // val hospitalFragment=HospitalFragment()
        //hospitalFragment.arguments=bundle
        //fragmentViewModel.setData(nameOfHospital)


        return inflater.inflate(R.layout.fragment_add_hospital, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val hospitalName: EditText = view.findViewById(R.id.etHospitalName)
        val saveBtn: Button = view.findViewById(R.id.btnSave)
        val speciality:EditText = view.findViewById(R.id.etSpeciality)
        val location:EditText = view.findViewById(R.id.etLocation)
        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        saveBtn.setOnClickListener {
             val nameOfHospital=hospitalName.text.toString()
            val hospitalSpeciality=speciality.text.toString()
            val hospitalLocation=location.text.toString()
         model.setData(HospitalData(nameOfHospital,hospitalSpeciality,hospitalLocation))
            //val nm=hospitalName.text.toString()


            view.findNavController().navigate(R.id.action_addHospitalFragment_to_hospitalFragment)
           // Log.i("name", nm)
            //fragmentViewModel.setData(nameOfHospital)

        }
    }


}