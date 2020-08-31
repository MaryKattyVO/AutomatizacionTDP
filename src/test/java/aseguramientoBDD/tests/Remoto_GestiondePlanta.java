package aseguramientoBDD.tests;

import aseguramientoBDD.helpers.BasePage;
import aseguramientoBDD.helpers.Hook;
import aseguramientoBDD.pageObject.WebConvergente.*;
import aseguramientoBDD.utility.ExcelUtils;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Remoto_GestiondePlanta {

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

    @When("^Elijo flujo a realizar correspondiente al \"([^\"]*)\"$")
    public void inicio_alta(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String i_Flujo = Parameters_4[Id][1].toString();
        String i_nLineas = Parameters_4[Id][4].toString();
        String i_dCompleta = Parameters_4[Id][11].toString();
        String i_direccion = Parameters_4[Id][15].toString();
        String i_urb = Parameters_4[Id][16].toString();
        String i_interior = Parameters_4[Id][17].toString();
        String i_referencia = Parameters_4[Id][18].toString();
        try {
            p003_productplanPage.elegirFlujo(i_Flujo,sIndice );

/*            System.out.println(i_direccion);
            p003_productplanPage.calcularOferta_validarUbigueo(i_dCompleta, i_direccion, i_urb, i_interior, i_referencia, sIndice);
            p003_productplanPage.calcularOferta_agregarLineas(i_nLineas, sIndice);*/
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en ingreso de datos de ubicación", e);
        }
    }


}
