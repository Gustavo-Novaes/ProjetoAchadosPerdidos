package com.example.projetoachadosperdidos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projetoachadosperdidos.databinding.TelaInicioBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class TelaInicio : Fragment() {

    private var _binding: TelaInicioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = TelaInicioBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPerfil.setOnClickListener {
            findNavController().navigate(R.id.action_TelaInicio_to_TelaPerfil)
        }

        binding.buttonCriarPostagem.setOnClickListener {
            findNavController().navigate(R.id.action_TelaInicio_to_TelaCriarPostagem)
        }

        binding.buttonSair.setOnClickListener {
            findNavController().navigate(R.id.action_TelaInicio_to_TelaLogin)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}