# Conversor de Moedas

Este projeto é parte do desafio do curso "Praticando Java: Challenge Conversor de Moedas" do Programa ONE Oracle + Alura. Ele é uma aplicação Java que permite a conversão de valores entre diferentes moedas utilizando a API ExchangeRate-API. O projeto também salva o histórico de conversões em um arquivo JSON.

## Funcionalidades

- Conversão de valores entre diferentes moedas
- Suporte a diversas moedas (USD, EUR, GBP, JPY, BRL, CAD, AUD, CHF, CNY, INR)
- Salvamento do histórico de conversões em um arquivo JSON

## Tecnologias Utilizadas

- Java
- Biblioteca Gson para manipulação de JSON
- API ExchangeRate-API para obter taxas de câmbio

## Como Executar

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/conversor-de-moedas.git
    cd conversor-de-moedas
    ```

2. **Compile o projeto**:
    ```bash
    javac -d bin -sourcepath src src/br/com/aluno/converte/Principal.java
    ```

3. **Execute o projeto**:
    ```bash
    java -cp bin br.com.aluno.converte.Principal
    ```

## Estrutura do Projeto

- **Principal.java**: Classe principal que contém o método `main` e controla o fluxo da aplicação.
- **ConversorDeMoedas.java**: Classe responsável pela conversão de moedas utilizando a API ExchangeRate-API.
- **GeradorDeArquivos.java**: Classe responsável por gerar o arquivo JSON com o histórico de conversões.
- **ConversaoFinanceira.java**: Interface que contém o método estático para imprimir a tabela de moedas suportadas.

## Exemplo de Uso

1. Ao iniciar a aplicação, uma tabela de siglas das moedas será exibida.
2. Digite a moeda de origem (ex: USD) ou 'sair'/'exit' para encerrar.
3. Digite a moeda de destino (ex: EUR).
4. Digite o valor a ser convertido.
5. A aplicação exibirá o valor convertido e salvará o histórico de conversões em um arquivo JSON.

## Desafios e Aprendizados

Este projeto faz parte do desafio do curso "Praticando Java: Challenge Conversor de Moedas" do Programa ONE Oracle + Alura. Foi uma excelente oportunidade para praticar habilidades em Java, manipulação de APIs, e trabalhar com arquivos JSON.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

- [LinkedIn](https://www.linkedin.com/in/seu-perfil)
- [GitHub](https://github.com/seu-usuario)

---

Desenvolvido como parte do desafio do Programa ONE Oracle + Alura.
