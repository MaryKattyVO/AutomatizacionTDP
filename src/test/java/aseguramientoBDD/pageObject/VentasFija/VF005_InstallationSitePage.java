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
public class VF005_InstallationSitePage extends BasePage {
    public final String txt_direccion ="//*[@id=\"direccion\"]";
    public final String lbl_direccionnoencontrada = "//*[@id=\"idLabelDireccion\"]";
    public final String txt_referencia="//*[@id=\"referencia\"]";
    public final String lbl_seleccionpack = "//*[@id=\"tab5\"]/div/table/tbody/tr/td[5]/div/label";
    public final String btn_migrar = "//*[contains(text(),'MIGRAR')]";
    public final String btn_continuar="//a[contains(@class,'boton_greentdp')]";
    public final String btn_detalle = "//*[contains(text(),'VER DETALLE')]";
    public final String btn_popupClose = "//div[@class='modal']//a[@class='popup-close'][contains(text(),'x')]";
    public final String checkbox_linea = "//div[@class='squaredTwo']//label";

    public void FijarDireccionMapa(String Direccion, String Referencia)throws Throwable {
        try {
            doAddTextField("Ingresar direccion", txt_direccion, Direccion ,false);
            doAddTextField("Ingresar referencia", txt_referencia, Referencia ,true);
            Thread.sleep(2000);
            EnterIntoView();

            //if (validateObjExist(lbl_direccionnoencontrada)) {
            //    EnterIntoView();
            //}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Detalles_Direccion(){
        try {
            doclickByJS("Click_continuar",btn_continuar,false);
        } catch ( IOException | AWTException e) {
            e.printStackTrace();
        }
    }
    public boolean Validar_Btn_Continuar(){
        boolean respuesta=false;
        try {
            Thread.sleep(2000);
            jsScrollIntoView("Scroll hasta el boton continuar",btn_continuar,false);
            respuesta=validateObjExist(btn_continuar);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return respuesta;
    }
    public boolean Validar_Btn_Paquete(){
        boolean respuesta=false;
        try {

            respuesta=validateObjExist(lbl_seleccionpack);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return respuesta;
    }
    public void DoClickPaquete() {
        try {
            doclickByJS("Seleccionar Producto", lbl_seleccionpack, false);
            Thread.sleep(4000);
            jsScrollIntoView("Scroll hasta boton migrar",btn_migrar,false);
            doclickByJS("Click en boton Migrar", btn_migrar, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DoClickDetalle(){
        try {
            Thread.sleep(8000);
            doclickByJS("Click en Ver Detalle", btn_detalle, true);
            Thread.sleep(3000);
            doclickByJS("Cerrar detalle", btn_popupClose, true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ChooseLineaMigrar(){
        try {
            doclickByJS("Elegir línea a migrar",checkbox_linea, true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void DoclickMigrar(){
        try {
            doclickByJS("Click en Migrar", btn_migrar, true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}