package com.example.formulasforphysics.view

import android.content.Context
import android.util.AttributeSet
import com.zanvent.mathview.MathView

class CustomMathView(
  context: Context,
  attrs: AttributeSet
) : MathView(context, attrs) {


  override fun setText(text: String?) {
    super.setText(text)
    if (onLoadListener != null) {
      onLoadListener.onLoad()
    }
  }
}