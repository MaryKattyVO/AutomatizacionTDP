package aseguramientoBDD.pageObject.VentasFija;

import aseguramientoBDD.helpers.BasePage;
import org.testng.Assert;

import java.awt.*;
import java.io.IOException;

/**************************************************
 WIPRO COMPANY PROPIEDAD INTELECTUAL www.wipro.com
 #Autor : Marcos Ronceros
 #Description : Venta Fija – Alta
 #Fecha de creación: Feb 2020
 # Venta Fija Version: XXXX
 #Input Parameters: --
 #Nombre que modifica : --
 #Fecha modificación: --
 **************************************************/
public class VF001_PreLoginPage extends BasePage {
    public final String txt_codatis = "//*[@id=\"signup-form\"]/div[1]/input";
    public final String btn_continuar = "//*[@id=\"signup-form\"]/div[2]/a";

    public void prelogin (String codatis) throws AWTException,IOException{
        try {
            doAddTextField("Ingresando Codigo Atis",txt_codatis,codatis,true);
            doClick("Click en Continuar",btn_continuar,false);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            Assert.fail("Fallo en el prelogin",e);
        }
    }
}
