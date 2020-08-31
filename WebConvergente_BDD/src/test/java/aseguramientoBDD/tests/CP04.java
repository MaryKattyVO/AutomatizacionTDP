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

public final class CP04 {
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

    @Given("^Selecciono el request del canal tienda para CP04$")
    public void selecciono_el_request_del_canal_tienda_CP04() throws Throwable {
    }

    @And("^Se consulta al API con el \"([^\"]*)\", con el body \"([^\"]*)\" y en el header donde estan las llaves \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" respectivo, con la url de la web convergente, canal tienda para CP04$")
    public void se_consulta_al_API_con_el_con_el_body_y_en_el_header_donde_estan_las_llaves_respectivo_con_la_url_de_la_web_convergente_tienda_CP04(String sUrl, String sBody, String Access_Token, String Authorization, String Content_Type) throws Throwable {
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

    @And("^Se devuelve un Token para el \"([^\"]*)\" y página de Webconvergente es cargada, canal tienda para CP04$")
    public void se_devuelve_un_Token_tienda_CP04(int Id) throws Throwable {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClient();
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
    }

    @And("^Inicio una consulta con el \"([^\"]*)\", canal tienda para CP04$")
    public void doy_clic_en_boton_Inicio_tienda_CP04(int Id) throws Throwable {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClient();
        sIndice = Parameters[Idxls][0].toString();
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

    @And("^Ingreso \"([^\"]*)\" del \"([^\"]*)\" y consulto, canal tienda para CP04$")
    public void ingreso_de_con_en_portal_y_doy_clic_en_Consultar_tienda_CP04(String sDNI, int Id) throws Throwable {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClient();
        sIndice = Parameters[Idxls][0].toString();
        sDNI = Parameters[Idxls][1].toString();
        try {
            Assert.assertTrue(p002_consultarctePage.dniConsultingPage(sIndice, sDNI, driver));
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Fallo en login de cliente", e);
        }
    }

    @When("^Incio el alta del Plan Movistar Total a un \"([^\"]*)\" nuevo, canal tienda para CP04$")
    public void realizo_una_compra_con_datos_del_en_portal_tienda_CP04(int Id) throws Exception {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClient();
        sIndice = Parameters[Id][0].toString();
        String i_nLineas = Parameters[Id][4].toString();
        String i_dCompleta = Parameters[Id][11].toString();
        String i_direccion = Parameters[Id][15].toString();
        String i_urb = Parameters[Id][16].toString();
        String i_interior = Parameters[Id][17].toString();
        String i_referencia = Parameters[Id][18].toString();
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

    @And("^Realizo una busqueda del plan para el \"([^\"]*)\", canal tienda para CP04$")
    public void realizo_una_busqueda_del_plan_en_el_con_tienda_CP04(int Id) throws Exception {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClient();
        String sNomPlan = Parameters[Idxls][14].toString();
        sIndice = Parameters[Idxls][0].toString();
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
                    sIndice = Integer.toString(Id);
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

    @And("^Selecciono el plan para el \"([^\"]*)\" e inicio el registro de la venta, canal tienda para CP04$")
    public void selecciono_plan_del_e_inicio_el_registro_tienda_CP04(int Id) throws Throwable {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClient();
        String i_email = Parameters[Idxls][8].toString();
        String i_telefonoContactoAdicional = Parameters[Idxls][9].toString();
        String i_personaRecibiraInstalacion = Parameters[Idxls][10].toString();
        String i_telefonoQuienRecibiraInstalacion = Parameters[Idxls][11].toString();
        String i_equipo = Parameters[Idxls][13].toString();
        String i_Sva = Parameters[Idxls][15].toString();
        sIndice = Parameters[Idxls][0].toString();
        try {
            p003_productplanPage.addSVA(sIndice);
            p006_agregarAdicionalPage.elegirSVA(i_Sva, sIndice);
            p003_productplanPage.addEquipoLinea1(sIndice);
            p006_agregarAdicionalPage.Elegir_Equipo_Elegir_Plan(i_equipo, sIndice);
            p003_productplanPage.doClickIniciarRegistro(stId);
            p004_salesaddofferPage.registroOferta(i_email, i_telefonoContactoAdicional, i_personaRecibiraInstalacion, i_telefonoQuienRecibiraInstalacion, sIndice);
            p004_salesaddofferPage.doContinuarRegistroMCSS_tienda(sIndice);
            p005_registrerOfferPage.doStartRegistro(i_telefonoContactoAdicional, i_telefonoQuienRecibiraInstalacion, sIndice);
            //AGENDAMIENTO
            //p007_instalacionSerivicioPage.programarInstalacion(sIndice);
            p008_registrarOfertaPage.registrarOferta(sIndice);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en busqueda de plan", e);
        }
    }

    @Then("^Obtengo un código MT para el \"([^\"]*)\", canal tienda para CP04$")
    public void Obtengo_un_codigo_MT_para_el_tienda_CP04(int Id) throws Exception {
        int Idxls = Id - 1;
        Object[][] Parameters = GetClient();
        sIndice = Parameters[Idxls][0].toString();
        String o_MT;
        try {
            o_MT = p009_orderStatusPage.getMT();
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
    }

    public Object[][] GetBDconecctions() throws Exception {
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
    }

}

