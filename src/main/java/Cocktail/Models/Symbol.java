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
     * Common among all symbol creations
     */
    private void SetInitValues(VariableType variableType, String name) {
        this.variableType = variableType;
        this.name = name;

        if (this.variableType == VariableType.NULL) {
            this.isNull = true;
        } else if (this.variableType == VariableType.UNDEFINED) {
            this.isUndefined = true;
        }
    }

    /**
     * Default Constructor no value for symbol has been set yet
     */
    public Symbol(VariableType variableType, String name) {
        this.SetInitValues(variableType, name);
    }

    /**
     * Constructor for an integer symbol
     */
    public Symbol(VariableType variableType, String name, int value) {
        this.SetInitValues(variableType, name);
        this.intValue = value;
    }

    /**
     * Constructor for a float symbol
     */
    public Symbol(VariableType variableType, String name, float value) {
        this.SetInitValues(variableType, name);
        this.floatValue = value;
    }

    /**
     * Constructor for a string symbol
     */
    public Symbol(VariableType variableType, String name, String value) {
        this.SetInitValues(variableType, name);
        this.stringValue = value;
    }

    /**
     * Constructor for a boolean symbol
     */
    public Symbol(VariableType variableType, String name, boolean value) {
        this.SetInitValues(variableType, name);
        this.booleanValue = value;
    }

    /**
     * Constructor for a char symbol
     */
    public Symbol(VariableType variableType, String name, char value) {
        this.SetInitValues(variableType, name);
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
    public String ToString() {
        return this.variableType + ": " + this.name + " " + this.valueToString();
    }
    //endregion
}