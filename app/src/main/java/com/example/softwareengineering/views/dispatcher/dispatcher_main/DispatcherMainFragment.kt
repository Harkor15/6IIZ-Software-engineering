package com.example.softwareengineering.views.dispatcher.dispatcher_main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation
import com.example.softwareengineering.R


class DispatcherMainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dispatcher_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = Navigation.findNavController(view)
        view.findViewById<ConstraintLayout>(R.id.dm_driversList).setOnClickListener {
            navController.navigate(R.id.action_dispatcherMainFragment_to_dispatcherDriversList)
        }
        view.findViewById<ConstraintLayout>(R.id.dm_dataExport).setOnClickListener {
            navController.navigate(R.id.action_dispatcherMainFragment_to_dispatcherDataExport)
        }
        view.findViewById<ConstraintLayout>(R.id.dm_messages).setOnClickListener {
            navController.navigate(R.id.action_dispatcherMainFragment_to_dispatcherMessagesFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}