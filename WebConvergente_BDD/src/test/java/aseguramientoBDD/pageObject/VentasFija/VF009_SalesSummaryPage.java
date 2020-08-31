package aseguramientoBDD.pageObject.VentasFija;

import aseguramientoBDD.helpers.BasePage;

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
public class VF009_SalesSummaryPage extends BasePage {
    public final String btn_siacepto = "//*[@id=\"data\"]/saleprocess/div/div/div/salesummary/div[2]/div/div[2]/div[4]/a";
    public final String btn_siacepto_migra = "//a[contains(text(),'SI, ACEPTO')]";

    public void SalesSummaryPage() {
        try {
            doclickByJS("Click_btn_aceptar",btn_siacepto_migra,true);
        } catch ( IOException | AWTException e) {
            e.printStackTrace();
        }
    }


}
