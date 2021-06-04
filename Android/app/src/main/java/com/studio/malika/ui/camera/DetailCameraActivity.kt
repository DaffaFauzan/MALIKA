package com.studio.malika.ui.camera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.studio.malika.R
import com.studio.malika.databinding.ActivityDetailCameraBinding

class DetailCameraActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetailCameraBinding
    companion object{
        const val  EXTRA_IMAGE = "extra_image"
        const val  EXTRA_PREDICTION = "extra_prediction"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        detailCamera()

    }

    private fun detailCamera() {
        var prediction = intent.getStringExtra(EXTRA_PREDICTION)
          binding.tvHeadDesc.text = prediction
        val image = intent.getStringExtra(EXTRA_IMAGE)
        Glide.with(applicationContext)
            .load(image)
            .into(binding.ivCamera)

    }
}