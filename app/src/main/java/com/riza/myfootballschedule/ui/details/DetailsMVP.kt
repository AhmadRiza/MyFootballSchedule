package com.riza.myfootballschedule.ui.details

import com.riza.myfootballschedule.data.model.Schedule

interface MvpView{

    fun setContent(list: MutableList<Schedule>)

}

interface MvpPresenter{

    fun updateContent();

}