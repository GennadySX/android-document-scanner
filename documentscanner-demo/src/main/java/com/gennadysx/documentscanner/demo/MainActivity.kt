package com.gennadysx.documentscanner.demo

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.gennadysx.documentscanner.DocumentScanner
import com.gennadysx.documentscanner.utils.ImageUtil

/**
 * A demo showing how to use the document scanner
 *
 * @constructor creates demo activity
 */
class MainActivity : AppCompatActivity() {


    /**
     * called when activity is created
     *
     * @param savedInstanceState persisted data that maintains state
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main_fragment, MainFragment()).commit()


}
