; Starting Header
; Generated by Cocktail
; Executable File: HelloWorld

global _start

section .text:
_start:
	mov eax, 4
	mov ebx, 1
	mov ecx, hello
	mov edx, 14
	int 0x80
	mov eax, 4
	mov ebx, 1
	mov ecx, Integer
	mov edx, 1
	int 0x80
	mov eax, 1
	mov ebx, 0
	int 0x80

section .data:
	hello: db "Hello, World!"
	Integer: dd 5
	Character: db "a"
