# Vetor – Soma e Média (Java)

Este projeto em **Java** lê uma quantidade definida de números inteiros, armazena-os em um **vetor**, exibe os valores digitados, calcula a **soma** e a **média** desses números.

## 📌 Funcionalidades

* Solicita ao usuário quantos números serão digitados
* Lê os valores e armazena em um vetor (`int[]`)
* Exibe todos os valores informados
* Calcula e exibe a **soma** dos elementos
* Calcula e exibe a **média** aritmética

## 🧠 Conceitos utilizados

* Vetores (arrays unidimensionais)
* Estruturas de repetição (`for`)
* Entrada de dados com `Scanner`
* Operações aritméticas básicas
* Configuração de localidade com `Locale`

## ▶️ Como executar

1. Certifique-se de ter o **JDK** instalado.
2. Compile o arquivo:

```bash
javac Main.java
```

3. Execute o programa:

```bash
java application.Main
```

## 💻 Exemplo de execução

Entrada:

```
Quantos números você vai digitar? 3
Digite um número: 5
Digite um número: 10
Digite um número: 15
```

Saída:

```
VALORES = 5 10 15
VALORES = 30
MEDIA = 10
```

## 📂 Estrutura do código

* `Main.java`: classe principal contendo o método `main` e toda a lógica do programa.

## 📚 Observações

* A média é calculada utilizando **divisão inteira**, pois os valores são do tipo `int`.
* Caso queira uma média com casas decimais, recomenda-se usar `double` no cálculo.

---

Projeto simples com foco em fundamentos de Java, ideal para iniciantes praticarem o uso de vetores e laços de repetição.
