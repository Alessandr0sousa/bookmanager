CREATE TABLE usuario (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  cpf VARCHAR(11) NOT NULL,
  email VARCHAR(150) NOT NULL,
  senha VARCHAR(200) NOT NULL,
  perfilUsuario VARCHAR(50) NOT NULL,
  PRIMARY KEY(id)
);
