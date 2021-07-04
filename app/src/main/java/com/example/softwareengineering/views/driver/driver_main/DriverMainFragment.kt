package com.example.softwareengineering.views.driver.driver_main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation
import com.example.softwareengineering.R

class DriverMainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_driver_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)
        view.findViewById<ConstraintLayout>(R.id.drm_stats).setOnClickListener {
            navController.navigate(R.id.action_driverMainFragment_to_driverStats)
        }
        view.findViewById<ConstraintLayout>(R.id.drm_notification_planel).setOnClickListener {
            navController.navigate(R.id.action_driverMainFragment_to_driverNotificationPanel)
        }
        view.findViewById<ConstraintLayout>(R.id.drm_messages).setOnClickListener {
            navController.navigate(R.id.action_driverMainFragment_to_driverMessagesFragment)
        }
    }

}