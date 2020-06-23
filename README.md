# EstruturaDeDados

## Executando o código

Clone o repositório para sua máquina e em seguida rode os comandos:

`javac Main.java`  
`java Main`

## Resultado da atividade

5 4 3 2 1 10 9 8 7 6

O resultado acontece da seguinte forma, pois adicionamos `{1, 2, 3, 4, 5}` a uma lista e posteriormente transportamos esses dados para uma pilha (Destacando sempre do índice 0).  
Como sempre removemos o início da lista, a pilha fica da seguinte forma: `[fundo da pilha] 1 2 3 4 5 [topo da pilha]`
Como na pilha o último a entrar é o primeiro a sair, a fila é populada da seguinte maneira:
`[início da fila] 5 4 3 2 1 [fim da fila]`

Em seguida adicionamos à lista os seguintes itens `{6, 7, 8, 9, 10}`  
Ao transportar para a pilha temos: `[fundo da pilha] 6 7 8 9 10 [topo da pilha]`  
Transferindo para a nossa lista já populada: `[início da fila] 5 4 3 2 1 10 9 8 7 6 [fim da fila]`
