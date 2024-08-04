package com.example.noteapp69.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.noteapp69.R
import com.example.noteapp69.databinding.FragmentOnBoardPagingBinding

class OnBoardPagingFragment : Fragment() {

    companion object{
        const val ARG_ONBOARD_POSITION = "onBoard"
    }

    private lateinit var binding: FragmentOnBoardPagingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardPagingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize()= with(binding) {
        when(requireArguments().getInt(ARG_ONBOARD_POSITION)){
            0 -> {
                txtOn.text = "Очень удобный функционал"
            }
            1 -> {
                txtOn.text = "Быстрый, качественный продукт"
            }
            2 -> {
                txtOn.text = "Куча функций и интересных фишек"
            }
        }
    }
}