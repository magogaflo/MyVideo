/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  paty
 * Created: 22 mar. 2021
 */

INSERT INTO Pelicula (nombre, descripcion,duracion,imagen,titulo_original) VALUES
  ( 'It','linda pelicula',108,'d','payaso asesino'),
  ( 'Logan','linda pelicula',110,'d','Logan'),
  ( 'Los Vengadores','linda pelicula',135,'d','Averger');


INSERT INTO Pais_Origen (id,idioma,nombre_pais) VALUES
  ( '1','Ingles','Estados Unidos'),
  ( '2','Ingles','Europea'),
  ( '3','Ingles','Estados Unidos');

INSERT INTO Genero (id,nombre_genero) VALUES
  ( '1','Terror'),
  ( '2','Drama'),
  ( '3','Accion');
INSERT INTO Calificacion (id,nombre_calificacion) VALUES
  ( '1','Buena'),
  ( '2','Regular'),
  ( '3','Buena');