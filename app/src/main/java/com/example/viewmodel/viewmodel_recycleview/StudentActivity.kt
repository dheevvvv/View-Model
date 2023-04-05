package com.example.viewmodel.viewmodel_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodel.R
import com.example.viewmodel.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {
//    lateinit var rvStudent : RecyclerView
//    lateinit var studentVm : StudentViewModel
    lateinit var studentAdapter: StudentAdapter
    private lateinit var binding: ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initStudent()
        val studentVm = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentVm.getStudentList()
        studentVm.studentList.observe(this, Observer {
//            studentAdapter.setDataStudent(it as ArrayList<DataStudent>)
            studentAdapter.setStudentData(it as ArrayList<DataStudent>)
        })

    }

    fun initStudent (){
        val rvStudent = binding.rvStudent
        studentAdapter = StudentAdapter(ArrayList())
        rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvStudent.adapter = studentAdapter
    }

    fun setDataStudent (){

    }

}