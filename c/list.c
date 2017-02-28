#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "list.h"

struct node * newNode(char *data) {
  struct node *curr = (struct node *)malloc(sizeof(struct node));
  curr->data = strdup(data);
  curr->next = NULL;
  return curr;
}

void insert(struct node **head, char *data) {
  if ((*head) == NULL) {
    (*head) = newNode(data);
  } else {
    struct node *curr = newNode(data);
    curr->next = (*head);
    (*head) = curr;
  }
}
void freeNode(struct node *curr) {
  curr->next = NULL;
  free(curr->data);
  free(curr);
}

void delete(struct node **head, char *data) {
  struct node *curr = (*head);
  struct node *prev = NULL;

  while(curr != NULL) {
    if (strcmp(curr->data, data) == 0) {
      if (prev == NULL) {
        (*head) = curr->next;
        freeNode(curr);
      } else if (curr->next == NULL) {
        prev->next = NULL;
        freeNode(curr);
      } else {
        prev->next = curr->next;
        freeNode(curr);
      }
      break;
    }
    prev = curr;
    curr = curr->next;
  }
}

int search(struct node *head, char *data) {
  struct node *curr = head;
  while (curr != NULL) {
    if (strcmp(curr->data, data) == 0) {
      return 1;
    }
    curr = curr->next;
  }
  return 0;
}

void print(struct node *head) {
  struct node *curr = head;
  while (curr != NULL) {
    printf("%s\n", curr->data);
    curr = curr->next;
  }
}

int size(struct node *head) {
  struct node *curr = head;
  int count = 0;
  while (curr != NULL) {
    count++;
    curr = curr->next;
  }
  return count;
}
