package khamdamov.dilmurod.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import khamdamov.dilmurod.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding:ActivityResultBinding
    private var userName: String? = null
    private var totalQuestions: Int? = null
    private var correctAnswers: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        userName = intent.getStringExtra(Constants.USER_NAME)
        totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        binding.tvName.text = userName
        binding.tvScore.text = "Your score is $correctAnswers out of $totalQuestions"

        binding.btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}