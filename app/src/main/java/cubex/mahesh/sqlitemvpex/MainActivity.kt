package cubex.mahesh.sqlitemvpex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import cubex.mahesh.sqlitemvpex.beans.IncExpPojo
import cubex.mahesh.sqlitemvpex.model.IncExpModel
import cubex.mahesh.sqlitemvpex.presenter.IncExpPresenterAPI
import cubex.mahesh.sqlitemvpex.view.IncExpViewAPI

class MainActivity : AppCompatActivity(),IncExpViewAPI {

    override fun addResult(msg: String) {
        Toast.makeText(this,
                msg,Toast.LENGTH_LONG).show()
    }

    override fun viewExpResult(list: ArrayList<String>) {
    var adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item,
            list)
        lview?.adapter = adapter
    }

    override fun viewIncResult(list: ArrayList<String>) {
        var adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item,
                list)
        lview?.adapter = adapter
    }

    override fun viewIncExpResult(list: ArrayList<String>) {
        var adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item,
                list)
        lview?.adapter = adapter
    }

    var sp1:Spinner? = null
    var et1:EditText? = null
    var et2:EditText? = null
    var et3:EditText? = null
    var lview:ListView? = null
    var pi:IncExpPresenterAPI? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       pi = IncExpModel(this)
        sp1 = findViewById(R.id.sp1)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        et3 = findViewById(R.id.et3)
        lview = findViewById(R.id.lview)
    }

    fun add(v:View){
   var pojo = IncExpPojo(
           sp1?.selectedItem.toString(),
           et1?.text.toString().toInt(),
           et2?.text.toString(),
           et3?.text.toString())

     pi?.addInput(pojo)

    }
    fun viewIncome(v:View){
        pi?.addViewIncInput()
    }
    fun viewExpense(v:View){
        pi?.addViewExpInput()
    }
    fun expInc(v:View){
        pi?.addViewIncExpInput()
    }

}
