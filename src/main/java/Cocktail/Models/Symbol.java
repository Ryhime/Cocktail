package Cocktail;

/**
 * A class to represent a basic symbol in the symbol table
 */
public class Symbol {
    // The type of the symbol
    private VariableType variableType;

    // The symbol name
    private String name;

    // The value of the symbol
    private int intValue;
    private float floatValue;
    private String stringValue;
    private boolean booleanValue;
    private char charValue;
    private boolean isNull;
    private boolean isUndefined;

    //region Constructors

    /**
     * Default Constructor no value for symbol has been set yet
     */
    public Symbol(VariableType variableType, String name) {
        this.variableType = variableType;
        this.name = name;

        switch (variableType) {
            case INT:
                this.intValue = 0;
                break;
            case FLOAT:
                this.floatValue = 0;
                break;
            case STRING:
                this.stringValue = "";
                break;
            case BOOLEAN:
                this.booleanValue = false;
                break;
            case CHAR:
                this.charValue = '\0';
                break;
            case NULL:
                this.isNull = true;
                break;
            case UNDEFINED:
                this.isUndefined = true;
                break;
            default:
                System.out.println("Symbol Type not found when creating symbol");
                break;
        }
    }

    /**
     * Constructor for an integer symbol
     */
    public Symbol(String name, int value) {
        this.name = name;
        this.variableType = VariableType.INT;
        this.intValue = value;
    }

    /**
     * Constructor for a float symbol
     */
    public Symbol(String name, float value) {
        this.name = name;
        this.variableType = VariableType.FLOAT;
        this.floatValue = value;
    }

    /**
     * Constructor for a string symbol
     */
    public Symbol(String name, String value) {
        this.name = name;
        this.variableType = VariableType.STRING;
        this.stringValue = value;
    }

    /**
     * Constructor for a boolean symbol
     */
    public Symbol(String name, boolean value) {
        this.name = name;
        this.variableType = VariableType.BOOLEAN;
        this.booleanValue = value;
    }

    /**
     * Constructor for a char symbol
     */
    public Symbol(String name, char value) {
        this.name = name;
        this.variableType = VariableType.CHAR;
        this.charValue = value;
    }

    //endregion
    //region Getters

    /**
     * Get Variable type
     */
    public VariableType getVariableType() {
        return this.variableType;
    }

    /**
     * Get Symbol Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get Integer Value
     */
    public int getIntValue() {
        return this.intValue;
    }

    /**
     * Get Float Value
     */
    public float getFloatValue() {
        return this.floatValue;
    }

    /**
     * Get String Value
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Get Boolean Value
     */
    public boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * Get Char Value
     */
    public char getCharValue() {
        return this.charValue;
    }

    /**
     * Get if the symbol is null
     */
    public boolean isNull() {
        return this.isNull;
    }

    /**
     * Get if the symbol is undefined
     */
    public boolean isUndefined() {
        return this.isUndefined;
    }

    /**
     * Gets the value of the symbol as a string
     */
    public String valueToString() {
        switch (this.variableType) {
            case INT:
                return ""+this.intValue;
            case FLOAT:
                return ""+this.floatValue;
            case STRING:
                return this.stringValue;
            case BOOLEAN:
                return this.booleanValue ? "1" : "0";
            case CHAR:
                return ""+this.charValue;
            case NULL:
                return "0";
            case UNDEFINED:
                return "0";
            default:
                System.out.println("Symbol Type not found when getting symbol value");
                return "";
        }
    }

    /**
     * Symbol To String
     */
    public String toString() {
        return this.variableType + ": " + this.name + " " + this.valueToString();
    }
    //endregion
}