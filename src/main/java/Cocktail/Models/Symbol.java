package Cocktail.Models;

/**
 * A class to represent a basic symbol in the symbol table
 */
public class Symbol {
    // The type of the symbol
    private VariableType variableType;

    // The symbol name
    private String name;

    // The value of the symbol
    private int intValue = null;
    private float floatValue = null;
    private String stringValue = null;
    private boolean booleanValue = null;
    private char charValue = null;
    private boolean isNull = false;
    private boolean isUndefined = false;

    //region Constructors

    /**
     * Common among all symbol creations
     */
    private void SetInitValues(VariableType variableType, String name) {
        this.variableType = variableType;
        this.name = name;

        if (this.variableType === VariableType.NULL) {
            this.isNull = true;
        } else if (this.variableType === VariableType.UNDEFINED) {
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

    //endregion
}