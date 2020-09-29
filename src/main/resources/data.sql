DROP TABLE IF EXISTS persona;
DROP TABLE IF EXISTS departamento;
 
CREATE TABLE persona (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  apellidos VARCHAR(250) NOT NULL,
  edad INT DEFAULT NULL
);

CREATE TABLE departamento (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nombre VARCHAR(250) NOT NULL,
  descripcion VARCHAR(250) NOT NULL
);


INSERT INTO persona (nombre, apellidos, edad) VALUES
  ('Andres', 'Antunez', 34),
  ('Beatriz', 'Benitez', 22),
  ('Conrado', 'Cabello', 65);

INSERT INTO departamento (nombre, descripcion) VALUES
  ('Dep1', 'Departamento 1'),
  ('Dep2', 'Departamento 2'),
  ('Dep3', 'Departamento 3');
  