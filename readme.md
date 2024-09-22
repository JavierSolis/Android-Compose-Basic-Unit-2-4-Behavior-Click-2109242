<img src="android_compose_head.png" alt="android jetpack compose android basics" style="width:100%;"/>

# Courses Android Compose Basic - Solution Code #AndroidBasics

# Training > Android Basics with Compose > Building App UI > Add a button > 4/Practice: Click behavior

---

Solution code for the Android Basics with Compose

Exercise source: https://developer.android.com/codelabs/basic-android-kotlin-compose-business-card?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-business-card#0

# Description

------------


## [2\. Descripción general de la app](https://developer.android.com/codelabs/basic-android-kotlin-compose-button-click-practice-problem?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-2&hl=es-419#1)

## 

Nos ayudarás a hacer realidad nuestra idea de crear limonada digital. El objetivo es crear una app interactiva y sencilla que te permita exprimir limones cuando presiones la imagen en pantalla hasta beber un vaso de limonada. Puedes considerarla una metáfora o tal vez solo una manera divertida de pasar el tiempo.

![dfcc3bc3eb43e4dd.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-button-click-practice-problem/img/dfcc3bc3eb43e4dd.png?hl=es-419)

La app funciona de la siguiente manera:

1.  Cuando el usuario inicia la app por primera vez, ve un limonero. Una etiqueta le indica que presione la imagen del limonero para "seleccionar" un limón.
2.  Después de que presiona el limonero, el usuario ve un limón. Se le solicita que presione el limón para "exprimirlo" y preparar la limonada. Debe presionar el limón varias veces para exprimirlo. La cantidad de presiones necesarias para exprimir el limón es diferente cada vez y es un número entre 2 y 4 (inclusive) generado de forma aleatoria.
3.  Después de presionar el limón la cantidad requerida de veces, verá un refrescante vaso de limonada. Se le solicita que presione el vaso para "beber" la limonada.
4.  Después de presionar el vaso de limonada, ve un vaso vacío. Se le pide que presione el vaso vacío para volver a empezar.
5.  Después de presionar el vaso vacío, ve el limonero y puede volver a comenzar el proceso. ¡Otra limonada, por favor!

A continuación, se muestran capturas de pantalla más grandes del aspecto de la app:

![](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-button-click-practice-problem/img/5384eedd313cb5a9.png?hl=es-419)

![](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-button-click-practice-problem/img/89cec3022a462039.png?hl=es-419)

![](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-button-click-practice-problem/img/513e4b0ee349a4d2.png?hl=es-419)

![](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-button-click-practice-problem/img/9dbd92f4413c186e.png?hl=es-419)

Para cada paso de la preparación de limonada, hay una imagen y una etiqueta de texto diferentes en la pantalla, y diferentes comportamientos para la respuesta de la app ante un clic. Por ejemplo, cuando el usuario presiona el limonero, la app muestra un limón.

Tu trabajo es crear el diseño de la IU de la app e implementar la lógica para que el usuario recorra todos los pasos necesarios para preparar la limonada.