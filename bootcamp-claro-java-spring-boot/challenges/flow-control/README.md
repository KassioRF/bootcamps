## Challenge: Basic Java - Flow Control.

The Source code is available on:
    [./src](./src)

#### Authors
- [Gleyson Sampaio](https://github.com/glysns)

## Flow Control - Challenge

Let's practice all the content presented in the Flow Control module by coding the following scenario.

The system should receive two parameters via terminal, which will represent two integers. With these two numbers, you should obtain the number of iterations (for loop) and print the incremented numbers to the console (System.out.print), as shown in the example:

* If you pass the numbers 12 and 30, you will have a for loop with 18 occurrences to print the numbers, like: `"Printing number 1"`, `"Printing number 2"`, and so on.
* If the first parameter is GREATER than the second parameter, you should throw a custom exception called `ParametrosInvalidosException` with the following message: "The second parameter must be greater than the first."

1. Create the project `DesafioControleFluxo`
2. Within the project, create the class `Contador.java` to implement all the program's code.
3. Within the project, create the class `ParametrosInvalidosException` to represent the business exception in the system.