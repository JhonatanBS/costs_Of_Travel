package com.example.costsoftravel

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.costsoftravel.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        try {
            binding.textValue.text = "R$ ${String.format("%.2f", calcule())}"
        } catch (error: Exception) {
            val snack = Snackbar.make(
                binding.main,
                "Digite um valor para todos os campos!",
                Snackbar.LENGTH_LONG
            )

            snack.setTextColor(Color.WHITE)
            snack.setBackgroundTint(Color.RED)

            snack.show()
        }
    }

    fun calcule(): Float {
        val map = binding.edittextMap.text.toString().toFloat()
        val gas = binding.edittextGas.text.toString().toFloat()
        val car = binding.edittextCar.text.toString().toFloat()

        val result = (map / car) * gas

        return result
    }
}