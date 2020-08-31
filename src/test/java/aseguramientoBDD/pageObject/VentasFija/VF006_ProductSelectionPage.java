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
public class VF006_ProductSelectionPage extends BasePage {
    public final String btn_productomono = "//*[@id=\"tab4\"]/div[1]/div[2]/a";
    public final String btn_productoduo = "//*[@id=\"tab3\"]/div[1]/div/div[2]/a";
    public final String btn_productotrio = "//div[@class='sepPest']//div[3]//div[2]//a[1]";

    public final String div_alert="//*[@id=\"data\"]/offering/div/div/div[2]/div[3]/div[1]/div";

    public final String btn_pestaniamono = "id|a4";
    public final String btn_pestaniaduo = "id|a3";
    public final String btn_pestaniatrio = "id|a2";

    public final String link_detalle = "//div[@id='trio2']//p[contains(text(),'Ver detalle')]";

    /*
    public final String btn_pestaniamono = "//*[@id=\"a4\"]"; "|id|a4";
    public final String btn_pestaniaduo = "//*[@id=\"a3\"]"; "|id|a3";
    public final String btn_pestaniatrio = "//*[@id=\"a2\"]"; "|id|a2";

     */

    public void DoClickSeleccionProducto(String stipoproducto) throws Exception {
        try {
           switch (stipoproducto){
               case "MONO":
                   System.out.println("case mono");
                   doclickByJS("Seleccionar Pestaña Mono", btn_pestaniamono, true);
                   doclickByJS("Seleccionar Producto Mono", btn_productomono, true);
                   Thread.sleep(2000);
                   break;
               case "DUO":
                   System.out.println("case duo");
                   doclickByJS("Seleccionar Pestaña Dúo", btn_pestaniaduo, true);
                   doclickByJS("Seleccionar Producto Dúo", btn_productoduo, true);
                   Thread.sleep(2000);
                   break;
               case "TRIO":
                   System.out.println("case trio");
                   doclickByJS("Seleccionar Pestaña Trío", btn_pestaniatrio, true);
                   jsScrollIntoView("Ir a footer",link_detalle, false);
                   doclickByJS("Ver detalle", link_detalle,true);
                   Thread.sleep(3000);
                   doclickByJS("Seleccionar Producto Trío", btn_productotrio, true);
                   Thread.sleep(2000);
                   break;
               }
           } catch (AWTException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public boolean ValidateAlert(){
        boolean respuesta=false;
        try{
            respuesta=validateObjExist(div_alert);
        }catch (Throwable e){
            e.printStackTrace();
        }
        return respuesta;
    }







}
