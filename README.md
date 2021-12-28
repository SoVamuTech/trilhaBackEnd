<h1 align="center">
    <img src="https://ik.imagekit.io/j5g11jplqm5/NTT-Data-Logo_4rrWLwgl_.png?updatedAt=1636466995979">
</h1>

- [Sobre](#📄-sobre)
- [Desafios](#🚀-desafios)

## 📄 Sobre

O projeto <b>Financys</b> é um projeto de controle financeiro criado dentro do programa <b>Cybertron</b> com a finalidade de estudarmos e colocarmos em prática o Spring Boot diante de desafios teóricos e práticos.

## 🚀 Desafios 

<h3 >
    🎯 Desafio 1<br>
</h3>

<p>

a) Com suas palavras defina o que é um sistema de controle de versões (VCS)? (máx 10
linhas)<br>

R: O controle de versão tem como objetivo rastrear e gerenciar as alterações em códigos de
projetos de software, ajudando as equipes a trabalhar de forma mais rápida. Mantém o
registro de todas as modificações feitas ao longo do tempo, assim, se um erro for cometido,
os desenvolvedores podem voltar e comparar o código com versões anteriores para poder
corrigir o erro. Trabalhando em equipe, pode acontecer de dois desenvolvedores alterarem
uma mesma parte do código, o controle de versão ajuda a equipe rastreando essas
mudanças e ajudando a evitar conflito em trabalhos simultâneos.<br>

b) Cite 5 vantagens em utilizar um VCS:<br>

R: Preserva a eficiência e agilidade da equipe; ajuda na análise da causa raíz dos bugs; ser
capaz de rastrear cada alteração feita no código e ainda deixar uma mensagem
descrevendo a mudança; criar uma ramificação para nos beneficiar da capacidade de
trabalhar em fluxos independentes de mudança e segurança, cada software de controle de
versão usa mecanismos para evitar qualquer tipo de invasão de agentes infecciosos nos
arquivos. Além do mais, somente usuários com permissão poderão mexer no código.<br>

c) Cite 3 exemplos de VCS:<br>

R: Git, TFS, SVN (Subversion)

</p>

<h3 >
    🎯 Desafio 2<br>
</h3>

<p>
a) Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus
pilares? (máx 10 linhas) <br>

R: A orientação a objetos é um paradigma usado na programação e diz respeito a um
padrão de desenvolvimento seguido por muitas linguagens, como C# e Java. O intuito da
sua criação foi o de aproximar o manuseio das estruturas de um programas ao manuseio de
coisas no mundo real. Esse paradigma se baseia principalmente em dois conceitos, classes
e objetos, podemos dizer que um objeto está dentro de uma classe e o mesmo possui
características que são seus atributos e seus comportamentos são os métodos. Além disso,
a POO possui 4 pilares, abstração, encapsulamento, herança e polimorfismo.<br>

b) Exemplifique e explique um cenário de abstração;<br>

R: A abstração é a captura das principais características do objeto, de forma que elas
possam ser descritas dentro de uma classe, por exemplo o objeto carro, ele tem suas
propriedades, exemplificando, cor, quantidade de portas, modelo, marca, etc. E não só as
propriedades, ele tem também seus métodos como, frear, acelerar, buzinar, acender os
faróis, etc. <br>

c) Exemplifique e explique um cenário de encapsulamento;<br>

R: O encapsulamento é um técnica que adiciona segurança à aplicação, pelo fato de
esconder as propriedades. Para isso, é criada uma estrutura que contém métodos que
podem ser utilizados por qualquer outra classe, sem causar inconsistências no
desenvolvimento de um código. E isso é feito através dos métodos getters e setters. Tendo
como exemplo uma classe de conta bancária, nela temos os atributos nome e saldo e
usaremos os métodos depositar e sacar, se os atributos puderem ser acessados
diretamente em qualquer parte do código, corre o risco de o saldo ser alterado sem passar
pelo método depositar. Para evitar isso, usamos os métodos get e set.<br>

d) Exemplifique e explique um cenário de herança;<br>

R: A herança é um pilar que faz uso de um dos recursos mais vantajosos da POO, o reuso
de código, uma classe filha herda todas as características da sua classe pai, ou seja ela
possui todos os métodos e atributos da classe a qual deriva. Por exemplo, a classe Fiat,
deriva da classe Carro, então a classe Fiat terá todas as características da classe Carro
mais as características dadas a ela.<br>

e) Exemplifique e explique um cenário de polimorfismo;<br>

R: O polimorfismo é a alteração de um método herdado de um objeto pai. Por exemplo,
temos um objeto pai chamado Eletrodoméstico e outros dois objetos filhos chamados
Televisão e Geladeira, eles não são ligados da mesma forma, portanto teríamos que
reescrever o método Ligar().<br>

f) Cite 5 vantagens da POO;<br>

R: - Reuso de código
- Permite que você represente melhor o mundo real em seu programa
- Os programas são mais fáceis de modificar
- Otimização do tempo, com o recurso da herança por exemplo, fica mais fácil criar
vários objetos, então economiza bastante o tempo.
- Todo software orientado a objeto é confiável (ao alterar uma parte nenhuma outra é
afetada)

</p>

<h3 >
    🎯 Desafio 3<br>
</h3>

<p>

a) Com suas palavras defina: (máx 5 linhas)<br>

i. O que é o protocolo de comunicação HTTP e como ele funciona;<br>

R: HTTP é um protocolo de transferência que possibilita que as pessoas que inserem a URL
do seu site na Web possam ver os conteúdos e dados que nele existem. As pessoas que
acessam o site enviam solicitações a servidores. Depois que a solicitação é atendida por
um servidor, a conexão entre o usuário e o servidor é desconectada. Uma nova conexão
deve ser feita para cada solicitação, isto é, cada vez que alguém acessa o seu site.<br>

ii. O que é REST, e qual é a sua relação com o protocolo HTTP;<br>

R: REST é um conjunto de restrições de arquitetura. A arquitetura REST é composta de um
conjunto de diretrizes que podem ser implementadas conforme necessário. Quando um
cliente faz uma solicitação usando uma API RESTful, essa API transfere uma representação
do estado do recurso ao solicitante ou endpoint. Essa informação (ou representação) é
entregue via HTTP.<br>

iii. O que é Web API, e qual é a sua relação com REST;<br>

As APIs são construções disponíveis nas linguagens de programação que permitem a
desenvolvedores criar funcionalidades complexas mais facilmente.Uma Web API fornece
toda infraestrutura para o desenvolvimento dos serviços, faz a escolha do método a ser
executado, converte as mensagens em parâmetros e os tipos adequados, aplica filtros, etc.<br>

b) Liste todos os métodos de solicitações HTTP utilizados pelo padrão REST e suas
respectivas finalidades;<br>

R: GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS e CONNECT.<br>

i) O que é Swagger? (máx 5 linhas)<br>

R: O swagger é um documento que especifica a lista de recursos que estão
disponíveis na API REST e as operações que podem ser chamadas nesses
recursos. O documento Swagger também especifica a lista de parâmetros para uma
operação, incluindo o nome e o tipo dos parâmetros, se os parâmetros são
necessários ou opcionais e informações sobre valores aceitáveis para esses
parâmetros

</p>

<h3 >
    🎯 Desafio 4<br>
</h3>

<p>

a) Com suas palavras conceitue: (máx 5 linhas/cada)<br>

i. O que é JDBC?<br>

R: JDBC significa Java Database Connectivity. Esta é uma tecnologia bem conhecida e
comumente utilizada para a implementação da interação do banco de dados. É um conjunto
de classes e interfaces (API) escritas em Java que fazem o envio de instruções SQL para
qualquer banco de dados relacional; Api de baixo nível e base para api’s de alto nível.<br>

ii. O que é ORM, cite 3 exemplos?<br>

R: É uma técnica de mapeamento objeto relacional que permite fazer uma relação dos
objetos com os dados que os mesmos representam. O ORM é a ponte entre o mundo
relacional e o mundo orientado a objetos, é ele quem vai permitir que você armazene os
seus objetos no banco de dados. Ex: Hibernate, NHibernate, Entity Framework.<br>

iii. O que é JPA e qual é a sua relação com os ORM’s?<br>

R: JPA é uma especificação oficial que descreve como deve ser o comportamento dos
frameworks de persistência Java que desejarem implementá-la. AJPA é uma interface que
possui algumas assinaturas, Apesar de não ter nada executável, a especificação possui
algumas classes, interfaces e anotações que ajudam o desenvolvedor a abstrair o código. É
também um framework para Mapeamento Objeto-Relacional (ORM - Object-Relational
Mapping).<br>

iv. O que é Spring Data?<br>

R: O Spring Data é um framework que nasceu para facilitar a criação dos nossos
repositórios.Ele faz isso nos liberando de ter que implementar as interfaces referentes aos
nossos repositórios (ou DAOs), e também já deixando pré-implementado algumas
funcionalidades como, por exemplo, de ordenação das consultas e de paginação de
registros.<br>

d) O que caracteriza um projeto “CRUD básico”?<br>

R: Um sistema CRUD básico seria aquele que realiza as quatro operações básicas, C
(Create), R (Read), U (Update), D (Delete), sem o uso de outros recursos dos bancos de
dados relacionais. O CRUD por si só representa a forma representar (computacionalmente)
e manipular os dados. Do ponto de vista do desenvolvedor, ele precisará criar as tabelas
(modelos) do banco de dados, funções (controles) que atualizarão o banco de dados e as
interfaces (visões), como página web ou aplicativo mobile, em que os usuários irão interagir
com os dados. Em sistemas mais atuais, os dados do CRUD podem ser manipulados por
outros sistemas via API

</p>

<h3 >
🎯 Desafio 5<br>
</h3>
<p>

a) Defina com suas palavras qual é a responsabilidade das camadas
vistas até agora, entity, controller, repository e service. (máx 10 linhas)<br>

● Entity: É a camada que contém as entidades, as classes contendo um ou mais
construtores, atributos e métodos que encapsulam seu comportamento.<br>

● Controller: É a camada responsável tanto por receber requisições
como por enviar a resposta ao usuário.<br>

● Repository: Anota classes na camada de persistência, que atuará
como um repositório de banco de dados. Através dela, podemos fazer
consultas e inserções no banco de dados.<br>

● Service: Faz anotações de classes na camada de serviço. Se
utiliza uma camada de serviço no meio, entre o controller e o repository, na qual ficam
as regras de negócio da aplicação.

</p>

<h3 >
🎯 Desafio 6<br>
</h3>
<p>

a) O que significa DTO, e qual sua importância? (máx 10 linhas)<br>

R:  DTO é um padrão de projetos bastante usado em Java para o 
transporte de dados entre diferentes componentes de um sistema,
diferentes instâncias ou processos de um sistema distribuído 
ou diferentes sistemas via serialização. São classes que ajudam
a fazer a manipulação dos dados de forma mais segura, 
encapsulando os objetos e tornando a aplicação mais segura.

</p>

<h3 >
🎯 Desafio 8<br>
</h3>
<p>

a) O que são exceptions? (máx 5 linhas)

R: A exceção é um evento não esperado que acontece no sistema em tempo de execução. 
Quando o sistema acha alguma exceção interrompe o fluxo de código.

b) Qual é o funcionamento do try, catch e finally? (máx 10 linhas)

R: Um bloco try contém comandos que caso ocorra algum erro desviará para os blocos catch correspondentes. 
Uma cláusula catch contém declarações que especificam o que fazer caso uma exceção seja lançada no bloco try. 
Caso a exceção não seja esperada no primeiro bloco catch, a execução pula pro próximo bloco catch, se houver. 
O bloco finally sempre finaliza a sequência de comandos do sistema, independente de ocasionar algum erro no sistema. 
Esse bloco é opcional, não é obrigatório colocá-lo na sequência try/catch.

c) Qual a relação entre “try, catch e finally” e “throws”? (máx 5 linhas)

R: Todos são usados para tratamento de exceções.

d) Para que serve a annotation @ExceptionHandler? (máx 5 linhas)

R: É uma anotação usada para tratar as exceções específicas e enviar as respostas personalizadas ao cliente.

e) Para que serve o comando throw? (máx 5 linhas)

R: É usado em situações em que não é desejado que uma exceção seja tratada na própria classe ou método, mas sim em outro método que venha lhe chamar. Para isso, utilizamos o comando throws na assinatura do método.

f) Para que serve a annotation @ControllerAdvice? (máx 10 linhas)

R: É usado para tratamento global de erros no aplicativo Spring MVC. Ele também tem controle total sobre o corpo da resposta e o código de status.

</p>

<h3 >
🎯 Desafio 9<br>
</h3>

<p>
a) O que é um padrão de projeto e por que nós os utilizamos? (máx 5 linhas) 

R: São padrões usados para solucionar problemas comuns 
encontrados no desenvolvimento ou manutenção de um software. 
São utilizados visando solucionar aqueles problemas comuns
que todo desenvolvedor encontra no dia a dia.

b) Cite e explique com suas palavras:

i. Um dos padrões de criação;

R: Factory Method, define uma interface para criar objetos, 
mas deixa que as subclasses decidam que classe instanciar. 
O Factory Method, permite adiar a criação do objeto a subclasses.

ii. Um dos padrões estruturais;

R: Adapter, converte a interface de uma classe por outra esperada 
pelos clientes . O que possibilita que classes com interfaces 
incompatíveis trabalhem em conjunto. Faz exatamente o que um 
adaptador da vida real faz (pense em um adaptador de tomadas, 
ele permite que um plug de um formato ligue em outro plug com um
formato diferente).

iii. Um dos padrões comportamentais;

R: Template Method, define o esqueleto de um algoritmo em um 
método. O Template Method permite que subclasses redefinam 
certos passos de um algoritmo sem mudar a estrutura dele.

c) Explique o conceito de arquitetura de software e seu propósito.

R: Arquitetura de software, resumidamente, é o modelo no qual o 
sistema deve ser desenvolvido. Ela abrange a forma como suas 
partes devem ser organizadas, incluindo questões como o 
comportamento e quais componentes são responsáveis por realizar 
um conjunto específico de funções. Identifica os principais 
componentes estruturais de um sistema e os relacionamentos entre 
eles. O resultado do processo de projeto de arquitetura é um modelo 
de arquitetura que descreve como o sistema está organizado em um 
conjunto de componentes de comunicação.

i. Qual arquitetura estamos seguindo até o momento? Justifique sua resposta. (máx 10 linhas)

R: Arquitetura de camadas(layers), pois os componentes da aplicação
estão organizados em camadas de funcionalidades, que podem ser 
desconstruídas em diferentes serviços.

e) O que significa a sigla SOLID?

R: O S.O.L.I.D é um acrônimo que representa cinco princípios da 
programação orientada a objetos e design de código.

Single Responsibility Principle (Princípio da Responsabilidade Única)

Open/Closed Principle (Princípio do Aberto/Fechado)

Liskov Substitution Principle (Princípio da Substituição de Liskov)

Interface Segregation Principle (Princípio da Segregação de Interfaces)

Dependency Inversion Principle (Princípio da Inversão de Dependências)

f) Quais princípios foram utilizados no projeto até o momento? Explique. (máx 10 linhas)

R: Princípio da Responsabilidade Única, pois cada camada da 
aplicação tem uma funcionalidade, como as classes repositories, 
ela tem a função de trabalhar diretamente com o banco na 
manipulação dos dados, já a camada de exception cuida das 
exceções da aplicação.

</p>

<h3 >
🎯 Desafio 10<br>
</h3>

<p>

a) O que você entende por Spring Framework?

R: É um framework desenvolvido para o Java baseado em padrões
de projeto, inversão de controle e injeção de dependência.
É constituído por diversos módulos capazes de impulsionar e
melhorar muito nossa aplicação Java.

b) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades;

R: Spring Data JPA - tem o propósito de fornecer um modelo de programação baseado em Spring para acesso a dados de maneira fácil e sem complicações.

Spring Security - é uma estrutura de autenticação e autorização poderosa e altamente personalizável para proteção de aplicações baseados em Spring Framework.

Spring Web - é utilizado para criar aplicativos Web, incluindo RESTful, utilizando o Spring MVC.

c) Quais ferramentas do Spring foram utilizadas na trilha até o momento?

R: Spring Data JPA e Spring Web.

d) Cite 5 vantagens em utilizar Spring;

Reduz o tempo de desenvolvimento, devido as facilidades de configuração.
Aumenta a produtividade, já que o desenvolvedor gasta menos tempo nas   configurações de projeto
Possui um servidor embutido, o Tomcat.
Arquivo pom.xml bem organizado, pois colocando uma dependência, temos acesso às subdependências. Então, adicionando apenas uma dependência, você tem acesso a várias outras sem ter que colocá-las de fato na sua aplicação.
Não necessitamos começar uma aplicação do zero, o spring dá todas as configurações iniciais.

e) Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server;

R: Primeiro criamos o projeto no site Spring Initializr. Neste projeto, temos um arquivo muito importante, o pom.xml, que contém as dependências que definimos para o nosso projeto. E o arquivo FinancysApplication que contém o main. Vamos criar um pacote para nossas entidades, que conterá os métodos e atributos do nosso objeto. Em seguida criamos nosso repositório, que estende da interface JpaRepository do Spring Data. Esta interface possui métodos para as operações padrão de um CRUD. Aproveitando que definimos o repositório, vamos configurar o banco de dados SQL Server. Esta configuração deve ser definida no arquivo application.properties. Por fim, vamos definir o controller da nossa aplicação. Assim como antes, ele será definido em um sub-package do package padrão da aplicação. Desta maneira teremos uma aplicação com conexão com o SQL Server.

f) Qual a funcionalidade do pom.xml?

R: O arquivo pom.xml contém todas as configurações que o Maven necessita para interagir corretamente com o projeto, ele possui coordenadas, dependências, repositórios, plugins e estratégias de construção do projeto.

g) Qual a funcionalidades do applications.properties?

R: No arquivo das propriedades de aplicação é possível parametrizar muitos aspectos e comportamentos da aplicação.

h) Qual o propósito das Annotations?

R: É um recurso da plataforma Java que fornece o uso de metadata ao longo do código que podem ser interpretadas por um compilador que irá realizar alguma tarefa pré-definida.

i) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização

R: @Entity - Declara uma entidade do tipo relacional, como uma tabela, porém é uma classe java.

@Id - Define o identificador da tabela

@SequenceGenerator - Forma de auto incremento de determinado campo.

@Override - É uma anotação de marcador que pode ser usada apenas em métodos. Um método anotado com @Override deve substituir um método de uma superclasse.

@Documented - É uma interface de marcador que informa a uma ferramenta que uma anotação deve ser documentada.

@Mapping - permite definirmos qual atributo da classe será mapeado para outro com nome diferente.

@Autowired - permite fazer uma injeção de dependência em uma classe.

@Controller - é uma anotação comum usada para marcar uma classe como Spring MVC Controller.

@Service faz anotações de classes na camada de serviço.

@Repository anota classes na camada de persistência, que atuará como um repositório de banco de dados.

j) O que é um advice em Spring? Quais os tipos de advice para o Spring?

R: Advice é uma ação realizada por um aspecto em um ponto de junção específico; existem alguns tipos como, before, after, after-returning, after-throwing e around.


k) O que é Spring IoC Container?

R: O Spring IoC container busca informações em XML, annotations ou código java sobre como os beans devem ser instanciados, configurados e montados, e como se relacionam com outros beans.

l) Como adicionamos segurança à nossa aplicação Spring?

R: Utilizando o Spring Security, que é um framework do projeto Spring que possui um sistema de autenticação e autorização de alto nível e altamente customizável para aplicações Java.

m) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?

R: JPA.

n) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade

R: Frequentemente temos especificações de aplicações que necessitam realizar tarefas de 
forma agendada, sejam para geração de relatórios, backups, ou simplesmente para tirar 
proveito de momentos com menor tráfego de rede para a execução de tarefas que demandem 
maior necessidade computacional. O Spring Framework fornece abstrações para a execução 
assíncrona e agendamento de tarefas com as interfaces TaskExecutore TaskScheduler, 
respectivamente.

</p>

<h3 >
🎯 Desafio 11<br>
</h3>

<p>

a) O que são libs quando se trata de código? (máx 3 linhas)

R: São bibliotecas, que é uma coleção de subprogramas usados no desenvolvimento de um software, elas contém código e dados auxiliares, que provém serviços a programas independentes, o que permite o compartilhamento e a alteração de código e dados.

b) Cite 2 libs populares no Java e seu objetivo; (máx 3 linhas)

R: JUnit - Com o Junit podemos criar testes para verificar funcionalidades de classes e seus métodos.

Mockito Core - Usado durante o teste de unidade, isso permitirá que você não gire um ambiente inteiro para o seu teste.

c) Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml? (máx 5 linhas)

R: Maven é uma ferramenta de automação de compilação. O principal objetivo do Maven é facilitar e uniformizar todas as fases de construção de um projeto. auxilia na configuração do projeto, na construção, versionamento e na manutenção. O pom.xml é a unidade fundamental de trabalho no Maven. É um arquivo XML que contém informações sobre o projeto e detalhes de configuração usados ​​pelo Maven para compilar o projeto.

d) Qual é a diferença do Maven para o Gradle? (máx 3 linhas)

R: O Gradle é uma ferramenta mais robusta que o Maven. Os scripts do Gradle são declarativos, de fácil leitura, e expressivo. Escrever o código em Groovy ao invés de XML como fazemos no maven, o tamanho de um script é bem menor e muito mais legível.

e) Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC, os drivers de comunicação com os bancos de dados.

I. Qual a relação entre os termos lib, driver e JDBC?

R: Podemos dizer que o JDBC é a API que reúne conjuntos de classes e interfaces escritas na linguagem Java na qual possibilita se conectar através de um driver específico do banco de dados desejado. E as libs são as dependências do banco desejado colocadas no arquivo pom.xml. Os Drivers, além de atuar como uma interface entre os SGBDs e as aplicações, também pode ser considerado como um tradutor que ajuda na definição das mensagens binárias trocadas com um protocolo de um SGBD.

II. Como é adicionado uma lib no projeto?

R: Fazendo a importação de pacotes pra dentro do projeto, mas é necessário que a implementação desse pacote esteja em um lugar conhecido. Com o Maven, você não precisa se preocupar em procurar os arquivos jars das bibliotecas para adicioná-los ao classpath do seu projeto. Isso é feito pelo Maven, você só precisa se preocupar em informar o identificador daquela dependência para que ele saiba quem baixar.

III. Escolha um banco de dados (menos o H2) e explique como utilizar o driver de comunicação.

R: No arquivo pom.xml adicionamos as dependências e o driver de comunicação do SQL Server. Precisamos substituir em application.properties as propriedades do banco de dados H2 definidas, pelas propriedades do SQL Server. Configurar o SQL Server na sua máquina.

</p>

