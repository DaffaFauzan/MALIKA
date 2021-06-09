package com.studio.malika.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.studio.malika.R
import com.studio.malika.data.Menu
import com.studio.malika.data.Telephone
import com.studio.malika.databinding.FragmentHomeBinding
import com.studio.malika.ui.camera.DetailCameraActivity
import com.studio.malika.ui.telephone.TelephoneActivity


class HomeFragment : Fragment(), MenuAdapter.OnItemClickCallback {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            homeViewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[HomeViewModel::class.java]

            val banner = homeViewModel.getBanner()
            val bannerAdapter = BannerAdapter(banner)
            val menu = homeViewModel.getMenu()
            val menuAdapter = MenuAdapter()
            menuAdapter.setMenu(menu)


            with(binding.rvMenu) {
                layoutManager = GridLayoutManager(activity, 2)
                setHasFixedSize(true)
                adapter = menuAdapter

            }

            binding.viewPager.adapter = bannerAdapter
            bannerAdapter.setBanner(banner)


            menuAdapter.setOnItemClickCallback(this@HomeFragment)

        }
    }

    override fun onItemClicked(menu: Menu, int: Int) {

        when (int) {
            0 -> {

                Toast.makeText(activity,resources.getString(R.string.not_available),Toast.LENGTH_SHORT).show()
            }
            1 -> {
                Toast.makeText(activity,resources.getString(R.string.not_available),Toast.LENGTH_SHORT).show()

            }
            2 -> {
                val intent = Intent(activity, TelephoneActivity::class.java)
                intent.putExtra("ItemPosition", int)
                startActivity(intent)

            }
            3 -> {
                Toast.makeText(activity,resources.getString(R.string.not_available),Toast.LENGTH_SHORT).show()

            }
        }
    }
}




