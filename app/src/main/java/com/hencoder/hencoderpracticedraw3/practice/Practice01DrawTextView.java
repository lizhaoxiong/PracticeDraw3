package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import java.util.Locale;

public class Practice01DrawTextView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "壹生富貴，妳是我的小蘋果";

    public Practice01DrawTextView(Context context) {
        super(context);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01DrawTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 drawText() 来绘制文字
        // 文字坐标： (50, 100)
        canvas.drawText(text,50,100,paint);

        //Path path = new Path();
        //path.rMoveTo(100,100);
        //path.rLineTo(600,600);
        //canvas.drawTextOnPath(text,path,5,10,paint);

        //TextPaint paint = new TextPaint();
        //paint.setTextSize(50);
        //paint.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"Satisfy-Regular.ttf"));
        //StaticLayout staticLayout = new StaticLayout(text,paint,1000,
        //    Layout.Alignment.ALIGN_CENTER,1,0,false);
        //staticLayout.draw(canvas);

        //paint.setTextSize(80);
        //paint.setFakeBoldText(true);
        //canvas.drawText(text,50,100,paint);
        //
        //paint.setFakeBoldText(false);
        //paint.setTypeface(Typeface.DEFAULT_BOLD);
        //canvas.drawText(text,50,200,paint);

        //paint.setUnderlineText(true);
        //paint.setStrikeThruText(true);
        //paint.setTextSkewX(0f);
        //paint.setTextScaleX(1f);
        //paint.setLetterSpacing(-0.2f);
        //paint.setFontFeatureSettings("smcp");
        //paint.setTextAlign(Paint.Align.CENTER);

        //canvas.drawText(text,600,150,paint);
        //paint.setTextLocale(Locale.JAPAN);
        //canvas.drawText(text,200,150,paint);


      //paint.setStyle(Paint.Style.FILL);
      //canvas.drawText(text, 100, 100, paint);
      //
      //Rect bounds = new Rect();
      //paint.getTextBounds(text, 0, text.length(), bounds);
      //bounds.left += 100;
      //bounds.top += 100;
      //bounds.right += 100;
      //bounds.bottom += 100;
      //paint.setStyle(Paint.Style.STROKE);
      //canvas.drawRect(bounds, paint);


    }
}
