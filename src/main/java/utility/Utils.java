package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Utils {


		public static WebDriver driver = null;
	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception{

		String sBrowserName;
		try{
		sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
		if(sBrowserName.contentEquals("firefox")){
			driver = new FirefoxDriver();

			}
        else if (sBrowserName.contentEquals("chrome")){
            String chromeBinayPath;
            chromeBinayPath =  System.getProperty("user.dir") + "/src/main/resources/Drivers/chromedriver 2";
            System.setProperty("webdriver.chrome.driver", chromeBinayPath);
            driver=new ChromeDriver();
        }
        else if(sBrowserName.contentEquals("IE")){
            String ieBinayPath;
            ieBinayPath = System.getProperty("user.dir") + "/src/main/resources/Drivers/phantomjs";
            System.setProperty("webdriver.ie.driver", ieBinayPath );
          driver= new InternetExplorerDriver();
        }
        else if(sBrowserName.contentEquals("PHANTOMJS")){
            String phantomBinayPath;
            phantomBinayPath = System.getProperty("user.dir") + "/src/main/resources/Drivers/phantomjs";
            System.setProperty("phantomjs.binary.path", phantomBinayPath);
            driver= new PhantomJSDriver();
        }
            Log.info("New driver instantiated");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            Log.info("Implicit wait applied on the driver for 10 seconds");

            driver.get(Constant.URL);

            Log.info("Web application launched successfully");


		}catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;

	}

	
	public static String getTestCaseName(String sTestCase)throws Exception{
		String value = sTestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}
	

	 public static void waitForElement(WebElement element){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}
		
	 public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{
			try{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + sTestCaseName +".jpg"));	
			} catch (Exception e){
				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
				throw new Exception();
			}
		}
	 
	 
	}
