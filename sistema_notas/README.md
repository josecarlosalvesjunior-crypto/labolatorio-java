# Sistema de Notas

Sistema de gerenciamento de notas de alunos, feito em **Java** e executado pelo **console**. Permite cadastrar alunos, lançar três notas para cada um, calcular a média e listar quem está aprovado ou reprovado.

Projeto desenvolvido para praticar os conceitos de **POO** em Java.

---

## Funcionalidades

| Opção | Descrição |
|-------|-----------|
| 1 | **Cadastrar aluno**: adiciona um novo aluno pelo nome |
| 2 | **Lançar notas**: busca o aluno pelo nome e registra as 3 notas |
| 3 | **Calcular média**: exibe os dados dos alunos com a média calculada |
| 4 | **Listar alunos**: mostra nome, notas e média de todos os alunos |
| 5 | **Mostrar aprovados**: lista os alunos com média maior ou igual a 7 |
| 6 | **Mostrar reprovados**: lista os alunos com média menor que 7 |
| 7 | **Sair**: encerra o programa |

### Regra de aprovação

```
Média = (nota1 + nota2 + nota3) / 3

Média >= 7  →  Aprovado
Média <  7  →  Reprovado
```

A busca do aluno ao lançar notas **não diferencia maiúsculas de minúsculas** (`maria` e `Maria` são o mesmo aluno).

---

## Estrutura do projeto

```
sistema_notas/
├── Aluno.java   
├── GerenciadorAlunos.java  
└── Sistema.java   
```

| Classe | Responsabilidade |
|--------|------------------|
| `Aluno` | Representa um aluno. Guarda o nome e as notas e possui o método `calcularMedia()`. |
| `GerenciadorAlunos` | Mantém um `ArrayList<Aluno>` e contém as operações: `cadastrar()`, `lancarNotas()`, `listar()`, `mostrarAprovados()` e `mostrarReprovados()`. |
| `Sistema` | Ponto de entrada do programa. Exibe o menu em loop e chama os métodos do gerenciador conforme a opção escolhida. |

---

## Tecnologias e conceitos

- **Java** 
- Classes e objetos
- Encapsulamento em classes separadas por responsabilidade
- `ArrayList` para armazenar os alunos
- `Scanner` para leitura de dados no console
- Estruturas de controle: `while`, `switch`, `for` e `if/else`

---

## Exemplo de uso

```
--- Sistema de notas ---
1 - Cadastrar aluno
2 - Lançar notas
3 - Calcular média
4 - Listar alunos
5 - Mostrar aprovados
6 - Mostrar reprovados
7 - Sair
Escolha uma opção:
1
Digite o nome do aluno: Maria
Aluno cadastrado com sucesso!

Escolha uma opção:
2
Digite o nome do aluno: Maria
Digite a nota 1: 8
Digite a nota 2: 7,5
Digite a nota 3: 9
Notas cadastradas!

Escolha uma opção:
4
----------------------
Nome: Maria
Nota 1: 8,0
Nota 2: 7,5
Nota 3: 9,0
Média: 8,16
```

Feito por José Carlos 🚀
