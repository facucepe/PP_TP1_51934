# TP N°1 PARADIGMAS DE PROGRAMACION
## EVENTO UNIVERSITARIO
El proyecto insetado en el apartado "src" consiste en el desarrollo de un sistema de gestion de eventos universitarios, tanto para actividades, estudiantes, inscripciones, etc.
## ESTRUCTURA
El proyecto esta compuesto por las siguientes clases:
App.class, EventoUniversitario.class, Actividad.class, Charla.class, Taller.class, Estudiante.class, Insripcion.class, Sala.class
## DESCRIPCION DE CLASES
1. App.class: contiene al metodo mein y se utiliza para ejecutar y mostrar el funcionaminto del sistema creado y el funcionamiento del polimorfismo
se crean 3 estudiantes, 1 sala, 1 evento universitario, 1 mas alto, 1 charla y sus inscripciones correspondientes
2. EventoUniversitario.class: contiene informacion sobre los eventos creados (identificacion, titulo, costo, evento gratuito o no, sala asginada y lista de actividades), tambien permite crear actividades, calcular costo estimado.
3. Actividad.class: representa una actividad dele vento, contiene (identificacion, titulo, cupo maximo, lista de inscripciones), se pueden inscribir estuaintes y mostrar inscripciones.
4. Charla.class: es una clase heredada de Actividad.class, representa una charla, sel costro de materiales es $0
5. Taller.class: es una clase heredada de Actividad.class, representa un taller y requiere informacion sobre si requiere cuaderno, el costo de materiales es $5000 si requiere notebokk, $2000 si no reuqiere libreta
6. Estudiante.class: representa a un estudiante, contiene (legajo y nombre)
7. Incripcion.class: representa la inscripcion de un estudiante a una actividad (fecha, estado, referencia al estudiante, referencia a la actividad)
8. Sala.class: representa las salas disponibles del evento
## CONCEPTOS DE PROGRAMACION ORIENTADA A OBJETOS APLICADOS
Se aplican los sigueintes conceptos:
1. encapsulamiento: los atributos de las clases se mantienen privados y se acceden mediante metodos publicos
2. herencia: charla y taller heredan de la clase abstracta Actividad.class
