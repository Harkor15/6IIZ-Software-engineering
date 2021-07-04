package com.example.softwareengineering.views.authentication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.softwareengineering.R
import com.example.softwareengineering.utils.TAG



class AuthenticationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Auth fragment on create")
        val view: View = inflater.inflate(R.layout.fragment_authentication, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.a_loginButton).setOnClickListener {
            val login = view.findViewById<EditText>(R.id.a_inputLogin).text
            val password = view.findViewById<EditText>(R.id.a_inputPassword).text
            if(login.isEmpty()||password.isEmpty()){
                view.findViewById<TextView>(R.id.a_wrong_login_details).visibility=View.VISIBLE
            }else{
                if(login.first() == 'r' || login.first()=='R'){
                    navController.navigate(R.id.action_authenticationFragment_to_restaurantMain)
                }else{
                    if(login[0]=='n'||login[0]=='N')
                        navController.navigate(R.id.action_authenticationFragment_to_newClientMainFragment)
                    else
                        navController.navigate(R.id.action_authenticationFragment_to_clientMain)
                }
            }
        }
        view.findViewById<TextView>(R.id.a_createNewAccountButton).setOnClickListener{
            navController.navigate(R.id.action_authenticationFragment_to_registerFragment)
        }
    }
}