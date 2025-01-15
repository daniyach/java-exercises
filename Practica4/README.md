# Práctica 4 - Ejercicio 1: **Métodos**

## Objetivos
El ejercicio busca que el estudiante desarrolle habilidades relacionadas con el manejo de métodos en Java, tales como:

1. **Implementar métodos** para ser llamados desde el método principal (`main()`) u otros métodos.
2. **Declarar la cabecera** y definir el cuerpo de un método.
3. **Definir parámetros de entrada** en los métodos.
4. **Devolver valores** mediante `return`.
5. **Llamar métodos desde otros métodos**, incluyendo el uso de `main()`.
6. **Entender y usar métodos sobrecargados**, es decir, métodos con el mismo nombre pero diferentes parámetros.

---

## Programa a realizar

Se deben implementar **6 métodos** en total, divididos en dos categorías principales: métodos de lectura de datos y métodos sobrecargados.

---

### **Métodos de lectura de datos (Métodos 1, 2 y 3)**

Estos métodos permiten leer datos desde el teclado de diferentes tipos: enteros, números reales y cadenas de texto.

#### **Método 1: `readInt`**
- **Propósito**: Solicitar al usuario un número entero, leerlo desde el teclado y devolverlo.
- **Cabecera**:
  ```java
  public static int readInt(String ask)
- **Detalles**:

1. El parámetro `ask` es una cadena que contiene la pregunta a mostrar al usuario, por ejemplo, ``"Introduce un número entero"``.
2. El método debe eliminar los espacios en blanco al inicio y al final de la cadena.
3. Si el texto no tiene un 

