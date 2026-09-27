# Kata 1 - Ingeniería de Software II (IS2)

## 1. Objetivo de la entrega
El objetivo de esta Kata es practicar el desarrollo incremental y la automatización de flujos de trabajo en Java mediante:
- Modelado de dominio simple (cálculo de edad a partir de una fecha de nacimiento).
- Refactorización de código clásico a estructuras modernas (`record` de Java).
- Aplicación estricta de buenas prácticas de control de versiones con Git (flujo Gitflow).
- Adquisición de fluidez y soltura mediante la repetición deliberada del proyecto (*takes* o tomas) en un único repositorio.


## 2. Cómo compilar y ejecutar

-Desde IntelliJ IDEA-

1º.Abrir el proyecto en IntelliJ.

2º.Navegar hasta la clase src/main/java/software/ulpgc/kata1/Main.java.

3º.Hacer clic en el botón de Run en la parte superior (o presionar Shift + F10).

## 3. Dependencias y versión de JDK

Lenguaje: Java 26 (OpenJDK / Temurin).

Gestor de proyectos: Maven 3.x.

Entorno de desarrollo (IDE): IntelliJ IDEA.

Dependencias externas: No requiere dependencias externas adicionales (se utilizan librerías nativas del JDK como java.time.LocalDate).

Desde línea de comandos (Terminal)
- Limpiar y compilar el proyecto con Maven
- mvn clean compile

- Ejecutar la aplicación
- mvn exec:java -Dexec.mainClass="software.ulpgc.kata1.Main"

## 4. Estructura de la entrega y clases principales

kata1/
- ├── .idea/                 # Configuraciones del IDE (módulos XML, compilador)
- ├── src/
- - │   └── main/
- - - │         └── java/
- - - - │              └── software/ulpgc/kata1/
- - - - - │                   ├── Main.java      # Punto de entrada de la aplicación
- - - - - │                   └── Person.java    # Modelo de dominio (record)
- ├── .gitignore             # Exclusión de binarios y temporales (target/)
- ├── pom.xml                # Configuración del proyecto Maven
- └── README.md              # Documentación del repositorio


Descripción de Clases principales:
- Person.java: Define el objeto de dominio refactorizado a record. Contiene los atributos de la persona (name, birthDate), la constante DAYS_PER_YEAR = 365.25 para evitar números mágicos y el método getAge() que calcula la edad en años basándose en LocalDate junto con toYears().

- Main.java: Clase ejecutable que instancia objetos Person e imprime por consola sus datos y la edad calculada para verificar el correcto funcionamiento.

## 5. Flujo Git usado
Se ha seguido un flujo basado en Gitflow:

- Rama master: Contiene exclusivamente versiones estables y probadas, resultantes de la fusión al finalizar cada repetición.

- Rama develop: Rama activa donde se han registrado de forma incremental todos los commits evolutivos del desarrollo.

Flujo de trabajo:

- 1º. Se realizan los cambios evolutivos y commits en develop.

- 2º. Tras completar la versión de la toma o repetición x, se pasa a master (checkout) y se realiza el merge de develop (resolviendo conflictos mediante Accept Theirs si corresponde).

- 3º. Se sincroniza con GitHub mediante push (tanto para develop como para master)

- Exclusión de archivos: Se garantizó mediante .gitignore que la carpeta de compilados target/ y binarios .class entre otros no se subieran al repositorio.

## 6. Clonación y verificación fuera de la carpeta original

Para verificar que el proyecto es autocontenido y compila fuera del entorno inicial, se ejecutaron los siguientes pasos en un directorio limpio:

EN INTELLIJ IDEA:
- 1. Ctrl + Shift + A y buscar palabra clave "clone".

- 2. Version de control por defecto Git.

- 3. La URL introducida del repositorio en GitHub (Code): https://github.com/alejandrozerong-ai/kata1.git

- 4. Nuevo directorio para la ubicación del clon y dar a "Clone".

EN TERMINAL:
- 1. Clonar el repositorio único desde GitHub.
git clone [https://github.com/alejandrozerong-ai/kata1.git](https://github.com/alejandrozerong-ai/kata1.git)

- 2. Acceder al directorio.
cd kata1

- 3. Compilar el proyecto con Maven para verificar que no faltan archivos.
mvn clean compile

## 7. Vídeo explicativo

- Enlace al vídeo: https://youtu.be/-BPbFPiITes?si=LbkafKLIQWlEq7x9
- Duración: 6:47 minutos (< 7 min)

## 8. Repeticiones de la kata

Para fijar el aprendizaje y ganar agilidad, la Kata se repitió un total de 3 veces (tomas) mediante clonados limpios del mismo repositorio:

- Toma 1 (Original): Creación del proyecto base Maven, clase Person tradicional y clase Main.


- Toma 2 (Repetición 1): Clonado en carpeta limpia, checkout a develop, refactorización de la clase Person a record de Java, extracción de la constante DAYS_PER_YEAR y resolución de conflictos al hacer el merge con master.


- Toma 3 (Repetición 2): Clonado en carpeta limpia, checkout directo e inmediato a develop antes de teclear para mantener una historia de Git continua, refactorización completa y posterior integración en master.

## 9. Evidencias de verificación o pruebas realizadas

- Verificación de consola: La ejecución del método main muestra la salida formateada con los datos de la persona y el cálculo de edad correcto en función de la fecha actual.


- Pruebas con Debugger: Se situó un breakpoint en el método de cálculo de edad para inspeccionar los valores temporales de LocalDate.now() y birthDate en tiempo de ejecución.


- Verificación de atajos (Shortcuts): Uso comprobado de Ctrl + Shift + A (Find Action), F2 (Edit Commit Message en el historial de Git) y Ctrl + Alt + S (Keymap) entre otros.


- Estructura limpia: Se verificó en GitHub que únicamente existen archivos fuente Java y de configuración (XML/pom.xml), sin presencia de binarios compilados ni la carpeta target/...

