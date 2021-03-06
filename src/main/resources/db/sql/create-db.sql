DROP TABLE EnderecoCEP IF EXISTS CASCADE;
DROP TABLE Endereco IF EXISTS CASCADE;

CREATE TABLE EnderecoCEP (
  id  INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,
  cep VARCHAR(8) not null,
  rua VARCHAR(50) not null,
  bairro VARCHAR(25),
  cidade VARCHAR(25)not null,
  uf VARCHAR(2) not null,
  
);


CREATE TABLE Endereco (
  id  INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,
  id_endereco_cep INTEGER,
  complemento VARCHAR(50),
  numero  INTEGER not null
);

ALTER TABLE Endereco
ADD FOREIGN KEY (id_endereco_cep) 
REFERENCES EnderecoCEP(id);