package com.CustomTestListeners;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerScreenDate implements ITestListener {
	SimpleDateFormat date=new SimpleDateFormat("2020_04_26_11_20_00");
	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Robot robo=new Robot();
			Rectangle rect=new Rectangle();
			rect.setRect(0, 0, 1600, 720);
			BufferedImage img=robo.createScreenCapture(rect);
			ImageIO.write(img,"PNG", new File("C:/Users/Dhiraj/Desktop/ide/eclipse-jee-oxygen-3a-win32-x86_64/eclipse/screenshots"+date+"/Screenshot_"+date+".png"));
		}catch(AWTException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
