# Design Patterns Study 🧠

Este repositório contém implementações de **Padrões de Projeto (Design Patterns)** em **Java** e **Python**.  
O objetivo é reforçar o aprendizado sobre os principais padrões utilizados no desenvolvimento orientado a objetos.

---

## 📚 Estrutura do Repositório

Cada padrão possui sua própria pasta.
Em alguns casos, um padrão principal pode conter outros padrões de apoio, representando cenários reais de arquitetura de software, onde múltiplos padrões se complementam. Exemplo de estrutura:

```
DesignPatternsStudy/
├── Builder/
├── Composite/
├── Decorator/
```

---

## 🚀 Como Executar os Exemplos

### 🐍 Python
1. Abra o terminal dentro da pasta do padrão desejado.
2. Execute o arquivo principal com:
   ```bash
   python nome_do_arquivo.py
   ```

### ☕ Java
1. Acesse a pasta do padrão desejado.
2. Compile e execute os arquivos Java:
   ```bash
   javac NomeDoArquivo.java
   java NomeDoArquivo
   ```

---

🧩 Padrões Já Implementados

Builder Pattern
Permite criar objetos complexos passo a passo, separando a construção da representação final.
Facilita a criação de diferentes representações do mesmo tipo de objeto usando o mesmo processo de construção.

Composite Pattern
Permite compor objetos em estruturas de árvore para representar hierarquias parte-todo.
Isso possibilita que clientes tratem objetos individuais e composições de maneira uniforme.

Decorator Pattern
Adiciona responsabilidades ou comportamentos adicionais a objetos dinamicamente, sem alterar suas classes originais.
É uma alternativa flexível à herança para estender funcionalidades.

---

🧠 Integração entre Padrões

Alguns desafios deste repositório aplicam múltiplos padrões de projeto combinados — por exemplo, um Builder que utiliza Decorators durante o processo de construção, ou um Facade que encapsula a criação de objetos gerenciados por um Composite.
Essas combinações representam situações práticas do mundo real, onde padrões raramente são usados de forma isolada.

---
## ✍️ Autor

**João Vítor Maia Braga**  
💻 Estudante e desenvolvedor em constante aprendizado sobre arquitetura de software e boas práticas de programação.  
🔗 [GitHub](https://github.com/JOAOVITORMAIABRAGA)

---

## 🗓️ Objetivo

Este repositório é atualizado constantemente. A meta é estudar e implementar **um novo padrão de projeto por dia**, explorando exemplos práticos em **Java** e **Python**.
