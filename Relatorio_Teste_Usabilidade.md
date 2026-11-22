# Teste de Usuário Final — Mercado Livre

| | |
|---|---|
| **Curso/Turma** | ENGENHARIA DE SOFTWARE 6S - A |
| **Matéria** | Projeto, Implementação e Teste de Software |
| **Integrantes** | Eric Delefrati Rocha Leite<br>Bruno Koji Fujisaki |

---

## 1. Participantes

| ID | Papel | Idade | Experiência com compras online | Dispositivo/Navegador |
|----|-------|-------|--------------------------------|-----------------------|
| U1 | Usuário final | 22 | Alta (compra online toda semana) | Notebook / Chrome |
| U2 | Usuário final | 45 | Média (compra algumas vezes por ano) | Notebook / Edge |
| A1 | Avaliador | — | — | — |

## 2. Procedimento

1. O avaliador explica o cenário ao usuário, sem demonstrar o caminho.
2. O usuário executa as tarefas em voz alta (pensando alto), sem ajuda.
3. O avaliador cronometra, registra erros e comentários na planilha de observação.
4. Ao final, o usuário responde o questionário SUS.

**Ferramentas:** navegador web, cronômetro, planilha de observação e formulário SUS.

## 3. Dados Coletados

| Métrica | Descrição |
|---------|-----------|
| Tempo de execução | Tempo total para completar todas as tarefas |
| Taxa de sucesso | Quantos usuários concluíram o fluxo sem ajuda |
| Erros cometidos | Cliques incorretos, perda do caminho, confusão nos filtros |

## 4. Critérios de Sucesso

- ≥ 90% dos usuários devem conseguir adicionar o produto ao carrinho.
- Tempo médio para concluir o teste: até 4 minutos.

## 5. Recursos e Organização

| Papel | Descrição |
|-------|-----------|
| Usuário final | Aluno que executa as tarefas como comprador |
| Avaliador | Colega que observa e registra tempo, erros e comentários |
| Instrutor | Professor que orienta e supervisiona o teste |

---

## 6. Planilha de Observação

### Usuário U1

| Tarefa | Tempo (s) | Sucesso (S/N) | Erros | Observações |
|--------|-----------|---------------|-------|-------------|
| Acessar site | 8 | S | 0 | Digitou o endereço direto na barra |
| Buscar produto | 15 | S | 0 | Usou a barra de busca sem dificuldade |
| Aplicar filtros | 62 | S | 2 | Clicou em "Frete grátis" achando que era o Full; só então encontrou o filtro correto |
| Abrir detalhes | 20 | S | 0 | Comparou duas opções pelas notas antes de escolher |
| Adicionar ao carrinho | 18 | S | 0 | Botão encontrado de imediato |
| Simular compra | 25 | S | 0 | Pediu login/cadastro e parou nessa etapa, como previsto |
| Voltar à tela inicial | 10 | S | 0 | Clicou no logo |
| **Total** | **158 (2 min 38 s)** | **7/7** | **2** | |

### Usuário U2

| Tarefa | Tempo (s) | Sucesso (S/N) | Erros | Observações |
|--------|-----------|---------------|-------|-------------|
| Acessar site | 12 | S | 0 | Buscou o site pelo Google |
| Buscar produto | 24 | S | 1 | Errou a digitação de "Bluetooth" e corrigiu |
| Aplicar filtros | 118 | S | 4 | Não achou o filtro Full na lateral; abriu "Mais filtros" duas vezes e comentou que a ordenação "melhores avaliados" não estava clara |
| Abrir detalhes | 35 | S | 0 | Leu várias avaliações antes de decidir |
| Adicionar ao carrinho | 30 | S | 1 | Clicou em "Comprar agora" no lugar de "Adicionar ao carrinho" e voltou |
| Simular compra | 40 | S | 0 | Hesitou ao ver a tela de login |
| Voltar à tela inicial | 15 | S | 0 | Precisou procurar o logo no topo |
| **Total** | **274 (4 min 34 s)** | **7/7** | **6** | |

---

## 7. Questionário SUS

Escala: **1** = Discordo totalmente · **5** = Concordo totalmente

| # | Afirmação | U1 | U2 |
|---|-----------|----|----|
| 1 | Acho que gostaria de usar este sistema com frequência | 5 | 4 |
| 2 | Achei o sistema desnecessariamente complexo | 2 | 3 |
| 3 | Achei o sistema fácil de usar | 5 | 4 |
| 4 | Acho que precisaria de ajuda de uma pessoa técnica para usar este sistema | 1 | 2 |
| 5 | Achei que as várias funções do sistema estavam bem integradas | 4 | 4 |
| 6 | Achei que havia muita inconsistência no sistema | 2 | 3 |
| 7 | Imagino que a maioria das pessoas aprenderia a usar este sistema rapidamente | 5 | 4 |
| 8 | Achei o sistema muito complicado de usar | 1 | 2 |
| 9 | Me senti muito confiante ao usar o sistema | 4 | 3 |
| 10 | Precisei aprender muitas coisas antes de conseguir usar o sistema | 2 | 3 |

---

## 8. Resultados

| Métrica | Resultado | Meta | Atingiu? |
|---------|-----------|------|----------|
| Taxa de sucesso (adicionar ao carrinho) | 100% (2 de 2) | ≥ 90% | ✅ Sim |
| Tempo médio total | 216 s (3 min 36 s) | ≤ 4 min | ✅ Sim |
| Média de erros por usuário | 4 (U1: 2; U2: 6) | — | — |

Observação: o U2 ultrapassou individualmente o limite de 4 minutos (4 min 34 s); a meta foi atingida apenas na média.

## 9. Análise

### 9.1 Problemas de usabilidade encontrados

| # | Problema | Tarefa | Gravidade | Usuários afetados |
|---|----------|--------|-----------|-------------------|
| 1 | Filtro "Full" difícil de localizar; confundido com "Frete grátis" ou escondido em "Mais filtros" | Aplicar filtros | Alta | 2 de 2 |
| 2 | Ordenação por "melhores avaliados" não é evidente | Aplicar filtros | Média | 1 de 2 |
| 3 | Botões "Comprar agora" e "Adicionar ao carrinho" competem pela atenção | Adicionar ao carrinho | Média | 1 de 2 |
| 4 | Logo como único caminho evidente para a tela inicial, pouco destacado no topo | Voltar à tela inicial | Baixa | 1 de 2 |