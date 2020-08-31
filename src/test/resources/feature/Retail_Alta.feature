Feature: Flujo Alta Movistar Total (Alta Trio + línea 1 Postpago + línea 2 Postpago), para un cliente nuevo, por canal Retail.

  @SmokeTest
  Scenario Outline: Como Usuario Vendedor activo de canal Tienda, acceso a Web Convergente mediante la generacion de un token
    Given Se consulta al servicio de Token del "<Id-Vendedor>" respectivo
    When Se genera el link correspondiente a la sesion del "<Id-Vendedor>"
    Then Ingreso a la ventana de login de Web Convergente
    Examples:
      | Id-Vendedor |
      | 1           |

  @SmokeTest
  Scenario Outline: Retail-Realizo alta MT
    Given En la Web Convergente, ingreso con el DNI del "<Id-Cliente>"
    When Inicio el proceso de alta MT del "<Id-Cliente>", se valida cobertura, se agrega una nueva linea MT y un Movil
    And Realizo una busqueda del plan para el "<Id-Cliente>"
    And Para el canal Retail, selecciono el plan para el "<Id-Cliente>" e inicio el registro de la venta
    Then Obtengo un código MT para el "<Id-Cliente>"
    Examples:
      | Id-Cliente |
      | 6          |