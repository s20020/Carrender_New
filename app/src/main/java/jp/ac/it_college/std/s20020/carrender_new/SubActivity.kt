package jp.ac.it_college.std.s20020.carrender_new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s20020.carrender_new.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}