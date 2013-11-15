package com.issacnitin.referenceapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;

public class GFXSurface extends Activity implements OnTouchListener {

	MyGraphicsSurface ourSurfaceView;
	float x, y, sX, sY, fX, fY, aniX, aniY, scaledX, scaledY, dX, dY;
	Bitmap bmp, bmp2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ourSurfaceView = new MyGraphicsSurface(this);
		ourSurfaceView.setOnTouchListener(this);
		x = 0;
		y = 0;
		sX = 0;
		sY = 0;
		fX = 0;
		fY = 0;
		aniX = aniY = scaledX = scaledY = dX = dY = 0;
		bmp = BitmapFactory.decodeResource(getResources(), R.drawable.charater);
		bmp2 = BitmapFactory.decodeResource(getResources(),
				R.drawable.onlampicon);
		setContentView(ourSurfaceView);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSurfaceView.pause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		ourSurfaceView.resume();
	}

	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		x = arg1.getX();
		y = arg1.getY();

		switch (arg1.getAction()) {

		case MotionEvent.ACTION_DOWN:
			sX = arg1.getX();
			sY = arg1.getY();
			aniX = aniY = scaledX = scaledY = dX = dY = fX = fY = 0;
			break;
		case MotionEvent.ACTION_UP:
			fX = arg1.getX();
			fY = arg1.getY();
			dX = fX - sX;
			dY = fY - sY;
			scaledX = dX / 30;
			scaledY = dY / 30;
			x = y = 0;
			break;
		} 
		return true;
	}

	public class MyGraphicsSurface extends SurfaceView implements Runnable {

		SurfaceHolder ourHolder;
		Thread gfxThread = null;
		boolean isRunning = true;

		public MyGraphicsSurface(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
			ourHolder = getHolder();
			gfxThread = new Thread(this);
			gfxThread.run();

		}

		public void pause() {
			isRunning = false;
			try {
				gfxThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			gfxThread = null;
		}

		public void resume() {
			isRunning = true;
			gfxThread = new Thread(this);
			gfxThread.run();

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (isRunning) {
				if (!ourHolder.getSurface().isValid())
					continue;

				Canvas canvas = ourHolder.lockCanvas();
				canvas.drawRGB(02, 02, 150);
				if (x != 0 && y != 0) {

					canvas.drawBitmap(bmp, (x - bmp.getWidth() / 2),
							(y - bmp.getHeight() / 2), null);
				}

				if (sX != 0 && sY != 0) {
					canvas.drawBitmap(bmp2, (sX - bmp2.getWidth() / 2),
							(sY - bmp2.getHeight() / 2), null);
				}

				if (fX != 0 && fY != 0) {
					canvas.drawBitmap(bmp, (fX - bmp.getWidth() / 2) - aniX,
							(fY - bmp.getHeight() / 2) - aniY, null);
					canvas.drawBitmap(bmp2, (fX - bmp2.getWidth() / 2) - aniX,
							(fY - bmp2.getHeight() / 2) - aniY, null);
				}
				aniX = aniX + scaledX;
				aniY = aniY + scaledY;
				ourHolder.unlockCanvasAndPost(canvas);
			}
		}

	}

}
