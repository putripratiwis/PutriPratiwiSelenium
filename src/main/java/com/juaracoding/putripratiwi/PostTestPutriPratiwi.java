package com.juaracoding.putripratiwi;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTestPutriPratiwi {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("first-name")).sendKeys("Putri");
        System.out.println("input First Name");
        driver.findElement(By.id("last-name")).sendKeys("Pratiwi");
        System.out.println("input Last Name");
        driver.findElement(By.id("job-title")).sendKeys("QA");
        System.out.println("input Job Title");
        driver.findElement(By.id("radio-button-3")).click();
        System.out.println("input Highest-Level-Of Education");
        driver.findElement(By.id("checkbox-2")).click();
        System.out.println("input Sex");
        WebElement elementSelect = driver.findElement(By.id("select-menu"));
        Select SelectMenu = new Select(elementSelect);
        SelectMenu.selectByValue("2");
        System.out.println("input Years of Experience");
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("datepicker")).sendKeys("02-02-2020");
        System.out.println("input Date");
        driver.findElement(By.xpath("/html/body/div[1]/form/div/div[8]/a")).click();
        System.out.println("button submit click");

    }
}
