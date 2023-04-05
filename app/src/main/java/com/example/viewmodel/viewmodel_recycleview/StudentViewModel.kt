package com.example.viewmodel.viewmodel_recycleview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodel.R

class StudentViewModel:ViewModel() {
    val list = arrayListOf(
        DataStudent("Andika", "24616724", R.drawable.oke),
        DataStudent("Titi", "64634634", R.drawable.oke),
        DataStudent("Dwika", "536436436", R.drawable.oke),
        DataStudent("Rois", "454345435",  R.drawable.oke),
        DataStudent("Wiwit", "3252664",  R.drawable.oke)
    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudentList(){
        var stu = list
        studentList.value = stu
    }
}