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
public class VF003_HomePage extends BasePage {
    public final String btn_Alta_Nueva = "//*[@id=\"data\"]/acciones/div/div/div[1]/form/div/a[1]";
    public final String lbl_user = "//*[@id=\"data\"]/acciones/div/div/div[1]/div";
    public final String btn_Migraciones = "//*[@id=\"data\"]/acciones/div/div/div[1]/form/div/a[2]";
    //"//*[@id=\"data\"]/acciones/div/div/div[1]/div"
    public final String btnObviarContinuar = "id|continuar_";

    public boolean ValidateUser(String suser, String id) {
        boolean respuesta = false;
        try {
            respuesta = verifyText(suser, lbl_user, id, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    public void DoClickAltaNueva() {
        try {
            Thread.sleep(2000);
            doClick("Click en alta nueva", btn_Alta_Nueva, false);
        } catch (IOException | AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean validarBtnAlta() {
        boolean respuesta = false;
        try {
            respuesta = validateObjExist(btn_Alta_Nueva);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return respuesta;
    }

    public boolean validarBtnMigacion() {
        boolean respuesta = false;
        try {
            respuesta = validateObjExist(btn_Migraciones);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return respuesta;
    }

    public void DoClickMigraciones() {
        try {
            doClick("Click en Migraciones", btn_Migraciones, false);
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }

    public void DoclickObviar() {
        try {
            doclickByJS("Click en onviar y continuar", btnObviarContinuar, true);
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }

}
