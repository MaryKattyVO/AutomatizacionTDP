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

public final class Retail_Alta {
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

    @And("^Para el canal Retail, selecciono el plan para el \"([^\"]*)\" e inicio el registro de la venta$")
    public void retail_selecciono_plan_del_e_inicio_el_registro(int Id) throws Throwable {
        Object[][] Parameters_4 = GetClientWC();
        sIndice = Parameters_4[Id][0].toString();
        String i_sva = Parameters_4[Id][5].toString();
        String i_equipoL1 = Parameters_4[Id][6].toString();
        String i_equipoL2 = Parameters_4[Id][7].toString();
        String i_tipoSVA = Parameters_4[Id][8].toString();
        String i_email = Parameters_4[Id][15].toString();
        String i_telefonoContactoAdicional = Parameters_4[Id][16].toString();
        String i_personaRecibiraInstalacion = Parameters_4[Id][17].toString();
        String i_telefonoQuienRecibiraInstalacion = Parameters_4[Id][18].toString();
        String i_equipo = Parameters_4[Id][19].toString();
        try {
            if (i_sva.equals("SI")) {
                p003_productplanPage.addSVA(sIndice);
                p006_agregarAdicionalPage.elegirSVA(i_tipoSVA, sIndice);
            }
            if (i_equipoL1.equals("SI")) {
                p003_productplanPage.addEquipoLinea1(sIndice);
                p006_agregarAdicionalPage.Elegir_Equipo_Elegir_Plan(i_equipo, sIndice);
            }
            System.out.println("Antes de iniciar registro");
            p003_productplanPage.doClickIniciarRegistro(sIndice);
            p004_salesaddofferPage.registroOferta(i_email, i_telefonoContactoAdicional, i_personaRecibiraInstalacion, i_telefonoQuienRecibiraInstalacion, sIndice);
            p004_salesaddofferPage.validarContrato(sIndice);
            p004_salesaddofferPage.doContinuarRegistroMCSS_retail(sIndice);
            p005_registrerOfferPage.doStartRegistro(i_telefonoContactoAdicional, i_telefonoContactoAdicional, i_telefonoQuienRecibiraInstalacion + sIndice);
            //AGENDAMIENTO
            p007_instalacionSerivicioPage.programarInstalacion(sIndice);
            p008_registrarOfertaPage.registrarOferta(sIndice);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            hook.closeBrowser(basepage.handleDriver());
            Assert.fail("Falla en busqueda de plan", e);
        }
    }
}

