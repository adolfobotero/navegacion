package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.navegacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnScreen1.setOnClickListener(this)
        binding.btnScreen2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnScreen1 -> {
                val intent = Intent(this, Pantalla2::class.java)
                val nombre = binding.txtNombre.text.toString()
                val apellido = binding.txtApellido.text.toString()
                val edadString = binding.txtEdad.text.toString()
                val edad = if (edadString.isNotEmpty()) {
                    edadString.toInt()
                } else {
                    0
                }

                intent.putExtra("Nombre", nombre)
                intent.putExtra("Apellido", apellido)
                intent.putExtra("Edad", edad)
                startActivity(intent)
            }

            R.id.btnScreen2 -> {
                val intent = Intent(this, Pantalla3::class.java)
                val carro = binding.txtCarro.text.toString()
                val color = binding.txtColor.text.toString()
                val modeloString = binding.txtModelo.text.toString()
                val modelo = if (modeloString.isNotEmpty()) {
                    modeloString.toInt()
                } else {
                    0
                }
                val valorString = binding.txtValor.text.toString()
                val valor = if (valorString.isNotEmpty()) {
                    valorString.toInt()
                } else {
                    0
                }

                intent.putExtra("Carro", carro)
                intent.putExtra("Color", color)
                intent.putExtra("Modelo", modelo)
                intent.putExtra("Valor", valor)
                startActivity(intent)
            }
        }
    }
}