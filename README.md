# Princípio Aberto-Fechado (OCP) em Java

Este repositório contém estudos e exemplos de aplicação do **Princípio Aberto-Fechado (OCP)** utilizando Java.
O príncipio **OCP (Open-Closed Principle)** estabelece que "as classes devem estar abertas para extensão, mas fechadas para modificação".
Isso significa que devemos poder adicionar novas funcionalidades sem alterar o código existente, evitando assim efeitos colaterais indesejados.

## Casos de Uso

### Case 1: Calculadora de Descontos (Refatorando para OCP)

#### **Problema**
Uma classe `DiscountCalculator` contém um `switch` para aplicar descontos a diferentes tipos de clientes (*Regular*, *VIP*, *Funcionário*). Sempre que um novo tipo de cliente é adicionado, é necessário modificar a classe, violando o OCP.

#### **Solução**
Refatoramos o código utilizando **polimorfismo** e uma interface `DiscountStrategy`, onde cada tipo de cliente tem sua própria implementação de desconto. Dessa forma, podemos adicionar novos descontos sem modificar a lógica principal da calculadora.

---

### Case 2: Exportação de Relatórios (Refatorando para OCP)

#### **Problema**
Uma classe `ReportExporter` utiliza `if-else` para decidir como exportar relatórios em diferentes formatos (*PDF*, *CSV*, *JSON*). Se um novo formato precisar ser adicionado (*XML*, por exemplo), a classe precisa ser modificada, quebrando o OCP.

#### **Solução**
Criamos uma interface `ReportExporter` e implementamos classes específicas para cada tipo de exportação (*PdfExporter*, *CsvExporter*, *JsonExporter*). Com isso, o sistema é expandido sem modificações na classe principal `ReportService`.

---

### Case 3: Sistema de Notificações (Refatorando para OCP)

#### **Problema**
Uma classe `NotificationService` utiliza `if-else` para decidir qual tipo de notificação enviar (*E-mail*, *SMS*, *Push Notification*). Se um novo canal for adicionado (*WhatsApp*, por exemplo), a classe precisa ser modificada, quebrando o OCP.

#### **Solução**
Criamos uma interface `NotificationSender` e implementamos classes específicas para cada tipo de notificação (*EmailNotification*, *SmsNotification*, *PushNotification*). Dessa forma, novos canais podem ser adicionados sem alterar o código existente da `NotificationService`.

---

Cada um desses casos foi implementado e separado em `cases/problem` e `cases/solution`.

Sinta-se à vontade para explorar o código e sugerir melhorias!

## Como Executar os Exemplos
1. Clone o repositório
```sh
   git clone git@github.com:DaniloTakeo/solid_open_closed_principle.git
```
2. Compile e execute os exemplos desejados em sua IDE ou via linha de comando.

## Contato
Caso tenha dúvidas ou sugestões, fique à vontade para abrir uma issue ou contribuir com melhorias! 🚀

## 👨‍💻 Autor
Danilo Takeo Kanizawa
