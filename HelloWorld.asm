; Learning some x86

; hello_world.asm

; THIS IS A COMMENT

global _start

section .text:

_start:
	mov eax, 0x4  ; use the write syscall to the eax register
	mov ebx, 1 ; use stdout for file descriptor
	mov ecx, message ; buffer to write out
	mov edx, message_length ; Length of bufffer
	int 0x80 ; invoke syscall stored in eax

	mov eax, 0x1 ; exit sys call
	mov ebx, 0 ; call with exit code 0
	int 0x80 ; do sys call

section .data:
	message: db "Hello World!", 0xA
	message_length equ $-message