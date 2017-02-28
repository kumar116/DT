#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "list.h"

int main(char * argc) {
  struct node **head = NULL;
  head = (struct node **)malloc(sizeof(struct node *));

  insert(head, "C");
  delete(head, "C");

  insert(head, "C");
  insert(head, "B");
  insert(head, "A");

  print(*head);
  printf("%d\n", size(*head));
  return 1;
}   
