# Desafio--Conversor-de-moedas
Conversor de Moedas

Projeto desenvolvido como parte do Challenge da Alura, utilizando Java para criar um sistema de conversão de moedas com taxas de câmbio obtidas dinamicamente de uma API.

Funcionalidades

Conversão de Real (BRL) para outras moedas:

Dólar Americano (USD)

Peso Argentino (ARS)

Boliviano (BOB)

Peso Chileno (CLP)

Peso Colombiano (COP)

Conversão de outras moedas para Real (BRL).

Exibição de taxas de câmbio em tempo real.

Menu interativo com opções claras de conversão.

Mensagem de erro em caso de falha na API ou entrada inválida do usuário.

Opção para encerrar a aplicação com segurança.

Configuração do Ambiente

Pré-requisitos

Java 17+

Maven

IDE (IntelliJ, Eclipse, VS Code, etc.)

Passos para Execução

Clone o repositório:

git clone https://github.com/SeuUsuario/conversor-moedas.git

Acesse o diretório do projeto:

cd conversor-moedas

Configure o ambiente Java e importe o projeto em sua IDE como um projeto Maven.

Execute a aplicação:

mvn spring-boot:run

Estrutura do Projeto

conversor-moedas/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/conversor/
│   │   │       ├── ConversorMoedasApplication.java
│   │   │       ├── controller/
│   │   │       │   └── MenuController.java
│   │   │       ├── service/
│   │   │       │   └── ConversaoService.java
│   │   │       ├── repository/
│   │   │       │   └── TaxasRepository.java
│   │   │       ├── model/
│   │   │       │   ├── Moeda.java
│   │   │       │   └── Conversao.java
│   │   │       └── util/
│   │   │           └── ApiClient.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   ├── test/
│       └── java/
│           └── com/conversor/
│               └── ConversorMoedasApplicationTests.java
├── pom.xml

Endpoints Principais

Menu: GET /menu - Exibe as opções disponíveis para interação.

Obter Taxa de Câmbio: GET /taxas/{codigoMoeda}

Converter Moeda: POST /converter

Tecnologias Utilizadas

Linguagem: Java 17

Framework: Spring Boot

Maven: Gerenciador de dependências

API de Taxas de Câmbio: Exemplo: exchangeratesapi.io

Contribuição

Se desejar contribuir com melhorias ou correções, sinta-se à vontade para criar um fork do projeto, fazer as alterações e enviar um pull request.

Licença

Este projeto é licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Projeto criado para o desafio do Challenge Alura.

