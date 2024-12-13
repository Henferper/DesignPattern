# Jogo de Batalha (Game Project)
### Autor - Henrique

Este projeto é uma aplicação Java simples que implementa um jogo de batalha entre um herói e um monstro. O jogo utiliza padrões de projeto como Singleton, Factory, Decorator, Observer e Strategy, proporcionando um design modular e extensível.

---

## O que foi feito

### Funcionalidades Principais:
1. **Singleton**: Gerenciamento da lógica principal do jogo através da classe `GameManager`.
2. **Factory**: Criação dinâmica de entidades do jogo (heróis e monstros) com a classe `EntityFactory`.
3. **Decorator**: Adição de comportamentos ou atributos ao herói, como escudos.
4. **Observer**: Registro de eventos no jogo usando padrões de publicação/assinatura.
5. **Strategy**: Diferentes estratégias de ataque implementadas para o herói e o monstro.

### Estrutura Modular:
O projeto foi dividido em pacotes para facilitar o entendimento e manutenção:
- `singleton`: Gerenciamento do jogo.
- `factory`: Criação de entidades.
- `decorator`: Modificações dinâmicas nas entidades.
- `observer`: Registro e manipulação de eventos.
- `strategy`: Estratégias de ataque.

---

## Como executar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior.
- Maven ou Gradle configurado (opcional para gerenciar dependências).

### Passos para execução
1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd <NOME_DO_PROJETO>
   ```

2. Compile o projeto:
   ```bash
   javac -d bin src/game/**/*.java
   ```

3. Execute a aplicação:
   ```bash
   java -cp bin game.Main
   ```

4. Siga as instruções do jogo no console para interagir e jogar.

---

## Testes Implementados

Os testes foram desenvolvidos com **JUnit 5** para validar as funcionalidades principais do jogo. Aqui estão os principais testes:

### Testes do `GameManager`
- Verificação do padrão Singleton: Certifica-se de que apenas uma instância de `GameManager` seja criada.
- Inicialização do jogo: Confirma que o herói e o monstro são criados corretamente com vida inicial válida.

### Testes do `EntityFactory`
- Criação de heróis: Garante que a entidade do herói seja instanciada corretamente.
- Criação de monstros: Garante que a entidade do monstro seja instanciada corretamente.

### Como executar os testes
1. Certifique-se de que o JUnit esteja configurado.
2. Compile e execute os testes:
   ```bash
   mvn test
   ```
   ou
   ```bash
   gradle test
   ```

3. Verifique os resultados no terminal ou relatório gerado pela ferramenta.