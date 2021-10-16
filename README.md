## Introducción 📖

Progama de hecho para deint en el curso 21-22, el programa consiste en tres activity, en la primera pedimos Pedimos los datos al usuario en la segunda se produce un juego y en la tercera te dice que has ganado y el numero de intentos.

## Programación ⌨️
Para comenzar la aplicació comienza en el ConfigActivity en el que pedimos al usuario sus datos,
en este codigo podemos ver que con un binding recogemos los datos los almacenamos en un bundle
y los enviamos mediante un intent:
![Captura1](https://user-images.githubusercontent.com/72571218/137601299-933a607a-95ea-4e53-821a-9ba144df9e54.PNG)

El la siguiente clase PlayActivity Es la clase donde producimos el juego he hecho uso de la clase Random
Para el numero aleatorio y consigiste en comparar el numero del usuario con el generado
![Captura2](https://user-images.githubusercontent.com/72571218/137601300-d5395b61-cead-4c8b-a26a-b4cc35b08a3a.PNG)

En la tarcera clase podemos ver como recojo los datos que he enviado en el intent y seteo el numero de intentos
en el textView Final
![Captura3](https://user-images.githubusercontent.com/72571218/137601301-c88ba187-c904-48c6-b337-d61b2781bfb8.PNG)
y para terminar tengo mi clase Message que es la que controla el nombre del jugador y los intentos
![Captura4](https://user-images.githubusercontent.com/72571218/137601302-48f2721b-aba7-4cbe-9dbf-a66ec2d0edc2.PNG)

## Ejecutando las pruebas ⚙️

Para comenzar podemos ver algo parecido a lo siguiente
![Captura10](https://user-images.githubusercontent.com/72571218/137601392-a26b01ed-da55-4692-b675-15b1e033cb51.PNG)
En esta aplicación los dos campos son obligatorios y si no nos avisa con un mensaje flotante
![Captura5](https://user-images.githubusercontent.com/72571218/137601303-19ec741d-a796-48ef-9f7d-b8bf94c14682.PNG)

La aplicación esta en ingles y español pero el emulador utilizado es en ingles por lo que las capturas se verán en dicho
idioma, en las siguientes imagenes veremos que pasa cuando es o mas alto o mas bajo el numero
![Captura7](https://user-images.githubusercontent.com/72571218/137601309-3346f412-21e0-4e11-95a1-bca700271c43.PNG)
![Captura8](https://user-images.githubusercontent.com/72571218/137601311-819c7426-202c-400e-a942-b550bfddaaa9.PNG)
y en esta captura podemos ver que cuando completamos el numero de intentos se desactiva el boton para que no puedas jugar
hasta que reinicies el juego con el boton restart
![Captura9](https://user-images.githubusercontent.com/72571218/137601313-2f88eaf5-e882-4964-abcb-cab93b54aebe.PNG)
y para terminar esta es la pantalla que se muestra cuando hemos ganado el juego
![Captura6](https://user-images.githubusercontent.com/72571218/137601308-070138ea-b4a4-4916-81b2-86aa75113473.PNG)


