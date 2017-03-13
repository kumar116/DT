main:
	gcc bst.c main.c -o main
run:
	./main
clean:
	clear
	rm main
test:
	valgrind --tool=memcheck --leak-check=full --track-origins=yes ./main
