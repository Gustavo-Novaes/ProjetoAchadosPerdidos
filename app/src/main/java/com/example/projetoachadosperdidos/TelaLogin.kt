package com.example.projetoachadosperdidos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projetoachadosperdidos.databinding.TelaLoginBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class TelaLogin : Fragment() {

    private var _binding: TelaLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = TelaLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCadastrar.setOnClickListener {
            findNavController().navigate(R.id.action_TelaLogin_to_TelaCadastro)
        }

        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(R.id.action_TelaLogin_to_TelaInicio)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}