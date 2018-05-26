package cubex.mahesh.sqlitemvpex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    var sp1:Spinner? = null
    var et1:EditText? = null
    var et2:EditText? = null
    var et3:EditText? = null
    var lview:ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(v:View){

    }
    fun viewIncome(v:View){

    }
    fun viewExpense(v:View){

    }
    fun expInc(v:View){

    }

}
