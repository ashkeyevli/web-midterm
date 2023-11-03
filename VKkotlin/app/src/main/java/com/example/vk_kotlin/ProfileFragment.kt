package com.example.vk_kotlin


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {
    private lateinit var username: TextView
    private lateinit var email: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = LayoutInflater.from(container?.context)
            .inflate(R.layout.fragment_profile, container, false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)

//        Log.d(data.value.toString(), "usermame")
//        data.observe(viewLifecycleOwner, Observer {
//            if(it!=null)
//                viewDataBinding.profileItem?.login= it.login
//
//        })
    }

    private fun bindViews(view: View) = with(view){
        username = view.findViewById(R.id.tv_name)
        email = view.findViewById(R.id.tv_address)


    }


}