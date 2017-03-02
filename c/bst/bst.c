#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#include "bst.h"

struct node * newNode(int data) {
  struct node *curr = (struct node *)malloc(sizeof(struct node));
  curr->data = data;
  curr->left = NULL;
  curr->right = NULL;
  return curr;
}

struct node * insert(struct node *head, int data) {
  if (head == NULL) {
    head = newNode(data);
  } else {
    if (data >= head->data) {
      head->right = insert(head->right, data);
    } else {
      head->left = insert(head->left, data);
    }
  }
  return head;
}

void inorder(struct node *head) {
  if (head == NULL) {
    return;
  } else {
    inorder(head->left);
    printf("%d ", head->data);
    inorder(head->right);
  }
}

void preorder(struct node *head) {
  if (head == NULL) {
    return;
  } else {
    printf("%d ", head->data);
    preorder(head->left);
    preorder(head->right);
  }
}

void postorder(struct node *head) {
  if (head == NULL) {
    return;
  } else {
    postorder(head->left);
    postorder(head->right);
    printf("%d ", head->data);
  }
}

int minimum(struct node *head) {
  struct node *curr = head;
  if (curr->left == NULL) {
    return curr->data;
  }
  return minimum(head->left);
}

int maximum(struct node *head) {
  struct node *curr = head;
  if (curr->right == NULL) {
    return curr->data;
  }
  return minimum(head->right);
}

int search(struct node *head, int data) {
  if (head == NULL) {
    return 0;
  }
  if (head->data == data) {
    return 1;
  }
  if (head->data > data) {
    return search(head->left, data);
  } else {
    return search(head->right, data);
  }
}
