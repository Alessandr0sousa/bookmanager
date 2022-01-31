CREATE TABLE livro (
  id BIGINT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(150) NULL,
  autor VARCHAR(150) NULL,
  editora VARCHAR(255) NULL,
  edição VARCHAR(150) NULL,
  ano INTEGER UNSIGNED NULL,
  dataCadastro DATETIME NULL,
  statusLivro VARCHAR(50) NULL,
  PRIMARY KEY(id)
);
