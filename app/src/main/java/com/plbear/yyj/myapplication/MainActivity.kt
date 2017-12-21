package com.plbear.yyj.myapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mFragList = ArrayList<Fragment>()
    var adapter = object:FragmentPagerAdapter(supportFragmentManager){
        override fun getItem(position: Int): Fragment {
            return mFragList[position]
        }

        override fun getCount(): Int {
            return 2
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewPager()
        initTabHost();
    }

    fun initTabHost(){
        tab.setupWithViewPager(view_pager)
        tab.setTabsFromPagerAdapter(adapter)
        tab.tabMode = TabLayout.MODE_FIXED
        tab.getTabAt(0)?.setText("第一页")
        tab.getTabAt(1)?.setText("第二页")
    }

    fun initViewPager(){
        mFragList.add(Fragment1())
        mFragList.add(Fragment2())

        view_pager.adapter = adapter
    }

}
