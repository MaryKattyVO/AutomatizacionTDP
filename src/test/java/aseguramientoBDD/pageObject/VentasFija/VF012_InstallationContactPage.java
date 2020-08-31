package aseguramientoBDD.pageObject.VentasFija;

import aseguramientoBDD.helpers.BasePage;

import java.awt.*;
import java.io.IOException;

public class VF012_InstallationContactPage extends BasePage {

    public final String btn_calendario = "//*[@id=\"calendar\"]";
    public final String btn_selecciondia = "//*[@id=\"calendar\"]/my-date-picker/div/div/table[2]/tbody/tr[4]/td[2]/div/span";

    public final String btn_turnomaniana_remoto = "//div[@class='mt recomendado row']//div[1]//div[1]";
    public final String btn_turnotarde_remoto = "//div[@class='mt recomendado row']//div[2]//div[1]";
    public final String btn_confirmaryFinalizar = "//*[contains(text(),'CONFIRMAR Y FINALIZAR')]";
    public final String btn_finalizarVenta = "//*[contains(text(),'FINALIZAR VENTA')]";

    public final String txt_telefono = "id|0phoneNumber";
    public final String btn_finalizarconagendamiento = "//*[@id=\"data\"]/saleprocess/div/div/div/app-schedule/div[1]/div[4]/div[3]/div/div[3]/a";
    public final String btn_entendido = "//*[@id=\"aceptar\"]";
    public final String lbl_título = "//*[@id=\"data\"]/contactoinstalacion/div/div/div[1]/p";
    public final String btn_finalizaraltasimple = "//*[@id=\"data\"]/contactoinstalacion/div/div/div[2]/app-form-contacto/div/div[1]/a";

    public final String btn_dateCalendar(String i_date) {
        return "//td[@class='daycell currmonth tablesingleday']//span[contains(text(),'" + i_date + "')]";
    }

    public void Agendar(String i_date, String i_turno, String iTelefono) throws Throwable {
        try {
            doclickByJS("Elegir fecha", btn_dateCalendar(i_date), true);
            if (i_turno.equals("Mañana")) {
                doclickByJS("Elegir turno manana", btn_turnomaniana_remoto, true);
            } else if (i_turno.equals("Tarde")) {
                doclickByJS("Elegir turno tarde", btn_turnotarde_remoto, true);
            }
            jsScrollIntoView("Bajar hasta boton", btn_finalizarVenta,false);
            doAddTextField("Agregar numero de celular",txt_telefono,iTelefono, false);
            doclickByJS("Click en Finalizar venta", btn_finalizarVenta, true);
            doclickByJS("Confirmar y Finalizar", btn_confirmaryFinalizar, true);
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }


    public void AgendarOSoloInsertarTelefono(String sTelefono) throws Throwable {
        try {
            if (validateObjExist(btn_calendario)) {
                System.out.println("VF012_InstallationContactPage: Agendamiento");
                doclickByJS("Click en día de instalación", btn_selecciondia, false);
                doclickByJS("Click en selección de turno", btn_turnotarde_remoto, true);
                doAddTextField("Ingresar telefono del cliente", txt_telefono, sTelefono, false);
            } else {
                //else if(lbl_título.equalsIgnoreCase("Contacto de Instalación")) {
                //if(validateObjExist(btn_finalizaraltasimple)) {
                System.out.println("VF012_InstallationContactPage: Ingreso de Teléfono - Simple");
                doAddTextField("Ingresar telefono del cliente", txt_telefono, sTelefono, false);
            }
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }

    public void DoClickFinalizarVenta() throws Throwable {
        try {
            if (validateObjExist(btn_calendario)) {
                System.out.println("VF012_InstallationContactPage: Finalizar con agendamiento");
                doClick("Click en finalizar venta", btn_finalizarconagendamiento, true);
                doClick("Click en confirmar y finalizar", btn_confirmaryFinalizar, true);

                if (validateObjExist(btn_entendido)) {
                    doClick("Click en entendido", btn_entendido, true);
                }
            } else {
                //if(lbl_título.equalsIgnoreCase("Contacto de Instalación")) {
                //if(validateObjExist(btn_finalizaraltasimple)) {
                System.out.println("VF012_InstallationContactPage: Finalizarción Alta - Simple");
                doClick("Click en finalizar", btn_finalizaraltasimple, true);
            }

        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }

    public boolean validarBtnFinalizar() {
        boolean respuesta = false;
        try {
            respuesta = validateObjExist(btn_finalizarconagendamiento);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return respuesta;
    }
}