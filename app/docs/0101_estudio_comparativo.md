Las 3 tecnologías que he escogido para su comparación son: Android nativo, React Native y PWA.



### ANDROID STUDIO:

1. **Lenguaje y herramientas necesarias:** El lenguaje recomendado es kotlin pero también se puede utilizar java. Las herramientas necesarias son Android Studio, que es el IDE y Android SDK que es el conjunto de herramientas, librerías y APIS de Android que se necesitan para crear una app.
2. **Plataformas que soporta:** Teléfonos móviles y tablets, relojes inteligentes, automóviles, televisores, dispositivos XR, TPVs...
3. **Rendimiento y acceso al hardware:** En cuanto al rendimiento destacamos la velocidad de ejecución, ya que el desarrollo nativo se comunica de forma directa con el sistema operativo sin traducciones ni puentes intermedios. El acceso al hardware en el desarrollo nativo de Android funciona mediante una arquitectura de capas que conecta la aplicación que hemos creado con los componentes físicos de un dispostivo de forma descencente (desde el nivel de la aplicación hasta el nivel del núcelo y sus controladores).
4. **Coste de desarrollo y mantemiento:** El coste de desarrollo se determina por el tiempo de entrega y lo complejo que sean las funciones del sistema (Tabla de precios). En cuanto al coste de mantenimeinto y actualizaciones el coste oscilaría entre 200 - 1000€ / mes. Ya que android lanza nuevas versiones del sistema operativo de forma regular y la app que has creado debe mantenerse compativle. Parches de seguridad, correciones de errores y mejoras son continuos.

| Tipo de aplicación           | Coste promedio     | Tiempo de entrega |
|------------------------------|--------------------|-------------------|
| App informativa              | 3.000€ - 8.000€    | 3 - 6 semanas     |
| App de pedidos               | 8.000€ - 15.000€   | 2 - 3 meses       |
| App de e-commerce            | 15.000€ - 30.000€  | 3 - 5 meses       |
| SaaS/ Marketplace            | 25.000€ - 50.000€  | 4 - 7 meses       |
| Sistema empresarial complejo | 40.000€ - 60.000+€ | 6 - 10+ meses     |


5. **Caso de uso:** Una aplicación para las personas que quieran tener buenos hábitos en alimentación, ejercicio, meditación... funciona mejor con el desarrollo nativo porque el rendimiento garantiza una reproducción fluida de video, mientras que las nofiticaciones incluyen recordatorios diarios. El modo sin conexión permite a los usuarios mantenerse al dia con las rutinas desde cualquier lugar.


### REACT NATIVE:

1. **Lenguaje y herramientas necesarias:** Se usa JavaScript o TypeScript. Para escribir el código usas Visual Studio Code y Expo (o React Native CLI). Aunque sea multiplataforma, para sacar la app final sigues necesitando Android Studio (para Android) y Xcode (para iOS, que exige tener un Mac).
2. **Plataformas que soporta:** Android e iOS a la vez con un único código. También se puede adaptar para web, televisores inteligentes y ordenadores.
3. **Rendimiento y acceso al hardware:** El rendimiento es casi nativo pero en tareas muy pesadas, como en juegos 3D, se nota que no lo es al 100%. En cuanto al acceso al hardware se puede conectar a la cámara, GPS o Bluetooth mediante librerías intermedias. Si la API del hardware es muy nueva o complicada, hay que escribir código a mano.
4. **Coste de desarrollo y mantenimiento:** El coste de desarrollo varía según la complejidad de la aplicación, sus características y la ubicación del equipo de desarrollo. Para una aplicación sencilla el costo puede oscilar entre 30.000€ y 50.000€; las aplicaciones más complejas pueden costar entre 60.000€ y 90.000€, mientras que las aplicaciones con amplias funciones e integraciones pueden costar más de 100.000€, incluso 300.000€. El coste de su mantenimiento oscila entre los 4.000€ y los 12.000€ al año (con developer a 50-80€ la hora).
5. **Caso de uso:** Una aplicación para reservas (hotel,restaurante,peluquería..) ya que necesitas llegar a todos tus clientes ya usen iPhone o Android, sin gastar más presupuesto.

### PWA

1. **Lenguaje y herramientas necesarias:** Se utiliza HTML, CSSS y JavaScript. Para programar solo se usa Visual Studio Code y un navegador para probarlo.
2. **Plataformas que soporta: En todas partes.** Ya que al ser una web adaptada funciona igual en Android, iPhone, Windows o Mac.
3. **Rendimiento y acceso al hardware:** Es más lenta que una app normal porque corre dentro del navegador. Para leer o rellenar datos funciona bien, pero pierde fluidez si metemos animaciones complejas o mucha carga gráfica. El acceso al hardware es bastante limitado, sobre todo en iPhone ya que Apple restringe varias funciones. Puedes usar la cámara o la ubicación de forma básica pero no te vale si necesitas conectar dispositivos por Bluetooth.
4. **Coste de desarrollo y mantenimiento:** El coste de desarrollo cuesta entre 6.000€ y 25.000€. El coste de mantenimiento anual equivaldría al 10 -15% del coste de desarrollo.
5. **Caso de uso:** Aliexpress es una aplicación PWA, antes de implementar PWA a su negocio los tiempos de carga de las páginas eran muy lentos, había altas tasas de rebote y falta de participación. Al implementar PWA Aliexpress ofreció un rendimiento ultrarrápido, acceso sin conexión y notificaciones push, garantizando así que cualquiera pudiera navegar y comprar sin interrupciones. 