package Cocktail;

enum SystemCall
{ 
    EXIT(1), WRITE(4); 
  
    private int systemCallNumber;
  
    public int getSystemCallNumber() 
    { 
        return this.systemCallNumber;
    } 
  
    private SystemCall(int systemCallNumber) 
    { 
        this.systemCallNumber = systemCallNumber;
    } 
} 