# Plantilla: propuesta del Proyecto A

---

## 0 · Datos

| |           |
|---|-----------|
| **Nombre de la app** | LolMaster |
| **Autor/a** | Claudia   |
| **Fecha** | 2/10/2026 |

---

## 1 · La idea en una frase

> Qué hace tu app y para quién, en una sola frase.
> 
> Una app para jugadores de LoL donde apuntan cada partida y, si quieren le pueden añadir hasta tres fotos y una nota, para ver cómo van mejorando. También pueden compartirla.
> 
> Fórmula: «Una app que permite a [quién] hacer [qué] para [para qué].»

---

## 2 · El problema

> ¿Qué problema resuelve? ¿Cómo se resuelve hoy sin tu app?

Cuando terminas una partida de LoL, lo más normal es que se te olvide cómo te fue. No te acuerdas de con qué campeón ganaste más, ni de por qué perdiste esa partida que te dio tanta rabia perder. Y así, una tras otra, vas repitiendo los mismos errores sin darte ni cuenta.

Mi app lo soluciona de esta manera: apuntas la partida en diez segundos, le pones una o tres fotos del post-game y escribes una nota si te apetece. Todo se queda guardado y ordenado, y lo puedes compartir con quien quieras.

Ahora mismo, sin mi app, eso lo haces mandando capturas a un grupo de WhatsApp, apuntando algo en una nota del móvil que nunca vuelves a abrir, o miras webs como OP.GG que te dan los números (KDA, CS...) pero no te dejan escribir lo que tú pensaste de la partida. Y muchas veces pues no haces nada. Y claro, si no haces nada no aprendes de tus errores, porque ni te acuerdas de qué hiciste mal.

---

## 3 · Personas usuarias

> ¿Quién la va a usar? Describe a una persona concreta: edad, soltura con la
> tecnología, cuándo y dónde abre la app, cuánto tiempo le dedica y qué pasa
> si le falla.

Javier de 23 años, juega a LoL desde hace cinco años y hace directos en Twitch.

Se maneja bien con el móvil y como streamer está acostumbrado a probar herramientas nuevas.

Abre la app justo al acabar una partida delante del PC mientras sigue en directo o nada más cerrar el stream. Le llevará poco tiempo apuntar el resultado rápido y, si la partida ha sido muy buena o se ha tilteado se queda un rato más escribiendo la nota y subiendo las fotos. Y al ser streamer, puede compartir cualquiera de sus partidas con la comunidad, por lo que en total no le llevaría más de unos pocos minutos.

Si la app le falla al apuntar una partida no sería algo grave ya que lo puede apuntar luego o lo deja pasar. Pero igual habría dos casos en los que sí le podría molestar y dejar de usar la app. Uno, cuando quiere compartir una partida con su comunidad justo al terminarla y la app no responde, tiene que ser en ese momento y no luego porque no tendría la misma repercusión. Y el segundo sería si un día abre la app y ha perdido el historial de toda una semana, porque la usa para ver cómo va mejorando y para tener sus estadísticas a mano. Por lo que acabaría dejando la app y buscando otras alternativas.


---

## 4 · Funcionalidades

### Imprescindibles (sin esto la app no tiene sentido)

| # | Funcionalidad                                                                                         |
|---|-------------------------------------------------------------------------------------------------------|
| F1 | Apuntar una partida (campeón,rol,resultado,KDA..), añadirle fotos o notas y compartirla como quieras. |
| F2 | Ver tu lista de partidas y filtrarlas por campeón,por resultado,por periodo y por rol.                |
| F3 | Abrir una partida y ver todos los detalles: las fotos, las notas y la información.                    |

### Opcionales (si sobra tiempo)

| # | Funcionalidad                                                                                                        |
|---|----------------------------------------------------------------------------------------------------------------------|
| O1 | Randomizador de campeón y build: si no sabes qué jugar, la app te elige un campeón y una build al azar.              |
| O2 | Minijuego de adivinar el campeón: la app te muestra una imagen o una pista y tienes que adivinar cuál es el campeón. |

---

## 5 · Pantallas

| Pantalla              | Para qué sirve                                                           | Se llega desde                                  |
|-----------------------|--------------------------------------------------------------------------|-------------------------------------------------|
| Lista de partidas     | Ver todas tus partidas guardadas y filtrarlas por campeón o resultado.   | (arranque)                                      |
| Detalle de partida    | Ver una partida en concreto con sus fotos, notas, datos... y compartirla | Lista de partidas                               |
| Formulario de partida | Apuntar una partida nueva o editar una que ya tienes.                    | Lista de partidas / Detalle de partida          |
| Ajustes               | Preferencias del usuario                                                 | Lista de partidas (Menú parte superior derecha) |

**OPCIONALES:**


| Pantalla             | Para qué sirve                                                 | Se llega desde           |
|----------------------|----------------------------------------------------------------|--------------------------|
| Randomizador         | Si no sabes qué jugar te escoge un campeón y una build al azar | Lista de partidas (Menú) |
| Adivina el personaje | Se muestra una imagen o una pista y dices qué campeón es       | Lista de partidas (Menú) |



---

## 6 · Bocetos

> Dibuja las pantallas principales. A mano y fotografiado es válido.
> Pega aquí las imágenes o indica el nombre de los archivos adjuntos.
> 
> ![Pantalla 1.png](res/Pantalla%201.png)
> ![Pantalla 2.png](res/Pantalla%202.png)
> ![Pantalla 3.png](res/Pantalla%203.png)

---

## 7 · Qué datos guarda la app

| Tipo de dato | Campos                                     | Ejemplo                                                               |
|--------------|--------------------------------------------|-----------------------------------------------------------------------|
| Partida      | id,campeón,linea,resultado,KDA,fecha,notas | 12,Yasuo, mid, victoria, 8/2/5, 8/12/2026, el jungla no me gankeó.... |
| Foto         | id,partida, imagen, tipo                   | 3,12,(imagen), score/gráficos/estadísticas                            |

Notas: El campeón se elige escribiendo su nombre en un buscador con autocompletado. Al seleccionarlo la app te muestra la imagen de ese campeón. Lo que se guarda en la partida es solo el nombre, ya que la imagen se pide a Riot usando el nombre del campeón.

---

## 8 · Encaje con los requisitos del módulo

> Apartado obligatorio: ninguna casilla puede quedar vacía.

| Requisito                                                             | Dónde encaja en tu app                                                                                                                                                                                                                                                              | Tema |
|-----------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------|
| **Persistencia de datos** — la información sobrevive al cerrar la app | Todos los datos registrados de las partidas se quedan guardadas en el móvil                                                                                                                                                                                                         | 4 |
| **Servicio web** — la app consulta datos por internet                 | la app se conecta a los servidores de Riot(Data Dragon) para cargar las imágenes de los campeones, sus datos,items y runas                                                                                                                                                          | 5 |
| **Sensor o localización**                                             | Acelerómetro para el randomizador: agitas el móvil y la app te elige campeón y build al azar. <br/>La cámara para el registro de partidas: Para hacer fotos del post-game, sin tener que hacer capturas de pantalla y luego subirlas (aunque estarían las dos opciones disponibles) | 6 |
| **Contenido multimedia** — foto, audio, vídeo o animación             | Cada partida puede llevar hasta 3 fotos del post-game (del score, de las estadísticas o de los gráficos), y son opcionales                                                                                                                                                          | 7 |

---

## 9 · Riesgos

| Lo que me preocupa                                                                            | Plan B                                                                                                                                     |
|-----------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------|
| Conectarme a los servidores de Riot para cargar imágenes y datos de campeones, ítems y runas. | Si la conexión falla o Riot cambia algo, la app tira de imágenes genéricas guardadas en el móvil y muestra los datos básicos que ya tenga. |
| Que el randomizador con el acelerómetro me cueste más de lo esperado                          | Si se complica, quito el sensor y dejo el randomizador como un simple botón que te elige campeón y build al pulsarlo.                      |
| Recortar las imágenes de los campeones para el minijuego de adivinar                          | Cambio el minijuego y lo dejo solo con mostrar una pista de texto (como rol o habilidad) y que el usuario adivine el campeón.              |
| La opción de compartir no funcione bien                                                       | Dejo una opción de guardar la partida como imagen en el móvil y que se comparta desde la propia galería.                                   |
| La cámara no funcione bien                                                                    | Si falla, dejo solo elegir una imagen de la galería                                                                                        |

---

## Antes de entregar

- [ ] La idea cabe en una frase.
- [ ] El público es una persona concreta, no «todo el mundo».
- [ ] Hay **3 o 4** funcionalidades imprescindibles, no diez.
- [ ] Cada funcionalidad imprescindible tiene su pantalla.
- [ ] Hay bocetos de las pantallas principales.
- [ ] **Las cuatro casillas del apartado 8 están rellenas.**
- [ ] Está identificado al menos un riesgo con su plan B.