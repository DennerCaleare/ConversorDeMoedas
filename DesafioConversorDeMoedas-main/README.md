
# Conversor de Moedas

## Descrição

Este projeto Java é um conversor de moedas que permite ao usuário converter valores entre Dólar Americano (USD), Dólar Canadense (CAD) e Real Brasileiro (BRL). O programa recebe uma opção de conversão de 1 a 6 digitada pelo usuário, solicita o valor a ser convertido e então retorna o valor convertido para o usuário, após isso o programa adiciona a conversão a uma List e salva o log da transição em Json.

## Funcionalidades

- Converter Dólar Americano (USD) para Dólar Canadense (CAD)
- Converter Dólar Americano (USD) para Real Brasileiro (BRL)
- Converter Dólar Canadense (CAD) para Dólar Americano (USD)
- Converter Dólar Canadense (CAD) para Real Brasileiro (BRL)
- Converter Real Brasileiro (BRL) para Dólar Americano (USD)
- Converter Real Brasileiro (BRL) para Dólar Canadense (CAD)
- Salvar o log da conversão após a utilização do programa

## Como Usar
### Usando o IntelliJ IDEA

1. Clone o repositório para o seu ambiente local.
   ```bash
   git clone https://github.com/dvdthedev/DesafioConversorDeMoedas.git
Abra o IntelliJ IDEA e selecione Open.

Navegue até o diretório do projeto clonado e clique em OK.

Aguarde o IntelliJ IDEA importar e indexar o projeto.

No painel do Projeto, navegue até src e encontre o arquivo Principal

Clique com o botão direito no arquivo Main.java e selecione Run 'Principal.main()'.

Siga as instruções do programa no console:

Escolha uma opção de conversão de 1 a 6.
Digite o valor a ser convertido.
O programa retornará o valor convertido.

## Exemplo de uso
```
**********************************************************************************************
Bem vindo(a) ao ConversorAPI
Selecione uma opção de conversão:

1 - Dólar americano para Real brasileiro
2 - Dólar americano para Dólar canadense
3 - Dólar canadense para Dólar americano
4 - Dólar canadense para Real brasileiro
5 - Real brasileiro para Dólar americano
6 - Real brasileiro para Dólar canadense
7 - Sair
**********************************************************************************************

1
Digite o valor que deseja converter, não utilize pontos, apenas vírgula
650
Valor em USD $650,00 convertido para BRL: $3333,98
[{Entrada: 'USD', Saída: 'BRL', valor: 650.0', totalConvertido: 3333.98}]
Deseja continuar? digite 1 ou 7 para sair.
```

## Tecnologias utilizadas:

- ``Java;``
- ``Paradigma de orientação a objetos;``
- ``ExchangeRate-API;``
- ``Gson;``

