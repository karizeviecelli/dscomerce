/*categoria*/
INSERT INTO tb_categoria(descricao) VALUES('Curso');
INSERT INTO tb_categoria (descricao) VALUES( 'Oficina');
/*participante*/
INSERT INTO tb_participante (email,nome) VALUES( 'jose@gmail.com','José Silva');
INSERT INTO tb_participante (email,nome) VALUES( 'tiago@gmail.com','Tiago Faria');
INSERT INTO tb_participante (email,nome) VALUES( 'maria@gmail.com','Maria do Rosário');
INSERT INTO tb_participante (email,nome) VALUES( 'teresa@gmail.com','Teresa Silva');
/*atividade*/
INSERT INTO tb_atividade(preco, categoria_id, descricao, nome) VALUES(80.00,1,'aprenda HTML de forma prática', 'HTML');
INSERT INTO tb_atividade(preco, categoria_id, descricao, nome) VALUES(50.00,2,'Controle versões de seus projetos', 'Oficina de Github');
/*bloco*/
INSERT INTO tb_bloco (atividade_id, fim, inicio) VALUES (1, '2017-09-25 11:00:00', '2017-09-25 08:00:00');
INSERT INTO tb_bloco (atividade_id, fim, inicio) VALUES (2, '2017-09-25 18:00:00', '2017-09-25 14:00:00');
INSERT INTO tb_bloco (atividade_id, fim, inicio) VALUES (2, '2017-09-26 11:00:00', '2017-09-26 08:00:00');
/*tb_paticipante_atividade*/
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES(1,1); 
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES(2,1); 
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES(1,2); 
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES(1,3); 
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES(2,3); 
INSERT INTO tb_participante_atividade(atividade_id,participante_id) VALUES(2,4); 




