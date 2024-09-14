# Stage 1: Scanning input prrograms into tokens

Java - Jflex (Official doc: https://jflex.de/manual.html#how-to-get-it-building)

# Stage 2: Parsing the program into an abstract syntax tree

Java Cup (Offical doc: https://www2.cs.tum.edu/projects/cup/)

Additional resources for both of the tools:
https://andreil26.github.io/me/uniprojects/2019/06/21/lexer_parser.html

# Stage 3: Semantic analysis

We will have a type system that enforces type saftey, i.e. you can only add two integers, the IF statement is well typed, etc. The type system _should_ be sound, but I make no promises :)

This doc will contain:

- The syntax for our language (expressed as a Context-Free Grammar)
- Type system
- We will use mostly standard IMP semantics, but will mention semantics for a few commands using big step operational semantics
