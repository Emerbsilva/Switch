package com.ebsindustrial.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebsindustrial.aswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setStatus()

        // verifica a mudança de estado da chave
        binding.switchStatus.setOnCheckedChangeListener{_, check ->
            setStatus()
        }
    }

    // atualize o texto se estiver acionado ou não
    fun setStatus(){
        binding.texto.text = if (binding.switchStatus.isChecked){
            "Ligado"
        }else{
            "Desligado"
        }
    }
}