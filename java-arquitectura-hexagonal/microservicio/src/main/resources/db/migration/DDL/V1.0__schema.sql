create table usuario (
 id int(11) not null auto_increment,
 nombre varchar(100) not null,
 clave varchar(45) not null,
 fecha_creacion datetime null,
 primary key (id)
);

CREATE TABLE `autorenting`.`auto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `placa` VARCHAR(45) NOT NULL,
  `tipoCombustible` VARCHAR(45) NOT NULL,
  `rentado` TINYINT NOT NULL,
  PRIMARY KEY (`id`));