package com.example.noteapp69.ui.fragments.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.noteapp69.R
import com.example.noteapp69.databinding.FragmentNoteBinding
import com.example.noteapp69.utills.PreferenceHelper

class NoteFragment : Fragment() {

    private lateinit var binding: FragmentNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() = with(binding) {
        val preferenceHelper = PreferenceHelper()
        preferenceHelper.unit(requireContext())
        btnSave.setOnClickListener {
            val et = etText.text.toString()
            preferenceHelper.text = et
            txtText.text = et
        }

        txtText.text = preferenceHelper.text
        btnGo.setOnClickListener {
            findNavController().navigate(R.id.action_noteFragment_to_noteDetailFragment, null,
//                navOptions{
//                    anim {
//                        enter = R.anim.slide_in_right
//                        exit = R.anim.slide_out_left
//                    }
//                }
            )
        }
    }
}