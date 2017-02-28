#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "list.h"

int main(char * argc) {
  struct node **head = NULL;
  head = (struct node **)malloc(sizeof(struct node *));
  char *A = "A";
  char *B = "B";
  char *C = "C";
  insert(head, C);
  delete(head, C);
  insert(head, C);
  insert(head, B);
  insert(head, A);
  reverse(head);
  print(*head);
  delete(head, B);
  delete(head, A);
  delete(head, C);
  print(*head);
  printf("%d\n", size(*head));
  free(head);
  return 1;
}   
