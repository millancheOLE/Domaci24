package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\milla\\IdeaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement selectProduct1 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div/div/a"));
        selectProduct1.click();
        WebElement addToCart1 = driver.findElement(By.id("add_to_cart"));
        addToCart1.click();
        WebElement continueShopping1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        continueShopping1.click();
        WebElement homepage1 = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        homepage1.click();

        WebElement selectProduct2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div/div/a"));
        selectProduct2.click();
        WebElement addToCart2 = driver.findElement(By.id("add_to_cart"));
        addToCart2.click();
        WebElement continueShopping2 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        continueShopping2.click();
        WebElement homepage2 = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
        homepage2.click();

        WebElement selectProduct3 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div/div/a"));
        selectProduct3.click();
        WebElement addToCart3 = driver.findElement(By.id("add_to_cart"));
        addToCart3.click();
        WebElement continueShopping3 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
        continueShopping3.click();
        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        proceedToCheckout.click();

        WebElement deleteProduct1 = driver.findElement(By.xpath("//*[@id=\"1_1_0_0\"]"));
        deleteProduct1.click();
        WebElement addQuantity = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_3_13_0_0\"]"));
        addQuantity.click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

        System.out.println("Test je uspesan!");
    }
}