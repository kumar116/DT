#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "list.h"

int main(char * argc) {
  struct node **head = NULL;
  head = (struct node **)malloc(sizeof(struct node *));
  
  struct node **front = NULL;
  struct node **back = NULL;
  front = (struct node **)malloc(sizeof(struct node *));
  back = (struct node **)malloc(sizeof(struct node *));
  
  char *A = "A";
  char *B = "B";
  char *C = "C";
  char *D = "D";
  char *E = "E";
  char *F = "F";

  insert(head, F);
  insert(head, E); 
  insert(head, D); 
  insert(head, C); 
  insert(head, B);
  insert(head, A);
  
  print(*head);
 
  //TODO write test cases 
  freeList(*head);
  free(front);
  free(back);
  free(head);
  return 1;
}   
