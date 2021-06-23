package com.example.testprogressbar


import android.animation.ObjectAnimator
import android.animation.TimeInterpolator
import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.example.testprogressbar.databinding.ActivityMain2Binding


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMain2Binding



//    var GAUGE_ANIMATION_INTERPOLATOR: TimeInterpolator = DecelerateInterpolator(2F)
//    var MAX_LEVEL = 100
//    var GAUGE_ANIMATION_DURATION: Long  = 5000
//    lateinit var mProgressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        var progress = 0
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        mProgressBar = findViewById(R.id.progressBar)

        binding.btnStart.setOnClickListener{
            progress += 10
            postProgress(progress)

//            val animator = ObjectAnimator.ofInt(mProgressBar, "progress", 0, MAX_LEVEL)
//            animator.interpolator = GAUGE_ANIMATION_INTERPOLATOR
//            animator.duration = GAUGE_ANIMATION_DURATION
//            animator.start()
        }

    }



    private fun postProgress(progress: Int) {
        val strProgress = "$progress %"
        binding.pbHorizontal.progress = progress
        if (progress == 0) {
            binding.pbHorizontal.secondaryProgress = 0
        } else {
            binding.pbHorizontal.secondaryProgress = progress + 5
        }
        binding.tvProgressHorizontal.text = strProgress
        binding.tvProgressCircle.text = strProgress
    }
}


