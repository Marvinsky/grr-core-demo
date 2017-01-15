
###########################################################
***************     REQUERIMIENTOS       *****************
###########################################################

	Eclipse
	jdk_1.8
	apache-tomcat-8.0.39
	Maven.
	MySQL_5.1




####################################################################################
***************     CONFIGURACIÓN DE DESARROLLO Y DESPLIEGUE       *****************
####################################################################################

1-Clonar el proyecto.

		git clone https://github.com/Marvinsky/grr-core-demo.git
		

2-Ejecutar el siguiente script en su base de datos MySQL:

		.../src/main/resource/database/testDatabase.sql
		

3-Importar el proyecto a Eclipse.


4-Instalar Maven plugin en Eclipse.

		http://www.java2blog.com/2015/09/how-to-install-maven-pluginm2eclipse-in.html
		

5-Actualizar el proyecto con Maven.

		Click derecho al proyecto -> Maven -> Update Project.
		

6-Asegurarse que el proyecto y Tomcat 8 estén configurados para jdk_1.8.

		En: Properties -> Java Buid Path -> Libraries.
		En: Properties -> Java Compiler.
		Al agregar el Servidor Tomcat 8.
		
		
7-Modificar el jdbc.properties (existen 2: para test y para proyecto web) con las credenciales de su base de datos.
		

8-Compilar el proyecto con Maven.

		Click derecho al proyecto -> Run as -> Maven Build.
		Goals: clean install.
		Cliek en Run.
		
		
9-Ejecutar Test SpringBeanServiceImplTest.java

		Click derecho a la clase -> Run as -> JUnit.
		

10-Agregar Tomcat 8.

		
11-Desplegar el proyecto en Tomcat 8
		
		Click derecho al proyecto -> Run as -> Run on Server -> Seleccionar Tomcat 8 -> Finish.
		

12-Confirmar en Postman las siguientes URL's
		
		http://localhost:8081/demomvn/getBeans
		GET
		Headers: token = abc123
		==========================> RESULT JSON: {"beans": [...]}
		
		http://localhost:8081/demomvn/rest/hello
		GET
		==========================> RESULT: Hello World!

		

THE END