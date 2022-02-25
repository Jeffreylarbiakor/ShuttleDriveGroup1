package com.example.shuttledrivegroup1.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shuttledrivegroup1.R

class RideHistoryFragment : Fragment() {

    companion object {
        fun newInstance() = RideHistoryFragment()
    }

    private lateinit var viewModel: RideHistoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ride_history_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RideHistoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}