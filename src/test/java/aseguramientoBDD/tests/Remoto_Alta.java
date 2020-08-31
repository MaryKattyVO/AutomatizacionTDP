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

package aseguramientoBDD.tests;


import aseguramientoBDD.pageObject.WebConvergente.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;
import aseguramientoBDD.helpers.Hook;
import aseguramientoBDD.utility.ExcelUtils;
import aseguramientoBDD.utility.JsonUtility;

import static org.testng.Assert.assertTrue;

public final class Remoto_Alta {
    public WebDriver driver;

    public String token_sub1 = "";
    public String stId;
    public String sIndice;
    public String urlwebConvergente;
    public String sBrowserEnd;
    private Hook hook = new Hook();
    BasePage basepage = new BasePage();

    P001_HomeMovistarPage p001_homemovistarPage = new P001_HomeMovistarPage();
    P002_ConsultarCtePage p002_consultarctePage = new P002_ConsultarCtePage();
    P003_ProductPlanPage p003_productplanPage = new P003_ProductPlanPage();
    P004_SalesAddOfferPage p004_salesaddofferPage = new P004_SalesAddOfferPage();
    P005_RegistrerOfferPage p005_registrerOfferPage = new P005_RegistrerOfferPage();
    P006_AgregarAdicionalPage p006_agregarAdicionalPage = new P006_AgregarAdicionalPage();
    P007_InstalacionSerivicioPage p007_instalacionSerivicioPage = new P007_InstalacionSerivicioPage();
    P008_RegistrarOfertaPage p008_registrarOfertaPage = new P008_RegistrarOfertaPage();
    P009_OrderStatusPage p009_orderStatusPage = new P009_OrderStatusPage();
    P010_BackOfficePage p010_backOfficePage = new P010_BackOfficePage();
    P011_DetalleMTPage p011_detalleMTPage = new P011_DetalleMTPage();

    public Object[][] LoadURL() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "LoginWC");
        return (testObjArray);
    }

    public Object[][] GetClientWC() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "ClientsWC");
        return (testObjArray);
    }

    @And("^Para el canal Remoto, selecciono el plan para el \"([^\"]*)\" e inicio el registro de la venta$")
    public void remoto_selecciono_plan_del_e_inicio_el_registro(int Id) throws Throwable {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String i_sva = Parameters_4[Id][5].toString();
        String i_equipoL1 = Parameters_4[Id][6].toString();
        String i_equipoL2 = Parameters_4[Id][7].toString();
        String i_tipoSVA = Parameters_4[Id][8].toString();
        String i_Agendamiento = Parameters_4[Id][10].toString();

        String i_email = Parameters_4[Id][19].toString();
        String i_telefonoContactoAdicional = Parameters_4[Id][20].toString();
        String i_personaRecibiraInstalacion = Parameters_4[Id][21].toString();
        String i_telefonoQuienRecibiraInstalacion = Parameters_4[Id][22].toString();

        String i_equipo = Parameters_4[Id][23].toString();
        String i_madre = Parameters_4[Id][9].toString();

        try {
            if (i_sva.equals("SI")){
                System.out.println("Agregar SVA's");
                p003_productplanPage.addSVA(sIndice);
                p006_agregarAdicionalPage.elegirSVA(i_tipoSVA, sIndice);
            }
            if (i_equipoL1.equals("SI")){
                System.out.println("Agregar Equipo");
                p003_productplanPage.addEquipoLinea1(sIndice);
                p006_agregarAdicionalPage.Elegir_Equipo_Elegir_Plan(i_equipo, sIndice);
            }
            p003_productplanPage.doClickIniciarRegistro(sIndice);
            p004_salesaddofferPage.ubicacionDelivery(sIndice);
            p004_salesaddofferPage.programarEntrega(sIndice);
            p004_salesaddofferPage.registroOferta(i_email, i_telefonoContactoAdicional, i_personaRecibiraInstalacion, i_telefonoQuienRecibiraInstalacion, sIndice);
            p004_salesaddofferPage.validarIdentidadTitular(i_madre, sIndice);
            p004_salesaddofferPage.validarContrato(sIndice);
            p004_salesaddofferPage.doContinuarRegistroMCSS_remoto(i_Agendamiento, sIndice);
            if (i_Agendamiento.equals("SI")){
                p007_instalacionSerivicioPage.programarInstalacion(sIndice);
                p008_registrarOfertaPage.registrarOferta(sIndice);
            }
            System.out.println("Antes de obtener MT");
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en busqueda de plan", e);
        }
    }

/*    @Then("^Obtengo un código MT para el \"([^\"]*)\", canal remoto para Remoto_Alta$")
    public void Obtengo_un_codigo_MT_para_el_remoto_CP02(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String o_MT;
        try {
            o_MT = p009_orderStatusPage.getMT();
            //Insertar MT a excel
            ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "AltaMovTot", "o_mt", sIndice, o_MT);
            p009_orderStatusPage.doClickSalir(sIndice);
            hook.closeBrowser(basepage.handleDriver());
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en obtenet codigo MT", e);
        }
    }*/

    /******************Flujo Backffice*******************/

    /*@Given("^Selecciono y conculto el API con el \"([^\"]*)\", con el body \"([^\"]*)\" y en el header donde estan las llaves \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" respectivo, con la url de la web convergente backup, canal remoto para Remoto_Alta$")
    public void selecciono_y_consulto_el_API_con_el_con_el_y_en_el_header_donde_estan_las_llaves_respectivo_con_la_utl_de_la_web_convergente_backup_remoto_CP02(String sUrl, String sBody, String Access_Token, String Authorization, String Content_Type) throws Exception {
        Object[][] Parameters = LoadURL();
        sIndice = Parameters[2][0].toString();
        String url_Token = Parameters[2][3].toString();
        String request_Method = Parameters[2][4].toString();
        String access_token = Parameters[2][5].toString();
        String authorization_token = Parameters[2][6].toString();
        String content_Type = Parameters[2][7].toString();
        String body_token = Parameters[2][8].toString();
        urlwebConvergente = Parameters[2][2].toString();
        sBrowserEnd = Parameters[2][10].toString();
        try {
            JsonUtility jsonPOSTToken = new JsonUtility();
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe"); // For Chrome
            String token1 = jsonPOSTToken.executePost(url_Token, request_Method, access_token, authorization_token, content_Type, body_token);
            token_sub1 = token1.substring(45);
        } catch (AssertionError e) {
            if (ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "LoginWebCvgte", "o_Status", sIndice, "F")) {
                System.out.println("Failure in Login WebConvergente" + " - " + sIndice);
                e.getMessage();
                e.getStackTrace();
                e.printStackTrace();
                hook.closeBrowser(basepage.handleDriver());
                Assert.fail("Fallo validacion de cuenta de usuario", e);
            }
        }
    }

    @And("^Se devuelve un Token para el \"([^\"]*)\" y página de Webconvergente backup es cargada, canal remoto para Remoto_Alta$")
    public void se_devuelve_un_token_para_el_y_pagina_de_webconvergente_backup_es_cargada_remoto_CP02(int Id) throws Exception {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClientWC();
        sIndice = Parameters[Idxls][0].toString();
        try {
            assertTrue(token_sub1.length() > 0);
            String sURLEnd = urlwebConvergente + token_sub1.substring(0, token_sub1.length() - 4);
            driver = hook.browser(sBrowserEnd, sURLEnd);
            if (ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "LoginWebCvgte", "o_Status", sIndice, "Y")) {
                System.out.println("Successful Mi Movistar Login");
            }
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Fallo la devolucion del token", e);
        }
    }*/
    @Then("Página Webconvergente es cargada")
    public void páginaWebconvergenteEsCargada() {
    }

    @When("^Remoto-Cargo un archivo de audio del \"([^\"]*)\"$")
    public void busco_el_codigo_MT_cargo_audio_remoto_CP02(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String o_MT = Parameters_4[Id][24].toString();
        String o_Order1 = Parameters_4[Id][21].toString();
        String o_Order2 = Parameters_4[Id][22].toString();
        try {
            /*System.out.println("MT  a buscar: " + o_MT);
            p010_backOfficePage.buscarMT(o_MT, sIndice);
            System.out.println("Buscando MT: " + o_MT);
            p010_backOfficePage.ValidarMT(sIndice);*/
            p010_backOfficePage.cambiarNombreArchivo(o_MT);
            p011_detalleMTPage.cargarAudio();
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en obtenet codigo MT", e);
        }
    }

    @Then("^Obtengo el estado Aprobado de la orden \"([^\"]*)\", canal remoto para CP02$")
    public void obtenbgo_el_estado_aprobado_de_la_orden_remoto_CP02(int Id) throws Exception {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClientWC();
        sIndice = Parameters[Idxls][0].toString();
        String o_StatusMT;
        try {
            o_StatusMT = p011_detalleMTPage.getStateMT();
            ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "AltaMovTot", "o_StatusMT", sIndice, o_StatusMT);
            //p011_detalleMTPage.doClickSalir();
            hook.closeBrowser(basepage.handleDriver());
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en obtenet codigo MT", e);
        }
    }



/*    public Object[][] GetBDconecctions() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "Conexiones");
        return (testObjArray);
    }

    public Object[][] LoadURL() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "LoginWC");
        return (testObjArray);
    }

    public Object[][] GetClient() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "Clients");
        return (testObjArray);
    }*/

}

