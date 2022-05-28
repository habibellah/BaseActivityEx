package habibellah.ayata.baseactivityex

import android.view.LayoutInflater
import habibellah.ayata.baseactivityex.databinding.ActivitySecondBinding


//SecondActivity extends from BaseActivity and pass its binding type to the Generic and to the binding inflate
class SecondActivity : BaseActivity<ActivitySecondBinding>() {
    override val activityName: String = "from SecondActivity"
    override val bindingInflate: (LayoutInflater) -> ActivitySecondBinding = ActivitySecondBinding::inflate

    override fun startWork() {
        //to do of SecondActivity
    }

    override fun addCallBacks() {
        //to do of SecondActivity
        binding.clickme2.setOnClickListener { toast() }
    }

}