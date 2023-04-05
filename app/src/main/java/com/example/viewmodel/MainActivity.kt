package com.example.viewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.viewmodel.viewmodel_recycleview.StudentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var btnVM: Button
        lateinit var btnWVM: Button
        lateinit var btnStudent: Button
        lateinit var btnUser: Button

        btnWVM = findViewById(R.id.btnWithoutVM)
        btnVM = findViewById(R.id.btnUsingVM)
        btnStudent = findViewById(R.id.btnStudent)
        btnUser = findViewById(R.id.btnUser)

            btnStudent.setOnClickListener {
                val intent = Intent(this, StudentActivity::class.java)
                startActivity(intent)
            }

        btnVM.setOnClickListener {
            startActivity(Intent(this, UsingViewModel::class.java))
        }
    }

}