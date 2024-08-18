# Spring API REST

<p align="justify"> Este projeto é um desafio pessoal de criar uma API RESTful utilizando Java, Spring e suas tecnologias. Aqui, você encontrará um resumo dos conceitos e tecnologias que serão utilizados no projeto. Inicialmente, este README será dividido em três partes: conceitos introdutórios, tecnologias utilizadas e implementação prática.</p>

### :blue_book: Porque usar REST e nao SOAP ?
---
| PONTOS                     | SOAP                                    | REST                                  |
|----------------------------|-----------------------------------------|---------------------------------------|
| Definição                  | Protocolo de troca de mensagens em XML  | Estilo arquitetural                   |
| Comunicação                | Usa WSDL entre cliente e servidor       | Usa XML, JSON para enviar e receber dados |
| Como as chamadas são feitas | Método RPC                              | URL PATH                              |
| Retorno                    | XML dentro de um SOAP envelope          | Retorna diversos formatos             |
| Protocolos                 | HTTP, SMTP, FTP ...                     | HTTP                                  |
| Complexidade               | Alta                                    | Baixa                                 |
| Performance                | Baixa                                   | Alta                                  |


<p align="justify"> :page_facing_up: Ao ponderar entre REST e SOAP, a pergunta que fica é: por que complicar o que pode ser simples? REST oferece uma abordagem mais moderna, 
eficiente e acessível para a comunicação entre sistemas, tornando-se a escolha ideal para a maioria dos projetos de APIs.</p>

<p align="justify"> :page_facing_up: REST frequentemente se destaca. Por ser menos complexo e por permitir a troca de dados em formatos leves como JSON, o REST tende a ter uma performance superior, especialmente em ambientes onde a latência e o consumo de recursos são fatores críticos. O SOAP, com sua estrutura mais pesada, pode introduzir sobrecarga e afetar negativamente a performance da aplicação.</p>

<p align="justify"> :page_facing_up: As operações padrão do protocolo HTTP (como GET, POST, PUT, DELETE), o que facilita a integração com a web e torna o desenvolvimento de APIs mais natural para desenvolvedores familiarizados com o ambiente web. SOAP, por outro lado, requer uma maior complexidade na comunicação, utilizando métodos de chamada remota (RPC) e WSDL para descrever os serviços, o que pode ser desnecessariamente complicado para muitas aplicações.</p>

<p align="justify"> :page_facing_up: Outra vantagem significativa do REST é sua capacidade de trabalhar com múltiplos formatos de dados, como JSON, XML, e até mesmo simples texto. Enquanto o SOAP está restrito ao uso de XML dentro de um envelope SOAP, o REST pode se adaptar ao formato de dados mais adequado para o contexto, resultando em uma comunicação mais eficiente e menos sobrecarregada.</p>
<br>


### :blue_book: Web Service 
---
<p align="justify"> :page_facing_up: Serviços web são uma tecnologia essencial para a comunicação entre sistemas computacionais pela World Wide Web. Eles facilitam a transferência de dados e a execução de funções entre diferentes plataformas, empregando protocolos como SOAP (Simple Object Access Protocol) para serviços baseados em XML e REST (Representational State Transfer) para abordagens mais leves baseadas em padrões HTTP. A descrição de serviços é feita através de linguagens como WSDL (Web Services Description Language) ou especificações como Swagger/OpenAPI. A segurança é garantida por meio de protocolos como SSL/TLS e extensões específicas, como WS-Security. Diversas implementações, como JAX-WS para serviços SOAP e JAX-RS para serviços REST, proporcionam a criação eficiente e interoperável de serviços web, promovendo a integração de sistemas de maneira global.</p>

<p align="justify"> :page_facing_up: Esses serviços também se beneficiam de registros como o UDDI (Universal Description, Discovery, and Integration) para facilitar a descoberta global de serviços. Os formatos de dados, como XML e JSON, desempenham papéis cruciais na troca eficiente de informações entre sistemas. Essa abordagem amplamente adotada oferece uma arquitetura flexível e padronizada, promovendo a conectividade e a colaboração eficaz entre aplicações distribuídas em ambientes diversos.</p>
<br>


### :blue_book: Rest 
---
<p align="justify"> :page_facing_up:  REST (Representational State Transfer) é uma arquitetura de software que define um conjunto de princípios e restrições para o design de serviços web. Diferentemente de protocolos como SOAP, REST não é um protocolo, mas um estilo arquitetônico baseado em padrões da web, como HTTP.REST é frequentemente utilizado em conjunto com o protocolo HTTP, aproveitando os métodos HTTP para operações CRUD (Create, Read, Update, Delete) e os códigos de status para indicar o resultado da operação. Essa abordagem simplificada e baseada em padrões torna o REST uma escolha popular para o desenvolvimento de serviços web, especialmente em contextos onde a simplicidade e a escalabilidade são prioridades.</p>

- Representação: Os recursos são representados por entidades, que são objetos de dados que podem ser manipulados por operações.
- Sinalização: As operações são realizadas por meio de métodos HTTP, como GET, POST, PUT e DELETE.
- Cadeias de recursos: Os recursos são relacionados por meio de URLs, que podem ser compostas para representar relacionamentos complexos.
- Cacheabilidade: Os recursos podem ser armazenados em cache pelo cliente ou pelo servidor, para melhorar o desempenho.
- Segurança: Os recursos podem ser protegidos por meio de mecanismos de autenticação e autorização.
- Evolução: Os sistemas RESTful devem ser projetados de forma a serem facilmente evoluídos, sem afetar a funcionalidade ou a interoperabilidade.


:page_facing_up: Roy fielding em sua tese define que o REST tem 6 restriçoes: 
> - Cliente Servidor  
> As duas partes vedem estar separadas. 
> - Stateless server
> Nao deve guardar o estado do cliente,cada resqueste tem todas as informaçoes.
> -  Cacheabilidade
> O cliente deve ser informado sobre as propriedade de cache.
> -  Interface Uniforme
> Interface uniforme entre cliente e servidor.
> - Sistema dem camadas
> Suportar conceitos de balancemaento de cargtas, proxys e firewalls.
> - Codigo sob demanda
> O cliente pode solicitar o codigo do servidor e executa-lo
<br>
<br>

### :blue_book: Resquest e Response
---
:page_facing_up: Request (Requisição):
<p align="justify"> Em um contexto de serviços web, uma requisição (ou request) é uma mensagem enviada por um cliente para solicitar a execução de uma operação específica em um servidor. Essa mensagem inclui informações como o método da requisição (como GET, POST, PUT ou DELETE), o URL do recurso desejado e, em casos de métodos que permitem o envio de dados, os parâmetros ou corpo da requisição. As requisições são a maneira pela qual os clientes interagem com os serviços web, solicitando ações ou informações específicas.</p>

![request](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/fae37093-d8fa-4b79-ab27-8b09297aa06b)


:page_facing_up: Response (Resposta):
<p align="justify"> Uma resposta (ou response) é a mensagem enviada pelo servidor em resposta a uma requisição recebida. Ela contém informações sobre o resultado da operação solicitada pelo cliente. Isso inclui um código de status HTTP que indica se a operação foi bem-sucedida, informações adicionais sobre a resposta e, quando apropriado, dados retornados pelo servidor. As respostas podem conter dados no formato desejado, como HTML, XML ou JSON, dependendo do tipo de serviço web e das preferências especificadas na requisição. O conjunto de códigos de status HTTP, como 200 OK, 404 Not Found e 500 Internal Server Error, é utilizado para comunicar o resultado da operação ao cliente de forma padronizada.</p>

![response](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/a55d5b48-4110-4f88-86f9-fb3945ce6dc1)
<br>
<br>

### :blue_book: Parametros
---

:page_facing_up: Path Params (Parâmetros de Caminho):

<p align="justify"> Path Params em REST são parâmetros inseridos diretamente na URL de uma solicitação de API para identificar recursos específicos. Eles são parte da rota e geralmente indicam a hierarquia dos recursos, como IDs. Por exemplo, em uma URL como /users/{id}, o {id} é um Path Param que será substituído pelo valor real do ID do usuário.</p>

```
https://host/api/teste/v1/find-person/asc/10/1
```

| Paramentro                 | Resultado                               | Conector / divisor      |
|----------------------------|-----------------------------------------|-------------------------|
|  asc                       | ordenaçao ascendente em sorte           |    "/"                  |
|  10                        | pagina com 10 itens                     |    "/"                  |
| 1                          | para iniciar na pagina 1                |    "/"                  |


:page_facing_up: Query Params (Parâmetros de Consulta):

<p align="justify">Query Params (Parâmetros de Consulta) em REST são parâmetros adicionados à URL após um ponto de interrogação (?) para modificar ou filtrar a resposta da API. Eles não fazem parte do caminho da rota, mas são usados para enviar informações adicionais à API.</p>

```
https://host/api/teste/v1/findPerson?fistName=Francisco&lastName=Silva
```
| Paramentro                 | Resultado                               |  Conector / divisor      |
|----------------------------|-----------------------------------------|--------------------------|
|  fistName                  | busca pelo primeiro nome                |    {"?" , "&"}           |
|  lastName                  | busca pelo ultimo nome                  |   {"?" , "&"}            |




:page_facing_up: Header Params (Parâmetros de Cabeçalho):
> Transportam informações adicionais no cabeçalho da requisição. São úteis para autenticação (como tokens) e metadados que não fazem parte da URL ou do corpo da requisição.

:page_facing_up: Body Params (Parâmetros no Corpo da Requisição):
> Enviados no corpo da requisição HTTP, são comumente utilizados para transmitir dados complexos, como JSON em requisições POST ou PUT. Podem ser obrigatórios ou opcionais, dependendo do endpoint.
<br>
<br>

### :blue_book: HTTP Status Codes mais usados.
---
<p align="justify"> :page_facing_up: Os HTTP Status Codes, ou códigos de status HTTP, são indicadores numéricos retornados como parte das respostas de requisições HTTP, fornecendo informações sobre o resultado da operação realizada. Divididos em cinco classes, esses códigos começam com os dígitos 1 a 5, onde os 2xx indicam sucesso, os 3xx indicam redirecionamento, os 4xx sinalizam erros do cliente, e os 5xx indicam erros do servidor. Esses códigos desempenham um papel crucial em comunicações cliente-servidor, permitindo uma compreensão rápida e padronizada do estado da requisição, o que facilita o diagnóstico de problemas e a implementação de tratamentos adequados no desenvolvimento de aplicações web.</p>

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
<br>
<br>

### :blue_book: Verbos HTTP mais comuns
---
<p align="justify"> :page_facing_up: Os verbos HTTP são um conjunto de métodos de requisição que definem a ação a ser executada para um dado recurso. Eles são usados em APIs RESTful para fornecer uma convenção de nomenclatura que facilite a compreensão de como uma API funciona.</p>

POST
> <p align="justify"> O verbo POST é usado para criar um novo recurso. Por exemplo, se você quiser criar uma nova conta de usuário em um sistema, você faria uma solicitação POST para o endpoint da API responsável por criar contas de usuário. A resposta da solicitação POST seria o novo recurso criado, no caso, a nova conta de usuário.</p>

GET
> <p align="justify"> O verbo GET é usado para recuperar um recurso existente. Por exemplo, se você quiser recuperar os dados de um usuário específico, você faria uma solicitação GET para o endpoint da API responsável por recuperar dados de usuários. A resposta da solicitação GET seria os dados do usuário solicitado.</p>

PUT
> <p align="justify"> O verbo PUT é usado para atualizar um recurso existente. Por exemplo, se você quiser alterar a senha de um usuário, você faria uma solicitação PUT para o endpoint da API responsável por atualizar dados de usuários. A resposta da solicitação PUT seria o recurso atualizado, no caso, o usuário com a senha alterada.</p>

DELETE
> <p align="justify"> O verbo DELETE é usado para excluir um recurso existente. Por exemplo, se você quiser excluir a conta de um usuário, você faria uma solicitação DELETE para o endpoint da API responsável por excluir contas de usuário. A resposta da solicitação DELETE seria um status HTTP 204 No Content, indicando que o recurso foi excluído com </p>

PATCH
> <p align="justify"> O verbo HTTP PATCH é utilizado em solicitações para aplicar modificações parciais a um recurso. Em outras palavras, ele é usado quando se deseja atualizar parte de um recurso, em vez de substituir o recurso inteiro, como seria feito com o verbo PUT. </p>

> - Modificações Parciais:
>    - O PATCH permite atualizações parciais no recurso. Em vez de enviar todos os dados do recurso, você pode enviar apenas os campos que precisam ser modificados.
Semântica de Atualização:
>    - PATCH é frequentemente utilizado quando se deseja atualizar campos específicos de um recurso sem afetar o restante das informações.
> Operação Atômica:
>    - As operações PATCH são consideradas atômicas, o que significa que a aplicação das modificações é tratada como uma única operação, garantindo consistência nos dados.
<br>
<br>

### :blue_book: Modelo de maturidade de Richardson 
---
<p align="justify"> :page_facing_up: Os níveis de maturidade do REST, também conhecidos como Richardson Maturity Model ou Modelo de Maturidade de Richardson, foram propostos por Leonard Richardson em seu artigo "Maturity Heuristics for Building Scalable and Maintainable RESTful Services". Este modelo define quatro níveis de maturidade para a implementação de serviços RESTful. Vamos explorar cada nível: </p>

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
<br>
<br>

### :blue_book: Hateoas
---
<p align="justify"> :page_facing_up: HATEOAS significa Hypermedia as the Engine of Application State. É um princípio de design para APIs RESTful que afirma que a API deve fornecer todas as informações necessárias para o cliente navegar no estado da aplicação. Isso significa que a API deve retornar links para recursos relacionados em suas respostas. Isso permite que o cliente descubra a API sem ter que conhecer a estrutura completa da aplicação com antecedência.</p>

:page_facing_up: Benefícios do HATEOAS

> - Desvinculação: O HATEOAS desvincula o cliente do servidor permitindo que o cliente descubra a API sem ter que conhecer a estrutura completa da aplicação com antecedência. Isso torna a API mais flexível e fácil de alterar.

> - Descobribilidade: O HATEOAS torna a API mais explorável fornecendo links para recursos relacionados em suas respostas. Isso torna mais fácil para os clientes encontrarem os recursos de que precisam sem ter que conhecer a estrutura completa da API com antecedência.

> - Facilidade de uso: O HATEOAS torna a API mais fácil de usar fornecendo uma maneira consistente para os clientes navegarem no estado da aplicação. Isso torna mais fácil para os desenvolvedores escrever clientes que consomem a API.

### :blue_book: Documentação com Swagger framework

:page_facing_up: O Swagger framework é uma ferramenta que pode ser usada para documentar APIs RESTful. Ele permite que os desenvolvedores criem uma documentação interativa que pode ser usada por desenvolvedores e consumidores da API.

:page_facing_up: O  framework pode ser usado para documentar APIs RESTful de várias maneiras. Uma maneira é usar a ferramenta Swagger UI. A Swagger UI é uma ferramenta web que pode ser usada para visualizar e testar APIs RESTful documentadas com o Swagger framework.

:page_facing_up: Outra maneira de usar o Swagger framework para documentar APIs RESTful é gerar documentação estática. A documentação estática pode ser usada em sites, wikis ou outros documentos.
<br>
<br>

### :blue_book: Autenticaçao com JWT 
---
<p align="justify"> :page_facing_up: A autenticação via JWT (JSON Web Token) é um método de autenticação que usa um token assinado digitalmente para representar as credenciais de um usuário. O token é gerado pelo servidor e enviado ao cliente, que o armazena em um local seguro. O cliente envia o token para o servidor em cada solicitação autenticada. O servidor verifica a assinatura do token e, se for válido, autentica o usuário. </p>

> O JWT é um formato de dados leve e compacto que é fácil de transportar e armazenar. O token é composto por três partes, separadas por pontos:
> - Header: Contém as informações sobre o tipo de token, o algoritmo de assinatura e o conteúdo do token.
> - HPayload: Contém as informações de autenticação, como o nome de usuário, o token de acesso e o tempo de expiração do token.
> - HSignature: É uma assinatura digital do header e do payload do token.

<p align="justify"> :page_facing_up: O JWT pode ser assinado usando uma chave secreta ou um par de chaves pública e privada. Se o token for assinado com uma chave secreta, o servidor e o cliente precisam compartilhar a chave secreta. Se o token for assinado com um par de chaves pública e privada, o servidor usa a chave privada para assinar o token e o cliente usa a chave pública para verificar a assinatura. </p>

> Anatomia de um JSON WEB TOKEN (JWT)


![1_2J0lK1r9c04ARTai-DrLQA](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/021d9ccf-f954-48fc-a139-673d7bb6b48d)

<br>
<br>

### :blue_book: Padrao de Projeto: Value Object VO / Data Transfer Object (DTO) - Farinha do mesmo saco.
---
<p align="justify"> :page_facing_up: O padrão de projeto VO, ou Value Object, é um padrão de projeto comportamental que descreve a criação de objetos que representam dados simples, como nomes, endereços ou números de telefone. Os VOs são frequentemente usados em sistemas de API para representar dados que precisam ser transferidos entre diferentes componentes do sistema.</p>

<p align="justify"> :page_facing_up: Os VOs são diferentes dos objetos de entidade (POs) em alguns aspectos importantes. Os POs representam entidades do mundo real, como clientes, produtos ou pedidos. Eles geralmente têm comportamentos associados, como criar, atualizar ou excluir. Os VOs, por outro lado, representam apenas dados simples. Eles não têm comportamentos associados e são geralmente usados ​​apenas para transferir dados entre diferentes componentes do sistema.</p>

<p align="justify"> :page_facing_up: Os VOs são usados ​​em sistemas de API para uma variedade de propósitos. Eles podem ser usados ​​para representar dados de entrada ou saída de uma API. Eles também podem ser usados ​​para representar dados que precisam ser transferidos entre diferentes componentes do sistema, como o controlador e o serviço.</p>
<br>
<br>

#### :blue_book: Referencia de Martin Fowler sobre VO e DTO  
---
<https://martinfowler.com/eaaCatalog/dataTransferObject.html>
> *"Quando você trabalha com uma interface remota, como Remote Facade (388), cada chamada para ela é cara. Como resultado, você precisa reduzir o número de chamadas, o que significa que você precisa transferir mais dados a cada chamada. Uma maneira de fazer isso é usar muitos parâmetros. No entanto, muitas vezes isso é difícil de programar - na verdade, muitas vezes é impossível com linguagens como Java, que retornam apenas um único valor."*

> *"A solução é criar um Objeto de Transferência de Dados que possa conter todos os dados da chamada. Ele precisa ser serializável para atravessar a conexão. Normalmente, um montador é usado no lado do servidor para transferir dados entre o DTO e quaisquer objetos de domínio."*

> *"Embora o principal motivo para usar um objeto de transferência de dados seja agrupar o que seriam várias chamadas remotas em uma única chamada, vale a pena mencionar que outra vantagem é encapsular o mecanismo de serialização para transferência de dados pela rede. Ao encapsular a serialização dessa forma, os DTOs mantêm essa lógica fora do restante do código e também fornecem um ponto claro para alterar a serialização, caso deseje."*

![vo](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/1e6a8a9f-6b66-4d86-ac00-d2d119377cfb)
<br>
<br>

### :blue_book: Evolutionary Database Design
---
<https://www.martinfowler.com/articles/evodb.html>

> <p align="justify"> O design evolutivo de banco de dados (EDBD) é uma abordagem para o design e desenvolvimento de bancos de dados que permite mudanças e adaptações ao longo do tempo. Essa abordagem é contrastante com o design de banco de dados tradicional, que envolve a criação de uma estrutura de banco de dados estática antecipadamente e, em seguida, a implementação dela sem alterações significativas.</p>

>  <p align="justify">  O esquema do banco de dados é desenvolvido de forma incremental, à medida que as necessidades do negócio mudam. Isso permite que os bancos de dados sejam adaptados às mudanças de requisitos sem a necessidade de uma reengenharia completa.</p>

> <p align="justify"> O EDBD é uma abordagem flexível e adaptável que pode ser usada para atender às necessidades de uma ampla gama de aplicações. É particularmente adequado para aplicações que estão sujeitas a mudanças frequentes de requisitos, como aplicações de comércio eletrônico e aplicativos móveis.</p>
<br>
<br>

### :blue_book: Customizando Serialization (JSON)
---
> As anotações @JsonPropertyOrder e @JsonProperty são usadas para controlar a forma como os campos de uma classe Java são serializados para JSON.

> A anotação @JsonPropertyOrder especifica a ordem dos campos na saída JSON. A ordem dos campos é especificada como uma matriz de strings, onde cada string é o nome do campo. Por exemplo, a seguinte classe Java:

```
Java
public class Pessoa {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("idade")
    private int idade;

    @JsonProperty("endereco")
    private Endereco endereco;
}
```

```
JSON
{
    "nome": "José da Silva",
    "idade": 30,
    "endereco": {
        "rua": "Rua da Paz",
        "numero": 100,
        "bairro": "Centro"
    }
}
```
> Para especificar uma ordem diferente, podemos usar a anotação @JsonPropertyOrder

```
JAVA
@JsonPropertyOrder({"idade", "nome", "endereco"})
public class Pessoa {
    // ...
}
```

> Para especificar um nome diferente para um campo, podemos usar a anotação @JsonProperty:

```
@JsonProperty("nomeCompleto")
private String nome;
```
<br>
<br>

### :blue_book: Content Negotiation
---
<p align="justify">  :page_facing_up: API suporta content negotiation, o que significa que ela pode fornecer o resultado em diferentes formatos, como XML, CSV, YAML, e também em diferentes idiomas. Essa capacidade é importante para garantir que a API possa ser consumida por diferentes clientes, independentemente de suas preferências ou restrições.</p>

<p align="justify"> :page_facing_up: Para especificar o formato e o idioma da resposta, o cliente deve enviar o header Accept na requisição HTTP. O servidor, então, usará esse header para determinar o formato e o idioma da resposta.</p>

<p align="justify"> :page_facing_up: O content negotiation funciona usando os headers da requisição HTTP. O cliente envia um header Accept que especifica os formatos e idiomas que ele aceita. O servidor, por sua vez, usa esse header para determinar o formato e o idioma da resposta. </p>

Por exemplo, o cliente pode enviar a seguinte requisição HTTP para solicitar o resultado em formato XML:

```
GET /produtos HTTP/1.1
Accept: application/xml
Nesse caso, o servidor retornará a lista de produtos no formato XML.
```

<p align="justify"> :page_facing_up: Para implementar o content negotiation em sua API, você precisará configurar o servidor para responder às requisições HTTP com base nos headers Accept. Você pode fazer isso usando uma biblioteca de processamento HTTP, como o Spring Boot: https://spring.io/projects/spring-boot ou o FastAPI: https://fastapi.tiangolo.com/.</p>

Este projeto implementa faster atraves das dependencias maven : 
```
<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
</dependency>

<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-yaml</artifactId>
</dependency>
```
<br>
<br>

### :blue_book: Adcionado Hateoas
---
-------------------> explicar depois e detalhar, nesse momento estou sem paciencia para este item.
<br>
<br>

### :blue_book: Mockito
---

> <p align="justify"> Mockito é um framework de teste de código aberto para Java lançado sob a licença MIT. A estrutura permite a criação de objetos duplos de teste em testes de unidade automatizados para fins de desenvolvimento orientado a testes ou desenvolvimento orientado a comportamento. </p>
> <p align="justify">Ele fornece uma API simples e concisa para criar objetos duplos de teste. Os objetos duplos podem ser usados para simular a interação com outros objetos ou sistemas, permitindo que os testes se concentrem no comportamento da unidade de teste em questão. </p>

