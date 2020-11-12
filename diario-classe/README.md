Coding Dojo Usando VRaptor 4
============================

Este projeto foi desenvolvido através de um [#codingdojo](http://pt.wikipedia.org/wiki/Coding_Dojo) realizado no dia 28/9/2014 pelos alunos em sala de aula durante a disciplina `Java para Web 3.0` do curso de Pos Graduacao da [Faculdade IMED] (http://www.imed.edu.br) de Passo Fundo.

Participantes:
* Guilherme Elias


Web App (rotas)
-------
* Cadastro de Estudante `/diario-classe/estudante`
* Cadastro de Disiciplinas `/diario-classe/disciplina`

API REST
--------

Estudante - (rotas)
--------
Adicionar Estudante

      USANDO XML:
            url: /diario-classe/api/estudante
            method: PUT
            Content-type: application/xml`
            Content: <estudante><id>1</id><nome>Guilherme Elias</nome></estudante>
      USANDO JSON:
            url: /diario-classe/api/estudante
            method: PUT
            Content-type: application/json`
            Content:  { "estudante": { "id": "1", "nome": "Guilherme Elias"} }

Editar Estudante

      USANDO XML
            url: /diario-classe/api/estudante/{id}.xml
            method: POST
            Content:    <estudante><id>1</id><nome>Guilherme da S. Elias</nome></estudante>
      USANDO JSON
            url: /diario-classe/api/estudante/{id}.json
            method: POST
            Content:    { "estudante": { "id": "1", "nome": "Guilherme da S. Elias"} }

Buscar Estudante por Id

      url: /diario-classe/api/estudante/{id}.{formato} (json ou xml)
      method: GET
      
Buscar Lista de Estudantes

      url: /diario-classe/api/estudante/lista.{formato} (json ou xml)
      method: GET

Deletar Estudante

      url: /diario-classe/api/estudante/{id}
      method: DELETE

Disciplina - (rotas)
--------
Adicionar Disciplina

      USANDO XML:
            url: /diario-classe/api/disciplina
            method: PUT
            Content-type: application/xml`
            Content: <disciplina><id>1</id><nome>Guilherme Elias</nome></disciplina>
      USANDO JSON:
            url: /diario-classe/api/disciplina
            method: PUT
            Content-type: application/json`
            Content:  { "disciplina": { "id": "1", "nome": "Java Web"} }

Editar disciplina

      USANDO XML
            url: /diario-classe/api/disciplina/{id}.xml
            method: POST
            Content:    <disciplina><id>1</id><nome>Java web 3.0</nome></estudante>
      USANDO JSON
            url: /diario-classe/api/disciplina/{id}.{formato}
            method: POST
            Content:    { "disciplina": { "id": "1", "nome": "Java Web 3.0"} }

Buscar Disciplina por Id

      url: /diario-classe/api/disciplina/{id}.{formato} (json ou xml)
      method: GET
      
Buscar Lista de disciplinas

      url: /diario-classe/api/disciplina/lista.{formato} (json ou xml)
      method: GET

Deletar Disciplina

      url: /diario-classe/api/disciplina/{id}
      method: DELETE


Resolver Dependências
=====================

O projeto usa [Maven]() como gerenciador de dependências. Para usar o maven temos duas opções

*    Instalando o [plugin M2E](http://marketplace.eclipse.org/category/free-tagging/m2e) no Eclipse. [Dica do GUJ](http://www.guj.com.br/java/263906-resolvido-instalar-o-maven-eclipse-plugin) 
*   Instalando o Maven manualmente através dos passos abaixo:

1.    Usando o terminal garanta que sua máquina já possui o JDK instalado e configurado. Para conferir digite:
      
      `java -version`

2.    Se tudo estiver ok, deverá aparece a versão do java instalado como por exemplo `java version "1.7.0_60"`
3.    Para resolver as dependências do projeto você precisa ter o [Maven](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) instalado. Para tanto siga o [tutorial](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) rápido de 5 :-) minutos do Maven.
4.    Para confirmar que o Maven está rodando corretamente abra o terminal e digite:
      
      `mvn --help`
5.    Pronto agora estamos aptos a resovler as dependências do projeto. Para isso através do terminal acesse a pasta do projeto e digite:
      
      `mvn clean install`

6.    Após rodar com sucesso a atualização das libs e build via Maven, atualize os arquivos do projeto no Eclipse usando a tecla `F5` 

Caso tenha alguma dificuldade com o Maven, ou ache ele bem ruim, não se preocupe você não está sozinho :-) #ivyfellings
      

Persistência
============

O projeto já está configurado com as dependências do [Postgres](http://www.postgresql.org/) e [HSQLDB](http://hsqldb.org/) junto ao arquivo pom.xml. O arquivo abaixo possui os scripts para geração da database e tabelas necessárias

      sql/diarioclasse.sql
