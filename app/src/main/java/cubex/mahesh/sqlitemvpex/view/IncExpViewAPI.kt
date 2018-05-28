package cubex.mahesh.sqlitemvpex.view

import cubex.mahesh.sqlitemvpex.beans.IncExpPojo

interface IncExpViewAPI
{

    fun  addResult(msg:String)
    fun  viewExpResult(list:ArrayList<IncExpPojo>)
    fun  viewIncResult(list:ArrayList<IncExpPojo>)
    fun  viewIncExpResult(list:ArrayList<IncExpPojo>)

}