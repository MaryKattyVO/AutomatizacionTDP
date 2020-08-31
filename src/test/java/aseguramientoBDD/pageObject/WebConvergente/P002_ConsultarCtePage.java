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

package aseguramientoBDD.pageObject.WebConvergente;

import java.awt.*;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

public class P002_ConsultarCtePage extends BasePage {

    public BasePage basePage = new BasePage();
    public final static String txt_DNI = "//input[@id='txtDocumentNumber']";
    public final static String btn_Consulting = "//button[@class='btn btn-success btn-block']";


    public boolean doClickConsultingPage(String UIName, String objTechName, Boolean screenshot) throws IOException {
        try {

            doClick(UIName, objTechName, screenshot);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
			Assert.fail("ERROR en doClickConsultingPage", e);
            return false;
        }
    }


    public boolean doAddTextFieldDocIdentPage(String UIName, String objTechName, String text, Boolean screenshot) throws IOException {
        try {

            doAddTextField(UIName, objTechName, text, screenshot);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
			Assert.fail("ERROR en doAddTextFieldDocIdentPage", e);
            return false;
        }
    }


    public boolean dniConsultingPage(String sEscenarioID, String sDNI, WebDriver driver) throws IOException, AWTException {
        boolean validacion = false;
        try {

            doAddTextFieldDocIdentPage("Ingreso_DNI", txt_DNI, sDNI, false);
            doClickConsultingPage("[Escenario " + sEscenarioID + "] " + "Consultar DNI", btn_Consulting, true);
            validacion = true;

        } catch (Exception e) {
            e.printStackTrace();
        	Assert.fail("ERROR en dniConsultingPage", e);
        }
        return validacion;
    }


}
