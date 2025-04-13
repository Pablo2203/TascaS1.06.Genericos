# ⚙️ Proyecto de Genéricos en Java

## 📄 Descripción - Enunciado del ejercicio

Este proyecto consiste en una serie de ejercicios prácticos sobre genéricos en Java, organizados en tres niveles de dificultad. A lo largo de los ejercicios se implementan y refuerzan conceptos como el uso de clases y métodos genéricos, interfaces, clases abstractas y listas de argumentos genéricos.

### **Nivel 1**
1. **Ejercicio 1:**  
   Crear una clase llamada `NoGenericMethods` que almacene tres argumentos del mismo tipo, con métodos para manejar dichos objetos. Los argumentos deberán poder ubicarse en cualquier posición al llamar al constructor.

2. **Ejercicio 2:**  
   Crear una clase llamada `Persona` con los atributos `nombre`, `apellido` y `edad`. A partir de esto, implementar una clase `GenericMethods` con un método genérico que acepte tres argumentos (de cualquier tipo) y los imprima por pantalla. En el método `main()` de la clase principal, se debe probar el método con tipos diferentes de parámetros.

---

### **Nivel 2**
1. **Ejercicio 1:**  
   Modificar el ejercicio genérico anterior para que uno de los tres argumentos del método genérico no sea genérico.

2. **Ejercicio 2:**  
   Ajustar el ejercicio anterior para que los argumentos del método genérico sean una lista de argumentos de variable indefinida.

---

### **Nivel 3**
1. **Ejercicio 1:**  
   Este nivel se enfoca en la creación de una interfaz y varias clases para experimentar con límites de tipos genéricos.  
   - Crear una interfaz llamada `Telefono` con un método `llamar()`.  
   - Desarrollar una clase `Smartphone` que implemente la interfaz y defina un método adicional, `hacerFotos()`.  
   - Crear una clase `Generica` con dos métodos genéricos:  
       - El primero recibe un argumento limitado por la interfaz `Telefono`.  
       - El segundo recibe un argumento limitado por la clase `Smartphone`.  
   - En el `main()` de la clase principal, llamar a ambos métodos genéricos pasando un objeto de la clase `Smartphone`.  

**Reflexión:**  
¿El método limitado por la interfaz `Telefono`, de la clase `Generica`, puede llamar al método `hacerFotos()`?

---

## 💻 Tecnologías Utilizadas

- Lenguaje: **Java 24**
- IDE: **IntelliJ IDEA 2024.3.5 Ultimate Edition**
- Estilo de codificación: Basado en el documento de buenas prácticas del Sprint 0.
- Opciones de proyecto: Maven, Gradle o solo Java.

---

## 📋 Requisitos

- **Java Development Kit (JDK):** Versión 17 o superior.
- **IntelliJ IDEA:** Versión compatible con Java 24 (2024.3.5 o más reciente).
- **Maven o Gradle:** (opcional, dependiendo de la configuración del proyecto).
- Sistema operativo compatible: macOS, Windows o Linux.

---

## 🛠️ Instalación

1. **Clonar el repositorio:**  
   Clona este repositorio desde GitHub en tu entorno local:
   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git
   ```

2. **Abrir el proyecto en IntelliJ IDEA:**  
   Abre IntelliJ IDEA, selecciona la opción `Open or Import`, y navega al directorio del proyecto.

3. **Configurar SDK:**  
   - Ve a `File > Project Structure > SDK`.
   - Selecciona la versión del JDK requerida (17 o superior).

4. **(Opcional) Configurar Maven/Gradle:**  
   - Si el proyecto está configurado con Maven o Gradle, asegúrate de que las dependencias se descarguen correctamente.

---

## ▶️ Ejecución

1. **Seleccionar la clase principal:**
   - Asegúrate de que tu clase principal (como `Main`) esté configurada como el punto de entrada para el proyecto.

2. **Ejecutar desde IntelliJ IDEA:**
   - Haz clic con el botón derecho en la clase principal (`Main`) y selecciona la opción `Run`.

3. **Resultados esperados:**
   - Cada ejercicio generará salidas en la consola según lo indicado en el enunciado. Asegúrate de probar con los diferentes ejemplos explicados.

---

## 🌐 Despliegue

Este proyecto no está diseñado para un entorno de producción, ya que es un conjunto de ejercicios conceptuales. Sin embargo, puedes empaquetar el proyecto como un archivo `.jar` para ejecutarlo en cualquier máquina con Java instalado:

1. **Crear un archivo `.jar:`**
   - Si utilizas Maven, ejecuta:
     ```bash
     mvn package
     ```
   - Si utilizas Gradle:
     ```bash
     gradle build
     ```

2. **Ejecutar el archivo `.jar`:**
   ```bash
   java -jar nombre_del_proyecto.jar
   ```

---

## 🤝 Contribuciones

Aunque este proyecto es educativo, siempre puedes sugerir mejoras o abrir un `pull request` en el repositorio principal:

1. **Crear un fork del repositorio:**  
   Haz clic en "Fork" en GitHub para crear una copia del proyecto en tu perfil.

2. **Realizar tus cambios:**  
   Realiza los cambios y mejoras en la rama principal o en una rama separada.

3. **Abrir un pull request:**  
   Envía tu contribución abriendo un `pull request` en el repositorio original.

---

¡Gracias por leer esta guía! Si tienes preguntas o necesitas aclaraciones, no dudes en abrir una incidencia en GitHub. 😊
