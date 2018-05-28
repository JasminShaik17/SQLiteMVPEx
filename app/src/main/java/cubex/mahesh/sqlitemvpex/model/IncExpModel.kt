package cubex.mahesh.sqlitemvpex.model

import cubex.mahesh.sqlitemvpex.beans.IncExpPojo
import cubex.mahesh.sqlitemvpex.presenter.IncExpPresenterAPI
import cubex.mahesh.sqlitemvpex.view.IncExpViewAPI

class IncExpModel:IncExpPresenterAPI
{
    var vi:IncExpViewAPI? = null

    constructor(vi:IncExpViewAPI){
        this.vi = vi

    }

    override fun addInput(pojo: IncExpPojo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addViewExpInput() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addViewIncInput() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addViewIncExpInput() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}