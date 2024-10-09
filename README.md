Aquí tienes el contenido completo del archivo `README.md`, incluyendo todos los apartados que mencionaste:


# 📄 Descripción

Este proyecto se compone de varios ejercicios que permiten trabajar con la manipulación de archivos y directorios en Java. Los ejercicios son los siguientes:

- **Ejercicio 1:** Crea una clase que liste alfabéticamente el contenido de un directorio recibido por parámetro.
- **Ejercicio 2:** Añade a la clase del ejercicio anterior, la funcionalidad de listar un árbol de directorios con el contenido de todos sus niveles (recursivamente) de forma que se impriman en pantalla en orden alfabético dentro de cada nivel, indicando además si es un directorio (D) o un archivo (F), y su última fecha de modificación.
- **Ejercicio 3:** Modifica el ejercicio anterior. Ahora, en lugar de mostrar el resultado por la pantalla, guarda el resultado en un archivo TXT.
- **Ejercicio 4:** Añade la funcionalidad de leer cualquier archivo TXT y muestra su contenido por consola.
- **Ejercicio 5:** Ahora el programa debe serializar un Objeto Java a un archivo .ser y después debe deserializarlo.

## 💻 Tecnologías Utilizadas

- Java JDK 22
- IntelliJ IDEA
- Maven

## 📋 Requisitos

- JDK 22 o superior instalado.
- IntelliJ IDEA o cualquier otro IDE compatible con Java.
- Dependencias de Maven configuradas.

## 🛠️ Instalación

1. Clona el repositorio en tu máquina local usando el comando:
   ```bash
   git clone <https://github.com/CatalinBarsan/1.5-Java-Utils.git>
   ```
2. Navega al directorio del proyecto:
   ```bash
   cd <src/main/resources/Directory01>
   ```
3. Si estás usando Maven, ejecuta el siguiente comando para descargar las dependencias:
   ```bash
   mvn install
   ```

## ▶️ Ejecución

Para ejecutar los ejercicios, sigue estos pasos:

1. Abre el proyecto en tu IDE.
2. Configura los argumentos de línea de comandos según sea necesario.
3. Ejecuta la clase principal de cada ejercicio.

Por ejemplo, para el ejercicio 5, asegúrate de pasar la ruta del archivo .ser como argumento.

## 🌐 Despliegue

Para desplegar el proyecto en un entorno de producción, sigue estos pasos:

1. Asegúrate de que todas las dependencias estén correctamente instaladas.
2. Compila el proyecto usando:
   ```bash
   mvn clean package
   ```
3. Copia el archivo JAR resultante al servidor de producción y ejecútalo con:
   ```bash
   java -jar <nombre del archivo>.jar
   ```

## 🤝 Contribuciones

Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tus cambios:
   ```bash
   git checkout -b mi-nueva-caracteristica
   ```
3. Realiza tus cambios y haz commit:
   ```bash
   git commit -m 'Añadí una nueva característica'
   ```
4. Envía tu rama al repositorio remoto:
   ```bash
   git push origin mi-nueva-caracteristica
   ```
5. Crea un Pull Request para que se revisen tus cambios.
```