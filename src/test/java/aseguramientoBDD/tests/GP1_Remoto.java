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

import aseguramientoBDD.helpers.BasePage;
import aseguramientoBDD.helpers.Hook;
import aseguramientoBDD.pageObject.WebConvergente.*;
import aseguramientoBDD.utility.ExcelUtils;
import aseguramientoBDD.utility.JsonUtility;
import aseguramientoBDD.utility.ScreenshotUtility;
import com.google.gson.internal.$Gson$Types;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public final class GP1_Remoto {
    protected static ScreenshotUtility utilitarios = new ScreenshotUtility();
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


    @When("^Elijo flujo a realizar correspondiente flujo remoto gp \"([^\"]*)\"$")
    public void inicio_alta2(int Id) throws Exception {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String i_Flujo = Parameters_4[Id][1].toString();
        String i_equipoL1 = Parameters_4[Id][6].toString();
        String i_equipo = Parameters_4[Id][23].toString();
        String i_eMail =  Parameters_4[Id][19].toString();
        String i_agendamiento = Parameters_4[Id][10].toString();
        String i_madre = Parameters_4[Id][9].toString();
        String i_telefonoContactoAdicional =  Parameters_4[Id][20].toString();
        String i_personaRecibiraInstalacion = Parameters_4[Id][21].toString();
        String i_telefonoQuienRecibiraInstalacion= Parameters_4[Id][22].toString();

        try {
            p003_productplanPage.elegirFlujo(i_Flujo, sIndice);
            if (i_equipoL1.equals("SI")){
                System.out.println("Cambiar equipo");
                p003_productplanPage.addEquipoLineagp(sIndice);
                p006_agregarAdicionalPage.Elegir_Equipo_Elegir_Plan(i_equipo, sIndice);
            }
            p003_productplanPage.doClickIniciarRegistro(sIndice);
            p004_salesaddofferPage.ubicacionDelivery(sIndice);
            p004_salesaddofferPage.programarEntrega(sIndice);
            p004_salesaddofferPage.registroOferta(i_eMail,i_telefonoContactoAdicional,i_personaRecibiraInstalacion,i_telefonoQuienRecibiraInstalacion,sIndice);
            p004_salesaddofferPage.validarIdentidadTitular(i_madre, sIndice);
            p004_salesaddofferPage.validarContrato(sIndice);
            p004_salesaddofferPage.doContinuarRegistroMCSS_remoto(i_agendamiento, sIndice);
            utilitarios.takeScreenshot("flujo remoto", driver);
            Hook.closeBrowser(driver);
            /*System.out.println(i_direccion);
            p003_productplanPage.calcularOferta_validarUbigueo(i_dCompleta, i_direccion, i_urb, i_interior, i_referencia, sIndice);
            p003_productplanPage.calcularOferta_agregarLineas(i_nLineas, sIndice);*/
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en ingreso de datos de ubicación", e);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}

