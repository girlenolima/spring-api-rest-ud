# spring-api-rest-ud

### Este projeto é um desafio pessoal de criar uma API RESTful utilizando Java, Spring e suas tecnologias. Aqui, você encontrará um resumo dos conceitos e tecnologias que serão utilizados no projeto. Inicialmente, este README será dividido em três partes: conceitos introdutórios, tecnologias utilizadas e implementação prática.

### Web Service 
> Serviços web são uma tecnologia essencial para a comunicação entre sistemas computacionais pela World Wide Web. Eles facilitam a transferência de dados e a execução de funções entre diferentes plataformas, empregando protocolos como SOAP (Simple Object Access Protocol) para serviços baseados em XML e REST (Representational State Transfer) para abordagens mais leves baseadas em padrões HTTP. A descrição de serviços é feita através de linguagens como WSDL (Web Services Description Language) ou especificações como Swagger/OpenAPI. A segurança é garantida por meio de protocolos como SSL/TLS e extensões específicas, como WS-Security. Diversas implementações, como JAX-WS para serviços SOAP e JAX-RS para serviços REST, proporcionam a criação eficiente e interoperável de serviços web, promovendo a integração de sistemas de maneira global.

> Esses serviços também se beneficiam de registros como o UDDI (Universal Description, Discovery, and Integration) para facilitar a descoberta global de serviços. Os formatos de dados, como XML e JSON, desempenham papéis cruciais na troca eficiente de informações entre sistemas. Essa abordagem amplamente adotada oferece uma arquitetura flexível e padronizada, promovendo a conectividade e a colaboração eficaz entre aplicações distribuídas em ambientes diversos.

### Rest 
> REST (Representational State Transfer) é uma arquitetura de software que define um conjunto de princípios e restrições para o design de serviços web. Diferentemente de protocolos como SOAP, REST não é um protocolo, mas um estilo arquitetônico baseado em padrões da web, como HTTP.REST é frequentemente utilizado em conjunto com o protocolo HTTP, aproveitando os métodos HTTP para operações CRUD (Create, Read, Update, Delete) e os códigos de status para indicar o resultado da operação. Essa abordagem simplificada e baseada em padrões torna o REST uma escolha popular para o desenvolvimento de serviços web, especialmente em contextos onde a simplicidade e a escalabilidade são prioridades.

> - Representação: Os recursos são representados por entidades, que são objetos de dados que podem ser manipulados por operações.
> - Sinalização: As operações são realizadas por meio de métodos HTTP, como GET, POST, PUT e DELETE.
> - Cadeias de recursos: Os recursos são relacionados por meio de URLs, que podem ser compostas para representar relacionamentos complexos.
> - Cacheabilidade: Os recursos podem ser armazenados em cache pelo cliente ou pelo servidor, para melhorar o desempenho.
> - Segurança: Os recursos podem ser protegidos por meio de mecanismos de autenticação e autorização.
> - Evolução: Os sistemas RESTful devem ser projetados de forma a serem facilmente evoluídos, sem afetar a funcionalidade ou a interoperabilidade.

### Resquest e Response

Request (Requisição):
> Em um contexto de serviços web, uma requisição (ou request) é uma mensagem enviada por um cliente para solicitar a execução de uma operação específica em um servidor. Essa mensagem inclui informações como o método da requisição (como GET, POST, PUT ou DELETE), o URL do recurso desejado e, em casos de métodos que permitem o envio de dados, os parâmetros ou corpo da requisição. As requisições são a maneira pela qual os clientes interagem com os serviços web, solicitando ações ou informações específicas.

![request](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/fae37093-d8fa-4b79-ab27-8b09297aa06b)


Response (Resposta):
> Uma resposta (ou response) é a mensagem enviada pelo servidor em resposta a uma requisição recebida. Ela contém informações sobre o resultado da operação solicitada pelo cliente. Isso inclui um código de status HTTP que indica se a operação foi bem-sucedida, informações adicionais sobre a resposta e, quando apropriado, dados retornados pelo servidor. As respostas podem conter dados no formato desejado, como HTML, XML ou JSON, dependendo do tipo de serviço web e das preferências especificadas na requisição. O conjunto de códigos de status HTTP, como 200 OK, 404 Not Found e 500 Internal Server Error, é utilizado para comunicar o resultado da operação ao cliente de forma padronizada.

![response](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/a55d5b48-4110-4f88-86f9-fb3945ce6dc1)


### Parametros

Path Params (Parâmetros de Caminho):
> São usados para identificar e acessar recursos específicos na URL. Inseridos diretamente no caminho, eles são obrigatórios e normalmente representam valores únicos, como IDs.

Query Params (Parâmetros de Consulta):
> Permitem filtrar ou personalizar resultados, adicionando informações à URL após o símbolo "?". São opcionais e frequentemente usados para configurações, filtros ou informações adicionais.

Header Params (Parâmetros de Cabeçalho):
> Transportam informações adicionais no cabeçalho da requisição. São úteis para autenticação (como tokens) e metadados que não fazem parte da URL ou do corpo da requisição.

Body Params (Parâmetros no Corpo da Requisição):
> Enviados no corpo da requisição HTTP, são comumente utilizados para transmitir dados complexos, como JSON em requisições POST ou PUT. Podem ser obrigatórios ou opcionais, dependendo do endpoint.


### HTTP Status Codes mais usados.


> Os HTTP Status Codes, ou códigos de status HTTP, são indicadores numéricos retornados como parte das respostas de requisições HTTP, fornecendo informações sobre o resultado da operação realizada. Divididos em cinco classes, esses códigos começam com os dígitos 1 a 5, onde os 2xx indicam sucesso, os 3xx indicam redirecionamento, os 4xx sinalizam erros do cliente, e os 5xx indicam erros do servidor. Esses códigos desempenham um papel crucial em comunicações cliente-servidor, permitindo uma compreensão rápida e padronizada do estado da requisição, o que facilita o diagnóstico de problemas e a implementação de tratamentos adequados no desenvolvimento de aplicações web.

>  - 1xx - Informativos:
>    - 100 Continue: Indica que o servidor recebeu os cabeçalhos da requisição e o cliente deve prosseguir com o corpo da requisição.

>  - 2xx - Sucesso:
>    -  200 OK: A requisição foi bem-sucedida.
>    - 201 Created: A requisição resultou na criação de um novo recurso.
>    - 204 No Content: A requisição foi bem-sucedida, mas não há conteúdo para retornar.

>  - 3xx - Redirecionamento:
>    - 301 Moved Permanently: O recurso solicitado foi movido permanentemente para uma nova localização.
>    - 302 Found: O recurso solicitado foi movido temporariamente para uma nova localização.
>    - 304 Not Modified: Indica que o recurso não foi modificado desde a última requisição.

>  - 4xx - Erro do Cliente:
>    - 400 Bad Request: A requisição não pode ser processada devido a uma sintaxe inválida.
>    - 401 Unauthorized: O cliente deve se autenticar para obter acesso.
>    - 403 Forbidden: O servidor entende a requisição, mas o acesso é proibido.
>    - 404 Not Found: O recurso solicitado não foi encontrado.
>    - 409 Conflict: A requisição não pode ser concluída devido a um conflito com o estado atual do recurso.

>  - 5xx - Erro do Servidor:
>    - 500 Internal Server Error: Indica um erro interno do servidor.
>    - 503 Service Unavailable: O servidor não está pronto para manipular a requisição. Pode estar temporariamente sobrecarregado ou em manutenção.


### Verbos HTTP mais comuns

Os verbos HTTP são um conjunto de métodos de requisição que definem a ação a ser executada para um dado recurso. Eles são usados em APIs RESTful para fornecer uma convenção de nomenclatura que facilite a compreensão de como uma API funciona.

POST
> O verbo POST é usado para criar um novo recurso. Por exemplo, se você quiser criar uma nova conta de usuário em um sistema, você faria uma solicitação POST para o endpoint da API responsável por criar contas de usuário. A resposta da solicitação POST seria o novo recurso criado, no caso, a nova conta de usuário.

GET
> O verbo GET é usado para recuperar um recurso existente. Por exemplo, se você quiser recuperar os dados de um usuário específico, você faria uma solicitação GET para o endpoint da API responsável por recuperar dados de usuários. A resposta da solicitação GET seria os dados do usuário solicitado.

PUT
> O verbo PUT é usado para atualizar um recurso existente. Por exemplo, se você quiser alterar a senha de um usuário, você faria uma solicitação PUT para o endpoint da API responsável por atualizar dados de usuários. A resposta da solicitação PUT seria o recurso atualizado, no caso, o usuário com a senha alterada.

DELETE
> O verbo DELETE é usado para excluir um recurso existente. Por exemplo, se você quiser excluir a conta de um usuário, você faria uma solicitação DELETE para o endpoint da API responsável por excluir contas de usuário. A resposta da solicitação DELETE seria um status HTTP 204 No Content, indicando que o recurso foi excluído com

PATCH
> O verbo HTTP PATCH é utilizado em solicitações para aplicar modificações parciais a um recurso. Em outras palavras, ele é usado quando se deseja atualizar parte de um recurso, em vez de substituir o recurso inteiro, como seria feito com o verbo PUT.

> - Modificações Parciais:
>    - O PATCH permite atualizações parciais no recurso. Em vez de enviar todos os dados do recurso, você pode enviar apenas os campos que precisam ser modificados.
Semântica de Atualização:
>    - PATCH é frequentemente utilizado quando se deseja atualizar campos específicos de um recurso sem afetar o restante das informações.
> Operação Atômica:
>    - As operações PATCH são consideradas atômicas, o que significa que a aplicação das modificações é tratada como uma única operação, garantindo consistência nos dados.


### Modelo de maturidade de Richardson 

> Os níveis de maturidade do REST, também conhecidos como Richardson Maturity Model ou Modelo de Maturidade de Richardson, foram propostos por Leonard Richardson em seu artigo "Maturity Heuristics for Building Scalable and Maintainable RESTful Services". Este modelo define quatro níveis de maturidade para a implementação de serviços RESTful. Vamos explorar cada nível:

![maturidade](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/73423351-1415-4a4c-be57-bd5184b65591)


Nível 0 - Serviços RESTful sem REST:
> - Utiliza apenas um ponto de extremidade para todos os recursos.
> - Geralmente usa apenas o verbo POST.
> - Não segue os princípios fundamentais do REST.

Nível 1 - Recursos Individuais:
> - Introduz a ideia de recursos individuais identificáveis por URIs.
> - Utiliza múltiplos pontos de extremidade (um por recurso).
> - Adota diferentes verbos HTTP, mas sem muita semântica.

Nível 2 - Utilização de Verbos HTTP:
> - Usa adequadamente os verbos HTTP para diferentes operações.
> - Utiliza GET para leitura, POST para criação, PUT para atualização, DELETE para exclusão.
> - Usa URIs para identificar recursos de forma mais semântica.

Nível 3 - HATEOAS (Hypermedia As The Engine Of Application State):
> - Introduz a ideia de HATEOAS, onde a representação de um recurso contém links para transições de estado possíveis.
> - As ações possíveis são descobertas dinamicamente pela aplicação cliente, reduzindo a necessidade de conhecimento prévio da API.


### Hateoas

> HATEOAS significa Hypermedia as the Engine of Application State. É um princípio de design para APIs RESTful que afirma que a API deve fornecer todas as informações necessárias para o cliente navegar no estado da aplicação. Isso significa que a API deve retornar links para recursos relacionados em suas respostas. Isso permite que o cliente descubra a API sem ter que conhecer a estrutura completa da aplicação com antecedência.

Benefícios do HATEOAS

> - Desvinculação: O HATEOAS desvincula o cliente do servidor permitindo que o cliente descubra a API sem ter que conhecer a estrutura completa da aplicação com antecedência. Isso torna a API mais flexível e fácil de alterar.

> - Descobribilidade: O HATEOAS torna a API mais explorável fornecendo links para recursos relacionados em suas respostas. Isso torna mais fácil para os clientes encontrarem os recursos de que precisam sem ter que conhecer a estrutura completa da API com antecedência.

> - Facilidade de uso: O HATEOAS torna a API mais fácil de usar fornecendo uma maneira consistente para os clientes navegarem no estado da aplicação. Isso torna mais fácil para os desenvolvedores escrever clientes que consomem a API.

### Documentação com Swagger framework

> O Swagger framework é uma ferramenta que pode ser usada para documentar APIs RESTful. Ele permite que os desenvolvedores criem uma documentação interativa que pode ser usada por desenvolvedores e consumidores da API.

> O Swagger framework pode ser usado para documentar APIs RESTful de várias maneiras. Uma maneira é usar a ferramenta Swagger UI. A Swagger UI é uma ferramenta web que pode ser usada para visualizar e testar APIs RESTful documentadas com o Swagger framework.

> Outra maneira de usar o Swagger framework para documentar APIs RESTful é gerar documentação estática. A documentação estática pode ser usada em sites, wikis ou outros documentos.

### Autenticaçao com JWT 


> A autenticação via JWT (JSON Web Token) é um método de autenticação que usa um token assinado digitalmente para representar as credenciais de um usuário. O token é gerado pelo servidor e enviado ao cliente, que o armazena em um local seguro. O cliente envia o token para o servidor em cada solicitação autenticada. O servidor verifica a assinatura do token e, se for válido, autentica o usuário.

> O JWT é um formato de dados leve e compacto que é fácil de transportar e armazenar. O token é composto por três partes, separadas por pontos:
> - Header: Contém as informações sobre o tipo de token, o algoritmo de assinatura e o conteúdo do token.
> - HPayload: Contém as informações de autenticação, como o nome de usuário, o token de acesso e o tempo de expiração do token.
> - HSignature: É uma assinatura digital do header e do payload do token.

> O JWT pode ser assinado usando uma chave secreta ou um par de chaves pública e privada. Se o token for assinado com uma chave secreta, o servidor e o cliente precisam compartilhar a chave secreta. Se o token for assinado com um par de chaves pública e privada, o servidor usa a chave privada para assinar o token e o cliente usa a chave pública para verificar a assinatura.

> Anatomia de um JSON WEB TOKEN (JWT)


![1_2J0lK1r9c04ARTai-DrLQA](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/021d9ccf-f954-48fc-a139-673d7bb6b48d)

