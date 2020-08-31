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
import cucumber.api.java.en.Then;
import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;
import aseguramientoBDD.helpers.Hook;

import aseguramientoBDD.utility.ExcelUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import aseguramientoBDD.utility.JsonUtility;

import static org.testng.Assert.assertTrue;

public final class Tienda_Alta {
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

    @Given("Se consulta al servicio de Token del \"([^\"]*)\" respectivo$")
    public void consulto_genero_token(int idve) throws Throwable {
        Object[][] Parameters = LoadURL();
        sIndice = Parameters[idve][0].toString();
        String url_Token = Parameters[idve][3].toString();
        String request_Method = Parameters[idve][4].toString();
        String access_token = Parameters[idve][5].toString();
        String authorization_token = Parameters[idve][6].toString();
        String content_Type = Parameters[idve][7].toString();
        String body_token = Parameters[idve][8].toString();
        urlwebConvergente = Parameters[idve][2].toString();
        sBrowserEnd = Parameters[idve][10].toString();
        try {
            JsonUtility jsonPOSTToken = new JsonUtility();
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe"); // For Chrome
            String token1 = jsonPOSTToken.executePost(url_Token, request_Method, access_token, authorization_token, content_Type, body_token);
            token_sub1 = token1.substring(45);
        } catch (AssertionError e) {
            if (ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "LoginWC", "o_Status", sIndice, "F")) {
                System.out.println("Failure in Login WebConvergente" + " - " + sIndice);
                e.getMessage();
                e.getStackTrace();
                e.printStackTrace();
                hook.closeBrowser(basepage.handleDriver());
                Assert.fail("Fallo validacion de cuenta de usuario", e);
            }
        }
    }

    @When("^Se genera el link correspondiente a la sesion del \"([^\"]*)\"$")
    public void genero_link_pagina_cargada(int idve) throws Throwable {
        Object[][] Parameters = LoadURL();
        sIndice = Parameters[idve][0].toString();
        try {
            assertTrue(token_sub1.length() > 0);
            String sURLEnd = urlwebConvergente + token_sub1.substring(0, token_sub1.length() - 4);
            driver = hook.browser(sBrowserEnd, sURLEnd);
            if (ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "LoginWC", "o_Status", sIndice, "Y")) {
                System.out.println("Successful Mi Movistar Login");
            }
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Fallo la devolucion del token", e);
        }
    }

    @Then("^Ingreso a la ventana de login de Web Convergente$")
    public void ingreso_ventana_login() throws Throwable {
        try {
            BasePage.stepTestName = "Carga Inicial Cliente";
            p001_homemovistarPage.doLoadInicioLink(BasePage.stepTestName);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Fallo en dar click a inicio", e);
        }
    }

    @Given("^En la Web Convergente, ingreso con el DNI del \"([^\"]*)\"$")
    public void ingreso_del_consulto(int Id) throws Throwable {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String sDNI = Parameters_4[Id][3].toString();
        try {
            System.out.println("Indice: " + sIndice);
            System.out.println("DNI: " + sDNI);
            Assert.assertTrue(p002_consultarctePage.dniConsultingPage(sIndice, sDNI, driver));
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Fallo en login de cliente", e);
        }
    }

    @When("^Inicio el proceso de alta MT del \"([^\"]*)\", se valida cobertura, se agrega una nueva linea MT y un Movil$")
    public void inicio_alta(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String i_nLineas = Parameters_4[Id][4].toString();
        String i_dCompleta = Parameters_4[Id][11].toString();
        String i_direccion = Parameters_4[Id][15].toString();
        String i_urb = Parameters_4[Id][16].toString();
        String i_interior = Parameters_4[Id][17].toString();
        String i_referencia = Parameters_4[Id][18].toString();
        try {
            System.out.println(i_direccion);
            p003_productplanPage.calcularOferta_validarUbigueo(i_dCompleta, i_direccion, i_urb, i_interior, i_referencia, sIndice);
            p003_productplanPage.calcularOferta_agregarLineas(i_nLineas, sIndice);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en ingreso de datos de ubicación", e);
        }
    }

    @And("^Realizo una busqueda del plan para el \"([^\"]*)\"$")
    public void realizo_una_busqueda_del_plan(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String sNomPlan = Parameters_4[Id][24].toString();
        try {
            boolean find = false;
            int j = 1;
            do {
                if (p003_productplanPage.validateObjectVisible("[Escenario " + sIndice + "] " + "Plan_encontrado", "visible", j, sIndice)) {
                    if (p003_productplanPage.verifyListaProductCart(sNomPlan, j, sIndice)) {
                        find = true;
                    }
                } else {
                    find = true;
                }
                if ((j > Id) && (find == false)) {
                    find = true;
                    stId = Integer.toString(Id);
                }
                j++;
            } while (find == false);
            p003_productplanPage.doClickSeleccionar(j, sIndice);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en busqueda de plan", e);
        }
    }

    @And("^Para el canal Tienda, selecciono el plan para el \"([^\"]*)\" e inicio el registro de la venta$")
    public void tienda_selecciono_plan_del_e_inicio_el_registro(int Id) throws Throwable {
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
        try {
            System.out.println("Elegir agregar adicionales");
            if (i_sva.equals("SI")) {
                System.out.println("Agregar SVA´s");
                p003_productplanPage.addSVA(sIndice);
                p006_agregarAdicionalPage.elegirSVA(i_tipoSVA, sIndice);
            }
            if (i_equipoL1.equals("SI")) {
                p003_productplanPage.addEquipoLinea1(sIndice);
                p006_agregarAdicionalPage.Elegir_Equipo_Elegir_Plan(i_equipo, sIndice);
            }
            p003_productplanPage.doClickIniciarRegistro(sIndice);
            p004_salesaddofferPage.registroOferta(i_email, i_telefonoContactoAdicional, i_personaRecibiraInstalacion, i_telefonoQuienRecibiraInstalacion, sIndice);
            p004_salesaddofferPage.doContinuarRegistroMCSS_tienda(sIndice);
            p005_registrerOfferPage.doStartRegistro(i_telefonoContactoAdicional, i_telefonoQuienRecibiraInstalacion, sIndice);
            if (i_Agendamiento.equals("SI")) {
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

    @Then("^Obtengo un código MT para el \"([^\"]*)\"$")
    public void Obtengo_un_codigo_MT(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String o_MT;
        try {
            o_MT = p009_orderStatusPage.getMT();
            System.out.println("Codigo MT: " + o_MT);
            ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "ClientsWC", "o_mt", sIndice, o_MT);
            p009_orderStatusPage.doClickSalir(sIndice);
            hook.closeBrowser(basepage.handleDriver());
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en obtenet codigo MT", e);
        }
    }

    /******************Flujo BackEnd*******************/

  /*  @Given("^Selecciono y conculto el API con el \"([^\"]*)\", con el body \"([^\"]*)\" y en el header donde estan las llaves \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" respectivo, con la url de la web convergente backup, canal tienda para$")
    public void selecciono_y_consulto_el_API_con_el_con_el_y_en_el_header_donde_estan_las_llaves_respectivo_con_la_utl_de_la_web_convergente_backup_tienda_CP01(String sUrl, String sBody, String Access_Token, String Authorization, String Content_Type) throws Exception {
        Object[][] Parameters = LoadURL();
        sIndice = Parameters[0][0].toString();
        String url_Token = Parameters[0][3].toString();
        String request_Method = Parameters[0][4].toString();
        String access_token = Parameters[0][5].toString();
        String authorization_token = Parameters[0][6].toString();
        String content_Type = Parameters[0][7].toString();
        String body_token = Parameters[0][8].toString();
        urlwebConvergente = Parameters[0][2].toString();
        sBrowserEnd = Parameters[0][10].toString();
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

    @And("^Se devuelve un Token para el \"([^\"]*)\" y página de Webconvergente backup es cargada, canal tienda para Tienda_Alta$")
    public void se_devuelve_un_token_para_el_y_pagina_de_webconvergente_backup_es_cargada_tienda_CP01(int Id) throws Exception {
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
    @Given("Busco el codigo MT del \"([^\"]*)\"$")
    public void busco_el_codigo_MT(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String o_MT = Parameters_4[Id][28].toString();
        try {
            System.out.println("MT  a buscar: " + o_MT);
            p010_backOfficePage.buscarMT(o_MT, sIndice);
            System.out.println("Buscando MT: " + o_MT);
            p010_backOfficePage.ValidarMT(sIndice);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en obtenet codigo MT", e);
        }
    }

    @When("Tienda-Registro las ordenes en Simple del \"([^\"]*)\"$")
    public void tienda_registro_ordenes_simpleT(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String o_Order1 = Parameters_4[Id][25].toString();
        String o_Order2 = Parameters_4[Id][26].toString();
        try {
            p011_detalleMTPage.ValidarMT(sIndice);
            p011_detalleMTPage.registrarSimple(o_Order1, o_Order2, sIndice);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en obtenet codigo MT", e);
        }
    }

    @Then("^Obtengo el estado Aprobado de la orden \"([^\"]*)\"$")
    public void obtenbgo_el_estado_aprobado_de_la_orden(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String o_StatusMT;
        try {
            o_StatusMT = p011_detalleMTPage.getStateMT();
            System.out.println("Codigo MT: " + o_StatusMT);
            ExcelUtils.setCellData("./src/test/resources/data/TestData.xlsx", "ClientsWC", "o_StatusMT", sIndice, o_StatusMT);
            p011_detalleMTPage.doClickSalir(sIndice);
            hook.closeBrowser(basepage.handleDriver());
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en obtenet codigo MT", e);
        }
    }


}

