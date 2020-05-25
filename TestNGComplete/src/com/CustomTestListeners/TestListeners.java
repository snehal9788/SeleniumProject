package com.CustomTestListeners;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
	@Override
	public void onFinish(ITestContext result) {
	
	}

	@Override
	public void onStart(ITestContext result) {
				
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Robot robo=new Robot();
			Rectangle rect=new Rectangle();
			rect.setRect(0, 0, 1600, 720);
			BufferedImage img=robo.createScreenCapture(rect);
			ImageIO.write(img,"PNG", new File("C:/Users/Dhiraj/Desktop/ide/eclipse-jee-oxygen-3a-win32-x86_64/eclipse/screenshots/TestListener.png"));
		}catch(AWTException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
				
	}

	@Override
	public void onTestStart(ITestResult result) {
				
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

}
