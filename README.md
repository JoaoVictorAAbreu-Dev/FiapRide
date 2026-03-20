# FiapRide — POO FIAP

Projeto desenvolvido nas aulas de Programação Orientada a Objetos da FIAP.
Simula uma plataforma de mobilidade urbana aplicando os fundamentos de
Classes, Objetos, Encapsulamento, Construtores, Getters e Setters em Java.

---

## 📁 Estrutura do Projeto
```
FiapRide
└── src
    ├── br.com.fiapride.main
    │   ├── SistemaPrincipal.java   ← testes do FiapRide
    │   └── TesteSmartPhone.java    ← testes do objeto pessoal
    └── br.com.fiapride.model
        ├── Passageiro.java         ← usuário da plataforma
        ├── Veiculo.java            ← veículo cadastrado no sistema
        ├── Garrafa.java            ← objeto do microdesafio
        └── SmartPhone.java         ← objeto pessoal encapsulado
```

---

## 🧩 Classes

### Passageiro
Representa um usuário cadastrado na plataforma FiapRide.
Não pode nascer sem nome e CPF.

| Atributo | Tipo   | Descrição                   |
|----------|--------|-----------------------------|
| nome     | String | Nome completo do passageiro |
| cpf      | String | CPF do passageiro           |
| saldo    | double | Saldo disponível em reais   |

| Método                   | Descrição                                   |
|--------------------------|---------------------------------------------|
| `Passageiro(nome, cpf)`  | Construtor — nome e cpf obrigatórios        |
| `adicionarSaldo(double)` | Adiciona saldo — bloqueia valores negativos |
| `pagarViagem(double)`    | Debita viagem — bloqueia saldo insuficiente |
| `getNome()`              | Retorna o nome                              |
| `getCpf()`               | Retorna o CPF                               |
| `getSaldo()`             | Retorna o saldo                             |

---

### Veiculo
Representa um veículo cadastrado no FiapRide.
Nenhum veículo pode rodar sem placa e modelo.

| Atributo | Tipo   | Descrição            |
|----------|--------|----------------------|
| placa    | String | Placa do veículo     |
| modelo   | String | Modelo do veículo    |

| Método                      | Descrição                                      |
|-----------------------------|------------------------------------------------|
| `Veiculo(placa, modelo)`    | Construtor — placa e modelo obrigatórios       |
| `atualizarPlaca(String)`    | Atualiza placa — bloqueia valores nulos/vazios |
| `getPlaca()`                | Retorna a placa                                |
| `getModelo()`               | Retorna o modelo                               |

> Não existe `setModelo()` — o modelo de um veículo é imutável na vida real.

---

### Garrafa
Objeto criado no microdesafio, encapsulado na Aula 3 e com construtor na Aula 4.

| Atributo       | Tipo   | Descrição                      |
|----------------|--------|--------------------------------|
| cor            | String | Cor da garrafa                 |
| material       | String | Material de fabricação         |
| capacidadeEmMl | int    | Capacidade entre 1 e 3000ml    |

| Método                      | Descrição                                       |
|-----------------------------|-------------------------------------------------|
| `Garrafa(cor, material)`    | Construtor — cor e material obrigatórios        |
| `definirCapacidade(int)`    | Define capacidade — bloqueia fora de 1 a 3000ml |
| `getCor()`                  | Retorna a cor                                   |
| `getMaterial()`             | Retorna o material                              |
| `getCapacidadeEmMl()`       | Retorna a capacidade                            |

---

### SmartPhone
Objeto pessoal encapsulado com métodos e validações de negócio.

| Atributo      | Tipo   | Descrição                    |
|---------------|--------|------------------------------|
| marca         | String | Fabricante do aparelho       |
| armazenamento | int    | Espaço disponível em MB      |
| tamanhoTela   | double | Tamanho da tela em polegadas |
| bateria       | int    | Nível da bateria de 0 a 100  |

| Método                          | Descrição                                        |
|---------------------------------|--------------------------------------------------|
| `SmartPhone(marca, arm, tela)`  | Construtor — marca, armazenamento e tela obrigatórios |
| `carregarBateria(int)`          | Carrega bateria — bloqueia negativo, limita 100% |
| `instalarApp(int)`              | Instala app — bloqueia se sem espaço             |
| `getMarca()`                    | Retorna a marca                                  |
| `getArmazenamento()`            | Retorna o armazenamento                          |
| `getTamanhoTela()`              | Retorna o tamanho da tela                        |
| `getBateria()`                  | Retorna o nível da bateria                       |

---

## ▶️ Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/fiap-poo.git
```

2. Abra o projeto no **IntelliJ IDEA**

3. Execute o arquivo desejado:
   - `SistemaPrincipal.java` → testa Passageiro e Veiculo
   - `TesteSmartPhone.java` → testa o SmartPhone e Garrafa

---

## 🖥️ Saída esperada

### SistemaPrincipal
```
--- Iniciando o Sistema FiapRide ---

Saldo adicionado! Novo saldo: R$ 50.0
Saldo adicionado! Novo saldo: R$ 12.5

--- Status dos Passageiros ---
Passageiro: Ana Silva | Saldo: R$ 50.0 | CPF: 222.222.222-22
Passageiro: Carlos Souza | Saldo: R$ 12.5 | CPF: 333.333.333-33

--- Realizando Viagens ---
Viagem paga! Saldo restante: R$ 30.0
Erro: saldo insuficiente. Saldo atual: R$ 12.5

--- Veículos ---
Registro: Um Toyota Corolla nasceu com a placa ABC-1234
Sucesso: placa agora é ABC-1234
Solicitada atualização de placa para o veículo Toyota Corolla...
Sucesso: placa agora é XYZ-9999
Solicitada atualização de placa para o veículo Toyota Corolla...
Erro: placa inválida!
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

- **Abstração** — modelar apenas o necessário para o negócio
- **Encapsulamento** — atributos private, acesso via getters e setters
- **Construtor** — objeto já nasce com estado válido e dados obrigatórios
- **Regras de negócio** — validações nos métodos protegem o estado
- **Clean Code** — máximo 3 parâmetros por construtor, nomes significativos
- **Separação de responsabilidades** — cada classe tem seu próprio arquivo de teste

---

## 👨‍💻 Autor
**[João Victor A. de Abreu]** — FIAP Ciência da Computação
