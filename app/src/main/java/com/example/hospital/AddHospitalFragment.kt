package com.example.hospital

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity


class AddHospitalFragment : Fragment() {
    lateinit var hospitalName:EditText
    lateinit var speciality:EditText
    lateinit var location:EditText
    lateinit var saveBtn:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_hospital, container, false)
        hospitalName=view.findViewById(R.id.etHospitalName)
        speciality=view.findViewById(R.id.etSpeciality)
        location=view.findViewById(R.id.etLocation)
        saveBtn=view.findViewById(R.id.btnSave)

        val nameOfHospital=hospitalName.text
        saveBtn.setOnClickListener {
            Log.i("name",nameOfHospital.toString())
        }


        return  view

    }




}