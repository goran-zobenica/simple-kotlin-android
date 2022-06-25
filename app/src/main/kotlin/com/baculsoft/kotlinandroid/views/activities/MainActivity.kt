package com.baculsoft.kotlinandroid.views.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Button
import com.baculsoft.kotlinandroid.R
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(getApplication(), "e1781d22-4929-4df3-b77d-0207597f1da1",Analytics.class, Crashes.class);
        setToolbar()
        setButton()
    }

    private fun setToolbar() {
        val toolbar = findViewById(R.id.toolbar_main) as Toolbar
        toolbar.title = resources.getString(R.string.app_name)
        setSupportActionBar(toolbar)
    }

    private fun setButton() {
        val button = findViewById(R.id.btn_main) as Button
        button.setOnClickListener { view -> Snackbar.make(view, "Hello Kotlin!", Snackbar.LENGTH_SHORT).show() }
    }
}