DROP TABLE IF EXISTS empleados;

CREATE TABLE empleados (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL,
  trabajo VARCHAR(255) NOT NULL,
  salario FLOAT(53) NOT NULL
);

INSERT INTO empleados (nombre, trabajo, salario) VALUES ('Jose Marin', 'PROGRAMADOR', 3000.00);
INSERT INTO empleados (nombre, trabajo, salario) VALUES ('Paul Stanescu', 'DISEÑADOR', 2500.00);
INSERT INTO empleados (nombre, trabajo, salario) VALUES ('Nombre Deotro', 'GERENTE', 5000.00);
INSERT INTO empleados (nombre, trabajo, salario) VALUES ('Nose Quemasponer', 'VENDEDOR', 2000.00);
