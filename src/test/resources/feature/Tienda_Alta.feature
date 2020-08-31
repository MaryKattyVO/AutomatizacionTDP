Feature: Flujo Alta Movistar Total para un cliente nuevo, por canal Tienda.

  @SmokeTest
  Scenario Outline: Como Usuario Vendedor activo de canal Tienda, acceso a Web Convergente mediante la generacion de un token
    Given Se consulta al servicio de Token del "<Id-Vendedor>" respectivo
    When Se genera el link correspondiente a la sesion del "<Id-Vendedor>"
    Then Ingreso a la ventana de login de Web Convergente
    Examples:
      | Id-Vendedor |
      | 0           |

  @SmokeTest
  Scenario Outline: En canal Tienda - Realizo alta Movistar Total (MT)
    Given En la Web Convergente, ingreso con el DNI del "<Id-Cliente>"
    When Inicio el proceso de alta MT del "<Id-Cliente>", se valida cobertura, se agrega una nueva linea MT y un Movil
    And Realizo una busqueda del plan para el "<Id-Cliente>"
    And Para el canal Tienda, selecciono el plan para el "<Id-Cliente>" e inicio el registro de la venta
    Then Obtengo un código MT para el "<Id-Cliente>"
    Examples:
      | Id-Cliente |
      | 8          |
