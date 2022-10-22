package org.com;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRScanner {
public static void main(String[] args) throws IOException, NotFoundException {
	System.setProperty("webdriver.chrome.driver","E:\\Windows_Old Eclipse Projects\\SeleniumPracticeDaily\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://testautomationpractice.blogspot.com/");
String qrCodeUL = driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
URL url =new URL(qrCodeUL);
BufferedImage bufferedimage=ImageIO.read(url);
LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedimage);
BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
Result result=new MultiFormatReader().decode(binaryBitmap);
System.out.println(result.getText());

}
}
