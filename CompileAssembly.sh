nasm -f elf32 -o $2.o $1 && ld -m elf_i386 -o $2 $2.o
