package com.studio.malika.ui.telephone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.studio.malika.R
import com.studio.malika.data.Telephone
import com.studio.malika.databinding.ActivityTelephoneBinding


class TelephoneActivity : AppCompatActivity(), TelephoneAdapter.OnItemClickCallback {
    private lateinit var binding: ActivityTelephoneBinding
    private lateinit var model: TeleponeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelephoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title =resources.getText(R.string.no_darurat)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        SetTelephone()
    }

    private fun SetTelephone() {
        model = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[TeleponeViewModel::class.java]
        val telp = model.getTelephone()
        val telpAdapter = TelephoneAdapter()
        telpAdapter.setTelephone(telp)

        with(binding.rvTelephone) {
            layoutManager = LinearLayoutManager(this@TelephoneActivity)
            setHasFixedSize(true)
            adapter = telpAdapter

        }
        telpAdapter.setOnItemClickCallback(this)

    }

    override fun onItemClicked(telp: Telephone) {
        if (telp.image == R.drawable.phone_call){
            val intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+telp.no_telepon))
            startActivity(intent)
            }else {
            val url = "https://api.whatsapp.com/send?phone=${telp.no_telepon}"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

        }
    }
}