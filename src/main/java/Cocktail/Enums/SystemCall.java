package Cocktail.Enums;

/**
 * System call enum
 */
public enum SystemCall
{ 
    EXIT(1), WRITE(4); 
  
    private int systemCallNumber;
  
   /**
   * Get the number associated with the system call
   */
    public int getSystemCallNumber() 
    { 
        return this.systemCallNumber;
    } 
  
    /**
     * Constructor for the system call
     */
    private SystemCall(int systemCallNumber) 
    { 
        this.systemCallNumber = systemCallNumber;
    } 
} 