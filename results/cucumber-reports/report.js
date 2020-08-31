$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/RetailGP1.feature");
formatter.feature({
  "line": 1,
  "name": "Flujo Gestion  de planta Movistar Total (Mantener fijo y agregarle un sva , Mantener lineas moviles), para un cliente , por canal Retail",
  "description": "",
  "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Como Usuario activo de canal Retail, genero el URL para acceder a Web Convergente",
  "description": "",
  "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;como-usuario-activo-de-canal-retail,-genero-el-url-para-acceder-a-web-convergente",
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
  "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;como-usuario-activo-de-canal-retail,-genero-el-url-para-acceder-a-web-convergente;",
  "rows": [
    {
      "cells": [
        "Id-Vendedor"
      ],
      "line": 9,
      "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;como-usuario-activo-de-canal-retail,-genero-el-url-para-acceder-a-web-convergente;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 10,
      "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;como-usuario-activo-de-canal-retail,-genero-el-url-para-acceder-a-web-convergente;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Como Usuario activo de canal Retail, genero el URL para acceder a Web Convergente",
  "description": "",
  "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;como-usuario-activo-de-canal-retail,-genero-el-url-para-acceder-a-web-convergente;;2",
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
  "duration": 3509312787,
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
  "duration": 99007396861,
  "status": "passed"
});
formatter.match({
  "location": "Tienda_Alta.ingreso_ventana_login()"
});
formatter.result({
  "duration": 3084410349,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "En canal Retail - Realizo G.P Movistar Total (MT)",
  "description": "",
  "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;en-canal-retail---realizo-g.p-movistar-total-(mt)",
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
  "name": "Elijo flujo a realizar correspondiente flujo retail gp \"\u003cId-Cliente\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;en-canal-retail---realizo-g.p-movistar-total-(mt);",
  "rows": [
    {
      "cells": [
        "Id-Cliente"
      ],
      "line": 18,
      "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;en-canal-retail---realizo-g.p-movistar-total-(mt);;1"
    },
    {
      "cells": [
        "10"
      ],
      "line": 19,
      "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;en-canal-retail---realizo-g.p-movistar-total-(mt);;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "En canal Retail - Realizo G.P Movistar Total (MT)",
  "description": "",
  "id": "flujo-gestion--de-planta-movistar-total-(mantener-fijo-y-agregarle-un-sva-,-mantener-lineas-moviles),-para-un-cliente-,-por-canal-retail;en-canal-retail---realizo-g.p-movistar-total-(mt);;2",
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
  "name": "En la Web Convergente, ingreso con el DNI del \"10\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Elijo flujo a realizar correspondiente flujo retail gp \"10\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 47
    }
  ],
  "location": "Tienda_Alta.ingreso_del_consulto(int)"
});
formatter.result({
  "duration": 1522561700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 56
    }
  ],
  "location": "RetailGP1.inicio_alta2(int)"
});
formatter.result({
  "duration": 93156785301,
  "status": "passed"
});
});