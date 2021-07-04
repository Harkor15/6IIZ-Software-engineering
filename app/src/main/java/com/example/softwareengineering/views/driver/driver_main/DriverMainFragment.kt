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
        view.findViewById<ConstraintLayout>(R.id.cm_restaurantInfo).setOnClickListener {
            navController.navigate(R.id.action_clientMain_to_clientRestaurantDetails)
        }
        view.findViewById<ConstraintLayout>(R.id.cm_menu).setOnClickListener {
            navController.navigate(R.id.action_clientMain_to_clientMenuFragment)
        }
        view.findViewById<ConstraintLayout>(R.id.cm_subscriptions).setOnClickListener {
            navController.navigate(R.id.action_clientMain_to_clientSubscriptionFragment)
        }
        view.findViewById<ConstraintLayout>(R.id.cm_history).setOnClickListener {
            navController.navigate(R.id.action_clientMain_to_clientHistoryFragment)
        }
        view.findViewById<ConstraintLayout>(R.id.cm_Messages).setOnClickListener {
            navController.navigate(R.id.action_clientMain_to_clientMessagesFragment)
        }
        view.findViewById<ConstraintLayout>(R.id.cm_settings).setOnClickListener {
            navController.navigate(R.id.action_clientMain_to_clientSettingsFragment)
        }
    }

}