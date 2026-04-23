# 🏦 FiapBankAtm - Java CLI Simulator

O **FiapBankAtm** é uma aplicação de console desenvolvida em Java que simula o funcionamento de um terminal bancário. O projeto foca em lógica de programação estruturada, validação de dados e segurança do usuário.

## 🚀 Funcionalidades

- **Cadastro de Conta:** Captura o nome completo e processa automaticamente o primeiro nome para personalização da interface.
- **Segurança com Regex:** Sistema de criação de senha com critérios rígidos (mínimo 8 caracteres, letra maiúscula, número e caractere especial).
- **Autenticação:** Sistema de login com validação de credenciais.
- **Proteção de Acesso:** Bloqueio automático do sistema após 3 tentativas consecutivas de login malsucedidas.
- **Operações Bancárias:** - Consulta de Saldo com interface formatada.
  - Depósito com validação de valor positivo.
  - Saque com verificação de disponibilidade de saldo.

## 🛠️ Tecnologias Utilizadas

- **Java SE (Standard Edition)**
- **Scanner API:** Para interação via terminal.
- **Regex (Expressões Regulares):** Para validação robusta de segurança de senhas.

## 🧪 Conceitos Aplicados

1. **Estruturas de Repetição:** Uso estratégico de `while(true)` para menus contínuos.
2. **Tomada de Decisão:** Implementação de `switch-case` para navegação entre funcionalidades.
3. **Tratamento de Strings:** Uso de métodos como `.trim()`, `.split()` e `.toUpperCase()` para sanitização e exibição de dados.
4. **Lógica de Negócio:** Gerenciamento de variáveis de estado (saldo, contador de erros).

## 🎮 Como Executar

1. Certifique-se de ter o **JDK** instalado (versão 11 ou superior recomendada).
2. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/FiapBankAtm.git](https://github.com/seu-usuario/FiapBankAtm.git)
