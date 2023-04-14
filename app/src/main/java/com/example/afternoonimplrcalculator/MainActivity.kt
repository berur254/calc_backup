package com.example.afternoonimplrcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Instantiate the elements on the user interface as variables
    lateinit var mAnswer :TextView
    lateinit var mFnum:EditText
    lateinit var msnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mDiv:Button
    lateinit var mMul:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEdtFnum)
        msnum = findViewById(R.id.mBtnsum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnsub)
        //Set onclick Listeners on buttons
        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an eror message on textView answer
                mAnswer.text = "Piease enter valid numbers!!!"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                // display the result of the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an eror message on textView answer
                mAnswer.text = "Piease enter valid numbers!!!"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                // display the result of the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an eror message on textView answer
                mAnswer.text = "Piease enter valid numbers!!!"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                // display the result of the textView answer
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                // Display an eror message on textView answer
                mAnswer.text = "Piease enter valid numbers!!!"
            }else{
                //Proceed to compute the numbers
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                // display the result of the textView answer
                mAnswer.text = jibu.toString()
            }
        }
    }
}