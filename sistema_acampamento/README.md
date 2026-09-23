# Sistema de Acampamento

Sistema de cadastro de participantes do **Acampamento 2026**, feito em **Java** e executado pelo **console**. Permite cadastrar pessoas com seus dados pessoais, controlar quem já pagou e listar pagantes e não pagantes.

Projeto desenvolvido para praticar os conceitos de **POO** em Java.

---

## Funcionalidades

| Opção | Descrição |
|-------|-----------|
| 1 | **Cadastrar pessoa**: registra nome, idade, sexo, cidade, CPF e se a pessoa já pagou |
| 2 | **Listar pessoas cadastradas**: mostra nome, idade, sexo, cidade e CPF (mascarado) de todos |
| 3 | **Mostrar pagantes**: lista as pessoas que já pagaram |
| 4 | **Mostrar não pagantes**: lista as pessoas que ainda não pagaram |
| 5 | **Sair**: encerra o programa |

### Regras do cadastro

```
CPF   →  precisa ter exatamente 11 números (sem pontos ou traço)
Pagou →  1 = Sim  |  2 = Não
```

- Se o CPF for inválido, o sistema pede para digitar novamente até estar correto.
- Se a resposta de pagamento for diferente de `1` ou `2`, a pergunta é repetida.
- Ao listar as pessoas, o CPF **não é exibido**: aparece sempre como `***.***.***-**`, para proteger os dados.

---

## Estrutura do projeto

```
sistema_acampamento/
├── Pessoa.java
├── GerenciadorAcampamento.java
└── Sistema.java
```

| Classe | Responsabilidade |
|--------|------------------|
| `Pessoa` | Representa um participante. Guarda nome, idade, sexo, cidade, CPF e situação de pagamento, com atributos privados, `getters` e `setters`. Possui o método `getStatus()`, que retorna "Pagou" ou "Não pagou". |
| `GerenciadorAcampamento` | Mantém um `ArrayList<Pessoa>` e contém as operações: `cadastrar()`, `listar()`, `mostrarPagantes()` e `mostrarNaoPagantes()`. |
| `Sistema` | Ponto de entrada do programa. Exibe o menu em loop e chama os métodos do gerenciador conforme a opção escolhida. |

---

## Tecnologias e conceitos

- **Java**
- Classes e objetos
- Encapsulamento (atributos `private` com `getters` e `setters`)
- Classes separadas por responsabilidade
- `ArrayList` para armazenar as pessoas
- `Scanner` para leitura de dados no console
- Validação de entrada com expressão regular (`matches`) para o CPF
- Estruturas de controle: `while`, `do-while`, `switch`, `for-each` e `if/else`

---

## Exemplo de uso

```
--- Acampamento 2026 ---
[1]- Cadastrar pessoa
[2]- Listar pessoas cadastradas
[3]- Mostrar pagantes
[4]- Mostrar não pagantes
[5]- Sair
Escolha uma opção: 1
-----------------
Nome: Maria
Idade: 17
Sexo: Feminino
Cidade: Salvador
CPF: 123
CPF inválido. Digite 11 números: 12345678901
Pagou? (1) SIM  (2) NÃO: 1
Pessoa cadastrada com sucesso!!

--- Acampamento 2026 ---
[1]- Cadastrar pessoa
[2]- Listar pessoas cadastradas
[3]- Mostrar pagantes
[4]- Mostrar não pagantes
[5]- Sair
Escolha uma opção: 2
--------------------------------
Nome: Maria
Idade: 17
Sexo: Feminino
Cidade: Salvador
CPF: ***.***.***-**

--- Acampamento 2026 ---
[1]- Cadastrar pessoa
[2]- Listar pessoas cadastradas
[3]- Mostrar pagantes
[4]- Mostrar não pagantes
[5]- Sair
Escolha uma opção: 3
Maria - Pagou
```

---

Feito por José Carlos 🚀
