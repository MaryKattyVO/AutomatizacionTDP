/**************************************************
 # WIPRO COMPANY PROPIEDAD INTELECTUAL www.wipro.com
 #Autor : Juan Pablo Rosas
 #Description : WebConvergente - Movistar Alta Total
 #Fecha de creación: Feb 2019
 # Venta Fija Version: XXXX
 #Input Parameters: --
 #Nombre que modifica : --
 #Fecha modificación: --
 **************************************************/

package aseguramientoBDD.helpers;

import aseguramientoBDD.utility.GlobalVariable;
import aseguramientoBDD.utility.ObjectMap;
import aseguramientoBDD.utility.ScreenshotUtility;
import aseguramientoBDD.utility.WordUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Hook {
    private static WebDriver driver;
    //public WebDriver driver;
    public BasePage basePage;


    /**
     * Borra todos los coockies e instancia el browser indicado
     */

//    @Before
    public WebDriver browser(String sbrowser, String strURL) throws Exception {
        String sCarpAct = "./results/screenshot/";
        ScreenshotUtility.cleanScreenshot(sCarpAct);
        boolean browserFound = true;
        if (sbrowser.toUpperCase().equals("FIREFOX")) {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } else if (sbrowser.toUpperCase().equals("CHROME")) {
            System.setProperty("webdriver.chrome.driver", GlobalVariable.AUT_BROWSER_SERVER_PATH_CHROME);
            driver = new ChromeDriver();
        } else if (sbrowser.toUpperCase().equals("IE")) {
            System.setProperty("webdriver.ie.driver", GlobalVariable.AUT_BROWSER_SERVER_PATH_CHROME);
            driver = new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } else {
            browserFound = false;
        }
        if (browserFound) {
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(strURL);
            basePage = new BasePage();
            basePage.setWebDriver(driver);
            System.out.println("Browser Inicializado" + driver.getTitle());
            return driver;
        } else {
            return null;
        }
    }

    /**
     * Cierra el browser y termina la sesion del WebDriver
     * @param webDriver
     */

//    @After
    public static void closeBrowser(WebDriver webDriver) throws Exception {
        generarWordFile();
        //driver.quit();
    }

    public static void generarWordFile() throws Exception {
        String sCarpAct = "./results/screenshot/";
        List<String> listScreen = ScreenshotUtility.listScreenshot(sCarpAct);
        if (listScreen != null && listScreen.size() > 0) {
            System.out.println("crea doc");
            WordUtils.createDoc("Alta trío Movistar Play", listScreen);
        } else {
            System.out.println("No hay Data");
        }
    }

    //Valida que el texto mostrado corresponda al texto comparado
    //No valida mayúsculas, ni minúsculas
    public boolean verifyText(String strText, String objTechName) throws Exception {
        int defaultWaitingTime = 500;
        WebDriverWait wait = new WebDriverWait(driver, defaultWaitingTime);
        WebElement element = driver.findElement(ObjectMap.getLocator(objTechName));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText().equalsIgnoreCase(strText);
    }
}