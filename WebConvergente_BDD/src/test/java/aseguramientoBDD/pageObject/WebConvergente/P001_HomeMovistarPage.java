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

package aseguramientoBDD.pageObject.WebConvergente;

import org.testng.Assert;
import aseguramientoBDD.helpers.BasePage;

public class P001_HomeMovistarPage extends BasePage {

	public BasePage basePage = new BasePage();

	public final static String lnk_Inicio = "//a[@class='navbar-brand telefonicaRegular cursor-pointer ng-star-inserted']";
	public final static String bnr_Main = "//a[@class='navbar-brand telefonicaRegular cursor-pointer ng-star-inserted']";
	
	
	public boolean loadHomeMovistar(String UIName) throws Exception{
		boolean validacion = false;
		try{
			ValidateObject(UIName, bnr_Main, "DISPLAYED");
			validacion = true;
		}catch(Exception e){
			e.printStackTrace();
			Assert.fail("ERROR en loadHomeMovistar", e);
		}	
		return validacion;
	}


	public boolean doLoadInicioLink(String UIName) throws Exception{
		boolean validacion=false;
		try{
			loadHomeMovistar(UIName);

			doClickLink("Click en Inicio",  lnk_Inicio,  false);
			checkAlert_Accept();
			validacion = true;
			
		}catch(Exception e){
			e.printStackTrace();
			Assert.fail("ERROR en doLoadInicioLink", e);
		}	

		return validacion;

	}


}
