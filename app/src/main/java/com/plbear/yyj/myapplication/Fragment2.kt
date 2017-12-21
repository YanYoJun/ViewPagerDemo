package com.plbear.yyj.myapplication

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by HuHu on 2017/12/20.
 */
open class Fragment2 :Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.fragment_2,container,false)
        return v!!
    }
}