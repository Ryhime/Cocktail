package Cocktail;

public class CodeGen {
    private String assemblyName;
    private String targetExecutableName;

    /**
     * Constructor for CodeGen
     */
    public CodeGen(String assemblyName, String targetExecutableName) {
        this.assemblyName = assemblyName;
        this.targetExecutableName = targetExecutableName;
    }

    /**
     * Converts an ASM file to an object file and runs it by calling the sh file
     */
    public void AsmToObject() {
        String[] runBashCommand = new String[] {
            "nasm", "-f", "elf32", "-o", targetExecutableName + ".o", assemblyName
        };
        try {
            Process process = Runtime.getRuntime().exec(runBashCommand);
            process.waitFor();
            
            runBashCommand = new String[] {
                "ld", "-m", "elf_i386", "-o", targetExecutableName, targetExecutableName+".o"
            };

            process = Runtime.getRuntime().exec(runBashCommand);
            process.waitFor();
        } catch (Exception e) {
            System.out.println("FAILED");
            System.out.println(e);
        }
    }
}