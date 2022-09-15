package stepDef;

import cucumber.api.java.en.*;
import page.Banistmo;

public class DescargaDocumento {
	
	Banistmo banistmo = new Banistmo();
	 
	@When("^usuario ingresa a la pagina de banitsmo$")
	public void usuario_ingresa_a_la_pagina_de_banitsmo() throws Exception {
		banistmo.launchBrowser();
		banistmo.openBanitsmoURL();
	}

	@When("^selecciona la opcion de Productos & Servicios$")
	public void selecciona_la_opcion_de_Productos_Servicios() throws Exception {
		banistmo.seleccionarProductoYServicio();
	}

	@When("^da clic en Depositos$")
	public void da_clic_en_Depositos() throws Exception {
		banistmo.SeleccionarDepositos();
	}

	@Then("^se muestra pagina de Depositos$")
	public void se_muestra_pagina_de_Depositos() throws Exception {
		banistmo.SeMuestraDepositos();
	}

	@When("^usuarios Selecciona cuenta de ahorro Comercial$")
	public void usuarios_Selecciona_cuenta_de_ahorro_Comercial() throws Exception {
		banistmo.SeleccionarCuentaAhorro();
	}

	@Then("^se muestre pagina de ahorro comencial$")
	public void se_muestre_pagina_de_ahorro_comencial() throws Exception {
		banistmo.MuestraPaginaAhorro();
	}

	@When("^usuario selecciona documentos$")
	public void usuario_selecciona_documentos() throws Exception {
		banistmo.SeleccionaDocumentos();
	}

	@When("^descarga el documento de Contrato unico de productos y servicios bancarios$")
	public void descarga_el_documento_de_Contrato_unico_de_productos_y_servicios_bancarios() throws Exception {
		banistmo.DescargaDocumentos();
	}

	@Then("^se valida que el documento descargado sea correcto$")
	public void se_valida_que_el_documento_descargado_sea_correcto() throws Exception {
		banistmo.ValidaDocumentos();
	}

}
