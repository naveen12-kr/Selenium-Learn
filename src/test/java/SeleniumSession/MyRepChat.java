package SeleniumSession;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyRepChat {

			static WebDriver driver;

			public static void main(String[] args) throws Throwable {

				WebDriverManager.chromedriver().setup();
				
				

//				ChromeOptions options = new ChromeOptions();
//				options.addArguments("headless");
//				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//
//				driver = new ChromeDriver(options);

				driver = new ChromeDriver();
				
				

				driver.get("https://dart.ionlake.com/dart");

				Thread.sleep(3000);

				driver.manage().window().maximize();

				driver.findElement(By.xpath("//input[@id='dijit_form_TextBox_0']")).sendKeys("naveen.kumar@zanjo.io");

				Thread.sleep(3000);

				driver.findElement(By.xpath("//span[@id='dijit_form_Button_0_label']")).click();

				Thread.sleep(5000);

				driver.findElement(By.xpath("//*[@id=\"dijit_form_TextBox_1\"]")).sendKeys("aMz3pba09rru");

				Thread.sleep(5000);

				driver.findElement(By.xpath("//span[@id='dijit_form_Button_0_label']")).click();

				Thread.sleep(45000);

				driver.manage().window().maximize();

				Thread.sleep(5000);

				sendMsg();

			}

			public static void sendMsg() throws Throwable {

				String[] messages = { "How are you?", "What is your good name", "What is your number",
						"Please mention your address", "Thank you for connect", "We will contact you soon",
						"Your suggestion is our improvement", "Feel free to contact","&#9851","&#9730","&#9729", "Hi    are you present"," Did you @ mail?","I don't want to go outside today. it's cold!" };

				driver.findElement(By.xpath("//div[@class='appItem']//div[@class='title'][contains(text(),'Messages')]"))
						.click();

				Thread.sleep(3000);
				List<WebElement> msg = driver
						.findElements(By.xpath("//div[@class='leftAppPanelInner']//div[@class='middleNav']//li"));

				int count = msg.size();

				System.out.println(" INFO: Number of contact at list is  :" + count);
				while (true) {
					for (int i = 1; i <= count; i++) {

						Thread.sleep(5000);

						driver.findElement(
								By.xpath("//div[@class='leftAppPanelInner']//div[@class='middleNav']//li[" + i + "]")).click();

						Thread.sleep(5000);

						for (int j = 0; j < 14; j++) {

							driver.findElement(By.xpath("//*[@id=\"dijit_form_SimpleTextarea_0\"]")).sendKeys(messages[j]);

							driver.findElement(By.xpath("//span[@id='dijit_form_Button_12_label']")).click();

							Thread.sleep(3000);

						}

						driver.findElement(By.xpath("//*[@id=\"dijit__WidgetsInTemplateMixin_1\"]/div[3]/div/div[3]/div[5]"))
								.click();

						Thread.sleep(3000);

						driver.findElement(
								By.xpath("//div[@class='palettesContainer']//div[1]//table[1]//tbody[1]//tr[1]//td[3]"))
								.click();

						Thread.sleep(3000);

						driver.findElement(By.xpath("//span[@id='dijit_form_Button_12_label']")).click();

						Thread.sleep(3000);

						driver.findElement(By.xpath("//div[@class='fal fa-image']")).click();

						Thread.sleep(3000);

						WebElement ele = driver.findElement(By.xpath("//span[@class='fas fa-plus-square']"));

						ele.click();

						Thread.sleep(5000);

						//StringSelection strs = new StringSelection("C:\\Users\\ss\\Desktop\\images1.jpg");
						
						StringSelection strs = new StringSelection("C:\\Users\\admin\\Desktop\\images.jpg");
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strs, null);

						try {

							// native key strokes for CTRL, V and ENTER keys
							Robot robot = new Robot();

							robot.setAutoDelay(3000);

							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);

							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);

							robot.setAutoDelay(3000);

							robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);
						} catch (Exception exp) {
							exp.printStackTrace();
						}

						driver.findElement(
//								By.xpath("//*[@id=\"dijit__WidgetsInTemplateMixin_1\"]/div[5]/div[2]/ul/li[2]/div/img"))
//								.click();
						By.xpath("//span[@class='far fa-file-pdf']"))
						.click();
						Thread.sleep(3000);

						driver.findElement(By.xpath("//span[@id='dijit_form_Button_3_label']")).click();

					}

				}
			}

		

}


