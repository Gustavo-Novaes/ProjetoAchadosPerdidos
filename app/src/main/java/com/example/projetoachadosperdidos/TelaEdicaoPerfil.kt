package com.example.projetoachadosperdidos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projetoachadosperdidos.databinding.TelaEdicaoPerfilBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class TelaEdicaoPerfil : Fragment() {

    private var _binding: TelaEdicaoPerfilBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = TelaEdicaoPerfilBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonVoltar.setOnClickListener {
            findNavController().navigate(R.id.action_TelaEdicaoPerfil_to_TelaPerfil)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}