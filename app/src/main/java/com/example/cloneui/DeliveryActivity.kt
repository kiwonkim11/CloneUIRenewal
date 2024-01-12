package com.example.cloneui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cloneui.databinding.ActivityDeliveryBinding

private lateinit var binding: ActivityDeliveryBinding
class DeliveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDeliveryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivMenu3.setOnClickListener {
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }

        binding.ivBack.setOnClickListener {
            finish()
        }
    }
}