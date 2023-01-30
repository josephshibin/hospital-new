package com.example.hospital.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {



     var  hospitalDataStoredList = MutableLiveData<ArrayList<HospitalData>?>()
    //var hospitalName=MutableLiveData<String>()


    fun setData(addedData:HospitalData){
       // hospitalDataStoredList.value?.add(addedData)
        var newList = hospitalDataStoredList.value
        newList?.let {
            it.add(addedData)
        }?: kotlin.run {
             newList = ArrayList<HospitalData>()
            newList!!.add(addedData)
        }

        hospitalDataStoredList.value=newList

    }

}