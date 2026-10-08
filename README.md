# epointis-tplp3-2026 - Minecraft POO & Spring Boot

Repositorio correspondiente al taller de Git y POO de Lenguaje de Programación 3.

## Dominio: Minecraft
Modelado de entidades de Minecraft basado en el diagrama de clases, aplicando herencia, polimorfismo, constructores sobrecargados y servicios REST con Spring Boot.

## Diagrama de Clases (Mermaid)
```mermaid
classDiagram
    class EntidadViva {
        <<abstract>>
        #String nombre
        #int vida
        #double altura
        +abstract String actuar()
    }
    class PersonajeJugable {
        -int hambre
        -boolean controlable
        +String actuar()
    }
    class Monstruo {
        -boolean hostil
        +String actuar()
    }
    EntidadViva <|-- PersonajeJugable
    EntidadViva <|-- Monstruo

## Cambios de Sobrecarga y Sobrescritura
- Sobrecarga (Overloading): Se implementaron múltiples constructores en las clases del dominio (por ejemplo, un constructor simple y un constructor sobrecargado que recibe nombre, vida y altura), lo que permite instanciar objetos con diferentes cantidades de datos asegurando un estado legal.
- Sobrescritura (Overriding): La clase abstracta EntidadViva define un método abstracto (como actuar()). Las clases hijas (PersonajeJugable, Monstruo, etc.) sobreescriben este método para definir su comportamiento propio y específico.

## Licencia
Este proyecto se distribuye bajo los términos de la licencia Apache 2.0.