Teste Java Robson Silvério dos Santos
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
Após instalar e configurar as variáveis de ambientes entre no shell de seu sistema operacional e baixar o projeto no git e rodar pelo maven  
$ git clone https://github.com/robson-silverio/testeJava  
$ mvn jetty:run  

###3. Para importar o projeto para o  Eclipse IDE
1. $ mvn eclipse:eclipse
2. Importe para o Eclipse via opção **existing projects into workspace** .

###4.Para testar as questões
Existe teste unitário para a questão 3;
Para as questões 1 e 2 podem ser testados os serviços através das urls  
1. ``localhost:8080/testejava/rest/json/endereco/get``  
2. ``localhost:8080/testejava/rest/json/endereco/post`` 
   ``localhost:8080/testejava/rest/json/endereco/put``  
   ``localhost:8080/testejava/rest/json/endereco/delete``

e para testar os serviços os objetos Json são:  
1. {"cep":"10101000"} ou {"cep":"10102000"} ou {"cep":"10103000"}
2. {"cep":"10101000","numero":10,"complemento":"casa 02"}
