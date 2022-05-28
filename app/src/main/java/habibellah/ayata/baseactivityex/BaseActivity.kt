package habibellah.ayata.baseactivityex

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import java.lang.IllegalArgumentException


/*
this is the base activity where will put all common methods and variables of activity first and second
the BaseActivity is abstract because we don't know the implementation of methods in witch activity
*/

//the viewBinding are common but not the same activity so we solve this problem using Generic

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    abstract val activityName : String
    /*
   inflate method in viewBinding are different from activity to another so we solve this problem
   make an inflate method as a variable and return the Generic type of binding VB
   */
    abstract val bindingInflate : (LayoutInflater) -> VB
    private   var _binding: ViewBinding? = null
    //binding val is the variable will use in concrete activity
    protected val binding
    get() =  _binding as VB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflate(layoutInflater)
        if(_binding == null)
            throw IllegalArgumentException("binding cannot be null")
        setContentView(requireNotNull(_binding).root)
         //you do not need to override the on create method in concrete classes after the call here
         //only if you have an addition
         startWork()
         addCallBacks()
    }

    //this methods are the common in first and second activity
     abstract fun startWork()
     abstract fun addCallBacks()
     fun toast()
    {
        Toast.makeText(baseContext,activityName, Toast.LENGTH_LONG).show()
    }
}

