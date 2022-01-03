insert into cozinha(nome) values ('Brasileira');
insert into cozinha(nome) values ('Nepaliana');


insert into restaurante(nome, taxa_frete, cozinha_id) values ('Dogão', 0.00, 1);
insert into restaurante(nome, taxa_frete, cozinha_id) values ('Oasis', 0.00, 2);

insert into forma_pagamento(descricao) values ('Debito');
insert into forma_pagamento(descricao) values ('PIX');

insert into Estado(nome) values ('Piaui');
insert into Cidade(nome, estado_id) values ('Parnaiba', 1);
