Feature: Flujo Alta Movistar Total (Alta Trio con SVA + añadir equipo a línea 1 + línea 2 Postpago), para un cliente nuevo, por canal Tienda

  @SmokeTest
  Scenario Outline: CP04 - Como Usuario activo, realizo un alta Movistar Total (Alta Trio con SVA + añadir equipo a línea 1 + línea 2 Postpago) por canal tienda.
    Given Selecciono el request del canal tienda para CP04
    And Se consulta al API con el "<Url>", con el body "<Body>" y en el header donde estan las llaves "<Access-Token>" "<Authorization>" "<Content-Type>" respectivo, con la url de la web convergente, canal tienda para CP04
    And Se devuelve un Token para el "<Id_Cliente>" y página de Webconvergente es cargada, canal tienda para CP04
    And Inicio una consulta con el "<Id_Cliente>", canal tienda para CP04
    And Ingreso "<DNI>" del "<Id_Cliente>" y consulto, canal tienda para CP04
    When Incio el alta del Plan Movistar Total a un "<Id_Cliente>" nuevo, canal tienda para CP04
    And Realizo una busqueda del plan para el "<Id_Cliente>", canal tienda para CP04
    And Selecciono el plan para el "<Id_Cliente>" e inicio el registro de la venta, canal tienda para CP04
    Then Obtengo un código MT para el "<Id_Cliente>", canal tienda para CP04
    Examples:
      | Id_Cliente      |
      | 1               |


