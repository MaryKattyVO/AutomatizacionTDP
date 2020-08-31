package aseguramientoBDD.tests;

import aseguramientoBDD.pageObject.PuertoBiomatch.PB001_LocalHost;
import aseguramientoBDD.pageObject.VentasFija.*;
import aseguramientoBDD.pageObject.WebAdmin.*;
import aseguramientoBDD.utility.ScreenshotUtility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;
import aseguramientoBDD.helpers.Hook;
import aseguramientoBDD.utility.ExcelUtils;

public class CP07 {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basepage = new BasePage();
    private String stId;
    private String tokenlogin;
    private String tokendiscapacitado;
    WA001_LoginPage WA001LoginPage = new WA001_LoginPage();
    WA002_HomePage WA002HomePage = new WA002_HomePage();
    WA003_TokenModulePage WA003TokenModulePage = new WA003_TokenModulePage();
    WA004_UserListPage WA004UserListPage = new WA004_UserListPage();
    WA005_CodeDetailPage WA005DetalleCodPage = new WA005_CodeDetailPage();
    PB001_LocalHost PB001LocalHost = new PB001_LocalHost();
    VF001_PreLoginPage VF001PreLoginPage = new VF001_PreLoginPage();
    VF002_NoBiometricLoginPage VF002NoBiometricLoginPage = new VF002_NoBiometricLoginPage();
    VF003_HomePage VF003HomePage = new VF003_HomePage();
    VF004_CustomerDataPage VF004CustomerDataPage = new VF004_CustomerDataPage();
    VF005_InstallationSitePage VF005InstallationSitePage = new VF005_InstallationSitePage();
    VF006_ProductSelectionPage VF006ProductSelectionPage = new VF006_ProductSelectionPage();
    VF007_SVASelectionPage VF007SVASelectionPage = new VF007_SVASelectionPage();
    VF008_SaleTermsPage VF008SaleTermsPage = new VF008_SaleTermsPage();
    VF009_SalesSummaryPage VF009SalesSummaryPage = new VF009_SalesSummaryPage();
    VF010_ContractPage VF010ContractPage = new VF010_ContractPage();
    VF011_IdentityCheckPage VF011IdentityCheckPage = new VF011_IdentityCheckPage();
    VF012_InstallationContactPage VF012InstallationContactPage = new VF012_InstallationContactPage();
    VF013_ClosingSales VF013ClosingSales = new VF013_ClosingSales();
    VF014_SalesCompletionPage VF014SalesCompletionPage = new VF014_SalesCompletionPage();
    VF015_GreetingSpeech VF015GreetingSpeech = new VF015_GreetingSpeech();
    VF016_UpAudioPage VF016UpAudioPage = new VF016_UpAudioPage();

    protected ScreenshotUtility utilitarios = new ScreenshotUtility();

    @Given("^Remoto-Abre login en web de venta fija \"([^\"]*)\"$")
    public void remoto_abriendo_el_navegador_remoto_CP07(int id) throws Throwable {
        Object[][] Parameters = LoadURL();
        String sBrowser = Parameters[id][2].toString();
        String sURL = Parameters[id][3].toString();
        driver = hook.browser(sBrowser, sURL);
    }

    @When("^Remoto-Ingreso codatis y doy click en continuar \"([^\"]*)\"$")
    public void remoto_ingresa_codatis_continuar_remoto_CP07(int id) throws Throwable {
        try {
            Object[][] Parameters = LoadURL();
            String codigoatis = Parameters[id][5].toString();
            VF001PreLoginPage.prelogin(codigoatis);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Ingreso_Codigo_Atis_Remoto", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Ingreso_Codigo_Atis_Remoto");
            Hook.closeBrowser(BasePage.handleDriver());
            Assert.fail("Fallo primer ingreso a la web de ventas por flujo remoto", e);
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Ingreso_Codigo_Atis_Remoto", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Ingreso_Codigo_Atis_Remoto");
            Hook.closeBrowser(BasePage.handleDriver());
        }
    }

    @Then("^Remoto-Ingreso password y Clic en iniciar sesion \"([^\"]*)\"$")
    public void remoto_ingresar_pass(int id) throws Throwable {
        try {
            Object[][] Parameters_2 = LoadURL();
            String pass2 = Parameters_2[id][6].toString();
            String suser = Parameters_2[id][7].toString();
            VF002NoBiometricLoginPage.trueloginremoto(pass2);
            System.out.println("Valor del excel: ");
            System.out.println(suser);
            String id_string = Integer.toString(id);
            Assert.assertTrue(VF003HomePage.ValidateUser(suser, id_string));
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Ingreso_Pass_Remoto", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Ingreso_Pass_Remoto");
            Hook.closeBrowser(BasePage.handleDriver());
            Assert.fail("Fallo  validacion de cuenta de usuario", e);
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Ingreso_Pass_Remoto", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Ingreso_Pass_Remoto");
            Hook.closeBrowser(BasePage.handleDriver());
        }
    }

    @Given("^Selecciono operación que realizará el \"([^\"]*)\"$")
    public void operacionaRealizar(int id) throws Throwable {
        Object[][] Parameters_3 = GetClient();
        String i_tipoFlujo = Parameters_3[id][1].toString();
        try {
            if (i_tipoFlujo.equals("Alta")) {
                Thread.sleep(3000);
                Assert.assertTrue(VF003HomePage.validarBtnAlta());
                VF003HomePage.DoClickAltaNueva();
            } else if (i_tipoFlujo.equals("Migracion")) {
                Thread.sleep(3000);
                Assert.assertTrue(VF003HomePage.validarBtnMigacion());
                VF003HomePage.DoClickMigraciones();
            }
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccionar_Migracion", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccionar_Migracion");
            Assert.fail("Fallo migracion", e);
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccionar_Migracion", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccionar_Migracion");
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
    }

    @And("^Remoto-Ingreso datos cliente a migrar \"([^\"]*)\"$")
    public void Remoto_DatosClienteMigrar(int id) throws Exception {
        Object[][] Parameters_3 = GetClient();
        String sTipDoc = Parameters_3[id][2].toString();
        String sNumDoc = Parameters_3[id][3].toString();
        try {
            VF003HomePage.DoclickObviar();
            VF004CustomerDataPage.InsertDNIClient(sTipDoc, sNumDoc);
            VF004CustomerDataPage.EvaluarMigracion();
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Ingreso_Datos", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Ingreso_Datos");
            Assert.fail("Fallo eleccion de cliente a migrar", e);
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Ingreso_Datos", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Ingreso_Datos");
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
    }

    @And("^Remoto-Selecciono producto del \"([^\"]*)\" a migrar$")
    public void Remoto_seleccionarProducto(int id) throws Throwable {
        Object[][] Parameters_3 = GetClient();
        String i_tipoProd = Parameters_3[id][9].toString();
        String sbloquehbonew = Parameters_3[id][11].toString();
        try {
            VF005InstallationSitePage.DoClickDetalle();
            VF005InstallationSitePage.ChooseLineaMigrar();
            VF005InstallationSitePage.DoclickMigrar();
            VF006ProductSelectionPage.DoClickSeleccionProducto(i_tipoProd);
            System.out.println(sbloquehbonew);
            VF007SVASelectionPage.DoClickSelecciondeSVATVenMigras(sbloquehbonew);
            VF007SVASelectionPage.DoClickSelecciondeSVAMigracion();
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Eleccion_Producto_Migrar", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Eleccion_Producto_Migrar");
            Assert.fail("Fallo eleccion de producto a migrar", e);
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Eleccion_Producto_Migrar", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Eleccion_Producto_Migrar");
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
    }

    @When("^Remoto-Acepto las condiciones, resumen de venta y contrato del \"([^\"]*)\"$")
    public void Remoto_aceptarCondicionesyContrato(int id) throws Exception {
        Object[][] Parameters_2 = LoadURL();
        Object[][] Parameters_3 = GetClient();
        String sdebitoautomatico = Parameters_3[id][21].toString();
        String stratamientodatos = Parameters_3[id][22].toString();
        String spackverde = Parameters_3[id][23].toString();
        String scontrolparental = Parameters_3[id][24].toString();
        String scorreodebitoautomatico = Parameters_3[id][20].toString();
        String scorreopackverde = Parameters_3[id][20].toString();
        try {
            VF008SaleTermsPage.DoClickDebitoAutomatico(sdebitoautomatico, scorreodebitoautomatico);
            VF008SaleTermsPage.DoClickTratamientoDatos(stratamientodatos);
            VF008SaleTermsPage.DoClickPackVerde(spackverde, scorreopackverde);
            VF008SaleTermsPage.DoClickControlParental(scontrolparental);
            VF008SaleTermsPage.DoClickContinuar();
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Condiciones_Venta", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Condiciones_Venta");
            Assert.fail("Fallo proceso de condiciones de venta y contrato", e);
            Hook.generarWordFile();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throwable.getMessage();
            throwable.getStackTrace();
            throwable.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Condiciones_Venta", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Condiciones_Venta");
            Hook.generarWordFile();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
    }

    @And("^Remoto-Hago la validacion de reniec \"([^\"]*)\"$")
    public void Remoto_validarReniec(int id) throws Exception {
        Object[][] Parameters_3 = GetClient();
        String ID_Reniec = Parameters_3[id][26].toString();
        Object[][] Parameters_2 = LoadURL();
        String sURL = Parameters_2[15][3].toString();
        BasePage base = new BasePage();
        try {
            VF011IdentityCheckPage.IdentityCheck(ID_Reniec);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Validadcion_Identidad_Migra", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Validadcion_Identidad_Migra");
            Assert.fail("Fallo validacion de RENIEC del cliente", e);
            Hook.generarWordFile();
            base.RedirigirPage(sURL);
        } catch (Exception e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Validadcion_Identidad_Migra", BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Validadcion_Identidad_Migra");
            Hook.generarWordFile();
            base.RedirigirPage(sURL);
        }
    }

    @And("^Remoto-Acepto el resumen de venta \"([^\"]*)\"$")
    public void Remoto_aceptarResumen(int id) throws Exception {
        try {
            VF009SalesSummaryPage.SalesSummaryPage();
            Assert.assertTrue(VF010ContractPage.validarBtnContratar());
            VF010ContractPage.DoClickContratar();
        }catch (AssertionError e){
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccion_Condiciones_Migra",BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccion_Condiciones_Migra");
            Assert.fail("Fallo proceso de aceptacion de condiciones y contrato",e);
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
        catch (Exception e){
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccion_Condiciones_Migra",BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccion_Condiciones_Migra");
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
    }

    @And("^Remoto-Realizo el agendamiento \"([^\"]*)\"$")
    public void Remoto_realizarAgendamiento(int id) throws Throwable {
        Object[][] Parameters_3 = GetClient();
        String i_date = Parameters_3[id][28].toString();
        String i_turno = Parameters_3[id][29].toString();
        String iTelefono = Parameters_3[id][27].toString();
        String oCodVenta;
        try {
            VF012InstallationContactPage.Agendar(i_date,i_turno, iTelefono);
            oCodVenta = VF013ClosingSales.getCodVenta();
            System.out.println("Codigo de venta: "+ oCodVenta);
            VF016UpAudioPage.cambiarNombreArchivo(oCodVenta);
        }catch (AssertionError e){
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccion_Condiciones_Migra",BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccion_Condiciones_Migra");
            Assert.fail("Fallo proceso de aceptacion de condiciones y contrato",e);
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
        catch (Exception e){
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccion_Condiciones_Migra",BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccion_Condiciones_Migra");
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
    }

    @Then ("^Remoto-Cargo el audio del \"([^\"]*)\" y obtengo mensaje exitoso$")
    public void Remoto_cargar_audio(int id) throws Throwable {
        Object[][] Parameters_3 = GetClient();
        String aMessage = Parameters_3[id][30].toString();
        String id_string = Integer.toString(id);
        try {
            VF013ClosingSales.goBandejaAudios();
            VF016UpAudioPage.cargarAudio();
            VF016UpAudioPage.ValidateMessageOK(aMessage,id_string);
            hook.closeBrowser(basepage.handleDriver());
        }catch (AssertionError e){
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccion_Condiciones_Migra",BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccion_Condiciones_Migra");
            Assert.fail("Fallo proceso de aceptacion de condiciones y contrato",e);
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
        catch (Exception e){
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            utilitarios.takeScreenshot("ERROR_Seleccion_Condiciones_Migra",BasePage.handleDriver());
            ScreenshotUtility.saveAccion("ERROR_Seleccion_Condiciones_Migra");
            Hook.generarWordFile();
            Object[][] Parameters_2 = LoadURL();
            String sURL = Parameters_2[15][3].toString();
            BasePage base = new BasePage();
            base.RedirigirPage(sURL);
        }
    }

    public Object[][] GetBDconecctions() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "Conexiones");
        return (testObjArray);
    }

    public Object[][] LoadURL() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "LoginFija");
        return (testObjArray);
    }

    public Object[][] GetClient() throws Exception {
        Object[][] testObjArray = null;
        testObjArray = ExcelUtils.getTableArray("./src/test/resources/data/TestData.xlsx", "ClientsF");
        return (testObjArray);
    }
}
