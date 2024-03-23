# Programa feito a partir de slides de aula sobre Computação Orientada a Objetos:

> Para utilizar o programa, certifique-se que todos os arquivos estejam na pasta "ComplexNumbers". Feito isso, adote durante a execução que a entrada de dados para números será do tipo 'double' e a entrada de string será do tipo 'string' (UTF-8).

## O programa consiste na soma de dois números complexos A e B:

+ Insira a parte real e depois a parte imaginária para o número A. Faça o mesmo para o número B;
+ Insira a operação desejada, tal como Soma, Subtração, Multiplicação ou Divisão;
+ Seu resultado será exibido, junto com o encerramento do programa.

Os números apresentam a **representação Ordinal**, porém pode ser substituído pela **representação Polar**, em que a parte real é um número e a parte imaginária é um ângulo. Para substituir, basta trocar o `return new OrdinaryComplex(a, b)` por `return new PolarComplex(a, b)`.
