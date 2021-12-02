package jp.ac.it_college.std.s20020.carrender_new

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.ac.it_college.std.s20020.carrender_new.databinding.FragmentBottomSheetBinding


class New_Create_Fragment : Fragment() {
    private var _binding: FragmentBottomSheetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inflater.inflate(R.layout.fragment_new__create_, container, false)
        _binding = FragmentBottomSheetBinding.inflate(inflater, container, false)
        return binding.root


    }
}
