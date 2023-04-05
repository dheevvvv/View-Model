package com.example.viewmodel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityUsingViewModelBinding

class UsingViewModel : AppCompatActivity() {
    private lateinit var binding: ActivityUsingViewModelBinding

    //    lateinit var btnHitung : Button
//    lateinit var etPanjang : EditText
//    lateinit var etLebar : EditText
//    lateinit var etTinggi : EditText
//    lateinit var txtHasil : TextView
    lateinit var viewModel : HitungViewModel

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsingViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        btnHitung= findViewById(R.id.btnHitung)
//        etPanjang = findViewById(R.id.etPanjang)
//        etLebar = findViewById(R.id.etLebar)
//        etTinggi = findViewById(R.id.etTinggi)
//        txtHasil = findViewById(R.id.txtHasil)

        viewModel = ViewModelProvider(this).get(HitungViewModel::class.java)
        binding.txtHasil.text = viewModel.hasil.toString()
//        displayResult()

        binding.btnHitung.setOnClickListener{
            var pj = binding.etPanjang.text.toString().toInt()
            var lb = binding.etLebar.text.toString().toInt()
            var tg = binding.etTinggi.text.toString().toInt()
            viewModel.Hitung(pj,lb,tg)
            binding.txtHasil.text = viewModel.hasil.toString()
        }
    }
}