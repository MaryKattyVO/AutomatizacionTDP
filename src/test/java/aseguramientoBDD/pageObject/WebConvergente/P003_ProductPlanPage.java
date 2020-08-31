/**************************************************
 # WIPRO COMPANY PROPIEDAD INTELECTUAL www.wipro.com
 #Autor : Juan Pablo Rosas
 #Description : WebConvergente - Movistar Alta Total
 #Fecha de creación: Feb 2019
 # Venta Fija Version: XXXX
 #Input Parameters: --
 #Nombre que modifica : --
 #Fecha modificación: --
 **************************************************/

package aseguramientoBDD.pageObject.WebConvergente;

import static org.testng.Assert.assertTrue;

import aseguramientoBDD.pageObject.WebConvergente.P001_HomeMovistarPage;
import cucumber.runtime.junit.ScenarioOutlineRunner;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

import java.io.IOException;

public class P003_ProductPlanPage extends BasePage {

    public BasePage basePage = new BasePage();

    public final static String lbl_CustomerClient = "/html[1]/body[1]/app-root[1]/div[1]/app-contracted-plan[1]/div[1]/div[1]/label[1]/b[1]";
    public final static String gif_ChangePlan = "/html[1]/body[1]/app-root[1]/div[1]/app-contracted-plan[1]/app-header[1]/app-loader[1]/div[1]/div[2]";
    public final static String btnAddNewLine = "//div//div//div//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]";
    public final static String lblFooter = "//body//app-footer//div[1]//div[1]//img[1]";
    public final static String lblXYUbicacion = "/html/body/app-root/div/app-planes-products/div[1]/div[2]/div/div[2]/div[3]/div/app-address/div[3]/div[1]/app-gmap-markers/div/div/div/div[1]/div[3]/div/div[4]/div/div/div/div/div/div/div[2]";

    public final static String txtDireccion = "//body/app-root/div/app-planes-products/div/div/div/div/div/div/app-address/div/div/div/div/div/form/fieldset/div/div/div/div/input[1]";
    public final static String txtUrbanizacion = "//body/app-root/div/app-planes-products/div/div/div/div/div/div/app-address/div/div/div/div/div/form/fieldset/div/div/input[1]";
    public final static String txtInterior = "//body/app-root/div/app-planes-products/div/div/div/div/div/div/app-address/div/div/div/div/div/form/fieldset/div[6]/div[1]/div[1]/input[1]";
    public final static String txtReferencia = "//body/app-root/div/app-planes-products/div/div/div/div/div/div/app-address/div/div/div/div/div/form/fieldset/div[8]/div[1]/div[1]/input[1]";
    public final static String cmbDistrito = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/app-address[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]";
    public final static String cmbDistritoR = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/app-address[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]";
    public final static String txtLima = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]";
    public final static String txtLimaR = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[1]";
    public final static String btnConsultarUbicacion = "//*[contains(text(),'Consultar ubicación')]";
    public final static String btnContinuar = "//*[contains(text(),'Continuar')]";

    public final static String btnAnadirNuevaLineaMovil1 = "//body/app-root/div/app-planes-products/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]";
    public final static String btnAnadirNuevaLineaMovil2 = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]";
    public final static String btnCargarOferta = "//*[contains(text(),'Mostrar ofertas')]";
    public final static String btnIniciarRegistro = "/html[1]/body[1]/app-root[1]/div[1]/app-summary-offer[1]/div[1]/app-summary-offer-bar-detail[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]";

    public final static String btnIniciarRegistroR = "//*[contains(text(),'Iniciar registro')]";
    public final static String btnOtrasOfertas = "//*[contains(text(),'Ver otras ofertas')]";

    public final static String btnAnadirEquipo = "//body//div//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[2]//app-summary-offer-line-movil[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//button[1]";
    public final static String btnSVA = "/html/body/app-root/div/app-summary-offer/div[1]/div/div/div[2]/div/div/div/div[1]/app-summary-offer-line-fixed/div[1]/div/div/div/div[5]/button";
    public final static String lblSVA = "//*[contains(text(),'adicionales(SVAs)')]";
    public final static String btnMigrarFijo = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/app-card-plan-fixed[1]/div[2]/div[1]/div[2]";

    //nueva Migracion para el canal Remoto
    public final static String btnMigrarfijo1 = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/app-card-plan-fixed[1]/div[2]";
    public final static String btnOmitirCard = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/app-card-plan-movil[1]/div[1]/div[1]/div[3]/i[1]";

    public final static String btnCapl1 = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/app-card-plan-movil[1]/div[2]";
    public final static String btnCapL2 = "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/app-card-plan-movil[1]/div[2]";





    public final String lbl_namePlan(int stId) {
        return "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/app-offer[1]/div[1]/div[4]/div[" + stId + "]/app-item-offer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]";
        //return "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/app-offer[1]/div[1]/div[5]/div[" + stId + "]/app-item-offer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]";
    }

    public final String btnSeleccionar(int stId) {
        return "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/app-offer[1]/div[1]/div[4]/div[" + stId + "]/app-item-offer[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/app-item-offer-price[1]/div[1]/div[2]/div[1]/div[1]/button[1]";
        //return "/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/app-offer[1]/div[1]/div[5]/div[" + stId + "]/app-item-offer[1]/div[2]/div[1]/div[1]/div[3]/app-item-offer-price[1]/div[1]/div[2]/div[1]/div[1]/button[1]";
    }

    //Gestion de Planta
    public final static String btnCambiarPlan = "//*[contains(text(),'Cambiar Plan')]";
    public final static String btnCambiarEquipo = "//*[contains(text(),'Cambiar equipo')]";

    public final static String btnCambiarPlanRetail= "//button[@class='btn btn-default btn-success btn-block text-white formTextBtn']";
    public final static String btnMostrarOfertasRetail="/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]";
    public final static String btnMantenerPlanRetail="/html[1]/body[1]/app-root[1]/div[1]/app-planes-products[1]/div[1]/div[2]/app-offer[1]/div[1]/div[1]/div[1]/div[2]/app-item-offer[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/app-item-offer-price[1]/div[1]/div[2]/div[1]/div[1]/button[1]";
    public boolean loadProductPlan(String UIName) throws Exception {
        boolean validacion = false;
        try {
            verifyNoExist(P001_HomeMovistarPage.bnr_Main);
            ValidateObject(UIName, lbl_CustomerClient, "DISPLAYED");
            ValidateObject(UIName, lbl_CustomerClient, "VISIBLE");
            ValidateObject(UIName, P001_HomeMovistarPage.lnk_Inicio, "CLICKED");
            ValidateObject(UIName, P001_HomeMovistarPage.lnk_Inicio, "VISIBLE");
            ValidateObject(UIName, P001_HomeMovistarPage.lnk_Inicio, "DISPLAYED");
            verifyNoExist(gif_ChangePlan);
            validacion = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en loadProductPla", e);
        }
        return validacion;
    }

    public boolean verifyDisplayCustomerClient(String CustomerClient, String UIName) throws Exception {
        boolean validacion = false;
        try {
            assertTrue(loadProductPlan(UIName));
            return verifyContainText(CustomerClient, lbl_CustomerClient);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en verifyDisplayCustomerClient", e);
        }
        return validacion;
    }

    public boolean calcularOferta_validarUbigueo_migra(String sEscenarioID) throws IOException {
        boolean validacion = false;
        try {
            doclickByJS("Click_Agregar Migracion", btnMigrarFijo, true);
            validacion = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en calcularOferta_validarUbigueo", e);
        }
        return validacion;
    }

    public boolean calcularOferta_validarUbigueo(String i_dCompleta, String i_direccion, String i_urb, String i_interior, String i_referencia, String sEscenarioID) throws IOException {
        boolean validacion = false;
        try {
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_AgregarLineaNueva", btnAddNewLine, true);
            BasePage.jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lblFooter, false);
            System.out.println(i_direccion);
            Thread.sleep(3000);
            if (i_dCompleta.equals("SI")) {
                System.out.println("Dirección completa: SI");
                doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_Direccion", txtDireccion, i_direccion, false);
                Thread.sleep(3000);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Distrito", cmbDistritoR, false);
                Thread.sleep(3000);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Opcion_Lima", txtLima, false);
                Thread.sleep(3000);
                doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_Urbanizacion", txtUrbanizacion, i_urb, false);
                Thread.sleep(3000);
                doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_Interior", txtInterior, i_interior, false);
                Thread.sleep(3000);
                doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_Referencia", txtReferencia, i_referencia, false);
                Thread.sleep(3000);
            } else if (i_dCompleta.equals("NO")) {
                System.out.println("Dirección completa: NO");
                doAddTextField("[Escenario " + sEscenarioID + "] " + "Agregar_Direccion", txtDireccion, i_direccion, false);
                Thread.sleep(3000);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Distrito", cmbDistritoR, false);
                Thread.sleep(3000);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Opcion_Lima", txtLima, false);
                Thread.sleep(3000);
            }
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_Consultar_ubicacion", btnConsultarUbicacion, true);
            waitInvisibility("[Escenario " + sEscenarioID + "] " + "Esperar boton", btnContinuar, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_Continuar", btnContinuar, true);
            validacion = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en calcularOferta_validarUbigueo", e);
        }
        return validacion;
    }

    public boolean chooseLineaMigrar(String sEscenarioID) {
        boolean validacion = false;
        try {
            doclickByJS("Click_Agregar Migracion", btnMigrarfijo1, true);
            validacion = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en chooseLineaMigrar", e);
        }
        return validacion;
    }

    public void calcularOferta_agregarLineas(String i_nLineas, String sEscenarioID) throws IOException {
        int nLineas = Integer.parseInt(i_nLineas);
        try {
            if (nLineas == 1) {
                waitInvisibility("[Escenario " + sEscenarioID + "] " + "Esperar a boton", btnAnadirNuevaLineaMovil1, false);
                jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lblFooter, true);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Agregar_Movil1", btnAnadirNuevaLineaMovil1, true);
            } else {
                waitInvisibility("[Escenario " + sEscenarioID + "] " + "Esperar a boton", btnAnadirNuevaLineaMovil1, false);
                jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lblFooter, true);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Agregar_Movil1", btnAnadirNuevaLineaMovil1, true);
                jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lblFooter, true);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "ClicK_Agregar_Movil2", btnAnadirNuevaLineaMovil2, true);
            }
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_CargarOferta", btnCargarOferta, true);
            jsScrollIntoView("Bajar hasta expander footer", btnOtrasOfertas, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_VerOtrasOfertas", btnOtrasOfertas, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en calcularOferta_agregarLineas", e);
        }
    }

    public void calcularOferta_agregarLineas_migra(String i_nLineas, String sEscenarioID) {
        int nLineas = Integer.parseInt(i_nLineas);
        try {
            if (nLineas == 1) {
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click Línea 1", btnCapl1, true);
                waitInvisibility("[Escenario " + sEscenarioID + "] " + "esperar hasta que aparezca", btnCapl1, true);
                Thread.sleep(4000);
            } else {
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click Línea 1", btnCapl1, true);
                waitInvisibility("[Escenario " + sEscenarioID + "] " + "esperar hasta que aparezca", btnCapl1, true);
                Thread.sleep(4000);
                jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lblFooter, true);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "ClicK_Agregar_Movil2", btnAnadirNuevaLineaMovil2, true);
            }
            Thread.sleep(5000);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_CargarOferta", btnCargarOferta, true);
            jsScrollIntoView("Bajar hasta expander footer", btnOtrasOfertas, false);
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_VerOtrasOfertas", btnOtrasOfertas, true);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en calcularOferta_agregarLineas_migra", e);
        }
    }

    //*************************************************************************************************

    public boolean validateObjectVisible(String sText, String sValidacion, int j, String sEscenarioID) throws Exception {
        jsScrollIntoView("[Escenario " + sEscenarioID + "] " + "Scroll", lbl_namePlan(j), false);
        return ValidateObject(sText, lbl_namePlan(j), sValidacion);
    }

    public boolean verifyListaProductCart(String sNomPlan, int j, String indice) throws Exception {
        jsScrollIntoView("[Escenario " + indice + "] " + "Scroll", lbl_namePlan(j), false);
        return verifyText(sNomPlan.trim(), lbl_namePlan(j), indice, false);
    }

    public boolean doClickSeleccionar(int j, String sEscenarioID) throws IOException {
        try {
            doClick("[Escenario " + sEscenarioID + "] " + "Click en boton Seleccionar", btnSeleccionar(j), true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doClickSeleccionar", e);
            return false;
        }
    }

    public boolean addEquipoLinea1(String sEscenarioID) {
        try {
            doClick("[Escenario " + sEscenarioID + "] " + "Clic en boton Añadir Equipo", btnAnadirEquipo, true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doClickSeleccionar", e);
            return false;
        }
    }

    public boolean addSVA(String sEscenarioID) throws Throwable {
        try {
            do {
                doClick("[Escenario " + sEscenarioID + "] " + "Clic en boton Añadir Equipo", btnSVA, true);
                Thread.sleep(5000);
            } while (validateObjExist(lblSVA) == false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doClickSeleccionar", e);
        }
        return false;
    }

    public boolean doClickIniciarRegistro(String sEscenarioID) {
        try {
            doClick("[Escenario " + sEscenarioID + "] " + "Click en Iniciar Registro", btnIniciarRegistro, true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doClickIniciarRegistr", e);
            return false;
        }
    }



    public void IniciarRegistro( String sEscenarioID) {
        try {
            doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_IniciarRegistro", btnIniciarRegistro, true);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR en doClickIniciarRegistr", e);
        }


    }

    //*********************************************************************************************************************

                                                  /*    GESTION DE PLANTA    */

    public void elegirFlujo(String i_Flujo, String sEscenarioID){
        try {
            if (i_Flujo.equals("GP - Migra")){
                Thread.sleep(4000);
                doclickByJS("Click en Camniar Plan", btnCambiarPlan, true);
                jsScrollIntoView("Bajar hasta expander footer", btnOtrasOfertas, false);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_VerOtrasOfertas", btnOtrasOfertas, true);
            }
            if (i_Flujo.equals("GP - CAEQ")){
                Thread.sleep(4000);
                doclickByJS("Click en Cambiar equipo", btnCambiarEquipo, true);
            }
            if(i_Flujo.equals("GP - Mantener")){
                Thread.sleep(14000);
               // waitInvisibility("invisible","//app-contracted-plan[@class='ng-star-inserted']",true);
                jsScrollIntoView("Bajar hasta expander footer", btnCambiarPlanRetail, false);
                Thread.sleep(14000);
                doclickByJS("Click en Cambiar Plan", btnCambiarPlanRetail, true);
                Thread.sleep(7000);
                jsScrollIntoView("Bajar hasta expander footer", btnMostrarOfertasRetail, false);
                Thread.sleep(7000);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_VerOtrasOfertas", btnMostrarOfertasRetail, true);
                doclickByJS("[Escenario " + sEscenarioID + "] " + "Click_Boton_VerOtrasOfertas", btnMantenerPlanRetail, true);


            }

        }catch (Exception e){
            e.printStackTrace();
            Assert.fail("ERROR en doClickIniciarRegistr", e);
        }
    }






}
