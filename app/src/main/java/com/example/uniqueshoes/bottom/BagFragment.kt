package com.example.uniqueshoes.bottom

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uniqueshoes.CrudActivity
import com.example.uniqueshoes.R
import com.example.uniqueshoes.databinding.FragmentBagBinding

class BagFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentBagBinding.inflate(layoutInflater)
        bind.check.setOnClickListener {
            val intent = Intent(this.requireContext(), CrudActivity::class.java)
                startActivity(intent)
        }
        return bind.root
    }
}

