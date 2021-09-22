package com.example.appcarvalho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appcarvalho.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btTrocarTexto.setOnClickListener {
//            trocaTexto()
//            binding.txtHello.text = trocaTexto2()
            binding.txtHello.text = calculaDobro()
        }

        val view = binding.root
        setContentView(view)
    }

    fun calculaDobro(): String {
        val textoEntrada = binding.txtInput1.text. toString()
        val numero = textoEntrada.toInt()
        val dobro = numero * 2
       return  dobro.toString()

    }

    fun multiplica(): String {
        val num1 = binding.txtInput1.text. toString().toInt()
        val num2 = binding.txtInput1.text. toString().toInt()
        val resultado = num1 * 2
//        return  resultado.toString()
        return "${num1 * 2}"

    }

//    fun trocaTexto() {
//        binding.txtHello.text = "oi\n sou ivan"
//    }

    fun trocaTexto(): String {
        return "oi\n sou ivan"
    }

    fun trocaTexto2(): String {
        return binding.txtInput1.text.toString()
    }
}