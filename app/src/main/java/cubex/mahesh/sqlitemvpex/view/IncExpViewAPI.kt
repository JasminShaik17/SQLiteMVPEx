package cubex.mahesh.sqlitemvpex.view

import cubex.mahesh.sqlitemvpex.beans.IncExpPojo

interface IncExpViewAPI
{

    fun  addResult(msg:String)
    fun  viewExpResult(list:ArrayList<String>)
    fun  viewIncResult(list:ArrayList<String>)
    fun  viewIncExpResult(list:ArrayList<String>)

}