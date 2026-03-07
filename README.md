## Aula de POO

## 🧩 Classes

### Passageiro
Representa um usuário cadastrado na plataforma FiapRide.

| Atributo | Tipo   | Descrição                   |
|----------|--------|-----------------------------|
| nome     | String | Nome completo do passageiro |
| cpf      | String | CPF do passageiro           |
| saldo    | double | Saldo disponível em reais   |

| Método                        | Descrição                                  |
|-------------------------------|--------------------------------------------|
| `adicionarSaldo(double)`      | Adiciona saldo — bloqueia valores negativos |
| `pagarViagem(double)`         | Debita viagem — bloqueia saldo insuficiente |
| `getNome()`                   | Retorna o nome                             |
| `getCpf()`                    | Retorna o CPF                              |
| `getSaldo()`                  | Retorna o saldo                            |

---

### Garrafa
Objeto criado no microdesafio da Aula 1, encapsulado na Aula 3.

| Atributo       | Tipo   | Descrição                          |
|----------------|--------|------------------------------------|
| cor            | String | Cor da garrafa                     |
| material       | String | Material de fabricação             |
| capacidadeEmMl | int    | Capacidade entre 1 e 3000ml        |

| Método                      | Descrição                                       |
|-----------------------------|-------------------------------------------------|
| `getCor()`                  | Retorna a cor                                   |
| `getMaterial()`             | Retorna o material                              |
| `getCapacidadeEmMl()`       | Retorna a capacidade                            |
| `setCapacidadeEmMl(int)`    | Define capacidade — bloqueia fora de 1 a 3000ml |

---

### SmartPhone
Objeto pessoal encapsulado na Aula 3, com métodos e validações.

| Atributo      | Tipo   | Descrição                        |
|---------------|--------|----------------------------------|
| marca         | String | Fabricante do aparelho           |
| armazenamento | int    | Espaço disponível em MB          |
| tamanhoTela   | double | Tamanho da tela em polegadas     |
| bateria       | int    | Nível da bateria de 0 a 100      |

| Método                        | Descrição                                        |
|-------------------------------|--------------------------------------------------|
| `carregarBateria(int)`        | Carrega bateria — bloqueia negativo, limita 100% |
| `instalarApp(int)`            | Instala app — bloqueia se sem espaço             |
| `getMarca()`                  | Retorna a marca                                  |
| `getArmazenamento()`          | Retorna o armazenamento                          |
| `getTamanhoTela()`            | Retorna o tamanho da tela                        |
| `getBateria()`                | Retorna o nível da bateria                       |

---

## ▶️ Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/fiap-poo.git
```

2. Abra o projeto no **IntelliJ IDEA**

3. Execute o arquivo desejado:
   - `SistemaPrincipal.java` → testa os passageiros
   - `TesteSmartPhone.java` → testa o SmartPhone
   - `TesteGarrafa.java` → testa a Garrafa

---

## 🖥️ Saída esperada

### SistemaPrincipal
```
--- Iniciando o Sistema FiapRide ---

>>> Recarga Passageiro 1:
Saldo adicionado! Novo saldo: R$ 50.0
>>> Recarga Passageiro 2:
Saldo adicionado! Novo saldo: R$ 12.5

--- Status dos Passageiros ---
Passageiro: Ana Silva | Saldo: R$ 50.0 | CPF: 222.222.222-22
Passageiro: Carlos Souza | Saldo: R$ 12.5 | CPF: 333.333.333-33

--- Realizando Viagens ---
Viagem paga! Saldo restante: R$ 30.0
Erro: saldo insuficiente. Saldo atual: R$ 12.5
```

### TesteSmartPhone
```
--- Teste SmartPhone ---

Meu celular: Samsung
Celular do amigo: Apple
Bateria atual: 0%
Armazenamento: 128MB

--- Testes Válidos ---
Bateria: 50%
App instalado! Armazenamento restante: 88MB

--- Tentando Burlar o Sistema ---
Erro: quantidade deve ser maior que zero.
Erro: armazenamento insuficiente. Disponível: 88MB
Bateria: 100%

--- Construtor com valor inválido ---
Erro: armazenamento inválido.
```

---

## 📚 Conceitos aplicados

- **Encapsulamento** — atributos private, acesso via getters e setters
- **Construtor** — objeto já nasce com estado válido
- **Regras de negócio** — validações nos setters protegem o estado
- **Separação de responsabilidades** — cada classe tem seu próprio arquivo de teste
- **Clean Code** — nomes significativos, métodos pequenos, responsabilidade única

---
