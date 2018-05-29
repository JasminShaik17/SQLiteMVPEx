package cubex.mahesh.sqlitemvpex.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import cubex.mahesh.sqlitemvpex.MainActivity
import cubex.mahesh.sqlitemvpex.beans.IncExpPojo
import cubex.mahesh.sqlitemvpex.presenter.IncExpPresenterAPI
import cubex.mahesh.sqlitemvpex.view.IncExpViewAPI

class IncExpModel:IncExpPresenterAPI
{
    var vi:IncExpViewAPI? = null
    var dBase :SQLiteDatabase? = null

    constructor(vi:IncExpViewAPI){
        this.vi = vi
        var mActivity = vi as MainActivity
        dBase = mActivity.openOrCreateDatabase(
                "incexp_db", Context.MODE_PRIVATE,
                null)
        dBase?.execSQL("create table if not exists incexp(type varchar(100),money number,description varchar(500),date_ varchar(100)) ")
    }

    override fun addInput(pojo: IncExpPojo) {
        var cv = ContentValues( )
        cv.put("type",pojo.type)
        cv.put("money",pojo.money)
        cv.put("description",pojo.desc)
        cv.put("date_",pojo.date_)
     var status =   dBase?.insert("incexp",
                null,cv)
        if(status == -1.toLong()) {
            vi?.addResult("Fail")
        }else{
            vi?.addResult("Success")
        }
    }

    override fun addViewExpInput() {
        var c =dBase?.query("incexp",null,
                "type=?", arrayOf("Expense"),
                null,null,null)
        var list = ArrayList<String>( )
        while (c!!.moveToNext()){
            list.add("${c.getString(0)}  |  ${c.getInt(1)}  | ${c.getString(2)} | ${c.getString(3)}")
        }
        vi?.viewExpResult(list)
    }

    override fun addViewIncInput() {

  var c =dBase?.query("incexp",null,
               "type=?", arrayOf("Income"),
                null,null,null)
    var list = ArrayList<String>( )
    while (c!!.moveToNext()){
         list.add("${c.getString(0)}  |  ${c.getInt(1)}  | ${c.getString(2)} | ${c.getString(3)}")
    }
    vi?.viewIncResult(list)
    }

    override fun addViewIncExpInput() {
        var c =dBase?.query("incexp",null,
                null, null,
                null,null,null)
        var list = ArrayList<String>( )
        while (c!!.moveToNext()){
            list.add("${c.getString(0)}  |  ${c.getInt(1)}  | ${c.getString(2)} | ${c.getString(3)}")
        }
        vi?.viewIncExpResult(list)
      }

}