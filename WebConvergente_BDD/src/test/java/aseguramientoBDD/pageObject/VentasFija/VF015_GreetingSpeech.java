package aseguramientoBDD.pageObject.VentasFija;

import aseguramientoBDD.helpers.BasePage;

import java.io.IOException;

public class VF015_GreetingSpeech extends BasePage {
    public final String txt_clientphone = "//*[@id=\"mobilePhone\"]";
    public final String btn_registerphone = "//*[@id=\"data\"]/contacto/div/div/div/form/div[2]/div[1]/div/a";
    public final String btn_continuar = "//*[@id=\"continuar_\"]";

    public void Registrar_Celular_de_Cliente(String sclientphone) throws Throwable{
        try {
            doAddTextField("Ingresando Telefono de Cliente",txt_clientphone,sclientphone,true);
            doClick("Registro del Celular del Cliente",btn_registerphone,true);
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Obviar_y_o_Continuar() throws Throwable{
        try {
            doClick("Hacer Click en Obviar y Continuar",btn_continuar,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
