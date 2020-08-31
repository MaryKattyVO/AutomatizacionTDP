Feature: Flujo Alta Movistar Total (Alta Trio + añadir equipo a línea 1 + línea 2 Postpago), para un cliente nuevo, por canal Remoto.

  @SmokeTest
  Scenario Outline: Como Usuario activo de canal Remoto, genero el URL para acceder a Web Convergente
    Given Se consulta al servicio de Token del "<Id-Vendedor>" respectivo
    When Se genera el link correspondiente a la sesion del "<Id-Vendedor>"
    Then Ingreso a la ventana de login de Web Convergente
    Examples:
      | Id-Vendedor |
      | 2           |

  @SmokeTest
  Scenario Outline: En canal Remoto - Realizo alta Movistar Total (MT)
    Given En la Web Convergente, ingreso con el DNI del "<Id-Cliente>"
    When Inicio el proceso de alta MT del "<Id-Cliente>", se valida cobertura, se agrega una nueva linea MT y un Movil
    And Realizo una busqueda del plan para el "<Id-Cliente>"
    And Para el canal Remoto, selecciono el plan para el "<Id-Cliente>" e inicio el registro de la venta
    Then Obtengo un código MT para el "<Id-Cliente>"
    Examples:
      | Id-Cliente |
      | 4          |

  @SmokeTest
  Scenario Outline: Como Usuario activo de canal Remoto, genero el URL para acceder a Web Convergente backoffice
    Given Se consulta al servicio de Token del "<Id-Vendedor>" respectivo
    When Se genera el link correspondiente a la sesion del "<Id-Vendedor>"
    Then Ingreso a la ventana de login de Web Convergente
    Examples:
      | Id-Vendedor |
      | 2           |

  @SmokeTest
  Scenario Outline: En canal Remoto - Realizo la validacion del MT desde backoffice y cargo el audio, por canal remoto
    Given Busco el codigo MT del "<Id-Cliente>"
    When Remoto-Cargo un archivo de audio del "<Id-Cliente>"
#   Then Obtengo el estado Aprobado de la orden "<Id_Cliente>"
    Examples:
      | Id-Cliente |
      | 1          |


