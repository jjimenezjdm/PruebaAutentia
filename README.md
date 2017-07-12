# Autentia

## Descripción del proyecto

Proyecto realizado como parte del proceso de selección de Autentia.

Se ha implementado una pequeña web usando Spring, MyBatis y PrimeFaces que permite listar y crear cursos.

### Requisitos implementados

 - Desde la ventana inicial podremos ver el listado de los cursos existentes. Solo se muestran los cursos activos.
 - Desde el botón "Crear" podemos acceder a la página de creación de cursos.
 - Se han implementado test para todas las clases que se han creado.
 - Se ha usado MyBatis del tal forma que podemos intercambiar las bases de datos sin que eso afecte a la implementación de la web (ha sido probado con H2 y MySQL).
 - Todas las dependencias se han gestionado a través de Maven.
 - Se han usado las herramientas que se requerían (Spring, MyBatis, JSF2 con Primefaces).
 - Se ha generado un WAR para que la aplicación pueda ser desplegada de forma independiente.


## Implementación

Para implementar este proyecto se han usado las siguientes herramientas:

 - Spring Boot v1.5.4
 - PrimeFaces v6.1
 - MyBatis v1.3.0
 - MySQL driver 5.1.6

## Ejecución

Para ejecutar el proyecto, debemos de elegir entre ejecutarlo desde el fichero war o ejecutarlo compilando el código.

#### Ejecución desde el war

Debemos tener Tomcat v8 descomprimido en nuestro equipo.
Una vez que tengamos Tomcat, copiaremos el war de la aplicación en la carpeta de "webapps" dentro de la carpeta principal de Tomcat. Una vez lo tengamos copiado, abriremos una consola en la carpeta de atrás a esta y ejecutaremos el siguiente comando:

`.\bin\startup.bat`


#### Ejecución compilando el código
A través desde cualquier IDE que permita Java, daremos clic en la clase "Aplication" y a continuación le daremos a ejecutar.

### Aceder a la web

Para acceder a la aplicación desde un IDE cualquiera usaremos la URL:

[http://localhost:8080/index.jsf](http://localhost:8080/index.jsf)

Para acceder a la aplicación ejecutando desde Tomcat usaremos la URL:

[http://localhost:8080/autentia/index.jsf](http://localhost:8080/autentia/index.jsf)