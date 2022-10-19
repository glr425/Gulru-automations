package com.myProjects.tests;

import com.myProjects.tests.base.TestBase;
import com.myProjects.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VY_tests extends TestBase {




                @Test
                public void story8() throws InterruptedException {

                driver.get("https://qa2.vytrack.com/user/login");
                WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                inputUsername.sendKeys("user12 ");

                WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                inputPassword.sendKeys("UserUser123");

                WebElement login = driver.findElement(By.id("_submit"));
                login.click();

                Thread.sleep(3000);
                WebElement activities = driver.findElement(By.xpath("(//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'])[3]"));
                Thread.sleep(3000);
                activities.click();

                WebElement Calender = driver.findElement(By.xpath("//span[.='Calendar Events']"));

                Calender.click();

                WebElement CalendarEvent = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
                Thread.sleep(3000);
                CalendarEvent.click();


                Thread.sleep(3000);
                WebElement Re = driver.findElement(By.xpath("//input[starts-with(@id,'recurrence')]")) ;
                Thread.sleep(3000);
                Re.click();
                Thread.sleep(3000);
                WebElement ReDay= driver.findElement(By.xpath("(//label[@class='fields-row'])[1]//input[@type='text']"));

                String actual = ReDay.getAttribute("value");
                String wanted = "1";

                Assert.assertEquals(actual,wanted);











        }
                @Test
                public void story8_b() throws InterruptedException {
                driver.get("https://qa2.vytrack.com/user/login");
                WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                inputUsername.sendKeys("storemanager55 ");

                WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                inputPassword.sendKeys("UserUser123");

                WebElement login = driver.findElement(By.id("_submit"));
                login.click();

                Thread.sleep(3000);
                WebElement Act= driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][4]"));
                Thread.sleep(3000);
                Act.click();


                Thread.sleep(3000);
                WebElement calIv =driver.findElement(By.xpath("//span[.='Calendar Events']"));
                Thread.sleep(3000);
                calIv.click();

                Thread.sleep(3000);
                WebElement Create = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
                Thread.sleep(3000);
                Create.click();

                Thread.sleep(3000);
                WebElement repeat = driver.findElement(By.xpath("//input[starts-with(@id,'recurrence-repeat-view')]"));
                Thread.sleep(3000);
                repeat.click();

                WebElement days = driver.findElement(By.xpath("(//label[@class='fields-row'])[1]//input[@type='text']"));
                Thread.sleep(3000);
                days.clear();


                Thread.sleep(3000);
                WebElement clear = driver.findElement(By.xpath("//span[starts-with(@id,'temp-validation-name')]//span[@style='top: 445px; left: 872.5px;']"));
                String actual = clear.getText();
                String wanted = "This value should not be blank.";
                Thread.sleep(3000);
                actual.contains(wanted);

        }






                @Test
                public void user9() throws InterruptedException {


            driver.get("https://qa2.vytrack.com/user/login");
            WebElement inputUsername = driver.findElement(By.id("prependedInput"));
            inputUsername.sendKeys("storemanager55 ");

            WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
            inputPassword.sendKeys("UserUser123");

            WebElement login = driver.findElement(By.id("_submit"));
            login.click();

            Thread.sleep(1000);
            WebElement Act= driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][4]"));
            Thread.sleep(1000);
            Act.click();


            Thread.sleep(1000);
            WebElement calIv =driver.findElement(By.xpath("//span[.='Calendar Events']"));
            Thread.sleep(1000);
            calIv.click();

            Thread.sleep(1000);
            WebElement Create = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));
            Thread.sleep(3000);
            Create.click();

            Thread.sleep(1000);
            WebElement repeat = driver.findElement(By.xpath("//input[starts-with(@id,'recurrence-repeat-view')]"));
            Thread.sleep(1000);
            repeat.click();

            WebElement days = driver.findElement(By.xpath("(//label[@class='fields-row'])[1]//input[@type='text']"));
            Thread.sleep(1000);
            days.clear();
            days.sendKeys("100");


            Thread.sleep(1000);
            WebElement nums = driver.findElement(By.xpath("//span[starts-with(@id,'temp-validation-name')]"));
            Thread.sleep(1000);
            String actual = nums.getText();
            String wanted = "The value have not to be more than 99.";
            actual.contains(wanted);


            WebElement days1 = driver.findElement(By.xpath("(//label[@class='fields-row'])[1]//input[@type='text']"));
            Thread.sleep(1000);
            days1.clear();
            days.sendKeys("-23");


            Thread.sleep(1000);
            WebElement nums1 = driver.findElement(By.xpath("//span[starts-with(@id,'temp-validation-name')]"));
            String actual1 = nums1.getText();
            String wanted1 = "The value have not to be less than 1.";
            actual1.contains(wanted1);


        }



                @Test
                public void user10() throws InterruptedException {
                driver.get("https://qa2.vytrack.com/user/login");
                WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                inputUsername.sendKeys("storemanager55 ");

                WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                inputPassword.sendKeys("UserUser123");

                WebElement login = driver.findElement(By.id("_submit"));
                login.click();

                Thread.sleep(1000);
                WebElement Act= driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][4]"));
                Thread.sleep(1000);
                Act.click();


                Thread.sleep(1000);
                WebElement calIv =driver.findElement(By.xpath("//span[.='Calendar Events']"));
                Thread.sleep(1000);
                calIv.click();

                Thread.sleep(1000);
                WebElement Create = driver.findElement(By.xpath("//a[@title='Create Calendar event']"));//
                Thread.sleep(1000);
                Create.click();

                Thread.sleep(1000);
                driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'oro')]")));
                Thread.sleep(1000);
                WebElement type = driver.findElement(By.xpath("//body[@id='tinymce']"));
                type.sendKeys("ohlala");

                Thread.sleep(1000);


               WebElement check = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
               String actual = check.getText();
               String wanted = "ohlala";

               Assert.assertTrue(check.isDisplayed());
               Assert.assertEquals(actual,wanted);

                driver.switchTo().defaultContent();
        }

                @Test
                public void user13() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager55 ");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("(//div[@id='main-menu']//span[@class='title title-level-1'])[2]"));
                        Thread.sleep(1000);
                        fleet.click();

                        WebElement cost = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
                        Thread.sleep(1000);
                        cost.click();

                        WebElement type = driver.findElement(By.xpath("//span[.='Type']"));
                        Thread.sleep(1000);
                        String actual = type.getText();
                        String wanted = "TYPE";
                        Assert.assertEquals(actual,wanted);

                        WebElement total = driver.findElement(By.xpath("//span[.='Total Price']"));
                        Thread.sleep(1000);
                        String actual1 = total.getText();
                        String wanted1 = "TOTAL PRICE";
                        Assert.assertEquals(actual1,wanted1);

                        WebElement date = driver.findElement(By.xpath("//span[.='Date']"));
                        Thread.sleep(1000);
                        String actual2 = date.getText();
                        String wanted2 = "DATE";
                        Assert.assertEquals(actual2,wanted2);




        }
                @Test
                public void user13b() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager55 ");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("(//div[@id='main-menu']//span[@class='title title-level-1'])[2]"));
                        Thread.sleep(1000);
                        fleet.click();

                        WebElement cost = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
                        Thread.sleep(1000);
                        cost.click();

                        WebElement box = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']"));
                        Thread.sleep(1000);
                        box.click();

                        WebElement box1 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][1]"));
                        box1.isSelected();
                        WebElement box2 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][2]"));
                        box2.isSelected();
                        WebElement box3 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][3]"));
                        box2.isSelected();
                        WebElement box4 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][4]"));
                        box2.isSelected();
                        WebElement box5 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][5]"));
                        box2.isSelected();
                        WebElement box6 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][6]"));
                        box2.isSelected();
                        WebElement box7 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][7]"));
                        box2.isSelected();
                        WebElement box8 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][8]"));
                        box2.isSelected();
                        WebElement box9 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][9]"));
                        box2.isSelected();
                        WebElement box10 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][10]"));
                        box2.isSelected();
                        WebElement box11 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][11]"));
                        box2.isSelected();
                        WebElement box12 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][12]"));
                        box2.isSelected();
                        WebElement box13 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][13]"));
                        box2.isSelected();
                        WebElement box14 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][14]"));
                        box2.isSelected();
                        WebElement box15 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][15]"));
                        box2.isSelected();
                        WebElement box16 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][16]"));
                        box2.isSelected();
                        WebElement box17 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][17]"));
                        box2.isSelected();
                        WebElement box18 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][18]"));
                        box2.isSelected();
                        WebElement box19 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][19]"));
                        box2.isSelected();
                        WebElement box20 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][20]"));
                        box2.isSelected();
                        WebElement box21 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][21]"));
                        box2.isSelected();
                        WebElement box22 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][22]"));
                        box2.isSelected();
                        WebElement box23 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][23]"));
                        box2.isSelected();
                        WebElement box24 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][24]"));
                        box2.isSelected();
                        WebElement box25 = driver.findElement(By.xpath("//tbody[@class='grid-body']/tr[@class='grid-row row-click-action row-selected'][25]"));
                        box2.isSelected();






                }


                @Test
                public void user12() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager55 ");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement customer = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][2]"));
                        Thread.sleep(1000);
                        customer.click();

                        WebElement account = driver.findElement(By.xpath("//li[@data-route='oro_account_index']//span[@class='title title-level-2']"));
                        Thread.sleep(1000);
                        account.click();

                        WebElement filter = driver.findElement(By.xpath("//i[@class='fa-filter hide-text']"));
                        Thread.sleep(1000);
                        filter.click();

                        WebElement num1 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][1]"));
                        String actual = num1.getText();
                        String wanted = "Account Name";
                        actual.contains(wanted);

                        WebElement num2 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][2]"));
                        String actual1 = num1.getText();
                        String wanted1 = "Contact Name";
                        actual1.contains(wanted1);

                        WebElement num3 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][3]"));
                        String actual3 = num1.getText();
                        String wanted3 = "Contact Email";
                        actual3.contains(wanted3);

                        WebElement num4 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][4]"));
                        String actual4 = num1.getText();
                        String wanted4 = "Contact Phone";
                        actual4.contains(wanted4);

                        WebElement num5 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][5]"));
                        String actual5 = num1.getText();
                        String wanted5 = "Owner";
                        actual5.contains(wanted5);

                        WebElement num6 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][6]"));
                        String actual6 = num1.getText();
                        String wanted6 = "Business Unit";
                        actual6.contains(wanted6);

                        WebElement num7 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][7]"));
                        String actual7 = num1.getText();
                        String wanted7 = "Created At";
                        actual7.contains(wanted7);

                        WebElement num8 = driver.findElement(By.xpath("//div[@class='filter-item oro-drop'][8]"));
                        String actual8 = num1.getText();
                        String wanted8 = "Updated At";
                        actual8.contains(wanted8);




                }

                @Test
                public void story7() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager55");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
                        vehicle.click();

                        WebElement checkbox = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']"));
                        boolean isSelected = checkbox.isSelected();
                        Assert.assertFalse(isSelected);

                        for ( int i =1; i <= 25; i ++){
                                WebElement boxes = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)["+i+"]"));
                                boolean isSelected1 = boxes.isSelected();
                                Assert.assertFalse(isSelected1);
                        }

                       /* WebElement box1 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[1]"));
                        boolean isSelected1 = box1.isSelected();
                        Assert.assertFalse(isSelected1);

                        WebElement box2 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[2]"));
                        boolean isSelected2 = box2.isSelected();
                        Assert.assertFalse(isSelected2);

                        WebElement box3 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[3]"));
                        boolean isSelected3 = box3.isSelected();
                        Assert.assertFalse(isSelected3);

                        WebElement box4 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[4]"));
                        boolean isSelected4 = box4.isSelected();
                        Assert.assertFalse(isSelected4);

                        WebElement box5 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[5]"));
                        boolean isSelected5 = box5.isSelected();
                        Assert.assertFalse(isSelected5);

                        WebElement box6 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[6]"));
                        boolean isSelected6 = box6.isSelected();
                        Assert.assertFalse(isSelected6);

                        WebElement box7 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[7]"));
                        boolean isSelected7 = box1.isSelected();
                        Assert.assertFalse(isSelected7);

                        WebElement box8 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[8]"));
                        boolean isSelected8 = box7.isSelected();
                        Assert.assertFalse(isSelected8);

                        WebElement box9 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[9]"));
                        boolean isSelected9 = box8.isSelected();
                        Assert.assertFalse(isSelected9);

                        WebElement box10 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[10]"));
                        boolean isSelected10 = box9.isSelected();
                        Assert.assertFalse(isSelected10);

                        WebElement box11 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[11]"));
                        boolean isSelected11 = box10.isSelected();
                        Assert.assertFalse(isSelected11);

                        WebElement box12 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[12]"));
                        boolean isSelected12 = box11.isSelected();
                        Assert.assertFalse(isSelected12);

                        WebElement box13 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[13]"));
                        boolean isSelected13 = box13.isSelected();
                        Assert.assertFalse(isSelected13);

                        WebElement box14 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[14]"));
                        boolean isSelected14 = box14.isSelected();
                        Assert.assertFalse(isSelected14);

                        WebElement box15 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[15]"));
                        boolean isSelected15 = box15.isSelected();
                        Assert.assertFalse(isSelected15);

                        WebElement box16 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[16]"));
                        boolean isSelected16 = box16.isSelected();
                        Assert.assertFalse(isSelected16);

                        WebElement box17 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[17]"));
                        boolean isSelected17 = box17.isSelected();
                        Assert.assertFalse(isSelected17);

                        WebElement box18 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[18]"));
                        boolean isSelected18 = box18.isSelected();
                        Assert.assertFalse(isSelected18);

                        WebElement box19 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[19]"));
                        boolean isSelected19 = box19.isSelected();
                        Assert.assertFalse(isSelected19);

                        WebElement box20 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[20]"));
                        boolean isSelected20 = box20.isSelected();
                        Assert.assertFalse(isSelected20);

                        WebElement box21 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[21]"));
                        boolean isSelected21 = box21.isSelected();
                        Assert.assertFalse(isSelected21);

                        WebElement box22 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[22]"));
                        boolean isSelected22 = box22.isSelected();
                        Assert.assertFalse(isSelected22);

                        WebElement box23 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[23]"));
                        boolean isSelected23 = box23.isSelected();
                        Assert.assertFalse(isSelected23);

                        WebElement box24 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[24]"));
                        boolean isSelected24 = box24.isSelected();
                        Assert.assertFalse(isSelected24);

                        WebElement box25 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[25]"));
                        boolean isSelected25 = box1.isSelected();
                        Assert.assertFalse(isSelected25);*/


                }
                @Test
                public void story7_b() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager58");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
                        vehicle.click();

                        WebElement checkbox = driver.findElement(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']"));
                        Thread.sleep(2000);
                        checkbox.click();

                        for ( int i =1; i <= 25; i ++){
                                WebElement boxes = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)["+i+"]"));
                                Assert.assertTrue(boxes.isSelected());
                        }

                       /* WebElement box1 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[1]"));
                        boolean isSelected1 = box1.isSelected();
                        Assert.assertTrue(isSelected1);

                        WebElement box2 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[2]"));
                        boolean isSelected2 = box2.isSelected();
                        Assert.assertTrue(isSelected2);

                        WebElement box3 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[3]"));
                        boolean isSelected3 = box3.isSelected();
                        Assert.assertTrue(isSelected3);

                        WebElement box4 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[4]"));
                        boolean isSelected4 = box4.isSelected();
                        Assert.assertTrue(isSelected4);

                        WebElement box5 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[5]"));
                        boolean isSelected5 = box5.isSelected();
                        Assert.assertTrue(isSelected5);

                        WebElement box6 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[6]"));
                        boolean isSelected6 = box6.isSelected();
                        Assert.assertTrue(isSelected6);

                        WebElement box7 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[7]"));
                        boolean isSelected7 = box7.isSelected();
                        Assert.assertTrue(isSelected7);

                        WebElement box8 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[8]"));
                        boolean isSelected8 = box8.isSelected();
                        Assert.assertTrue(isSelected8);

                        WebElement box9 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[9]"));
                        boolean isSelected9 = box9.isSelected();
                        Assert.assertTrue(isSelected9);

                        WebElement box10 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[10]"));
                        boolean isSelected10 = box10.isSelected();
                        Assert.assertTrue(isSelected10);

                        WebElement box11 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[11]"));
                        boolean isSelected11 = box11.isSelected();
                        Assert.assertTrue(isSelected11);

                        WebElement box12 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[12]"));
                        boolean isSelected12 = box12.isSelected();
                        Assert.assertTrue(isSelected12);

                        WebElement box13 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[13]"));
                        boolean isSelected13 = box13.isSelected();
                        Assert.assertTrue(isSelected13);

                        WebElement box14 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[14]"));
                        boolean isSelected14 = box14.isSelected();
                        Assert.assertTrue(isSelected14);

                        WebElement box15 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[15]"));
                        boolean isSelected15 = box15.isSelected();
                        Assert.assertTrue(isSelected15);

                        WebElement box16 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[16]"));
                        boolean isSelected16 = box16.isSelected();
                        Assert.assertTrue(isSelected16);

                        WebElement box17 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[17]"));
                        boolean isSelected17 = box17.isSelected();
                        Assert.assertTrue(isSelected17);

                        WebElement box18 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[18]"));
                        boolean isSelected18 = box18.isSelected();
                        Assert.assertTrue(isSelected18);

                        WebElement box19 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[19]"));
                        boolean isSelected19 = box19.isSelected();
                        Assert.assertTrue(isSelected19);

                        WebElement box20 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[20]"));
                        boolean isSelected20 = box20.isSelected();
                        Assert.assertTrue(isSelected20);

                        WebElement box21 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[21]"));
                        boolean isSelected21 = box21.isSelected();
                        Assert.assertTrue(isSelected21);

                        WebElement box22 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[22]"));
                        boolean isSelected22 = box22.isSelected();
                        Assert.assertTrue(isSelected22);

                        WebElement box23 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[23]"));
                        boolean isSelected23 = box23.isSelected();
                        Assert.assertTrue(isSelected23);

                        WebElement box24 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[24]"));
                        boolean isSelected24 = box24.isSelected();
                        Assert.assertTrue(isSelected24);

                        WebElement box25 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[25]"));
                        boolean isSelected25 = box25.isSelected();
                        Assert.assertTrue(isSelected25);*/


                }
                @Test
                public void story7_c() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("salesmanager105");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
                        vehicle.click();

                        WebElement box21 = driver.findElement(By.xpath("(//tbody[@class='grid-body']//input)[21]"));
                        box21.click();
                        boolean isSelected21 = box21.isSelected();
                        Assert.assertTrue(isSelected21);

                }

                @Test
                public void story6() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("salesmanager105");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();


                        Thread.sleep(2000);
                        WebElement vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
                        Thread.sleep(2000);
                        vehicle.click();


                        Thread.sleep(2000);
                        WebElement threeDots = driver.findElement(By.xpath("//td[@data-column-label='test']/div/div/a"));
                        Thread.sleep(2000);
                        Actions action = new Actions(driver);
                        action.moveToElement(threeDots).perform();
                        Thread.sleep(5000);
                        WebElement verifyThreeOptions = driver.findElement(By.xpath("(//div[@class='more-bar-holder']/div)[1]"));

                        Assert.assertTrue(verifyThreeOptions.isDisplayed());
                       // WebElement view = driver.findElement(By.xpath("(//div[@class='more-bar-holder']/div)[1]//a[@title='View']"));
                       // Assert.assertTrue(view.isDisplayed());
                        //Thread.sleep(2000);
                        //WebElement edit = driver.findElement(By.xpath("(//div[@class='more-bar-holder']/div)[1]//a[@title='Edit']"));
                        //Assert.assertTrue(edit.isDisplayed());
                       // Thread.sleep(2000);
                       // WebElement delete = driver.findElement(By.xpath("(//div[@class='more-bar-holder']/div)[1]//a[@title='Delete']"));
                        //Assert.assertTrue(delete.isDisplayed());



                }

                @Test
                public void story5() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager58");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement modle = driver.findElement(By.xpath("//span[.='Vehicles Model']"));
                        modle.click();

                        WebElement name = driver.findElement(By.xpath("//span[.='Model Name']"));
                        String actual = name.getText();
                        String wanted = "MODEL NAME";
                        Assert.assertEquals(actual,wanted);

                        WebElement make = driver.findElement(By.xpath("//span[.='Make']"));
                        String actual1 = make.getText();
                        String wanted1 = "MAKE";

                        WebElement required  = driver.findElement(By.xpath("//span[.='Can be requested']"));
                        String actual2 = required.getText();
                        String wanted2 = "CAN BE REQUESTED";
                        Assert.assertEquals(actual2,wanted2);

                        WebElement CVV = driver.findElement(By.xpath("//span[.='CVVI']"));
                        String actual3 = CVV.getText();
                        String wanted3 = "CVVI";
                        Assert.assertEquals(actual3,wanted3);

                        WebElement CO2Fee= driver.findElement(By.xpath("//span[.='CO2 Fee (/month)']"));
                        String actual4 = CO2Fee.getText();
                        String wanted4 = "CO2 FEE (/MONTH)";
                        Assert.assertEquals(actual4,wanted4);

                        WebElement cost = driver.findElement(By.xpath("//span[.='Cost (Depreciated)']"));
                        String actual5 = cost.getText();
                        String wanted5 = "COST (DEPRECIATED)";
                        Assert.assertEquals(actual5,wanted5);

                        WebElement total = driver.findElement(By.xpath("//span[.='Total Cost (Depreciated)']"));
                        String actual6 = total.getText();
                        String wanted6 = "TOTAL COST (DEPRECIATED)";
                        Assert.assertEquals(actual6,wanted6);

                        WebElement emissions = driver.findElement(By.xpath("//span[.='CO2 Emissions']"));
                        String actual7 = emissions.getText();
                        String wanted7 = "CO2 EMISSIONS";
                        Assert.assertEquals(actual7,wanted7);

                        WebElement fuel = driver.findElement(By.xpath("//span[.='Fuel Type']"));
                        String actual8 = fuel.getText();
                        String wanted8 = "FUEL TYPE";
                        Assert.assertEquals(actual8,wanted8);

                        WebElement vendors = driver.findElement(By.xpath("//span[.='Vendors']"));
                        String actual9 = vendors.getText();
                        String wanted9 ="VENDORS";
                        Assert.assertEquals(actual9,wanted9);




                }
                @Test
                public void story5_b() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("user7");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement modle = driver.findElement(By.xpath("//span[.='Vehicles Model']"));
                        modle.click();

                        WebElement warning = driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));
                        String actual= warning.getText();
                        String wanted = "You do not have permission to perform this action.";
                        Assert.assertEquals(actual,wanted);

        }

                @Test
                public void story4() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager58");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement contract = driver.findElement(By.xpath("//span[.='Vehicle Contracts']"));
                        contract.click();

                        String actual = driver.getCurrentUrl();
                        String wanted = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";
                        Assert.assertEquals(actual,wanted);

                        WebElement title = driver.findElement(By.xpath("//title[.='All - Vehicle Contract - Entities - System - Car - Entities - System']"));
                        String actual1 = driver.getTitle();
                        String wanted1 = "All - Vehicle Contract - Entities - System - Car - Entities - System";
                        Assert.assertEquals(actual1,wanted1);
                }
                @Test
                public void story4_b() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("salesmanager105");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement contract = driver.findElement(By.xpath("//span[.='Vehicle Contracts']"));
                        contract.click();

                        String actual = driver.getCurrentUrl();
                        String wanted = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";
                        Assert.assertEquals(actual,wanted);

                        WebElement title = driver.findElement(By.xpath("//title[.='All - Vehicle Contract - Entities - System - Car - Entities - System']"));
                        String actual1 = driver.getTitle();
                        String wanted1 = "All - Vehicle Contract - Entities - System - Car - Entities - System";
                        Assert.assertEquals(actual1,wanted1);
                }
                @Test
                public void story4_c() throws InterruptedException {
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("user1");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]"));
                        Thread.sleep(2000);
                        fleet.click();

                        WebElement contract = driver.findElement(By.xpath("//span[.='Vehicle Contracts']"));
                        contract.click();

                        WebElement warning = driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));
                        String actual = warning.getText();
                        String wanted = "You do not have permission to perform this action.";
                        Assert.assertEquals(actual,wanted);
                }

                @Test
                public void story3_b(){
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("user1");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement text = driver.findElement(By.xpath("//a[.='Learn how to use this space']"));
                        text.click();

                        WebElement image = driver.findElement(By.xpath("//img"));
                        String actual = image.getAttribute("src");
                        String wanted = "/bundles/oronavigation/images/pinbar-location.jpg";
                        actual.contains(wanted);



        }

                @Test
                public void story2(){
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("user1");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement help = driver.findElement(By.xpath("//i[@title='Get help']"));
                        help.click();

                        String actual = driver.getCurrentUrl();
                        String wanted = "https://doc.oroinc.com/";
                        actual.contains(wanted);


                }

                @Test
                public void story1(){
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("storemanager58");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement dash = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
                        String actual = dash.getText();
                        String wanted = "Dashboards";
                        Assert.assertEquals(actual,wanted);

                        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
                        String actual1 = fleet.getText();
                        String wanted1 = "Fleet";
                        Assert.assertEquals(actual1,wanted1);

                        WebElement customer = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
                        String actual2 = customer.getText();
                        String wanted2 = "Customers";
                        Assert.assertEquals(actual2,wanted2);

                        WebElement sale = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[4]"));
                        String actual3 = sale.getText();
                        String wanted3 = "Sales";
                        Assert.assertEquals(actual3,wanted3);

                        WebElement Activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[5]"));
                        String actual4 = Activities.getText();
                        String wanted4 = "Activities";
                        Assert.assertEquals(actual4,wanted4);

                        WebElement marketing = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[6]"));
                        String actual5 = marketing.getText();
                        String wanted5 = "Marketing";
                        Assert.assertEquals(actual5,wanted5);

                        WebElement report = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[7]"));
                        String actual6 = report.getText();
                        String wanted6 = "Reports & Segments";
                        Assert.assertEquals(actual6,wanted6);

                        WebElement system = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[8]"));
                        String actual7 = system.getText();
                        String wanted7 = "System";
                        Assert.assertEquals(actual7,wanted7);






                }
                @Test
                public void story1_b(){
                        driver.get("https://qa2.vytrack.com/user/login");
                        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
                        inputUsername.sendKeys("user7");

                        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
                        inputPassword.sendKeys("UserUser123");

                        WebElement login = driver.findElement(By.id("_submit"));
                        login.click();

                        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
                        String actual1 = fleet.getText();
                        String wanted1 = "Fleet";
                        Assert.assertEquals(actual1,wanted1);

                        WebElement customer = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
                        String actual2 = customer.getText();
                        String wanted2 = "Customers";
                        Assert.assertEquals(actual2,wanted2);

                        WebElement Activities = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
                        String actual4 = Activities.getText();
                        String wanted4 = "Activities";
                        Assert.assertEquals(actual4,wanted4);

                        WebElement system = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[4]"));
                        String actual7 = system.getText();
                        String wanted7 = "System";
                        Assert.assertEquals(actual7,wanted7);
                }

}
