package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

public class P009_OrderStatusPage extends BasePage {

    public final String lbltMT = "/html[1]/body[1]/app-root[1]/div[1]/app-order-status[1]/div[1]/app-section-header[1]/header[1]/section[1]/div[1]/div[1]/div[2]/b[1]";
    public final String btnSalir = "//*[contains(text(),'Salir')]";
    ///html[1]/body[1]/app-root[1]/div[1]/app-order-status[1]/div[1]/app-section-header[1]/header[1]/section[1]/div[1]/div[1]/div[3]/div[1]/button[1]
    public final String lblStatus = "/html[1]/body[1]/app-root[1]/div[1]/app-order-status[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/font[1]/font[1]";

    public String getMT() throws Exception {
        System.out.println("Obteniendo MT");
        return getlabel("Codigo MT", lbltMT);
    }

    public void doClickSalir(String sEscenarioID) {
        try {
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID +" ]"+ "Hacer Click en Salir", btnSalir, true);
            Thread.sleep(3000);
            checkAlert_Accept();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doClickSalir", e);
        }
    }
}
