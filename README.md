# FiapRide — POO FIAP

Projeto de Programação Orientada a Objetos da FIAP.

---

## O que é o SmartPhone?
Representa um smartphone no mundo real com atributos como bateria e armazenamento,
e métodos que simulam seu comportamento com regras de negócio.

---

## Atributos

| Atributo      | Tipo   | Descrição                    |
|---------------|--------|------------------------------|
| marca         | String | Fabricante do aparelho       |
| armazenamento | int    | Espaço disponível em MB      |
| tamanhoTela   | double | Tamanho da tela em polegadas |
| bateria       | int    | Nível da bateria de 0 a 100  |

---

## Métodos

### `carregarBateria(int quantidade)`
Aumenta o nível da bateria.
- Regra: valor deve ser maior que zero
- Regra: bateria não ultrapassa 100%

### `instalarApp(int tamanhoEmMb)`
Instala um app reduzindo o armazenamento disponível.
- Regra: tamanho deve ser maior que zero
- Regra: não instala se não houver espaço suficiente

---

## Como usar
```java
SmartPhone meuCelular = new SmartPhone();
meuCelular.marca         = "Samsung";
meuCelular.armazenamento = 128;
meuCelular.bateria       = 20;

meuCelular.carregarBateria(50);  // bateria: 70%
meuCelular.instalarApp(40);      // armazenamento: 88MB
```

---
