--Insert da Tabela usuario
insert into perfil values(1, 'Administrador');
insert into usuario (ID, CPF, EMAIL, NOME, SENHA, DATA_INSERT, DATA_UPDATE)
values (1,'01234567890', 'alessandro@gmail.com', 'alessandro', '$2a$10$3On/mLd4CFapowlI/xrSOeeaM.mqCMNf8MUa84jJJWkVo3WXL69v2','2022-01-24 16:50:11.224', null);
insert into usuario_perfis values(1, 1);
--Insert da Tabela Livros
INSERT INTO livro VALUES ( 1,  2018 , 'jane austen',  'romance', '2022-01-24 16:50:11.224', null, 'luxo', 'martin claret', 2,'Disponivel', 'orgulho e preconceito', 1);
--Insert da Tabela Emprestimo
INSERT INTO EMPRESTIMO  VALUES(1, '2022-02-03 16:50:11.224', '2022-01-24 16:50:11.224', 'No_Prazo', 1, 1);
-----------
select * from usuario