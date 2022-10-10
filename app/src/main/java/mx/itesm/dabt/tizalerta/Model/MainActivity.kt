package mx.itesm.dabt.tizalerta.Model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.itesm.dabt.tizalerta.R
import mx.itesm.dabt.tizalerta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
