package scisrc.mobiledev.firstuiassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {

    lateinit var backToMainPageBtn: Button
    lateinit var gotologinbtn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bindbtn()

        addlistener()

        backToMainPageBtn = findViewById(R.id.registBackToMainBtn)

        backToMainPageBtn.setOnClickListener() {
            finish()
        }
    }

    fun bindbtn(){
        gotologinbtn = findViewById(R.id.gotologinbtn)
    }

    fun addlistener(){
        gotologinbtn.setOnClickListener(){
            val intent = Intent(this ,LoginActivity::class.java).setAction("go to login")
            startActivity(intent)
    }
    }

}