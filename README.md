<h1 align="center">
    <img src="https://user-images.githubusercontent.com/96594294/149683574-9d5e207f-9ad6-4f33-86dd-e301e09816e6.png">
</h1>

## 👋 Bem-Vindo

### Este repositório git tem como objetivo auxiliar os guias a padronizar e escalar os ensinamentos e experiências de cada mochileiro.


### Todos os códigos aqui escritos foram seguindo o material disponibilizado na trilha a fim de verificar a veracidade do conteúdo exigido pela trilha back-end java. 

## 🤷‍♂️ Obrigações dos Guias
### Os guias tem como obrigação manter as informações atualizadas dos nosso mochileiros, questionar e avaliar seu conhecimento e desempenho. Além de ser uma fonte de conhecimento e experiência.

## 👇 Imagem Relevante das Obrigações dos Guias
<img  src="https://user-images.githubusercontent.com/96594294/149683738-63f75a6e-1868-410f-830b-3b6f7134b4de.png">

## 📚 Lista de Desafios
- [Desafio 1](#-Desafio-1)
- [Desafio 2](#-Desafio-2)
- [Desafio 3](#-Desafio-3)
- [Desafio 4](#-Desafio-4)
- [Desafio 5](#-Desafio-5)
- [Desafio 6](#-Desafio-6)
- [Desafio 7](#-Desafio-7)
- [Desafio 8](#-Desafio-8)
- [Integração](#-Integração)

## 🎯 Desafio 1

### 👩‍💻 Descrição Técnica
Este desafio tem como objetivo criar e configurar a máquina para fazer todos os desafios, além de ensinar a fazer um readme.md bonito para adicionar todas as respostas teóricas na brach main facilitando a correção das perguntas teóricas e enriquecendo o seu repositório.
### 💡 Dicas e truques
Este desafio é importante para o versionamento das atividades conceitos de versionamento estaram presentes em todo o restante da trilha por isso devemos analizar os seguintes pontos:
- Cada branch do desafio deve ter os desafios anteriores e o atual que o mochileiro está fazendo, após terminar ele irá margear a branch para a main;
- Este repositório está no padrão que deve ser seguido e entregue os desafios no final da trilha;
- O readme.md pode ser utilizado para mostrar ao mochileiro que seu repositório não está versionado corretamente, sempre cobrar ao longo da trilha que este arquivo esteja versionado da forma correta;
- Passar a ideia que a main sempre tem que estar atualizada e que ela pode ser o código que vai para "produção", além de entender que uma branch desatualizada pode prejudicar na frente.
### 🎉 Criterios de Aceite da Avaliação
- Nome correto do repositório;
- Respostas teóricas corretas;
- Maquina já configurada;
- Readme.md Bonito esteticamente.

### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Desafio 2

### 👩‍💻 Descrição Técnica
Este desafio tem como objetivo testar os conhecimentos básicos de POO, saber se o mochileiro consegue entender bem como funciona o java, assim auxiliar ele nas possíveis dúvidas que ele tenha e já começar a entender suas dificuldades.
### 💡 Dicas e truques
O feedback do primeiro desafio é bastante valioso para o mochileiro que pode começar a estudar por fora alguns conceitos que ele ainda não entende de POO.
- Extremamente importante que o guia avalie e peça para explicar os conceitos de POO sendo rigoroso, pois o POO é a base do java e springBoot;
- Na branch 2 está a versão mais otimizada do código, fica a critério do guia e do tempo restante para entregar a atividade que otimize o codigo da melhor forma possível;
- Peça para seu guia se estiver com muita dificuldade mostre ele escrevendo o código e avalie bem o seu conhecimento nessa primeira atividade. 
### 🎉 Criterios de Aceite da Avaliação
- Ter criado a brach corretamente seguindo o desafio;
- Respostas teóricas corretas;
- Ver se o retorno está exatamente oque foi pedido no desafio;
- Verificar se está filtrando por ordem os produtos.

### 🚧 Ponto Importante da Trilha
Nesse desafio que explica os models do projeto, nele está escrito que a categoria é um agrupamento de lançamentos. Sempre retornar no enunciado do desafio para confirmar essa premissa com o mochileiro.

### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Desafio 3

### 👩‍💻 Descrição Técnica
Este desafio tem como objetivo apresentar a primeira camada do SpringBoot que é a controller, o mochileiro terá que implementar uma controller utilizando as classes feitas no desafio anterior (categoria e lançamento). Irá utilizar uma lista em runtime para simular uma base de dados assim entendendo como funciona a troca de informações entre um cliente e uma API REST. Aprenderá sobre protocolo HTTP para poder completar o desafio.
### 💡 Dicas e truques
Neste desafio ele terá que utilizar o postman para simular o cliente, terá também que configurar a documentação do Open API em sua API.
- Verificar se está passando corretamente o JSON e o método utilizando o postman;
- Acompanhar o processo que está executando para adicionar objetos na API;
- Pedir para inserir usando o postman e Open API;
- Ainda não solicite que faça o relacionamento da classe categoria e lançamentos.

### 🎉 Criterios de Aceite da Avaliação
- Ter criado a brach corretamente seguindo o desafio;
- Respostas teóricas corretas;
- Código bem escrito e identado corretamente;
- Verificar se o retorno está ordenado por data;
- Acompanhar os processos pelo postman e Open API;
- Verificar se está utilizando os protocolos HTTP corretamente.

### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Desafio 4

### 👩‍💻 Descrição Técnica
Neste desafio o mochileiro terá que fazer a integração com o banco de dados H2, adicionar a camada de repository, fazer o relacionamento no banco de dados entre categoria e lançamento ([Desafio2](#-Ponto-Importante-da-Trilha)) e fazer algumas regras de negócio referentes a API
### 💡 Dicas e truques
Este é um dos desafios mais críticos para os mochileiros, conceitos básicos de crud, banco de dados, relacionamento entre classes os confundem e consome muito do seu tempo e energia de aprendizado.
- Nos end-points de POST e PUT, perguntar sobre as anotações @RequestBody e @PathVariable para que possam te explicar;
- Pedir para abrir o H2 para verificar se os dados estão realmente salvando;
- Voltar na descrição da [atividade 2](#-Ponto-Importante-da-Trilha) para ajudar eles no relacionamento e identificar que tipo é cada um @OneToMany, etc.., ajudando assim a identificar o tipo de relacionamento;
- Depois de fazerem o relacionamento pedir para ver se realmente a tabela está relacionada além de pedirem para fazer o processo de create passando um objeto no corpo do JSON;
- Quando fizerem o relacionamento irá ocorrer um loop no retorno do findAll do lançamento, pedir para pesquisar como que resolver este problema;
- Nos últimos passos do hands-on (xiii,ix,x,xi,xii) é um ponto bem crítico que precisa de bastante ajuda, pois são 2 regras de negócio que os mochileiros têm muita dificuldade para entender e escrever.

### 🎉 Criterios de Aceite da Avaliação
- Ter criado a brach corretamente seguindo o desafio;
- Respostas teóricas corretas;
- Código bem escrito e identado corretamente;
- Verificar se está persistindo na base de dados H2;
- Verificar se o relacionamento está funcionando na base de dados e se está correto.
- Verificar os passos do hands-on (xiii,ix,x,xi,xii) se o que foi pedido está sendo executado corretamente.


### 🚧 Ponto Importante Trilha
Este ponto que o mochileiro faz o relacionamento na base de dados de forma correta é extremamente importante para que ele possa fazer os demais desafios, existem regras de negócios e requisitos posteriormente que tem como premissa este relacionamento de forma correta.

### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Desafio 5

### 👩‍💻 Descrição Técnica
No desafio 5 o mochileiro implementa a camada de serviço e aprende todas as camadas da aplicação, separando finalmente as regras de negócio da camada de controller que estavam sendo exigidas até o momento. Precisa implementar também o ResponseEntity na camada de controller refatorando pela primeira vez o código.
### 💡 Dicas e truques
- Explicar a importância da ResponseEntity e seu retorno com os códigos de forma correta, sobre a tipagem do retorno da ResponseEntity;
- Pedir para o mochileiro tirar todas as injeções de dependência referentes ao repository do seus controllers para refatorar, assim levando toda a regra de negócio para o service;
- Usar a analogia do Restaurante e das camadas da API, (Garçom == Controller, Cozinheiro == Service, Despensa == Repository), conversando com ele para entender o'que cada camada faz dentro do sistema.  

### 🎉 Criterios de Aceite da Avaliação
- Ter criado a brach corretamente seguindo o desafio;
- Respostas teóricas corretas;
- Código bem escrito e identado corretamente;
- Verificar se o repository não está mais na camada de controller;
- Se todas as regras de negócio e refatoração foram feitas corretamente;
- Pedir para fazer todos os processos do CRUD para ver se estão com o retorno correto e se não quebrou nada na refatoração.


### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Desafio 6

### 👩‍💻 Descrição Técnica
A Api já está funcional é criada nesse ponto da trilha o objetivo deste desafios e dos demais é passar conceitos importantes sobre a API Rest. Irá ser implementados frameworks para melhorar a qualidade do código e aumentar a segurança e profissionalismo da api como um todo.
### 💡 Dicas e truques
Além de criar os Dtos de entrada nos métodos POST e PUT das controllers o mochileiro também terá que implementar o mapperstruc ou modelmapper em sua aplicação para poder completar o desafio, outro ponto importante é o relacionamento correto no [desafio 4](#-Ponto-Importante-Trilha) para que possa facilitar na implantação do desafio.
- Importante conversar e debater com o mochileiro a importância de ter dtos em sua aplicação, tanto para entender o conceito quanto para saber fazer as conversões utilizando os frameworks;
- Neste desafio ele terá que agrupar os lançamentos por categoria, mostre o poder do relacionamento para isso, utilizando uma busca da categoria para montar o dto utilizando o for;
- A lógica do dto é mais simples que parece, precisa somente somar o amount de lançamentos por categoria;
- Verifique se entendeu como pode trocar o atributo de um entity, e assim alterar as requisições que fazia no postman.

### 🎉 Criterios de Aceite da Avaliação
- Ter criado a brach corretamente seguindo o desafio;
- Respostas teóricas corretas;
- Código bem escrito e identado corretamente;
- Verificar se implementou o DTO em todas os métodos de POST e PUT;
- Verificar se o retorno está correto, voltando uma classe do tipo entity;
- Verificar se está utilizando o nome correto nos métodos de conversão;
- Verificar se o ChartDTO está voltando as informações corretas.

### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Desafio 7

### 👩‍💻 Descrição Técnica
Seguindo com os desafios baseados em conceitos importantes para um API Rest, esse desafio aborda o tema de validação de dados e a utilização e personalização de annotations do spring, além da refatoração da classe dto criada no desafio anterior e dando início ao conhecimento de streams.
### 💡 Dicas e truques
O desafio não tem muito segredo, se o mochileiro tiver dúvidas nas validações acompanhe com ele a pesquisa no material disponibilizado na trilha e converse sobre cada uma delas, maior desafio será na diferença da annotation para cada tipo de atributo.
- Explicar a importância da validação, e que as validações tem que estar sempre na camada mais próxima do usuário, que no caso seriam as DTO's;
- Passar alguns conceitos de @JsonFormat e a biblioteca Jackson para turbinar ainda mais a API;
- Na parte de stream() pode aceitar mesmo um foreach(), não precisa cobrar coisas mais avançadas, a ideia é conhecer o conceito;
- Na nesta branch tem a melhor implementação possível dessa tarefa, não precisa usar ela como critério de aceite, pois os mochileiros ainda estão começando.

### 🎉 Criterios de Aceite da Avaliação
- Ter criado a brach corretamente seguindo o desafio;
- Respostas teóricas corretas;
- Código bem escrito e identado corretamente;
- Verificar se colocou as annotations corretamente para cada tipo de atributo;
- Acompanhar os testes do mochileiro e se estão voltando os erros de forma correta;
- Verificar se usou uma stream para substituir o for usado no desafio anterior e se continua funcionando corretamente.

### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Desafio 8

### 👩‍💻 Descrição Técnica
Desafio pede uma dos conceitos mais importantes da programação que são as tratativas de exceções, este desafio é quebrado em 3 formas de tratar exceções, usando try/catch, Exception Handler e Controller Advice, fazendo um tour passo a passo nas exceções.
### 💡 Dicas e truques
Geralmente não existem muitas dificuldades nesta parte da trilha, a implementação é bem tranquila, porém é importante falar e perguntar bastante para o mochileiro sobre exceções.
- Muitos têm dificuldade na hora de manipular o end-point passado no desafio, não conseguem enxergar os @PathVariable nas variáveis x e y;

### 🎉 Criterios de Aceite da Avaliação
- Ter criado a brach corretamente seguindo o desafio;
- Respostas teóricas corretas;
- Código bem escrito e identado corretamente;
- Verificar se o erro está personalizado;
- Pedir para fazer o processo e explicar como funciona a tratativa de exceção.
### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)

## 🎯 Integração

### 👩‍💻 Descrição Técnica
O Final da trilha onde os mochileiros conseguem interagir como usúarios e fazem a integração do front com sua api, um momento que enxergam varios problemas que foram acarretados por falta de atenção ou algo parecido e começam a concertar seu codigo.
### 💡 Dicas e truques
Teoricamente não teria problemas no back-end se seguiram e fizeram todos os passos corretamente, nessa parte da integração é interessante deixar o mochileiro fazer as alterações que precisa para alinahar com o front.
- Sempre que pedir ajuda identifique qual o desafio que fazia a parte na trilha e converse com ele sobre o conceito, deixe ele tirar suas propias conclusões sobre o problema;
- Tente passar o minimo de ajudas tecnicas possiveis, comece a usar sua experiencia como desenvolvedor nessa parte da integração;
- Pense nisso como uma implantação ou teste integrado, deixe ele entender e resolver o seu propio codigo, fazer sozinho.
### 🎉 Criterios de Aceite da Avaliação
- Nome correto do repositório;
- Respostas teóricas corretas;
- Verificar se o front está funcional, analisando o maximo de cenarios possiveis;
- Fazer testes basicos como não passar um atributo e espera um erro, etc...;
- Pedir para te apresentar todo o projeto e gravar um video;(Opcional)
### 📚 Retornar a lista de desafio
[Voltar](#-Lista-de-Desafios)
