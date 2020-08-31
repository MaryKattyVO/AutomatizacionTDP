package aseguramientoBDD.pageObject.VentasFija;

import aseguramientoBDD.helpers.BasePage;

import java.awt.*;
import java.io.IOException;

public class VF014_SalesCompletionPage extends BasePage {
    public final String btn_menuprincipal = "//*[@id=\"data\"]/saleprocess/div/div/div/close/div/div/div[2]/div[2]/a";
    public void DoClickMenuPrincipal() {
        try {
            doClick("Click en Volver al Menu Principal", btn_menuprincipal, true);
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }
}
