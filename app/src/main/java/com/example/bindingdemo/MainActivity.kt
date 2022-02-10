package com.example.bindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("W123", "Ali")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myData = student

//        binding.tvStudentID.text = student.id
//        binding.tvStudentName.text = student.name

        binding.btnUpdate.setOnClickListener()
        {
            student.name = "Alex"
//            binding.tvStudentName.text = student.name
            binding.apply {
                invalidateAll()
            }
        }
       // val tv :TextView = findViewById(R.id.tvStudentID)
       // tv.text = student.id



    }
}