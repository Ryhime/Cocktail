package Cocktail;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class SymbolTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void CreateIntSymbol() {
        Symbol symbol = new Symbol("test", 5);
        assertTrue(symbol.getName().equals("test"));
        assertTrue(symbol.getVariableType() == VariableType.INT);
        assertTrue(symbol.getIntValue() == 5);
        assertTrue(symbol.valueToString().equals("5"));

        Symbol symbol2 = new Symbol(VariableType.INT, "test2");
        assertTrue(symbol2.getName().equals("test2"));
        assertTrue(symbol2.getVariableType() == VariableType.INT);
        assertTrue(symbol2.getIntValue() == 0);
    }

    @Test
    public void CreateFloatSymbol() {
        Symbol symbol = new Symbol("testfloat", .5f);
        assertTrue(symbol.getName().equals("testfloat"));
        assertTrue(symbol.getVariableType() == VariableType.FLOAT);
        assertTrue(symbol.getFloatValue() == .5f);
        assertTrue(symbol.valueToString().equals("0.5"));
        

        Symbol symbol2 = new Symbol(VariableType.FLOAT,"test2");
        assertTrue(symbol2.getName().equals("test2"));
        assertTrue(symbol2.getVariableType() == VariableType.FLOAT);
        assertTrue(symbol2.getFloatValue() == 0);
    }

    @Test
    public void CreateStringSymbol() {
        Symbol symbol = new Symbol("teststring", "myStr");
        assertTrue(symbol.getName().equals("teststring"));
        assertTrue(symbol.getVariableType() == VariableType.STRING);
        assertTrue(symbol.getStringValue().equals("myStr"));
        assertTrue(symbol.valueToString().equals("myStr"));

        Symbol symbol2 = new Symbol(VariableType.STRING, "test2");
        assertTrue(symbol2.getName().equals("test2"));
        assertTrue(symbol2.getVariableType() == VariableType.STRING);
        assertTrue(symbol2.getStringValue() == "");
    }

    @Test
    public void CreateBooleanSymbol() {
        Symbol symbol = new Symbol("testbool", true);
        assertTrue(symbol.getName().equals("testbool"));
        assertTrue(symbol.getVariableType() == VariableType.BOOLEAN);
        assertTrue(symbol.getBooleanValue());
        assertTrue(symbol.valueToString().equals("1"));

        Symbol symbol2 = new Symbol(VariableType.BOOLEAN, "test2");
        assertTrue(symbol2.getName().equals("test2"));
        assertTrue(symbol2.getVariableType() == VariableType.BOOLEAN);
        assertTrue(symbol2.getBooleanValue() == false);
        assertTrue(symbol2.valueToString().equals("0"));
    }

    @Test
    public void CreateCharacterSymbol() {
        Symbol symbol = new Symbol("testchar", 'c');
        assertTrue(symbol.getName().equals("testchar"));
        assertTrue(symbol.getVariableType() == VariableType.CHAR);
        assertTrue(symbol.getCharValue() == 'c');
        assertTrue(symbol.valueToString().equals("c"));

        Symbol symbol2 = new Symbol(VariableType.CHAR, "test2");
        assertTrue(symbol2.getName().equals("test2"));
        assertTrue(symbol2.getVariableType() == VariableType.CHAR);
        assertTrue(symbol2.getCharValue() == '\0');
    }

    @Test
    public void CreateNullSymbol() {
        Symbol symbol = new Symbol(VariableType.NULL, "test2");
        assertTrue(symbol.getName().equals("test2"));
        assertTrue(symbol.getVariableType() == VariableType.NULL);
        assertTrue(symbol.isNull());
        assertTrue(symbol.valueToString().equals("0"));
    }

    @Test
    public void CreateUndefinedSymbol() {
        Symbol symbol = new Symbol(VariableType.UNDEFINED, "test2");
        assertTrue(symbol.getName().equals("test2"));
        assertTrue(symbol.getVariableType() == VariableType.UNDEFINED);
        assertTrue(symbol.isUndefined());
        assertTrue(symbol.valueToString().equals("0"));
    }
}
