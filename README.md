# desafio-rgr

OBS: Frontend abistraido

Considere um sistema que tem os seguintes requisitos:

• Como usuário, quando seleciono "Cidades" quero ver a lista de cidades.

->MS GET "/v1/api/cidade"

• Como usuário, quando seleciono uma cidade quero ver a lista de filmes.

->MS GET "/v1/api/filme-por-cidade/{idCidade}"

• Como usuário, quando seleciono um filme quero ver a lista de cinemas.

->MS GET "/v1/api/sessao-por-filme/{idFilme}": trará a lista de Sessões, contendo o ID da Sala que contem o ID do cinema. Seria simples alterar o retorno para trazer as informações do cinema no mesmo VO

• Como usuário, quando seleciono um cinema quero ver a lista de horários.

->MS GET "/v1/api/sessao-por-cinema-e-filme/{idCinema}/{idFilme}"

• Como usuário, quando seleciono um horário e informo o número de assentos quero ver os assentos disponíveis.

-> Essa parte eu faria em frontend usando as informações do MS acima, e mandaria a lista da definida de acessontos para o backend processar

• Como usuário, quando seleciono o(s) assento(s) quero ver o preço total.

• Como usuário, quando seleciono "Concluir Compra" quero ser redirecionado a um gateway de pagamento.

->MS POST "/v1/api/pagamento"

• Como usuário, quando realizo o pagamento quero receber o(s) ingresso(s) por e-mail.

a) Crie um modelo de banco de dados (entidade relacionamento) de forma a atender aos requisitos deste sistema.

-> Modelo definido nas entidades mapeadas

b) Escreva as queries em SQL para responder aos requisitos colocados acima.
