# Atividade Prática – Refatoração com Generics, Lambda e Streams
Atividade prática de refatoração de um sistema de cadastro de produtos, utilizando **Generics**, **expressões Lambda** e **Streams**, mantendo o comportamento original do programa.

## Refatoração - Link do Projeto no  Github

[https://github.com/gabvilar/solo-adventure.git](https://github.com/gabvilar/refatoracao)

## Equipe
- Bruno Ferreira da Silva 
    - email: brenoouhd@gmail.com
- Gabriel Brandão Vilar
    - email: gabriel.vilar.098@ufrn.edu.br
- Letícia Queiroz Wanderley 
    - email: leticia.queiroz.109@ufrn.edu.br

## O que foi refatorado

- **Repository genérico:** `ProdutoRepository` foi substituído por `Repository<T>`, que funciona com qualquer tipo. No `Main`, é usado como `Repository<Produto>`.
- **Filtro único:** `buscarPorCategoria()` e `buscarAbaixoDoPreco()` viraram um só método, `filtrar()`, que recebe um `Predicate<Produto>`. A condição é informada por lambda no `Main`.
- **Streams:** os laços do `ProdutoService` foram trocados por `stream()`, `filter()`, `map()`, `sorted()` e `toList()`.
- **Exibição:** os `for` do `Main` foram trocados por `forEach` com lambda.
- **Ordenação:** `ordenarPorPreco()` agora retorna uma nova lista ordenada (`List<Produto>`) em vez de alterar a original.

## Estrutura

| Arquivo | Descrição |
|---|---|
| `Main.java` | Cadastra os produtos, define as lambdas e exibe os resultados |
| `Produto.java` | Classe que representa um produto (nome, categoria, preço) |
| `Repository.java` | Repositório genérico `Repository<T>` |
| `ProdutoService.java` | Operações de filtro, nomes e ordenação com Streams |

## Como compilar e executar

Requer **Java 16 ou superior** (por causa do `toList()`).

- Para compilar: `javac -d out src/*.java`
- Para executar: `java -cp out src.Main`
