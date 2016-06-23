Teste Java Robson Silv�rio dos Santos
=====================================
Respostas das perguntas 1, 2  e 3.

###1. Tecnologias utilizadas
* JDK 1.7
* Maven 3.0
* Spring 4.3.0.RELEASE
* HSQLDB 2.3.2
* Hibernate 
* Jackson
* Jersey

###2. Para rodar esse projeto localmente
Instale JDK, Maven e cliente git. 
Ap�s instalar e configurar as vari�veis de ambientes entre no shell de seu sistema operacional e baixar o projeto no git e rodar pelo maven  
$ git clone https://github.com/robson-silverio/testeJava  
$ mvn jetty:run  

Accesse ```http://localhost:8080/testeJava/``

###3. Para importar o projeto para o  Eclipse IDE
1. $ mvn eclipse:eclipse
2. Importe para o Eclipse via op��o **existing projects into workspace** .

###4.Para testar as quest�es
Existe teste unit�rio para a quest�o 3;
Para as quest�es 1 e 2 podem ser testados os servi�os atrav�s das urls  
1. ``localhost:8080/testejava/rest/json/cep/get``  
2. ``http://localhost:8080/testeJava/``  
e testes unit�rios.

