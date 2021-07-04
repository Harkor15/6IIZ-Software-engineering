
package com.example.softwareengineering.views.dispatcher.dispatcher_drivers_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.softwareengineering.R

class DispatcherDriversList : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.ddl_button_back).setOnClickListener {
            activity?.onBackPressed()
        }
        val navController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.ddl_driver_info).setOnClickListener {
            navController.navigate(R.id.action_dispatcherDriversList_to_dispatcherDriverDetails2)
        }
        view.findViewById<Button>(R.id.ddl_vehicle_info).setOnClickListener {
            navController.navigate(R.id.action_dispatcherDriversList_to_dispatcherVehicleDetails)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dispatcher_drivers_list, container, false)
    }


}