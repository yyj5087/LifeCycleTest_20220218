package com.nepplus.lifecycletest_20220218

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면","메인화면의 onResum 실행됨")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "메인화면의 onPause 실행됨")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "메인화면의 onDestroy 실행됨")
    }

    fun setupEvents(){
//        이벤트 처리에 관한 코드를 모아두는 함수

        btnMove.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }
    }
    fun setValues(){
//        화면에 값을 띄워주기 위한 코드를 모으는 함수
        btnMove.text ="CLICK ME!!"

    }
}