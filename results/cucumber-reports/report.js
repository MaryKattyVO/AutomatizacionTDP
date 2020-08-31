$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/GP1_Remoto.feature");
formatter.feature({
  "line": 1,
  "name": "Flujo Gestion de planta Movistar Total (Mantener fijo, Mantener lineas moviles y agregarle un equipo), para un cliente , por canal Remoto",
  "description": "",
  "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Como Usuario activo de canal Remoto, genero el URL para acceder a Web Convergente",
  "description": "",
  "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;como-usuario-activo-de-canal-remoto,-genero-el-url-para-acceder-a-web-convergente",
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
  "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;como-usuario-activo-de-canal-remoto,-genero-el-url-para-acceder-a-web-convergente;",
  "rows": [
    {
      "cells": [
        "Id-Vendedor"
      ],
      "line": 9,
      "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;como-usuario-activo-de-canal-remoto,-genero-el-url-para-acceder-a-web-convergente;;1"
    },
    {
      "cells": [
        "2"
      ],
      "line": 10,
      "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;como-usuario-activo-de-canal-remoto,-genero-el-url-para-acceder-a-web-convergente;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Como Usuario activo de canal Remoto, genero el URL para acceder a Web Convergente",
  "description": "",
  "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;como-usuario-activo-de-canal-remoto,-genero-el-url-para-acceder-a-web-convergente;;2",
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
  "name": "Se consulta al servicio de Token del \"2\" respectivo",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Se genera el link correspondiente a la sesion del \"2\"",
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
      "val": "2",
      "offset": 38
    }
  ],
  "location": "Tienda_Alta.consulto_genero_token(int)"
});
formatter.result({
  "duration": 2874694800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 51
    }
  ],
  "location": "Tienda_Alta.genero_link_pagina_cargada(int)"
});
formatter.result({
  "duration": 23607496000,
  "status": "passed"
});
formatter.match({
  "location": "Tienda_Alta.ingreso_ventana_login()"
});
formatter.result({
  "duration": 5181271800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "En canal Remoto - Realizo G.P Movistar Total (MT)",
  "description": "",
  "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;en-canal-remoto---realizo-g.p-movistar-total-(mt)",
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
  "name": "Elijo flujo a realizar correspondiente flujo remoto gp \"\u003cId-Cliente\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Realizo una busqueda del plan para el \"\u003cId-Cliente\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Para el canal Remoto, selecciono el plan para el \"\u003cId-Cliente\u003e\" e inicio el registro de la venta",
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
  "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;en-canal-remoto---realizo-g.p-movistar-total-(mt);",
  "rows": [
    {
      "cells": [
        "Id-Cliente"
      ],
      "line": 20,
      "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;en-canal-remoto---realizo-g.p-movistar-total-(mt);;1"
    },
    {
      "cells": [
        "11"
      ],
      "line": 21,
      "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;en-canal-remoto---realizo-g.p-movistar-total-(mt);;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "En canal Remoto - Realizo G.P Movistar Total (MT)",
  "description": "",
  "id": "flujo-gestion-de-planta-movistar-total-(mantener-fijo,-mantener-lineas-moviles-y-agregarle-un-equipo),-para-un-cliente-,-por-canal-remoto;en-canal-remoto---realizo-g.p-movistar-total-(mt);;2",
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
  "name": "En la Web Convergente, ingreso con el DNI del \"11\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Elijo flujo a realizar correspondiente flujo remoto gp \"11\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Realizo una busqueda del plan para el \"11\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Para el canal Remoto, selecciono el plan para el \"11\" e inicio el registro de la venta",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Obtengo un código MT para el \"11\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 47
    }
  ],
  "location": "Tienda_Alta.ingreso_del_consulto(int)"
});
formatter.result({
  "duration": 1357540000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 56
    }
  ],
  "location": "GP1_Remoto.inicio_alta2(int)"
});
