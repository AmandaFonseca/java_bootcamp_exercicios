Com base na imagem, aqui está a extração apenas do conteúdo referente à **Interface**, organizada em uma lista para facilitar a consulta:

## Interface

* **Herança:** Herança múltipla é permitida; uma interface pode estender várias interfaces.
* **Palavra-chave:** A palavra-chave `implements` é utilizada para implementar uma interface.
* **Métodos:** Por padrão, todos os métodos são públicos e abstratos (`public abstract`) — não há necessidade de declará-los explicitamente.
* **Implementação:** Interfaces não possuem implementação (corpo nos métodos).
* **Sobrescrita:** Todos os métodos de uma interface precisam ser sobrescritos pela classe que a implementa.
* **Variáveis:** Todas as variáveis declaradas em uma interface são `public static final` (constantes).
* **Construtores:** Interfaces não possuem construtor(es).
* **Métodos Estáticos:** Métodos não podem ser estáticos (`static`).*

---
> **Nota técnica:** Vale lembrar que, em versões mais modernas do Java (pós-Java 8), as interfaces passaram a aceitar métodos `default` e métodos `static`. O conteúdo da imagem parece focar na definição clássica/base para fins didáticos e comparativos.

Com base na imagem, aqui está a extração apenas do conteúdo referente à **Classe Abstrata**, organizada em tópicos para facilitar o seu estudo:

## Classe Abstrata

* **Herança:** Herança múltipla não é possível; uma classe só pode estender uma única classe.
* **Palavra-chave:** A palavra-chave **extends** é utilizada para estender uma classe.
* **Modificadores de Métodos:** Os métodos podem ter modificadores `public` e `abstract` se necessário, e também podem utilizar outros modificadores.
* **Implementação:** Podem ter implementação parcial (podem conter métodos já com corpo/lógica definida).
* **Sobrescrita:** Somente os métodos abstratos precisam ser obrigatoriamente sobrescritos pela classe filha.
* **Variáveis:** Variáveis podem ser declaradas como `public static final` se necessário, mas não é obrigatório (podem ter atributos de instância comuns e variáveis com outros modificadores).
* **Construtores:** Classes abstratas podem ter construtores.
* **Métodos Estáticos:** Métodos não abstratos podem ser estáticos (`static`).