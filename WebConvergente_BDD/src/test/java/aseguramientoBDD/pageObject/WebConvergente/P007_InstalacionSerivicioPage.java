package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

import java.awt.*;
import java.io.IOException;

public class P007_InstalacionSerivicioPage extends BasePage {

    public final String btnTurno1 = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-agendamiento[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]";
    public final String btnTurno2 = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-agendamiento[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]";
    public final String btnAceptar = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-agendamiento[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]";
    public final String btnConfirmar = "//*[contains(text(),'Confirmar y finalizar')]";

    public final String btnRegsitrar = "//*[contains(text(),'Registrador oferta')]";


    public void programarInstalacion(String sEscenarioID) throws IOException, AWTException {
        try {
            waitInvisibility("[Escenario " + sEscenarioID + "] " + "Esperar boton", btnTurno1, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Escoger turno", btnTurno1, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Dar click en Aceptar", btnAceptar, true);
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en Confirmar", btnConfirmar,true);
            waitInvisibility("[Escenario " + sEscenarioID + "] " + "Esperar boton de registro",btnRegsitrar,true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en programarInstalacion", e);
        }
    }

}
