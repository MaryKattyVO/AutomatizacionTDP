Feature: Flujo Migración a Movistar Total (Cambio de plan a MT con SVA + añadir línea 1 postpago + añadir linea 2 postpago), para un cliente que tiene un servicio no MT, por canal  Retail

  @SmokeTest
  Scenario Outline: Como Usuario activo de canal Remoto, genero el URL para acceder a Web Convergente
    Given Se consulta al servicio de Token del "<Id-Vendedor>" respectivo
    When Se genera el link correspondiente a la sesion del "<Id-Vendedor>"
    Then Ingreso a la ventana de login de Web Convergente
    Examples:
      | Id-Vendedor |
      | 2           |

  @SmokeTest
  Scenario Outline: Retail-Realizo migra MT
    Given En la Web Convergente, ingreso con el DNI del "<Id-Cliente>"
    When Remoto-Incio migra MT del "<Id-Cliente>"
    And Realizo una busqueda del plan para el "<Id-Cliente>"
    And Remoto-Selecciono el plan para el "<Id-Cliente>" e inicio el registro de la migra
    Then Obtengo un código MT para el "<Id-Cliente>"
    Examples:
      | Id-Cliente |
      | 1          |



