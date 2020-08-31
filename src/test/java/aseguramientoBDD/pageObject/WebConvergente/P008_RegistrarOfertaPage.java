package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

public class P008_RegistrarOfertaPage extends BasePage {

    public final String btnRegsitrar = "//*[contains(text(),'Registrar oferta')]";
    ///html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]

    public void registrarOferta(String sEscenarioID) {
        try {
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID +" ]" +" Click en Registrar Oferta", btnRegsitrar, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en registrarOferta", e);
        }
    }
}
