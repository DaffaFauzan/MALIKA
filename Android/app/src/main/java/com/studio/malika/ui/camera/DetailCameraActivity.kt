package com.studio.malika.ui.camera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.studio.malika.MainActivity
import com.studio.malika.R
import com.studio.malika.databinding.ActivityDetailCameraBinding
import com.studio.malika.ui.home.HomeViewModel
import com.studio.malika.utils.DetailHelper
import kotlin.text.StringBuilder

class DetailCameraActivity : AppCompatActivity() {
    private lateinit var model: DetailCameraViewModel
    private lateinit var binding: ActivityDetailCameraBinding


    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_PREDICTION = "extra_prediction"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        detailCamera()

    }

    private fun detailCamera() {
        model = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailCameraViewModel::class.java]
        var prediction = intent.getStringExtra(EXTRA_PREDICTION)
        binding.tvKekerasan.text =
            StringBuilder(resources.getString(R.string.kekerasan) + prediction)
        binding.tvName.text =
            StringBuilder(resources.getString(R.string.nama) + resources.getString(R.string.dummy_name))
        binding.tvTgl.text =
            StringBuilder(resources.getString(R.string.tanggal) + DetailHelper.getCurrentDate())
        binding.tvAlamat.text =
            StringBuilder(resources.getString(R.string.alamat) + resources.getString(R.string.dummy_address))

        val image = intent.getStringExtra(EXTRA_IMAGE)
        Glide.with(applicationContext)
            .load(image)
            .into(binding.ivCamera)

        binding.btnLapor.setOnClickListener {
            if (prediction != null) {
                if (image != null) {


                    model.postReport(
                        resources.getString(R.string.dummy_name),
                        prediction,
                        resources.getString(R.string.dummy_address),

                        image
                    )
                    Toast.makeText(applicationContext, resources.getString(R.string.upload_sukses), Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        }
        }