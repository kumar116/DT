main:
	gcc list.c main.c -o main
run:
	./main
clean:
	rm main
test:
	valgrind --tool=memcheck --leak-check=full --track-origins=yes ./main
