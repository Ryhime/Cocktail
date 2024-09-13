package Cocktail;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        CodeGen codeGen = new CodeGen("HelloWorld.asm", "HelloWorld");
        codeGen.AsmToObject();
    }
}
