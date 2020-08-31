package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;
import aseguramientoBDD.utility.ScreenshotUtility;

import java.io.File;

public class P010_BackOfficePage extends BasePage {

    public final String btnValidar = "//*[contains(text(),'Validar')]";
    public final String txtBuscar = "/html[1]/body[1]/app-root[1]/div[1]/app-dashboard[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/input[1]";
    public final String btnLupa = "/html[1]/body[1]/app-root[1]/div[1]/app-dashboard[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/mat-icon[1]";

    public void buscarMT(String o_MT, String sEscenarioID) {
        try {
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Ingresar MT", txtBuscar, o_MT, false);
            Thread.sleep(3000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Buscar MT", btnLupa, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en buscarMT", e);
        }
    }

    public void ValidarMT(String sEscenarioID) {
        try {
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID + "Click en boton Validar", btnValidar, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en ValidarMT", e);
        }
    }

    public void cambiarNombreArchivo(String o_MT) throws Exception {
        String evidencePath = "./src/test/resources/audio/";
        try {
            String nombre = ScreenshotUtility.getName(evidencePath);
            System.out.println("Archivo original: " + nombre);
            File oldfile = new File("./src/test/resources/audio/" + nombre);
            File newfile = new File("./src/test/resources/audio/" + o_MT + ".gsm");
            if (oldfile.renameTo(newfile)) {
                System.out.println("Archivo renombrado");
            } else {
                System.out.println("Error al cambiar nombre de audio");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en cambiarNombreArchivo", e);
        }
    }

}
