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
public class VF007_SVASelectionPage extends BasePage {

    public final String chk_bloquefullhd = "//*[@id=\"abrirResumen\"]/div[1]/div[1]/table/tbody/tr[2]/td[3]/div/label";
    public final String chk_bloquehbonew = "//*[@id=\"109_sva\"]/td[3]/div/label";
    public final String chk_bloquefoxnew = "//*[@id=\"111_sva\"]/td[3]/div/label";
    public final String chk_bloquehotpack = "//*[@id=\"113_sva\"]/td[3]/div/label";
    public final String chk_bloquegoldenpremier = "//*[@id=\"115_sva\"]/td[3]/div/label";
    public final String chk_bloqueestelar = "//*[@id=\"107_sva\"]/td[3]/div/label";
    public final String cbo_pasmarthd = "id|DSHD";
    //public final String cbo_pasmarthd         = "//*[@id=\"DSHD\"]";
    public final String txt_correopasmarthd = "id|email";
    //public final String txt_correopasmarthd   = "//*[@id=\"email\"]";
    public final String cbo_rsmartwifi = "id|RSW";
    //public final String cbo_rsmartwifi        = "//*[@id=\"RSW\"]";
    public final String cbo_svainternet = "id|SVAI";
    //public final String cbo_svainternet       = "//*[@id=\"SVAI\"]";
    public final String cbo_svalinea = "id|SVAL";
    //public final String cbo_svalinea          = "//*[@id=\"SVAL\"]";

    public final String btn_continuaralta = "//*[@id=\"abrirResumen\"]/div[1]/div[2]/a";
    public final String btn_continuarmigracion = "//*[@id=\"abrirResumen\"]/div[1]/div[3]/a";

    //Locator Mira SVA
    public final String chk_bloquehbonew_migra = "//tr[2]//td[3]//div[1]//label[1]";
    public final String chk_bloquehotpack_migra = "//tr[@id='113_sva']//label";
    public final String chk_bloquegoldenpremier_migra = "//tr[@id='115_sva']//div[@class='squaredTwo2']";
    public final String chk_bloqueestelar_migra = "//tr[@id='107_sva']//label";

    public void DoClickSelecciondeSVALineaenAltas(String svalinea) throws Throwable {
        try {
            System.out.println("Error1");
            if (validateObjExistById("Validar objeto", cbo_svalinea)) {
                System.out.println("Error2");
                if (svalinea.equalsIgnoreCase("IDENTIFICACION DE LLAMADAS") || svalinea.equalsIgnoreCase("PLAN MULTIDESTINO 10") || svalinea.equalsIgnoreCase("PLAN MULTIDESTINO 15") || svalinea.equalsIgnoreCase("PLAN MULTIDESTINO 20") || svalinea.equalsIgnoreCase("PLAN MULTIDESTINO 25") || svalinea.equalsIgnoreCase("PLAN MULTIDESTINO 30")) {
                    System.out.println("Error3");

                    jsScrollIntoView("Scroll hasta Combobox de SVA Línea", cbo_svalinea, false);
                    doSelectDropdown("Seleccionar el SVA Línea", cbo_svalinea, svalinea, true);

                    System.out.println("Error4");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DoClickSelecciondeSVATVenAltas(String sbloquefullhd, String sbloquehbonew, String sbloquefoxnew, String sbloquehotpack, String sbloquegoldenpremier, String sbloqueestelar, String spasmarthd, String scorreopasmarthd) throws Throwable {
        try {
            System.out.println("Error5");
            if (validateObjExist(chk_bloquefullhd)) {
                System.out.println("Error6");
                if (sbloquefullhd.equalsIgnoreCase("Si")) {
                    System.out.println("Error7");
                    doclickByJS("Selección de SVA Bloque Full HD", chk_bloquefullhd, true);
                    System.out.println("Error8");
                }
            }
            if (validateObjExist(chk_bloquehbonew)) {
                System.out.println("Error9");
                if (sbloquehbonew.equalsIgnoreCase("Si")) {
                    System.out.println("Error10");
                    doclickByJS("Selección de SVA Bloque HBO New", chk_bloquehbonew, true);
                    System.out.println("Error11");
                }
            }
            if (validateObjExist(chk_bloquefoxnew)) {
                System.out.println("Error12");
                if (sbloquefoxnew.equalsIgnoreCase("Si")) {
                    System.out.println("Error13");
                    doclickByJS("Selección de SVA Bloque FOX + New", chk_bloquefoxnew, true);
                    System.out.println("Error14");
                }
            }
            if (validateObjExist(chk_bloquehotpack)) {
                System.out.println("Error15");
                if (sbloquehotpack.equalsIgnoreCase("Si")) {
                    System.out.println("Error16");
                    doclickByJS("Selección de SVA Bloque Hot Pack", chk_bloquehotpack, true);
                    System.out.println("Error17");
                }
            }
            if (validateObjExist(chk_bloquegoldenpremier)) {
                System.out.println("Error18");
                if (sbloquegoldenpremier.equalsIgnoreCase("Si")) {
                    System.out.println("Error19");
                    doclickByJS("Selección de SVA Bloque Golden Premier", chk_bloquegoldenpremier, true);
                    System.out.println("Error20");
                }
            }
            if (validateObjExist(chk_bloqueestelar)) {
                System.out.println("Error21");
                if (sbloqueestelar.equalsIgnoreCase("Si")) {
                    System.out.println("Error22");
                    doclickByJS("Selección de SVA Bloque Estelar", chk_bloqueestelar, true);
                    System.out.println("Error23");
                }
            }
            if (validateObjExistById("Validar objeto", cbo_pasmarthd)) {
                System.out.println("Error24");
                if (spasmarthd.equalsIgnoreCase("1") || spasmarthd.equalsIgnoreCase("2")) {
                    System.out.println("Error25");
                    jsScrollIntoView("Scroll hasta Combobox de Punto Adicional Smart HD", cbo_pasmarthd, false);
                    doSelectDropdown("Seleccionar Número de Puntos Adicionales Smart HD", cbo_pasmarthd, spasmarthd, false);
                    doAddTextField("Ingresando Codigo Atis", txt_correopasmarthd, scorreopasmarthd, true);
                    System.out.println("Error25");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DoClickSelecciondeSVAInternetenAltas(String srsmartwifi, String ssvainternet) throws Throwable {
        try {
            if (validateObjExistById("Validar objeto", cbo_rsmartwifi)) {
                System.out.println("Error26");
                if (srsmartwifi.equalsIgnoreCase("1") || srsmartwifi.equalsIgnoreCase("2")) {
                    System.out.println("Error27");
                    jsScrollIntoView("Scroll hasta Combobox de Repetidor Smart Wifi", cbo_rsmartwifi, false);
                    System.out.println("Error28");
                    doSelectDropdown("Seleccionar Número de Repetidores Smart Wifi", cbo_rsmartwifi, srsmartwifi, true);
                    System.out.println("Error29");
                }
            }
            if (validateObjExistById("Validar objeto", cbo_svainternet)) {
                System.out.println("Error30");
                if (ssvainternet.equalsIgnoreCase("SEGURIDAD TOTAL RESIDENCIAL")) {
                    System.out.println("Error31");
                    jsScrollIntoView("Scroll hasta Combobox de SVA Internet", cbo_svainternet, false);
                    System.out.println("Error32");
                    doSelectDropdown("Seleccionar Seguridad Total Residencial", cbo_svainternet, ssvainternet, true);
                    System.out.println("Error33");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DoClickSelecciondeSVATVenMigras(String sbloquehbonew) throws Throwable {
        try {
            if (validateObjExist(chk_bloquehbonew_migra)) {
                if (sbloquehbonew.equalsIgnoreCase("Si")) {
                    Thread.sleep(4000);
                    doclickByJS("Selección de SVA Bloque HBO New", chk_bloquehbonew_migra, true);
                    System.out.println("Paquete seleccionado");
                } else {
                    System.out.println("No existe xpath");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DoClickContinuar() throws IOException, AWTException {
        try {
            Thread.sleep(4000);
            doclickByJS("Click en Continuar", btn_continuaralta, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DoClickSelecciondeSVAMigracion() {
        try {
            Thread.sleep(4000);
            jsScrollIntoView("Scroll hasta boton continuar", btn_continuarmigracion, false);
            doclickByJS("Seleccionando SVA", btn_continuarmigracion, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
