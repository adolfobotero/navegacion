package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.navegacion.databinding.ActivityPantalla3Binding

class Pantalla3 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityPantalla3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        binding.tvCarro.text = intent.getStringExtra("Carro")
        binding.tvColor.text = intent.getStringExtra("Color")
        binding.tvModelo.text = intent.getIntExtra("Modelo", 0).toString()
        binding.tvValor.text = intent.getIntExtra("Valor", 0).toString()
        binding.btnAtrasPtlla3.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnAtrasPtlla3 -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}