Feature: Flujo Gestion  de planta Movistar Total (Mantener fijo y agregarle un equipo a su primera Linea movil), para un cliente , por canal Retail

   @SmokeTest
   Scenario Outline: Como Usuario activo de canal Retail, genero el URL para acceder a Web Convergente
     Given Se consulta al servicio de Token del "<Id-Vendedor>" respectivo
     When Se genera el link correspondiente a la sesion del "<Id-Vendedor>"
     Then Ingreso a la ventana de login de Web Convergente
     Examples:
       | Id-Vendedor |
       | 1           |

   @SmokeTest
   Scenario Outline: En canal Retail - Realizo G.P Movistar Total (MT)
     Given En la Web Convergente, ingreso con el DNI del "<Id-Cliente>"
     When Elijo flujo a realizar correspondiente al "<Id-Cliente>"
     And Realizo una busqueda del plan para el "<Id-Cliente>"
     And Para el canal Retail, selecciono el plan para el "<Id-Cliente>" e inicio el registro de la venta
     Then Obtengo un código MT para el "<Id-Cliente>"
     Examples:
       | Id-Cliente |
       | 9          |


