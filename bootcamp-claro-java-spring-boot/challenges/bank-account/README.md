## Challenge: Basic Java - Inputs and Outputs via Terminal.

The Source code is available on:
    [./src](./src)

#### Challenge Authors
- [Gleyson Sampaio](https://github.com/glysns)

## Syntax - Challenge

Let's exercise all the content presented in the Syntax module by coding the following scenario.

1. Create the `BankAccount` project that will receive data via terminal containing bank account characteristics as described by the attributes below:
2. Within the project, create the `ContaTerminal.java` class to implement all the coding for our program.

###### Review variable declaration rules

| Attribute  | Type     | Example   
| ---------  | ---------| ------- 
| Number     | Integer  | 1021 
| Branch     | Text     | 067-8
| Client Name| Text     | MARIO ANDRADE
| Balance    | Decimal  | 237.48


###### Review terminal input, main args, and the Scanner class
2. Allow the data to be entered via terminal, with the user receiving a message indicating which information will be requested, for example:

* Program: "Please, enter the Branch number!"
* User: 1021 *(then press ENTER for the next field)* 

###### Review concatenation and the String class with the concat method

3. After all the information has been entered, the system should display the following message:

*"Hello [Client Name], thank you for creating an account with our bank. Your branch is [Branch], account number [Number], and your balance of [Balance] is now available for withdrawal."*

The fields in [ ] should be replaced with the information entered by the users.
