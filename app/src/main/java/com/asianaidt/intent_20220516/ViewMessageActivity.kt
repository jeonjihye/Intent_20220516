package com.asianaidt.intent_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        이벤트 처리 X, 화면에 들어오자마자 --> 데이터 수신 + 텍스트 뷰에 반영

//        1. 보내준 문구가 무너지 변수에 저장
        val receivedMessage = intent.getStringExtra("inputMsg")


//        2. 저장한 문구를 텍스트 뷰에 저장
        txtMessage.text = receivedMessage



    }
}