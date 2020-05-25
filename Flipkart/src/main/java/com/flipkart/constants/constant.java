package com.flipkart.constants;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class constant{
	public static WebDriver driver;
	public static WebElement element;
	public static Actions action;
	public static FluentWait wait;
	public static Properties prop;
	public static FileInputStream fis;
	public static Alert alert;
}