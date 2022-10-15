## Introducción 📖

Progama de hecho para deint en el curso 22-23, es un juego para adivinar el numero, el programa consiste en tres activity, en la primera pedimos Pedimos los datos al usuario en la segunda se produce un juego y en la tercera te dice que has ganado y el numero de intentos.

## Programación ⌨️
Para comenzar la aplicació comienza en el ConfigActivity en el que pedimos al usuario sus datos,
en este codigo podemos ver que con un binding recogemos los datos los almacenamos en un bundle
y los enviamos mediante un intent.
El la siguiente clase PlayActivity Es la clase donde producimos el juego, he hecho uso de la clase Random
Para el numero aleatorio y consiste en comparar el numero del usuario con el generado
En la tarcera clase EndPlayActivity podemos ver como recojo los datos que he enviado en el intent y seteo el numero de intentos
en el textView Final.
y para terminar tengo mi clase Message que es la que controla el nombre del jugador , los intentos el numero oculto y si has ganado o perdido.


## Ejecutando las pruebas ⚙️

Para comenzar podemos ver algo parecido a lo siguiente
![Captura10](https://user-images.githubusercontent.com/72571218/137601392-a26b01ed-da55-4692-b675-15b1e033cb51.PNG)
En esta aplicación los dos campos son obligatorios y si no nos avisa con un mensaje flotante
![Captura5](https://user-images.githubusercontent.com/72571218/137601303-19ec741d-a796-48ef-9f7d-b8bf94c14682.PNG)

La aplicación esta en ingles y español pero el emulador utilizado es en ingles por lo que las capturas se verán en dicho
idioma, en las siguientes imagenes veremos que pasa cuando es o mas alto o mas bajo el numero
![Captura7](https://user-images.githubusercontent.com/72571218/137601309-3346f412-21e0-4e11-95a1-bca700271c43.PNG)
![Captura8](https://user-images.githubusercontent.com/72571218/137601311-819c7426-202c-400e-a942-b550bfddaaa9.PNG)
Y en las siguientes imagenes podemos ver como es la interfaz cuando ganamos o perdemos el juego

Imagen del ganador
![image](https://user-images.githubusercontent.com/72571218/196005157-fcd76a03-0dc2-4f4d-aa42-4c4f042810a9.png)

Imagen del perdedor
![image2](https://user-images.githubusercontent.com/72571218/196005183-59e8177a-42e8-439d-a446-8e26407c71bf.png)

