package jp.ac.it_college.std.s20020.carrender_new

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.SpinnerAdapter
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import jp.ac.it_college.std.s20020.carrender_new.databinding.ActivityMainBinding
import java.time.Month

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            Toast.makeText(this, "" + year + "-" + (month+1) + "-" + dayOfMonth, Toast.LENGTH_LONG).show()
            runBottom(year, month, dayOfMonth)

        }


    }
    fun runBottom(year: Int, month: Int, day: Int) {
        val myBottomSheet = MyBottomSheet()
        myBottomSheet.send(year, month, day)
        myBottomSheet.show(supportFragmentManager, "navigation_bottom_sheet")

    }


}