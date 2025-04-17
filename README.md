# Bank Account Currency as my first project
* Reviewing basic definitions of Object-Orient Programming in Java.*

[![Version] (Java 20.0.2)]
[![License] (Copyright © 2025)]
[![Status] (Working)]

---

## Table of Contents
1. [About the project](#about-the-project)
2. [Key Features](key-features)
3. [New Concepts](#new-concepts)
4. [Usage](#usage)
5. [Project Structure](#project-structure)
6. [Authors and Acknowledgements](#authors-and-acknowledgments)

---

## ✨ About the project

- **Bank Account Currency** is a little project of bank account currency just to review java fundaments and see how looks the OOP in real usage. I have done most part of the code by myself but my dad helped me so much doing refactoring ,indenting and teaching some functions that I don't learned very well in module java fundaments in the course.

---

## 👨🏾‍💻 Key Features

- (introducaoAoUsuario) to introduce the user to initial data(name,agency number and account number) 

- ("sacarUmValor") to withdraw

- ("transferirUmValor") to transfer any value

- ("consultarSaldoFinal") check the current balance after the transactions

- ("consultarAsTransacoesDoDia") check the day's transactions

- ("cancelarConta") cancel the account


---

## 🌎 New Concepts 

- I learned more about the fundamentals of OOP, such as polymorphism, which allows methods with the same signature to behave differently depending on the child class. Each child class can override the method and provide its own specific behavior.

- Override is used to redefine a method in a child class, changing its behavior from the one defined in the parent class. This is how polymorphism is achieved in object-oriented programming.

- Abstraction allows developers to create simplified models of complex real-world entities. An abstract class in Java is used as a template for other classes. It can contain abstract methods (without a body) that must be implemented in the child classes.

- Encapsulation is the practice of hiding important information about attributes or methods, restricting direct access from outside the class. This is managed through visibility scopes (like private or protected) and by using getter and setter methods to access or modify the values safely.

- Inheritance allows a class to inherit common attributes and methods from a parent class. The child class becomes a more specific version, adding or modifying its own attributes and methods. In Java, this is done using the extends keyword.

---

## 🔥 Usage

- The user will be introduced by entering initial data such as their name, agency number, and account number. Then, the user will be asked how much they want to withdraw ("sacar"). After entering the amount, another question will be asked: who the user wants to transfer ("transferir") money to, followed by the value of the transaction.

- To conclude, the user will be informed of their current account balance, and finally, they will be asked to provide a reason for canceling the bank account before finish the program the user can check the day's transactions. After that, the program ends.
 

---

## ⚙️ Project Structure
- The Bank file contains the domain class, which includes the ContaCorrente class — an entity that holds data, characteristics, and methods that are predefined in the system.

    The other files are:

- Service, which contains the ContaService class. This class is responsible for running the main logic of the program.

- Transacao, which contains the Central class. Its function is to instantiate objects and define their attributes.


---

## 👤 Authors and Acknowledgments
- My Dad and Me

---

## 📝 License
- Copyright © 2025 João Victor Braga Santos.
This project is MIT licensed.

