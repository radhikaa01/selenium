package tyssselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrome {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/tyss/Desktop/practicekusum/tyss/exefiles/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	/*Dimension d=new Dimension(400,600);//for customize screen
	driver.manage().window().setSize(d);
	Point p=new Point(350,0);
	driver.manage().window().setPosition(p);*/
	
	driver.get("http://toolsqa.com/automation-practice-form/");
	//driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("agra");
	
}
}
