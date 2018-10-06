package com.riza.myfootballschedule.ui.schedule

interface MvpView{

    fun showLoading()
    fun hideLoading()
    fun updateList()

}

interface MvpPresenter{

    fun updateSchedule()

}