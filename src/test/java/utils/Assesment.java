package utils;

import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assesment {
@Test
	public static void a() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vitthal\\Desktop\\workspace\\finalAssesmentKrinati\\driver1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://codeshare.io");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Share Code Now']")).click();
		String sr = driver.getCurrentUrl();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
js.executeScript("document.getElementsByClassName(' CodeMirror-lines ').value='#include <stdio.h>'");  
String s=js.executeScript("return document.getElementsByClassName(' CodeMirror-lines ').value").toString();  
System.out.println(s);
js.executeScript("window.open('sr')");
Set<String> wd = driver.getWindowHandles();
Iterator<String> itr = wd.iterator();
String w1 = itr.next();
String w2 = itr.next();
driver.switchTo().window(w2);
driver.get(sr);
//boolean fsast = driver.findElement(By.xpath("//span[text()='#include <stdio.h>']")).isDisplayed();
//System.out.println("after switching w2 text '#include <stdio.h>' is visible true or false'"+ fsast );
//System.out.println(window.getComputedStyle("document.getElementsByClassName(' CodeMirror-lines ').display"));
//Object visi= js.executeScript("return document.getElementsByClassName(' CodeMirror-lines ').style.display !== 'none");
//System.out.println(visi);
//boolean ak=("document.getElementsByClassName(' CodeMirror-lines ').style.visibility !== 'hidden'" );
js.executeScript("document.getElementsByClassName(' CodeMirror-lines ').value='#include <conio.h>'");  
driver.switchTo().window(w1);
//boolean w1fselement = driver.findElement(By.xpath("//span[text()='#include <stdio.h>']")).isDisplayed();
//boolean w1seelement = driver.findElement(By.xpath("//span[text()='#include <conio.h>']")).isDisplayed();
//boolean w1final=w1fselement & w1seelement;
//System.out.println("after switching w1 text '#include <stdio.h>' and '#include <conio.h>'is visible true or false'"+ w1final );
String ss=js.executeScript("return document.getElementsByClassName(' CodeMirror-lines ').value").toString();  
System.out.println(ss);
driver.switchTo().window(w2);
String sf=js.executeScript("return document.getElementsByClassName(' CodeMirror-lines ').value").toString();  
System.out.println(sf);

		driver.quit();
}	

}
