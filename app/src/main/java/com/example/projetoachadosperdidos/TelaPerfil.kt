package com.example.projetoachadosperdidos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projetoachadosperdidos.databinding.TelaPerfilBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class TelaPerfil : Fragment() {

    private var _binding: TelaPerfilBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = TelaPerfilBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonEditarPerfil.setOnClickListener {
            findNavController().navigate(R.id.action_TelaPerfil_to_TelaEdicaoPerfil)
        }

        binding.buttonVoltar.setOnClickListener {
            findNavController().navigate(R.id.action_TelaPerfil_to_TelaInicio)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}