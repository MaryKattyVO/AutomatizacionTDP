package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

public class P005_RegistrerOfferPage extends BasePage {

    public final String btnValidarMCSS = "//*[contains(text(),'Validar')]";
    public final String txtNumSimple = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-modal-generic[1]/div[2]/mat-dialog-content[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
    public final String btnListo = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-modal-generic[1]/div[2]/mat-dialog-content[1]/form[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
    public final String btnValidar = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-amdocs[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]";
    public final String iconTel = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-modal-generic[1]/div[2]/mat-dialog-content[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-icon[1]";
    public final String frame1 = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]";
    public final String frame2 = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]";
    public final String lblValidando = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-modal-generic[1]/div[2]/div[2]";
    public final String lblNum = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-modal-generic[1]/div[2]/div[3]";

    public void doStartRegistro(String i_telefonoContactoAdicional, String i_telefonoQuienRecibiraInstalacion, String sEscenarioID) throws Throwable {
        try {
            System.out.println("Antes de click validar");
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Validar MCSS", btnValidarMCSS, true);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click txt", txtNumSimple, false);
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Ingresar número + Simple 1", txtNumSimple, i_telefonoContactoAdicional, false);
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en bton Listo", btnListo, true);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Validar MCSS", btnValidarMCSS, true);
            Thread.sleep(5000);
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Ingresar número + Simple 2", txtNumSimple, i_telefonoQuienRecibiraInstalacion, false);
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en bton Listo", btnListo, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doContinuarRegistroMCSS", e);
        }
    }


}
