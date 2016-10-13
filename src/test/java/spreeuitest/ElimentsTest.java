package spreeuitest;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileOutputStream;

/**
 * Created by wasey on 9/1/16.
 */
public class ElimentsTest {

    @Test
    public static void allElements() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://spree.paxotech.com/");
        Thread.sleep(1000);
        FileOutputStream fos = new FileOutputStream("/Users/wasey/IdeaProjects/PerFactHybrid/TestResults/wasey.xls");
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet s = wb.createSheet("allElements");
        java.util.List<WebElement> links = driver.findElements(By.xpath(".//*"));
        for (int i = 0; i < links.size(); i++)

        {
            //will store all the webElements in excel at given path

            Row row = s.createRow(i);
            row.createCell(0).setCellValue(links.get(i).getText());

            row.createCell(2).setCellValue(links.get(i).getAttribute("name"));
            row.createCell(3).setCellValue(links.get(i).isSelected());


        }
        wb.write(fos);
        fos.close();
        driver.quit();

    }
}
