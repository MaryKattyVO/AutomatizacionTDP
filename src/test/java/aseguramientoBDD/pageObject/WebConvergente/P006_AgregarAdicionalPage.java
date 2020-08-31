package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

import java.awt.*;
import java.io.IOException;

public class P006_AgregarAdicionalPage extends BasePage {

    //Objetos Añadir equipo
    public final static String btnDetalleEq = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-mobile[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ngx-hm-carousel[1]/div[1]/section[1]/article[2]/app-mobile-price-in-offer[1]/div[1]";
    public final static String btnColor = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-mobile[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]";
    public final static String btnSeleccionarPlan = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-mobile[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ngx-hm-carousel[1]/div[1]/section[1]/article[2]/app-mobile-price-in-offer[1]/div[1]/div[1]";
    public final static String btnPagoTotal = "//*[@id=\"mat-dialog-0\"]/app-mobile/div/div[2]/div[1]/div/div/div/div/div[2]/form/div[4]/div[2]/div[2]";
    public final static String btnElegirEquipo = "//*[contains(text(),'ELEGIR EQUIPO')]";
    public final static String buscador = "/html[1]/body[1]/app-root[1]/div[1]/app-mobile-catalog[1]/div[3]/div[1]/app-mobile-catalog-filter[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]";
    public final static String equipoSelkected = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]";

    //Objetos Añadir SVA
    public final static String rdnBloqueHD = "id|radio_hd";
    public final static String rdnHBO = "id|radio_hbo";
    public final static String rdnFOX = "id|radio_fox";
    public final static String rdnBloqueEstelar = "id|radio_estelar";
    public final static String btnGuardarCambios = "//*[contains(text(),'Guardar Cambios')]";
    public final static String rdnDeco = "//div[contains(@class,'bg-white pt-4 pb-4')]//i[@class='material-icons cursor-event'][contains(text(),'add_circle_outline')]";

    //Añadir equipo
    public void Elegir_Equipo_Elegir_Plan(String i_equipo, String sEscenarioID) throws IOException, AWTException {
        try {
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Ingresar modelo de equipo", buscador, i_equipo, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Elegir equipo", equipoSelkected, true);
            wait("esperando elemento",btnSeleccionarPlan);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Clic_Seleccionar_Plan", btnSeleccionarPlan, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Elegir color", btnColor, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Clic_Pago_Contado", btnPagoTotal, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Clic_Elegir_Equipo", btnElegirEquipo, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en Elegir_Equipo_Elegir_Plan", e);
        }
    }

    //Analir SVA
    public void elegirSVA(String i_Sva, String sEscenarioID) {
        try {
            System.out.println("Escoge SVA");
            if (i_Sva.equals("Bloque HD")){
                System.out.println("Bloque HD");
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Escoger bloque HD ", rdnBloqueHD, true);
            }else if (i_Sva.equals("HBO")){
                System.out.println("HBO");
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Escoger bloque HD ", rdnHBO, true);
            }else if (i_Sva.equals("FOX")){
                System.out.println("FOX");
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Escoger bloque HD ", rdnFOX, true);
            }else if (i_Sva.equals("Bloque estelar")){
                System.out.println("Bloque estelar");
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Escoger bloque HD ", rdnBloqueEstelar, true);
            }
            Thread.sleep(2000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click en Aceptar Cambios", btnGuardarCambios, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en Elegir_Equipo_Elegir_Plan", e);
        }
    }
}


