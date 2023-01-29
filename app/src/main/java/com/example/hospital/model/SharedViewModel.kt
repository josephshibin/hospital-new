package com.example.hospital.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    val hospitalData=MutableLiveData<HospitalData>()
    //var hospitalName=MutableLiveData<String>()


    fun setData(addedData:HospitalData){
        hospitalData.value=addedData

    }
}