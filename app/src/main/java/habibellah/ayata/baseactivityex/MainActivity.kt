package habibellah.ayata.baseactivityex


import android.view.LayoutInflater
import habibellah.ayata.baseactivityex.databinding.ActivityMainBinding

//MainActivity extends from BaseActivity and pass its binding type to the Generic and to the binding inflate
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val activityName: String = "from MainActivity"
    override val bindingInflate: (LayoutInflater) -> ActivityMainBinding = ActivityMainBinding::inflate

    override fun startWork() {
        //to do of MainActivity
    }

    override fun addCallBacks() {
        //to do of MainActivity
        binding.clickme1.setOnClickListener {
            toast()
        }

    }
}