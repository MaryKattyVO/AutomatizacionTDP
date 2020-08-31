package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

import java.io.IOException;

public class P004_SalesAddOfferPage extends BasePage {
    public final String txtemail = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]";
    public final String txtContactoAdicional = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]";
    public final String txtInstallPerson = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
    public final String txtInstallPhone = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]";
    public final String btnValidarContrato = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/div[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[2]/form[1]/div[5]/div[1]/button[1]";
    public final String btnAceptar = "/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-read-contract[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[7]/div[1]/button[1]";
    public final String btnContinuar = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/button[1]";
    public final String btnValidarMCSS = "//*[contains(text(),'Validar')]";
    public final String lblRegistroMovil = "//*[contains(text(),'Registro Móvil')]";

    public final String lblSimple = "//b[@class='ng-star-inserted']";

    public final String btnRegistrarOferta = "//*[contains(text(),'Registrar oferta')]";
    public final String btnError = "//div[@class='w-100 ng-star-inserted']";
    public final static String lblFooter = "//div[@class='container desktop-view']//img[@class='footer-large__logo-img']";
    public final String btnConsultarUbicacion = "//div[@class='input-field col-sm-12 m-t-1 mb-2']//button[@class='btn btn-success btn-block']";
    public final String btnContinuarHorarioEntrega = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-address[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[11]/button[1]";
    public final String cmbTipoEntrega = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/div[1]/div[1]/app-form-delivery-type[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]";
    public final String opRapido = "//*[contains(text(),'Express')]";
    public final String btnGuardarYcontinuar = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/div[1]/div[1]/app-form-delivery-type[1]/form[1]/div[2]/button[1]";
    public final String btnIdentidadTitular = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]";
    public final String cbmNombreMadre = "//*[contains(text(),'Nombre de la madre')]";
    public final String btnValidarDatosMadre = "//*[contains(text(),'Validar datos')]";
    public final String btn_contract = "//*[contains(text(),'Validar contrato Movistar Total')]";
    public final String btn_confirmarContrato = "//*[contains(text(),'Sí, acepta')]";
    public final String lblTurno = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-agendamiento[1]/div[1]/div[2]/div[2]/div[1]/span[1]/font[1]/font[1]";

    public final String lblTextoFinal = "//font[contains(text(),'El código Movistar Total del cliente es:')]";

    //Departamento y Provincia
    public final static String cmbDepartamento="/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-address[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]";
    public final static String txtLimaD="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[7]/span[1]";
    public final static String cmbProvincia="/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-address[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]";
    public final static String  txtLimaP="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]";

    // delivery 2
    public final static String cbohorario="/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/div[1]/div[1]/app-form-delivery-type[1]/form[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[local-name()='svg'][1]/*[name()='path'][2]";
    public final static String cboFecha="/html[1]/body[1]/div[1]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr[3]/td[5]/div[1]";
    public final static String cboTurno="/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/div[1]/div[1]/app-form-delivery-type[1]/form[1]/div[3]/div[1]/div[1]/div[1]";
    public final static String txtDireccion="/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-address[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]";

    //distrito
    public final static String cmbDistrito = "/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/app-form-delivery-address[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]";
    public final static String txtLima = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]";

    //registrar Oferta
    public final static String RegistrarOferta="/html[1]/body[1]/app-root[1]/div[1]/app-register-offer[1]/div[1]/div[1]/div[1]/app-form-delivery-contact[1]/div[1]/div[2]/form[1]/div[7]/div[1]/button[1]";

    //Locator nombre de la madre
    public final String opNombreMadre(String nombre) {
        return "//*[contains(text(),'" + nombre + "')]";
    }

    public boolean ubicacionDelivery(String sEscenarioID) throws IOException {
        boolean validacion = false;
        try {
            jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lblFooter, false);
            Thread.sleep(4000);
            doclickByJS("Click_consultar ubicacion", btnConsultarUbicacion, true);
            jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lblFooter, false);
            Thread.sleep(4000);
            doclickByJS("Click_continuar entrega", btnContinuarHorarioEntrega, true);
            validacion = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en calcularOferta_validarUbigueo", e);
        }
        return validacion;
    }

    public boolean ubicacionDelivery_migra(String i_direccion, String sEscenarioID) throws IOException {
        boolean validacion = false;
        try {
            doClick("Click_Departamento", cmbDepartamento, false);
            doClick("Click_Opcion_Lima", txtLimaD, false);
            doClick("Click_Provincia", cmbProvincia, false);
            doClick("Click_Opcion_Lima", txtLima, false);
            doClick("Click_Distrito", cmbDistrito, false);
            //doClick("Click_Opcion_Lima", txtLima, false);
            doAddTextField("Agregar_Direccion", txtDireccion, i_direccion, true);
            doclickByJS("Click_consultar ubicacion", btnConsultarUbicacion, true);
            doclickByJS("Click_continuar entrega", btnContinuarHorarioEntrega, true);
            validacion = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en ubicacionDelivery_migra", e);
        }
        return validacion;
    }

    public void ubicacionDelivery2(String sEscenarioID) throws IOException {
        try {
            Thread.sleep(3000);
            doClick("Click_Opcion_horario", cbohorario, false);
            doclickByJS("Click_agregar fecha", cboFecha, true);
            doclickByJS("Click_agrega turnor fecha", cboTurno, true);
            doclickByJS("Click_guardar ycontinuar", btnGuardarYcontinuar, true);
        }catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en calcularOferta_validarUbigueo", e);
        }
    }

    public void programarEntrega(String sEscenarioID) throws IOException {
        try {
            Thread.sleep(5000);
            doclickByJS("Click_Entrega", cmbTipoEntrega, true);
            Thread.sleep(5000);
            doclickByJS("Click opcion rapido", opRapido, true);
            Thread.sleep(5000);
            doclickByJS("Click en Guardar y Continuar", btnGuardarYcontinuar, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en programarEntrega", e);
        }
    }

    public void registroOferta(String email, String telfContactAdicional, String personaRecibiraInst, String telfRecibiraInst, String sEscenarioID) throws IOException {
        try {
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_Email", txtemail, email, false);
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_celular_adicional", txtContactoAdicional, telfContactAdicional, false);
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_Persona_recibira_inst", txtInstallPerson, personaRecibiraInst, false);
            doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_celular_quienRecibira_inst", txtInstallPhone, telfRecibiraInst, false);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en registroOfertao", e);
        }
    }

    public void registroOferta_migra(String madre, String email, String telfContactAdicional, String personaRecibiraInst, String telfRecibiraInst, String sEscenarioID) throws IOException {
        try {
            doAddTextField("Agregar_Email", txtemail, email, false);
            doAddTextField("Agregar_celular_adicional", txtContactoAdicional, telfContactAdicional, false);
            doAddTextField("Agregar_Persona_recibira_inst", txtInstallPerson, personaRecibiraInst, false);
            doAddTextField("Agregar_celular_quienRecibira_inst", txtInstallPhone, telfRecibiraInst, false);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en registroOfertao", e);
        }
    }

    public void validarIdentidadTitular(String madre, String sEscenarioID) {
        try {
            doclickByJS("Hacer cick en Validar identidad del titular", btnIdentidadTitular, true);
            Thread.sleep(5000);
            doclickByJS("Click_option_madres", cbmNombreMadre, true);
            Thread.sleep(5000);
            System.out.println("Elegir nombre nombre " + opNombreMadre(madre));
            doclickByJS("Click_nombre_Madre", opNombreMadre(madre), true);
            System.out.println("Nombre elegido correctamente");
            Thread.sleep(5000);
            doclickByJS("Hacer cick en Validar Datos", btnValidarDatosMadre, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en validarDatos_remoto", e);
        }
    }


    public void validarContrato(String sEscenarioID) {
        try {
            Thread.sleep(3000);
            doclickByJS("Hacer cick en Validar contrato", btn_contract, true);
            Thread.sleep(3000);
            doclickByJS("Aceptar contrato", btn_confirmarContrato, true);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en validarContrato", e);
        }
    }

    public void doContinuarRegistroMCSS_remoto(String i_Agendamiento, String sEscenarioID) throws Throwable {
        try {
            if (i_Agendamiento.equals("SI")){
                do {
                    Thread.sleep(5000);
                    doclickByJS("[Escenario " + sEscenarioID + "Hacer clic en Continuar", btnContinuar, true);
                    checkAlert_Accept();
                    Thread.sleep(5000);
                } while (validateObjExist(lblTurno) == false);
            } else {
               // do {
                    Thread.sleep(5000);
                    doclickByJS("[Escenario " + sEscenarioID + "Hacer clic en Continuar", btnContinuar, true);
                    checkAlert_Accept();
                    Thread.sleep(5000);
                //} while (validateObjExist(lblTextoFinal) == false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doContinuarRegistroMCSS", e);
        }
    }

    public boolean doContinuarRegistroMCSS_tienda(String sEscenarioID) throws Throwable {
        try {
            do {
                Thread.sleep(5000);
                doClick("[Escenario " + sEscenarioID + "Hacer clic en Continuar", btnRegistrarOferta, true);
                checkAlert_Accept();
                Thread.sleep(6000);
            } while (validateObjExist(lblRegistroMovil) == false);
            System.out.println("Luego del alert");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doContinuarRegistroMCSS", e);
        }
        return false;
    }

    public boolean doContinuarRegistroMCSS_retail(String sEscenarioID) throws Throwable {
        try {
            do {
                Thread.sleep(5000);
                doClick("[Escenario " + sEscenarioID + "Hacer clic en Continuar", btnRegistrarOferta, true);
                checkAlert_Accept();
                Thread.sleep(5000);
            } while (validateObjExist(btnValidarMCSS) == false);
            System.out.println("Luego del alert");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doContinuarRegistroMCSS", e);
        }
        return false;
    }
}



