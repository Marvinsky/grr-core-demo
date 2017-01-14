CREATE DATABASE `db_demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `db_demo`.`ta_spring_bean` (
  `idSpringBean` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `dni` varchar(20) DEFAULT NULL,
  `fechaRegistro` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idSpringBean`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;


DELIMITER $$
CREATE PROCEDURE `db_demo`.`SP_SPRING_LIST`(pIdSpringBean int)
BEGIN
	SELECT idSpringBean, nombre FROM TA_SPRING_BEAN
    WHERE idSpringBean = pIdSpringBean;
END;


INSERT INTO `db_demo`.`ta_spring_bean` (`nombre`, `apellido`, `dni`, `fechaRegistro`) VALUES ('Juan', 'Perez', '10000001', '01/01/2017');
INSERT INTO `db_demo`.`ta_spring_bean` (`nombre`, `apellido`, `dni`, `fechaRegistro`) VALUES ('Armando', 'Paredes', '10000002', '01/01/2017');
INSERT INTO `db_demo`.`ta_spring_bean` (`nombre`, `apellido`, `dni`, `fechaRegistro`) VALUES ('Ana', 'Souza', '10000003', '01/01/2017');
INSERT INTO `db_demo`.`ta_spring_bean` (`nombre`, `apellido`, `dni`, `fechaRegistro`) VALUES ('María', 'Costa', '10000004', '01/01/2017');
INSERT INTO `db_demo`.`ta_spring_bean` (`nombre`, `apellido`, `dni`, `fechaRegistro`) VALUES ('Luis', 'León', '10000005', '01/01/2017');

