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

void freeList(struct node *head) {
  if (head == NULL) {
    return;
  }
  freeList(head->next);
  freeNode(head);
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
    printf("%s ", curr->data);
    curr = curr->next;
  }
  printf("\n");
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

void reverse(struct node **head) {
  struct node *prev = NULL;
  struct node *curr = *head;
  struct node *next = NULL;

  while (curr != NULL) {
    next = curr->next;
    curr->next = prev;
    prev = curr;
    curr = next;
  }
  (*head) = prev;
}

void split(struct node *head, struct node **front, struct node **back) {
  struct node *slow = head;
  struct node *fast = head;
  struct node *temp = NULL;
  while (fast != NULL) {
    temp = slow;
    slow = slow->next;
    fast = (fast->next) ? fast->next->next : NULL;
  } 
  temp->next = NULL;
  (*back) = slow;
  (*front) = head;
}

void zip(struct node **head, struct node *front, struct node *back) {
  struct node *curr1 = front;
  struct node *next1 = NULL;
  struct node *curr2 = back;
  struct node *next2 = NULL;

  while (curr1 != NULL && curr2 != NULL) {
    next1 = curr1->next;
    next2 = curr2->next;
    curr1->next = curr2;
    curr2->next = next1;
    curr1 = next1;
    curr2 = next2;
  }
  *head = front;
}

void join(struct node *front, struct node *back) {
  struct node *curr = front;
  while (curr->next != NULL) {
    curr = curr->next;
  }
  curr->next = back;
}
