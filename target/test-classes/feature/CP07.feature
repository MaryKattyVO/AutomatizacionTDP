Feature: Flujo Migración Movistar Total (Migración FIJA + SVA (FOX)), por canal CROSS

  @SmokeTest
  Scenario Outline: Como Usuario Remoto-Call-In, realizo login en Web Ventas Fijas
    Given Remoto-Abre login en web de venta fija "<Id-VENDEDOR>"
    When Remoto-Ingreso codatis y doy click en continuar "<Id-VENDEDOR>"
    Then Remoto-Ingreso password y Clic en iniciar sesion "<Id-VENDEDOR>"
    Examples:
      | Id-VENDEDOR |
      | 2           |

  @SmokeTest
  Scenario Outline: CP07 - Como Usuario Remoto-Call-In, realizo una migración Movistar Total (Migración FIJA + SVA (FOX)), por canal remoto
#    Given Selecciono operación que realizará el "<Id-Cliente>"
#    And Remoto-Ingreso datos cliente a migrar "<Id-Cliente>"
#    And Remoto-Selecciono producto del "<Id-Cliente>" a migrar
#    When Remoto-Acepto las condiciones, resumen de venta y contrato del "<Id-Cliente>"
#    And Remoto-Hago la validacion de reniec "<Id-Cliente>"
#    And Remoto-Acepto el resumen de venta "<Id-Cliente>"
#    And Remoto-Realizo el agendamiento "<Id-Cliente>"
    Then Remoto-Cargo el audio del "<Id-Cliente>" y obtengo mensaje exitoso
    Examples:
      | Id-Cliente |
      | 1          |


