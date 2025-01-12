package scisrc.mobiledev.firstuiassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    lateinit var backToMainBtn: Button
    lateinit var gotoSignupbtn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bindbtn()

        addlistener()


        backToMainBtn = findViewById(R.id.loginBackToMainBtn)

        backToMainBtn.setOnClickListener() {
            finish()
        }
    }
    fun bindbtn(){
        gotoSignupbtn = findViewById(R.id.signbtn)
    }

    fun addlistener(){
        gotoSignupbtn.setOnClickListener(){
            val intent = Intent(this ,RegisterActivity::class.java).setAction("go to signup")
            startActivity(intent)
    }
    }



}