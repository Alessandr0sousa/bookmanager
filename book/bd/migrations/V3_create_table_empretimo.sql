CREATE TABLE emprestimo (
  id BIGINT NOT NULL AUTO_INCREMENT,
  usuario_id BIGINT NOT NULL,
  livro_id BIGINT NOT NULL,
  dataEmprestimo DATETIME NOT NULL,
  dataDevolucao DATETIME NOT NULL,
  statusEmprestimo VARCHAR(50) NOT NULL,
  PRIMARY KEY(id),
  foreign key(usuario_id) references usuario(id),
  foreign key(livro_id) references livro(id),
);
