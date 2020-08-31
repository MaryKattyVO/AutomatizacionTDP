$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Retail_Alta.feature");
formatter.feature({
  "line": 1,
  "name": "Flujo Alta Movistar Total (Alta Trio + línea 1 Postpago + línea 2 Postpago), para un cliente nuevo, por canal Retail.",
  "description": "",
  "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Como Usuario Vendedor activo de canal Tienda, acceso a Web Convergente mediante la generacion de un token",
  "description": "",
  "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;como-usuario-vendedor-activo-de-canal-tienda,-acceso-a-web-convergente-mediante-la-generacion-de-un-token",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Se consulta al servicio de Token del \"\u003cId-Vendedor\u003e\" respectivo",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Se genera el link correspondiente a la sesion del \"\u003cId-Vendedor\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Ingreso a la ventana de login de Web Convergente",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;como-usuario-vendedor-activo-de-canal-tienda,-acceso-a-web-convergente-mediante-la-generacion-de-un-token;",
  "rows": [
    {
      "cells": [
        "Id-Vendedor"
      ],
      "line": 9,
      "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;como-usuario-vendedor-activo-de-canal-tienda,-acceso-a-web-convergente-mediante-la-generacion-de-un-token;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 10,
      "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;como-usuario-vendedor-activo-de-canal-tienda,-acceso-a-web-convergente-mediante-la-generacion-de-un-token;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Como Usuario Vendedor activo de canal Tienda, acceso a Web Convergente mediante la generacion de un token",
  "description": "",
  "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;como-usuario-vendedor-activo-de-canal-tienda,-acceso-a-web-convergente-mediante-la-generacion-de-un-token;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Se consulta al servicio de Token del \"1\" respectivo",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Se genera el link correspondiente a la sesion del \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Ingreso a la ventana de login de Web Convergente",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 38
    }
  ],
  "location": "Tienda_Alta.consulto_genero_token(int)"
});
formatter.result({
  "duration": 4146837237,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 51
    }
  ],
  "location": "Tienda_Alta.genero_link_pagina_cargada(int)"
});
formatter.result({
  "duration": 148252029633,
  "status": "passed"
});
formatter.match({
  "location": "Tienda_Alta.ingreso_ventana_login()"
});
formatter.result({
  "duration": 7365181690,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Retail-Realizo alta MT",
  "description": "",
  "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;retail-realizo-alta-mt",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "En la Web Convergente, ingreso con el DNI del \"\u003cId-Cliente\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Inicio el proceso de alta MT del \"\u003cId-Cliente\u003e\", se valida cobertura, se agrega una nueva linea MT y un Movil",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Realizo una busqueda del plan para el \"\u003cId-Cliente\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Para el canal Retail, selecciono el plan para el \"\u003cId-Cliente\u003e\" e inicio el registro de la venta",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Obtengo un código MT para el \"\u003cId-Cliente\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;retail-realizo-alta-mt;",
  "rows": [
    {
      "cells": [
        "Id-Cliente"
      ],
      "line": 20,
      "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;retail-realizo-alta-mt;;1"
    },
    {
      "cells": [
        "6"
      ],
      "line": 21,
      "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;retail-realizo-alta-mt;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Retail-Realizo alta MT",
  "description": "",
  "id": "flujo-alta-movistar-total-(alta-trio-+-línea-1-postpago-+-línea-2-postpago),-para-un-cliente-nuevo,-por-canal-retail.;retail-realizo-alta-mt;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "En la Web Convergente, ingreso con el DNI del \"6\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Inicio el proceso de alta MT del \"6\", se valida cobertura, se agrega una nueva linea MT y un Movil",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Realizo una busqueda del plan para el \"6\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Para el canal Retail, selecciono el plan para el \"6\" e inicio el registro de la venta",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Obtengo un código MT para el \"6\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 47
    }
  ],
  "location": "Tienda_Alta.ingreso_del_consulto(int)"
});
formatter.result({
  "duration": 1908484228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 34
    }
  ],
  "location": "Tienda_Alta.inicio_alta(int)"
});
formatter.result({
  "duration": 69902114120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 39
    }
  ],
  "location": "Tienda_Alta.realizo_una_busqueda_del_plan(int)"
});
formatter.result({
  "duration": 2132563299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 50
    }
  ],
  "location": "Retail_Alta.retail_selecciono_plan_del_e_inicio_el_registro(int)"
});
