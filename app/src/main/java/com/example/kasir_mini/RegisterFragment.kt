package com.irhan.kasir_mini

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kasir_mini.Model.RequestRegister
import com.example.kasir_mini.R
import com.example.kasir_mini.databinding.RegisterScreenBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RegisterFragment : Fragment() {

    private var _binding: RegisterScreenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    //    public var email: String? = null
//    public var password: String? = null
    private val requestRegister : RequestRegister by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = RegisterScreenBinding.inflate(inflater, container, false)
        return binding.root

    }

    //    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
//    }
//
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ButtonSubmit.setOnClickListener{
            findNavController().navigate(R.id.LoginFragment)
        }

        binding.ButtonToLogin.setOnClickListener{
            findNavController().navigate(R.id.LoginFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}