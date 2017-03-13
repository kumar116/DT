#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "bst.h"

int main(char * argc) {
  struct node *head = NULL;

  head = insert(head, 4);
  head = insert(head, 2);
  head = insert(head, 3);
  head = insert(head, 1);
  head = insert(head, 5);
  inorder(head); 
  printf("\n");

  //preorder(head);
  //printf("\n");

  //postorder(head);
  //printf("\n");

  //printf("%d\n", minimum(head));
  //printf("%d\n", maximum(head));

  //printf("%p\n", search(head, 1));
  //printf("%p\n", search(head, 5));
  //printf("%p\n", search(head, 10));

  //delete(head, 1);
  delete(head, 2); 

  inorder(head);
  free(head);
  return 1;
}   
