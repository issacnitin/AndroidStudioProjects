package com.issacnitin.referenceapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

public class MyGraphics extends View{

	Bitmap cCharacter;
	int changingY, changingX;
	Typeface font;
	
	
	public MyGraphics(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		cCharacter = BitmapFactory.decodeResource(getResources(), R.drawable.charater);
		changingY = 0;
		changingX = 0;
		font = Typeface.createFromAsset(context.getAssets(), "G-Unit.TTF");
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		Paint textPaint = new Paint();
		textPaint.setARGB(20, 213, 123, 134);
		textPaint.setTextSize(50);
		textPaint.setTextAlign(Align.CENTER);
		textPaint.setTypeface(font);
		
		canvas.drawPaint(textPaint);
		
		
		canvas.drawColor(Color.YELLOW);
		canvas.drawBitmap(cCharacter, changingX, changingY, null);
		if(changingX < canvas.getHeight())
			changingX++;
		else
			changingX = 0;
		if(changingY < canvas.getWidth())
			changingY++;
		else
			changingY = 0;
		
		Rect blueRect = new Rect();
		blueRect.set(0, 200, canvas.getWidth(), 350);
		Paint bluepaint = new Paint();
		bluepaint.setColor(Color.BLUE);
		canvas.drawRect(blueRect, bluepaint);
		
		invalidate();
	}



}
