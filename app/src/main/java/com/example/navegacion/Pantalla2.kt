package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.navegacion.databinding.ActivityPantalla2Binding

class Pantalla2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityPantalla2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        binding.tvNombre.text = intent.getStringExtra("Nombre")
        binding.tvApellido.text = intent.getStringExtra("Apellido")
        binding.tvEdad.text = intent.getIntExtra("Edad", 0).toString()
        binding.btnAtrasPtlla2.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnAtrasPtlla2 -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}