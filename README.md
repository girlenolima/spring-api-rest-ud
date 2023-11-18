# spring-api-rest-ud

# Web Service 
> Serviços web são uma tecnologia essencial para a comunicação entre sistemas computacionais pela World Wide Web. Eles facilitam a transferência de dados e a execução de funções entre diferentes plataformas, empregando protocolos como SOAP (Simple Object Access Protocol) para serviços baseados em XML e REST (Representational State Transfer) para abordagens mais leves baseadas em padrões HTTP. A descrição de serviços é feita através de linguagens como WSDL (Web Services Description Language) ou especificações como Swagger/OpenAPI. A segurança é garantida por meio de protocolos como SSL/TLS e extensões específicas, como WS-Security. Diversas implementações, como JAX-WS para serviços SOAP e JAX-RS para serviços REST, proporcionam a criação eficiente e interoperável de serviços web, promovendo a integração de sistemas de maneira global.

> Esses serviços também se beneficiam de registros como o UDDI (Universal Description, Discovery, and Integration) para facilitar a descoberta global de serviços. Os formatos de dados, como XML e JSON, desempenham papéis cruciais na troca eficiente de informações entre sistemas. Essa abordagem amplamente adotada oferece uma arquitetura flexível e padronizada, promovendo a conectividade e a colaboração eficaz entre aplicações distribuídas em ambientes diversos.

# Rest 
> REST (Representational State Transfer) é uma arquitetura de software que define um conjunto de princípios e restrições para o design de serviços web. Diferentemente de protocolos como SOAP, REST não é um protocolo, mas um estilo arquitetônico baseado em padrões da web, como HTTP.REST é frequentemente utilizado em conjunto com o protocolo HTTP, aproveitando os métodos HTTP para operações CRUD (Create, Read, Update, Delete) e os códigos de status para indicar o resultado da operação. Essa abordagem simplificada e baseada em padrões torna o REST uma escolha popular para o desenvolvimento de serviços web, especialmente em contextos onde a simplicidade e a escalabilidade são prioridades.

> - Representação: Os recursos são representados por entidades, que são objetos de dados que podem ser manipulados por operações.
> - Sinalização: As operações são realizadas por meio de métodos HTTP, como GET, POST, PUT e DELETE.
> - Cadeias de recursos: Os recursos são relacionados por meio de URLs, que podem ser compostas para representar relacionamentos complexos.
> - Cacheabilidade: Os recursos podem ser armazenados em cache pelo cliente ou pelo servidor, para melhorar o desempenho.
> - Segurança: Os recursos podem ser protegidos por meio de mecanismos de autenticação e autorização.
> - Evolução: Os sistemas RESTful devem ser projetados de forma a serem facilmente evoluídos, sem afetar a funcionalidade ou a interoperabilidade.

# Resquest e Response

Request (Requisição):
> Em um contexto de serviços web, uma requisição (ou request) é uma mensagem enviada por um cliente para solicitar a execução de uma operação específica em um servidor. Essa mensagem inclui informações como o método da requisição (como GET, POST, PUT ou DELETE), o URL do recurso desejado e, em casos de métodos que permitem o envio de dados, os parâmetros ou corpo da requisição. As requisições são a maneira pela qual os clientes interagem com os serviços web, solicitando ações ou informações específicas.

![request](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/fae37093-d8fa-4b79-ab27-8b09297aa06b)


Response (Resposta):
> Uma resposta (ou response) é a mensagem enviada pelo servidor em resposta a uma requisição recebida. Ela contém informações sobre o resultado da operação solicitada pelo cliente. Isso inclui um código de status HTTP que indica se a operação foi bem-sucedida, informações adicionais sobre a resposta e, quando apropriado, dados retornados pelo servidor. As respostas podem conter dados no formato desejado, como HTML, XML ou JSON, dependendo do tipo de serviço web e das preferências especificadas na requisição. O conjunto de códigos de status HTTP, como 200 OK, 404 Not Found e 500 Internal Server Error, é utilizado para comunicar o resultado da operação ao cliente de forma padronizada.

![response](https://github.com/girlenolima/spring-api-rest-ud/assets/75032231/a55d5b48-4110-4f88-86f9-fb3945ce6dc1)

