package aseguramientoBDD.pageObject.VentasFija;

import aseguramientoBDD.helpers.BasePage;

import java.awt.*;
import java.io.IOException;

/**************************************************
 WIPRO COMPANY PROPIEDAD INTELECTUAL www.wipro.com
 #Autor : Marcos Ronceros
 #Description : Venta Fija – Alta
 #Fecha de creación: Feb 2020
 # Venta Fija Version: XXXX
 #Input Parameters: --
 #Nombre que modifica : --
 #Fecha modificación: --
 **************************************************/
public class VF004_CustomerDataPage extends BasePage {
    public final String cbo_TipoDoc ="id|documentType";
    public final String txt_NroDoc ="id|docNroDni";
    public final String cbo_Departamento="id|department";
    public final String cbo_Provincia="id|city";
    public final String cbo_Distrito="id|district";
    public final String btn_EvaluarAlta ="//*[@id=\"data\"]/searchuser/div/div/div[2]/form/div[6]/button";
    public final String btn_continuar="//*[@id=\"data\"]/searchuser/div/div/div[2]/div[4]/button";
    public final String btn_EvaluarMigracion ="//*[@id=\"data\"]/searchuser/div/div/div[2]/form/div[3]/button";

    public void InsertDNIClient(String sTipoDoc, String sNumDoc){
        try {
            doSelectDropdown("Seleccionar Tipo de Doc", cbo_TipoDoc, sTipoDoc, false);
            doAddTextField("Ingresar Número de Doc cliente", txt_NroDoc, sNumDoc, false);
            Thread.sleep(3000);
        } catch (IOException | AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void UbicacionInstalacion(String sDepartamento, String sProvincia, String sDistrito){
        try {
            doSelectDropdown("Seleccionar Departamento", cbo_Departamento, sDepartamento, false);
            doSelectDropdown("Seleccionar Provincia", cbo_Provincia, sProvincia, false);
            doSelectDropdown("Seleccionar Distrito", cbo_Distrito, sDistrito, false);
            jsScrollIntoView("Scroll hasta boton evaluarr", btn_EvaluarAlta, false);
            doClick("Click en evaluar cliente", btn_EvaluarAlta, true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/*
    public void UbicacionInstalacion(int DepartamentoIndex, int ProvinciaIndex, int DistritoIndex){
        try {

            doSelectDropdown("Seleccionar Departamento",cbo_Departamento,DepartamentoIndex,false);
            doSelectDropdown("Seleccionar Provincia",cbo_Provincia,ProvinciaIndex,false);
            doSelectDropdown("Seleccionar Distrito",cbo_Distrito,DistritoIndex,false);
            jsScrollIntoView("Scroll hasta boton evaluarr",btn_Evaluar,false);
            doClick("Click en evaluar cliente",btn_Evaluar,true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 */
    public void ClickContinuar() throws InterruptedException, IOException, AWTException {

        doclickByJS("Click en evaluar cliente",btn_continuar,true);
    }
    public boolean ValidarBtnContinuar() throws Throwable {
        boolean respuesta=false;
        try{
            Thread.sleep(4000);
            jsScrollIntoView("Scroll hasta boton continuar",btn_continuar,false);
            respuesta= validateObjExist(btn_continuar);
        }catch (Exception e){
            e.printStackTrace();
        }
        return respuesta;
    }
    public void EvaluarMigracion(){
            try {
                //jsScrollIntoView(btn_Evaluar);
                doclickByJS("Click en evaluar cliente", btn_EvaluarMigracion,true);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
