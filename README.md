# Conversor de Monedas (Java)

Este proyecto es un pequeño conversor de monedas hecho en Java, donde utilizo la API de ExchangeRate API para obtener los valores de diferentes divisas en tiempo real.
#La idea principal es practicar manejo de JSON, consumo de APIs, uso de Maven y un menú interactivo por consola.
¿Qué hace el programa?

El usuario puede elegir entre varias opciones del menú para convertir Pesos Colombianos (COP) a diferentes monedas como:
USD
EUR
ARS
MXN
BRL
CLP
PEN
GBP
JPY
KRW
CAD
AUD
Además también incluí conversiones al revés:
USD → COP
EUR → COP
El programa llama a la API, toma las tasas actuales y hace los cálculos dependiendo de lo que el usuario seleccione.
Tecnologías usadas
Java 17
Maven

# Autor: Jesus Albeiro Zuñiga Daza
Gson (para manejar JSON)

HttpURLConnection para conectar con la API
