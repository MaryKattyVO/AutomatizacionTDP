package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;
import aseguramientoBDD.utility.ScreenshotUtility;

import java.io.File;

public class P011_DetalleMTPage extends BasePage {

    public final String btnValidar = "/html[1]/body[1]/app-root[1]/div[1]/app-order-detail[1]/app-validate-order[1]/section[1]/div[1]/div[1]/div[3]/button[1]";
    public final String btnValidarMovil = "//*[contains(text(),'Validar')]";
    public final String txtOrder1 = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-modal-generic[1]/div[2]/mat-dialog-content[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
    public final String btnListo = "//*[contains(text(),'Listo')]";
    public final String btnSalir = "/html[1]/body[1]/app-root[1]/div[1]/app-order-detail[1]/app-aproved-order[1]/section[1]/div[1]/div[1]/div[3]/a[1]";
    public final String lblEstado = "/html[1]/body[1]/app-root[1]/div[1]/app-order-detail[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-status-order[1]/h2[1]/span[1]";
    public final String btnCargarAudio = "//*[contains(text(),'Cargar audio')]";
    public final String pnlCargaAudio = "//div[@class='drop-zone-uploader']";
    public final String frame = "id|mat-dialog-0";

    public final String txtNum = "";
    public final String txtOrd = "";
    public final String btnConfirm = "";

    public void cargarAudio() {
        String evidencePath = "./src/test/resources/audio/";
        try {
            doclickByJS("Click en boton Cargar Audio: ", btnCargarAudio, true);
            switchiframeToframe("Cambiar", frame);
            String nameFile = ScreenshotUtility.getName(evidencePath);
            System.out.println("Nombre de archivo" + nameFile);
            DropFile("Cargando audio",new File(evidencePath + nameFile), pnlCargaAudio, 0, 0, true);
            switchiframeDefaultContent("Audio cargado");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en ValidarMT", e);
        }
    }

    public void ValidarMT(String sEscenarioID) {
        try {
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en Validar", btnValidar, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en ValidarMT", e);
        }
    }

    public void registrarSimple(String o_order1, String o_order2, String sEscenarioID) {
        try {
            Thread.sleep(3000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en Validar Movil 1", btnValidarMovil, true);
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Ingresar orden +Simple", txtOrder1, o_order1, false);
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en boton Listo", btnListo, true);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en Validar Movil 2", btnValidarMovil, true);
            Thread.sleep(5000);
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Ingresar orden +Simple", txtOrder1, o_order2, false);
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en boton Listo", btnListo, true);
            checkAlert_Accept();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en registrarSimple", e);
        }
    }

    public void registrarSimple_remoto(String i_Num1G, String o_Order1, String o_Order2, String sEscenarioID) {
        try {
            doAddTextField("Agregar numero 1:", txtNum, i_Num1G, false);
            doAddTextField("Agregar orden 1:", txtOrd, o_Order1, false);
            doclickByJS("Click en Confirmar registro", btnConfirm, true);
            doAddTextField("Agregar numero 2:", txtNum, i_Num1G, false);
            doAddTextField("Agregar orden 2:", txtOrd, o_Order2, false);
            doclickByJS("Click en Confirmar registro", btnConfirm, true);
            checkAlert_Accept();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en registrarSimple", e);
        }
    }

    public String getStateMT() throws Exception {
        return getlabel("Estado MT", lblEstado);
    }

    public void doClickSalir(String sEscenarioID) {
        try {
            Thread.sleep(5000);
            System.out.println("antes de salir: " + btnSalir);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en Salir", btnSalir, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doClickSalir", e);
        }
    }

}

