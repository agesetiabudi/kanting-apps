package com.example.kasir_mini

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kasir_mini.Model.RequestLogin
import com.example.kasir_mini.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private val requestLogin: RequestLogin by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.username.setText("Username :" + requestLogin.email)
        binding.password.setText("Kata Sandi :" + requestLogin.password)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.Action_Keluar)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}