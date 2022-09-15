#Author: Celaya Aguirre Alan jovani
Feature: Descarga de Contrato unico de productos y servicios bancarios

  Scenario: usuario descarga el documento
    When usuario ingresa a la pagina de banitsmo
    And selecciona la opcion de Productos & Servicios
    And da clic en Depositos
    Then se muestra pagina de Depositos
    When usuarios Selecciona cuenta de ahorro Comercial
    Then se muestre pagina de ahorro comencial
    When usuario selecciona documentos
    And descarga el documento de Contrato unico de productos y servicios bancarios
    Then se valida que el documento descargado sea correcto