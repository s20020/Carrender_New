package jp.ac.it_college.std.s20020.carrender_new

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import jp.ac.it_college.std.s20020.carrender_new.databinding.FragmentBottomSheetBinding


class MyBottomSheet(): BottomSheetDialogFragment() {

    private var _binding: FragmentBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        inflater.inflate(R.layout.fragment_bottom_sheet,container,false)
        _binding = FragmentBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    fun send(year: Int, month: Int, day: Int) {
        binding.dateTitle.text = "${year}年${month}月${day}日"
    }

}

