package cubex.mahesh.sqlitemvpex.presenter

import cubex.mahesh.sqlitemvpex.beans.IncExpPojo

interface IncExpPresenterAPI
{
    fun addInput(pojo:IncExpPojo)
    fun addViewExpInput()
    fun addViewIncInput()
    fun addViewIncExpInput()

}