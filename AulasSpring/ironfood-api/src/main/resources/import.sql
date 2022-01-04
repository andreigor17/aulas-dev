insert into cozinha(nome) values ('Brasileira');
insert into cozinha(nome) values ('Nepaliana');


insert into restaurante(nome, taxa_frete, cozinha_id) values ('Dogão', 0.00, 1);
insert into restaurante(nome, taxa_frete, cozinha_id) values ('Oasis', 0.00, 2);

insert into forma_pagamento(descricao) values ('Debito');
insert into forma_pagamento(descricao) values ('PIX');

insert into Estado(nome) values ('Piaui');
insert into Cidade(nome, estado_id) values ('Parnaiba', 1);

insert into restaurante_formas_pagamento(restaurante_id, formas_pagamento_id) values (1,1)
insert into restaurante_formas_pagamento(restaurante_id, formas_pagamento_id) values (1,2)
insert into restaurante_formas_pagamento(restaurante_id, formas_pagamento_id) values (2,1)
