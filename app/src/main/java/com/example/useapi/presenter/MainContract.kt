package com.example.useapi.presenter

import kotlin.coroutines.CoroutineContext

interface MainContract {

    interface View {

    }

    interface Presenter {
        suspend fun getData() : List<CoinsModel>
        suspend fun getDetail(id: String) : CoinsDetail
//        fun creat()
//        fun read()
//        fun update()
        //요청 +  받아오기
    }
}