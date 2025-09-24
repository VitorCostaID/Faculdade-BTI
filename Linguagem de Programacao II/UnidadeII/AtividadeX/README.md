### **Atividade 10: Gestão de Dispositivos Eletrônicos com Interfaces**

#### **1. Objetivo**
O objetivo deste projeto é implementar um sistema de gestão de dispositivos eletrônicos, aplicando o conceito de **Interface** para criar um contrato comum de funcionalidades.

#### **2. Instruções do Projeto**

##### **2.1. Criação das Classes e Interfaces**
Você deve criar a seguinte estrutura:

* **Interface `DispositivoEletronico`**: Define o contrato com os métodos `ligar()`, `desligar()` e `status()`.
* **Classe `Smartphone`**: Implementa a interface `DispositivoEletronico` e tem os atributos `marca` (String) e `modelo` (String).
* **Classe `SmartTV`**: Implementa a interface `DispositivoEletronico` e tem os atributos `marca` (String) e `tamanho` (int).
* **Classe `ControleRemoto`**: Não possui atributos de dispositivo, mas tem um método que interage com qualquer objeto que implemente a interface `DispositivoEletronico`.

##### **2.2. Relacionamento entre as Classes**
* Tanto a classe `Smartphone` quanto a `SmartTV` devem implementar a interface `DispositivoEletronico`.
* A classe `ControleRemoto` deve usar a interface como um "tipo" de dado em seu método, permitindo interagir com qualquer `DispositivoEletronico` sem conhecer os detalhes específicos de `Smartphone` ou `SmartTV`.

##### **2.3. Funcionalidade Básica**
* Seu programa deve permitir a criação de um `Smartphone` e uma `SmartTV`.
* A classe `ControleRemoto` deve ter um método chamado `controlarDispositivo(DispositivoEletronico dispositivo)` que chame os métodos `ligar()`, `status()` e `desligar()` do dispositivo recebido.

---

#### **3. Implementação**

##### **3.1. Implementação das Interfaces e Classes**
* **Interface `DispositivoEletronico`**: Crie os métodos abstratos `ligar()`, `desligar()` e `status()`.
* **Classe `Smartphone`**: Implemente a interface, adicione um construtor e forneça a lógica para os métodos `ligar()`, `desligar()` e `status()`.
* **Classe `SmartTV`**: Siga o mesmo processo, implementando a interface com seu construtor e a lógica dos métodos.
* **Classe `ControleRemoto`**: Crie o método `controlarDispositivo(DispositivoEletronico dispositivo)` para interagir com o objeto de forma polimórfica.

##### **3.2. Criação de Múltiplos Objetos**
1.  Crie instâncias de `Smartphone` e `SmartTV`.
2.  Crie uma instância de `ControleRemoto`.
3.  Chame o método `controlarDispositivo()` do `ControleRemoto`, passando primeiro o objeto `Smartphone` e, em seguida, o objeto `SmartTV`.

---

#### **4. Exemplo de Saída Esperada**
Ao executar o programa, você deve obter uma saída como a seguinte:
```
Ligando o Smartphone Samsung Galaxy S21 ...
Status do Smartphone : Ligado .
Desligando o Smartphone Samsung Galaxy S21 ...

--- Controlando SmartTV ---
Ligando a SmartTV LG 55 polegadas ...
Status da SmartTV : Ligada .
Desligando a SmartTV LG 55 polegadas ...

```