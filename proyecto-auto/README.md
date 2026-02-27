# Práctica de Programación Orientada a Objetos (POO) - Java 

Este proyecto contiene una implementación básica de los conceptos fundamentales de la POO utilizando el ejemplo de un sistema de **Autos**.

##  Conceptos Aplicados

A continuación, se describen los pilares utilizados en el desarrollo de esta práctica:

### 1. La Clase (Plantilla)
Es el molde o plano que define cómo será un objeto. Se utiliza para agrupar datos y comportamientos, evitando repetir código innecesariamente.
* *En este proyecto:* La clase `Auto`.

### 2. El Objeto (Instancia)
Es la unidad de código que se crea a partir de la clase. Mientras la clase es el "plano", el objeto es el "auto real" con datos específicos.

### 3. Los Atributos (Propiedades)
Son las características que definen al objeto. Es el lugar donde se almacena la información.
* **Ejemplos:** Marca, modelo, nivel de gasolina.

### 4. Los Métodos (Acciones)
Representan las funciones o comportamientos que el objeto puede realizar.
* **Ejemplos:** `acelerar()`, `recargar()`, `encender()`.

---

##  Guía de Ejecución

Puedes ejecutar este proyecto de dos formas:

### Opción A: Usando Maven (Recomendado)
Si tienes Maven configurado en tu sistema:
```bash

# 1. Compilar
mvn clean compile

# 2. Ejecutar
mvn exec:java -Dexec.mainClass="com.actividad.Main"
```

### Opción B: Ejecución manual 
Si no tienes Maven en el PATH, usa los comandos nativos de Java desde la raíz del proyecto

```bash
# 1. Compilar
javac -d target/classes src/main/java/com/actividad/*.java

# 2. Ejecutar
java -cp target/classes com.actividad.Main
---
```

## 🧐 Reflexión sobre Modificadores de Acceso

En esta práctica, los atributos se mantuvieron con acceso directo para facilitar el aprendizaje de la interacción objeto-plantilla. Sin embargo, en entornos profesionales se utiliza el **Encapsulamiento** mediante el modificador `private`.

**¿Por qué usar `private` en el futuro?**
1. Para proteger la integridad de los datos.
2. Para implementar métodos `get` (leer) y `set` (escribir) que validen la información.
3. Para seguir las buenas prácticas de diseño de software (Ocultamiento de información).