
<h1>
  Geometry Dash
</h1>

<h4>Game developed for the subject of programming workshop in the University of <a href="https://www.umss.edu.bo/" > Mayor de san simon <a></h4>

<p>
  <a href="https://badge.fury.io/js/electron-markdownify">
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"
         alt="Gitter">
  </a>
  <a href="https://gitter.im/amitmerchant1990/electron-markdownify"><img src="https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white">
  </a>
</p>


![screenshot](https://github.com/RudyMontenegro/geometryDash-java/blob/main/srcReadme/tinyGP.gif) 

## Features

* Simulation of to short map and music to famos game Geometry Dash.
 
* I used different java freeware such as Jframe, IO, jl1.01 etc.
  
* The sound works for both the music and the collisions of the cube.

* The basic logic to create the layout of each map was to create a 50x500 matrix, which is printed 50x50 each time the player advances. 

* Each object such as the floor, block or thorn is filled with 1 in the matrix, and the player cube also has this value, so when the player advances, he checks if the next position on the Y axis has a value of 0 which is equal to empty or 1 which means that there is an object which triggers the collision.

* There are other objects such as the star that contains the value 2, which performs the sum of points.

* The hardest part of developing this game was creating the function that checks if the player collides with an object when jumping, it checks all the frames around them in every frame they jump.


## How To Test

To  [download](https://github.com/RudyMontenegro/geometryDash-java/blob/main/GeometryDash.zip) GeometryDash.zip, unzip and open with [VScode](https://code.visualstudio.com/) then install this extension:
![image info](https://github.com/RudyMontenegro/geometryDash-java/blob/main/srcReadme/pluginsVScode.png)

Then, localise main java class in the route: GeometryDash\geometryDash-java\src\Mecanismo\MenuInicio.java and play test:
![image info](https://github.com/RudyMontenegro/geometryDash-java/blob/main/srcReadme/playTest.png)

> **Note**
>
## This moment i try to make file .jar for easier testing





