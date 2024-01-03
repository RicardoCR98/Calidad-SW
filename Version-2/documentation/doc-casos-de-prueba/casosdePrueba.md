# Especificación de Casos de Prueba
## Casos Funcionales
## Caso de Prueba 1: Verificar la Traducción Correcta

**Descripción:**
Verificar que el sistema traduzca correctamente el nombre de una postura de yoga del idioma inglés al sánscrito y español.

**Pasos:**
1. Abrir la aplicación.
2. Presionar en la pestaña de Inglés.
3. Seleccionar una postura.
4. Verificar la traducción en sánscrito y español.

**Resultado Esperado:**
La traducción en sánscrito y español es correcta.

## Caso de Prueba 2: Ingresar una Postura en Sánscrito

**Descripción:**
Confirmar que el sistema permita ingresar una postura de yoga en sánscrito y obtenga su traducción al español.

**Pasos:**
1. Abrir la aplicación.
2. Dirigirse a la pestaña de Diccionario
3. Ingresar el nombre de una postura en sánscrito.
4. Verificar la traducción en inglés y español.

**Resultado Esperado:**
La traducción en español es correcta.

## Caso de Prueba 3: Visualización Gráfica de Posturas

**Descripción:**
Asegurar que el sistema permita visualizar las posturas de yoga de manera gráfica en la interfaz.

**Pasos:**
1. Abrir la aplicación.
2. Seleccionar una postura de yoga en cualquiera de las 3 primeras pestañas.
3. Verificar que se muestra una representación gráfica de la postura.

**Resultado Esperado:**
La interfaz muestra la postura de yoga de manera gráfica.

## Caso de Prueba 4: Acceso sin Conexión a Internet

**Descripción:**
Confirmar que el sistema sea accesible al traductor incluso sin conexión a internet.

**Pasos:**
1. Desconectar el dispositivo de internet.
2. Abrir la aplicación.
3. Realizar operaciones normales.

**Resultado Esperado:**
La aplicación funciona correctamente incluso sin conexión a internet.

## Caso de Prueba 5: Usabilidad de la Interfaz

**Descripción:**
Verificar que la interfaz del sistema sea simple y fácil de utilizar.

**Pasos:**
1. Abrir la aplicación.
2. Evaluar la facilidad de navegación y comprensión de la interfaz.

**Resultado Esperado:**
La interfaz es simple y fácil de utilizar.

## Caso de Prueba 6: Autocompletar en la Búsqueda

**Descripción:**
Confirmar que el sistema ofrezca la opción de autocompletar mientras se escribe el nombre de la postura.

**Pasos:**
1. Abrir la aplicación.
2. Comenzar a escribir el nombre de una postura en cualquiera de las 3 primeras pestañas.
3. Verificar que se ofrezcan opciones de autocompletar.

**Resultado Esperado:**
La opción de autocompletar está disponible y funciona correctamente.

## Caso de Prueba 7: Validación en la Entrada de Texto

**Descripción:**
Verificar la validación en la entrada de texto en la pestaña de Diccionario.

**Pasos:**
1. Abrir la aplicación.
2. Seleccionar la pestaña de Diccionario.
3. Ingresar texto inválido (por ejemplo, números).

**Resultado Esperado:**
Confirmar que el sistema no deje ingresar caracteres especiales ni números y muestre una alerta.

## Caso de Prueba 8: Validación en el Espacio de Traductor

**Descripción:**
Verificar la validación en el espacio de traductor cuando se deja vacío.

**Pasos:**
1. Abrir la aplicación.
2. Seleccionar la pestaña de Traductor.
3. Dejar vacío el espacio destinado para ingresar el texto a traducir.
4. Intentar realizar la traducción.

**Resultado Esperado:**
Confirmar que el sistema detecta la entrada de texto vacía y muestra una alerta informativa indicando que el campo no puede estar en blanco. Además, verificar que no se realice ninguna traducción en ausencia de texto y que el sistema no genere resultados incorrectos.

## Caso de Prueba 9: Traducción No Encontrada en el Diccionario

**Descripción:**
Verificar el comportamiento del sistema al intentar traducir una palabra o frase que no está presente en el diccionario proporcionado.

**Pasos:**
1. Abrir la aplicación.
2. Seleccionar la pestaña de Traductor.
3. Dejar vacío el espacio destinado para ingresar el texto a traducir.
4. Intentar realizar la traducción.

**Resultado Esperado:**
Confirmar que el sistema detecta que la palabra o frase no está en el diccionario y muestra una alerta informativa indicando que la traducción no puede llevarse a cabo. Verificar que no se generen resultados incorrectos y que el sistema no intente realizar una traducción basada en la información disponible en el diccionario.

## Casos No Funcionales

## Caso de Prueba 10: Rendimiento del Traductor

**Descripción:**
Evaluar la velocidad de traducción del sistema bajo diferentes condiciones.

**Pasos:**
1. Ingresar textos cortos, medianos y largos para traducir.
2. Medir el tiempo de respuesta del sistema para cada traducción.

**Criterios de Aceptación:**
- El tiempo de respuesta para traducciones de textos debe ser inferior a 1 segundo.

## Caso de Prueba 11: Disponibilidad del Servicio

**Descripción:**
Verificar la disponibilidad del sistema en diferentes momentos del día.

**Pasos:**
1. Monitorear la disponibilidad del sistema durante períodos pico y valle.
2. Registrar cualquier interrupción o tiempo de inactividad.

**Criterios de Aceptación:**
- El sistema debe estar disponible el 99.9% del tiempo, con un tiempo de inactividad mínimo.
