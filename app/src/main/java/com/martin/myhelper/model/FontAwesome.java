package com.martin.myhelper.model;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class FontAwesome extends androidx.appcompat.widget.AppCompatTextView {
    public FontAwesome(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FontAwesome(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontAwesome(Context context) {
        super(context);
        init();
    }

    private void init() {

        //Font name should not contain "/".
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "Font Awesome 5 Brands-Regular-400.otf");
        setTypeface(tf);
    }
}
