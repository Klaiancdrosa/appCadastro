# **AppCadastro**
&gt; Demonstrar a primeira utilização do banco de dados SQLite para cadastro e login.

## Descrição
O **AppCadastro** permite ao usuário criar um cadastro e permitir o login utilizando o banco de dados.

## Funcionalidades
- [x] Entrada de dados (username, nome, senha, confirmar senha)
- [x] Interface simples e intuitiva

## Tecnologias Utilizadas
- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **RelativeLayout e CoordinatorLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
      
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
```bash
git clone https://github.com/Klaiancdrosa/appCadastro.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.
   
## Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
| | | | |── br.ulbra.appcadastro
│ │ │ │ | ├── CadastrarActivity.java # Atividade aonde ocorre o cadastro do cliente para o banco de dados.
│ │ │ │ | ├── BDHelper.java # Banco de dados aonde as informações de cadastro ficam armazenadas.
│ │ │ │ | ├── CadastrarActivity.java # Atividade aonde o usuário fará o login após o cadastro.
│ │ │ ├── res
| | | | ├── drawable # imagens e icones utilizados na tela principal
│ │ │ │ ├── layout
│ │ │ │ │ ├── telacadastro.xml # Layout da tela de cadastro
│ │ │ │ │ ├── telalogin.xml # Layout da tela de cadastro
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

## Design e Prototipage
A interface do app foi criada usando **RelativeLayout e CoordinatorLayout**;
O design é minimalista e fácil de usar, com foco na simplicidade.

## Telas do App Agenda
**Tela Principal**
Na tela principal, aonde o usuário poderá realizar o login ou avançar para a aba de cadastro.

![image](https://github.com/user-attachments/assets/8ed5e11c-d194-4a7a-8647-8246396d7bf0)

**Tela Secundária**
Na tela secundária, o usuário deverá fazer o cadastro de suas informações para após realizar o login.

![image](https://github.com/user-attachments/assets/9f9b7174-7d3a-4f50-95fd-1c2dc9686631)

## Desenvolvedores
**Klaian Conceição da Rosa** - Desenvolvedor - [GitHub](https://github.com/Klaiancdrosa)

## Licenças
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo
[LICENSE](LICENSE).
