-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema bdasesoria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdasesoria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdasesoria` DEFAULT CHARACTER SET utf8 ;
USE `bdasesoria` ;

-- -----------------------------------------------------
-- Table `bdasesoria`.`Sede`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Sede` (
  `sede_id` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`sede_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Estado` (
  `estado_id` CHAR(10) NOT NULL,
  `tipoestado` VARCHAR(45) NULL,
  `horario` VARCHAR(30) NULL,
  `fecha` DATE NULL,
  `observacion` VARCHAR(100) NULL,
  PRIMARY KEY (`estado_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Aula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Aula` (
  `aula_id` CHAR(10) NOT NULL,
  `sede_id` CHAR(10) NOT NULL,
  `salon` CHAR(6) NULL,
  `estado_id` CHAR(10) NOT NULL,
  PRIMARY KEY (`aula_id`, `sede_id`, `estado_id`),
  INDEX `fk_aula_sede1_idx` (`sede_id` ASC),
  INDEX `fk_Aula_Estado1_idx` (`estado_id` ASC),
  CONSTRAINT `fk_aula_sede1`
    FOREIGN KEY (`sede_id`)
    REFERENCES `bdasesoria`.`Sede` (`sede_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aula_Estado1`
    FOREIGN KEY (`estado_id`)
    REFERENCES `bdasesoria`.`Estado` (`estado_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Administrador` (
  `admin_id` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `mail` VARCHAR(60) NULL,
  `telefono` VARCHAR(45) NULL,
  `user` VARCHAR(45) NULL,
  `contrasena` VARCHAR(30) NULL,
  PRIMARY KEY (`admin_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Docente` (
  `docente_id` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `correo` VARCHAR(60) NULL,
  `especialidad` VARCHAR(60) NULL,
  `user` VARCHAR(45) NULL,
  `contrasena` VARCHAR(30) NULL,
  `web` CHAR(30) NULL,
  `descripcion` VARCHAR(100) NULL,
  `tipo` VARCHAR(45) NULL,
  PRIMARY KEY (`docente_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Asesoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Asesoria` (
  `asesoria_id` CHAR(10) NOT NULL,
  `curso` VARCHAR(45) NULL,
  `descripcion` VARCHAR(100) NULL,
  `admin_id` CHAR(10) NOT NULL,
  `aula_id` CHAR(10) NOT NULL,
  `docente_id` CHAR(10) NOT NULL,
  `fechainicio` DATE NULL,
  `fechafin` DATE NULL,
  `estado` VARCHAR(45) NULL,
  PRIMARY KEY (`asesoria_id`, `admin_id`, `aula_id`, `docente_id`),
  INDEX `fk_asesorias_admin_idx` (`admin_id` ASC),
  INDEX `fk_asesorias_aula1_idx` (`aula_id` ASC),
  INDEX `fk_asesorias_docente1_idx` (`docente_id` ASC),
  CONSTRAINT `fk_asesorias_admin`
    FOREIGN KEY (`admin_id`)
    REFERENCES `bdasesoria`.`Administrador` (`admin_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_asesorias_aula1`
    FOREIGN KEY (`aula_id`)
    REFERENCES `bdasesoria`.`Aula` (`aula_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_asesorias_docente1`
    FOREIGN KEY (`docente_id`)
    REFERENCES `bdasesoria`.`Docente` (`docente_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Alumno` (
  `alumno_id` CHAR(10) NOT NULL,
  `codigo` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(50) NULL,
  `correo` VARCHAR(45) NULL,
  `contrasena` VARCHAR(30) NULL,
  `facultad` VARCHAR(45) NULL,
  `carrera` VARCHAR(45) NULL,
  `preferencias` VARCHAR(45) NULL,
  PRIMARY KEY (`alumno_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Discusion_Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Discusion_Alumno` (
  `alum_discusion_id` CHAR(10) NOT NULL,
  `pregunta` LONGTEXT NULL,
  `fecha` VARCHAR(45) NULL,
  `importancia` VARCHAR(45) NULL,
  `alumno_id` CHAR(10) NOT NULL,
  PRIMARY KEY (`alum_discusion_id`, `alumno_id`),
  INDEX `fk_Discusion_Alumno1_idx` (`alumno_id` ASC),
  CONSTRAINT `fk_Discusion_Alumno1`
    FOREIGN KEY (`alumno_id`)
    REFERENCES `bdasesoria`.`Alumno` (`alumno_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Discusion_Docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Discusion_Docente` (
  `doc_discusion_id` CHAR(10) NOT NULL,
  `pregunta` LONGTEXT NULL,
  `fecha` VARCHAR(45) NULL,
  `importancia` VARCHAR(45) NULL,
  `docente_id` CHAR(10) NOT NULL,
  PRIMARY KEY (`doc_discusion_id`, `docente_id`),
  INDEX `fk_Discusion_Docente_Docente1_idx` (`docente_id` ASC),
  CONSTRAINT `fk_Discusion_Docente_Docente1`
    FOREIGN KEY (`docente_id`)
    REFERENCES `bdasesoria`.`Docente` (`docente_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Respuestas_Docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Respuestas_Docente` (
  `doc_respuesta_id` CHAR(10) NOT NULL,
  `respuesta` LONGTEXT NULL,
  `docente_id` CHAR(10) NOT NULL,
  `doc_discusion_id` CHAR(10) NOT NULL,
  `fecha` VARCHAR(45) NULL,
  PRIMARY KEY (`doc_respuesta_id`, `docente_id`, `doc_discusion_id`),
  INDEX `fk_respuestas_Docente1_idx` (`docente_id` ASC),
  INDEX `fk_Respuestas_Docente_Discusion_Docente1_idx` (`doc_discusion_id` ASC),
  CONSTRAINT `fk_respuestas_Docente1`
    FOREIGN KEY (`docente_id`)
    REFERENCES `bdasesoria`.`Docente` (`docente_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Respuestas_Docente_Discusion_Docente1`
    FOREIGN KEY (`doc_discusion_id`)
    REFERENCES `bdasesoria`.`Discusion_Docente` (`doc_discusion_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Respuestas_Alumnos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Respuestas_Alumnos` (
  `alum_respuesta_id` CHAR(10) NOT NULL,
  `respuesta` LONGTEXT NULL,
  `alum_discusion_id` CHAR(10) NOT NULL,
  `alumno_id` CHAR(10) NOT NULL,
  `fecha` VARCHAR(45) NULL,
  PRIMARY KEY (`alum_respuesta_id`, `alum_discusion_id`, `alumno_id`),
  INDEX `fk_respuestas_discusion1_idx` (`alum_discusion_id` ASC),
  INDEX `fk_Respuestas_Alumnos_Alumno1_idx` (`alumno_id` ASC),
  CONSTRAINT `fk_respuestas_discusion10`
    FOREIGN KEY (`alum_discusion_id`)
    REFERENCES `bdasesoria`.`Discusion_Alumno` (`alum_discusion_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Respuestas_Alumnos_Alumno1`
    FOREIGN KEY (`alumno_id`)
    REFERENCES `bdasesoria`.`Alumno` (`alumno_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Respuesta_Doc_Discusion_Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Respuesta_Doc_Discusion_Alumno` (
  `rep_doc_disalum_id` CHAR(10) NOT NULL,
  `respuesta` LONGTEXT NULL,
  `fecha` VARCHAR(45) NULL,
  `alum_discusion_id` CHAR(10) NOT NULL,
  `docente_id` CHAR(10) NOT NULL,
  PRIMARY KEY (`rep_doc_disalum_id`, `alum_discusion_id`, `docente_id`),
  INDEX `fk_Respuesta_Doc_Discusion_Alumno_Discusion_Alumno1_idx` (`alum_discusion_id` ASC),
  INDEX `fk_Respuesta_Doc_Discusion_Alumno_Docente1_idx` (`docente_id` ASC),
  CONSTRAINT `fk_Respuesta_Doc_Discusion_Alumno_Discusion_Alumno1`
    FOREIGN KEY (`alum_discusion_id`)
    REFERENCES `bdasesoria`.`Discusion_Alumno` (`alum_discusion_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Respuesta_Doc_Discusion_Alumno_Docente1`
    FOREIGN KEY (`docente_id`)
    REFERENCES `bdasesoria`.`Docente` (`docente_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Respuesta_Alum_Discusion_Doc`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Respuesta_Alum_Discusion_Doc` (
  `rep_alum_disdoc_id` CHAR(10) NOT NULL,
  `respuesta` LONGTEXT NULL,
  `fecha` VARCHAR(45) NULL,
  `doc_discusion_id` CHAR(10) NOT NULL,
  `alumno_id` CHAR(10) NOT NULL,
  PRIMARY KEY (`rep_alum_disdoc_id`, `doc_discusion_id`, `alumno_id`),
  INDEX `fk_Respuesta_Alum_Discusion_Doc_Discusion_Docente1_idx` (`doc_discusion_id` ASC),
  INDEX `fk_Respuesta_Alum_Discusion_Doc_Alumno1_idx` (`alumno_id` ASC),
  CONSTRAINT `fk_Respuesta_Alum_Discusion_Doc_Discusion_Docente1`
    FOREIGN KEY (`doc_discusion_id`)
    REFERENCES `bdasesoria`.`Discusion_Docente` (`doc_discusion_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Respuesta_Alum_Discusion_Doc_Alumno1`
    FOREIGN KEY (`alumno_id`)
    REFERENCES `bdasesoria`.`Alumno` (`alumno_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdasesoria`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`administrador` (
  `admin_id` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido` VARCHAR(45) NULL DEFAULT NULL,
  `mail` VARCHAR(60) NULL DEFAULT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  `user` VARCHAR(45) NULL DEFAULT NULL,
  `contrasena` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bdasesoria`.`alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`alumno` (
  `alumno_id` CHAR(10) NOT NULL,
  `codigo` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido` VARCHAR(50) NULL DEFAULT NULL,
  `correo` VARCHAR(45) NULL DEFAULT NULL,
  `contraseña` VARCHAR(30) NULL DEFAULT NULL,
  `facultad` VARCHAR(45) NULL DEFAULT NULL,
  `carrera` VARCHAR(45) NULL DEFAULT NULL,
  `preferencias` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`alumno_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bdasesoria`.`sede`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`sede` (
  `sede_id` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`sede_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bdasesoria`.`estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`estado` (
  `estado_id` CHAR(10) NOT NULL,
  `tipoestado` VARCHAR(45) NULL DEFAULT NULL,
  `horario` VARCHAR(30) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `observacion` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`estado_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bdasesoria`.`aula`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`aula` (
  `aula_id` CHAR(10) NOT NULL,
  `sede_id` CHAR(10) NOT NULL,
  `salon` CHAR(6) NULL DEFAULT NULL,
  `estado_id` CHAR(10) NOT NULL,
  PRIMARY KEY (`aula_id`, `sede_id`, `estado_id`),
  INDEX `fk_aula_sede1_idx` (`sede_id` ASC),
  INDEX `fk_Aula_Estado1_idx` (`estado_id` ASC),
  CONSTRAINT `fk_aula_sede1`
    FOREIGN KEY (`sede_id`)
    REFERENCES `bdasesoria`.`sede` (`sede_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aula_Estado1`
    FOREIGN KEY (`estado_id`)
    REFERENCES `bdasesoria`.`estado` (`estado_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bdasesoria`.`docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`docente` (
  `docente_id` CHAR(10) NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido` VARCHAR(45) NULL DEFAULT NULL,
  `correo` VARCHAR(60) NULL DEFAULT NULL,
  `especialidad` VARCHAR(60) NULL DEFAULT NULL,
  `user` VARCHAR(45) NULL DEFAULT NULL,
  `contrasena` VARCHAR(30) NULL DEFAULT NULL,
  `web` CHAR(30) NULL DEFAULT NULL,
  `descripcion` VARCHAR(100) NULL DEFAULT NULL,
  `tipo` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`docente_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bdasesoria`.`asesoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`asesoria` (
  `asesoria_id` CHAR(10) NOT NULL,
  `curso` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion` VARCHAR(100) NULL DEFAULT NULL,
  `admin_id` CHAR(10) NOT NULL,
  `aula_id` CHAR(10) NOT NULL,
  `docente_id` CHAR(10) NOT NULL,
  `alumno_id` CHAR(10) NOT NULL,
  `fechainicio` DATE NULL DEFAULT NULL,
  `fechafin` DATE NULL DEFAULT NULL,
  `estado` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`asesoria_id`, `admin_id`, `aula_id`, `docente_id`, `alumno_id`),
  INDEX `fk_asesorias_admin_idx` (`admin_id` ASC),
  INDEX `fk_asesorias_aula1_idx` (`aula_id` ASC),
  INDEX `fk_asesorias_docente1_idx` (`docente_id` ASC),
  INDEX `fk_asesorias_alumno1_idx` (`alumno_id` ASC),
  CONSTRAINT `fk_asesorias_admin`
    FOREIGN KEY (`admin_id`)
    REFERENCES `bdasesoria`.`administrador` (`admin_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_asesorias_aula1`
    FOREIGN KEY (`aula_id`)
    REFERENCES `bdasesoria`.`aula` (`aula_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_asesorias_docente1`
    FOREIGN KEY (`docente_id`)
    REFERENCES `bdasesoria`.`docente` (`docente_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_asesorias_alumno1`
    FOREIGN KEY (`alumno_id`)
    REFERENCES `bdasesoria`.`alumno` (`alumno_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `bdasesoria`.`Asesoria_has_Alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdasesoria`.`Asesoria_has_Alumno` (
  `Asesoria_asesoria_id` CHAR(10) NOT NULL,
  `Alumno_alumno_id` CHAR(10) NOT NULL,
  PRIMARY KEY (`Asesoria_asesoria_id`, `Alumno_alumno_id`),
  INDEX `fk_Asesoria_has_Alumno_Alumno1_idx` (`Alumno_alumno_id` ASC),
  INDEX `fk_Asesoria_has_Alumno_Asesoria1_idx` (`Asesoria_asesoria_id` ASC),
  CONSTRAINT `fk_Asesoria_has_Alumno_Asesoria1`
    FOREIGN KEY (`Asesoria_asesoria_id`)
    REFERENCES `bdasesoria`.`Asesoria` (`asesoria_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Asesoria_has_Alumno_Alumno1`
    FOREIGN KEY (`Alumno_alumno_id`)
    REFERENCES `bdasesoria`.`Alumno` (`alumno_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
