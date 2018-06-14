/*
 * This Java source file was generated by the Gradle 'init' task.
 */
/*import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

public class LibraryTest {
  	Library lib;
  	
  @Before 
  public void initLibrary() {
	  lib=new Library();
  }
  
  @Test public void addtest() {
    	
    	
    	int max=Integer.MAX_VALUE;
    	int min=Integer.MIN_VALUE;
    	int res1=lib.add(max, 1);
    	Assert.assertEquals(min,res1);
    }
    
        @Test public void substest() {
        	
        	
        	int max=Integer.MAX_VALUE;
        	int min=Integer.MIN_VALUE;
        	int res2=lib.subs(max, min);
        	Assert.assertEquals(-1,res2);
        }
        
    @After
    public void closeDB()
    {
    	lib=null;
    }
    
}*/

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

public class LibraryTest {
	@Test
	public void ChromeTest()
	{
	
	WebDriver driver=new ChromeDriver();
	//**************ouvrir un page **********************
	 /* driver.get("http://www.google.com");*/
	//************************************
	
	 //***********chercher si on a un element qui a un id *************************************** 
	 /*WebElement barreRecherche= driver.findElement(By.id("lst-ib") );*/
	//*************on va taper coup du monde *********************************/
	//	barreRecherche.sendKeys("Coup du monde");
	//****************on va chercher des elements et prendre le premiere ***********************
	/*
	  List<WebElement> buttons=driver.findElements(By.className("lsb"));
	  buttons.get(0).click();*/
	
	//Arrange
	String urlwiki="https://en.wikipedia.org";
	
	driver.get("https://en.wikipedia.org");
	WebElement barreRecherche= driver.findElement(By.id("searchInput") );
	barreRecherche.sendKeys("World Cup");
	WebElement button=driver.findElement(By.className("searchButton"));
	  button.click();
	  WebElement titre=driver.findElement(By.id("firstHeading"));
		driver.findElement(By.xpath(xpathExpression)));
		WebElement titre=driver.findElement(By.id("firstHeading"));
	  Assert.assertEquals("World Cup",titre.getText());
	  
	driver.quit();
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
}