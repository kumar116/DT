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

struct node * successor(struct node *head) {
  if (head->left == NULL && head->right == NULL) {
    return head;
  }
  return successor(head->left);
}

struct node * delete(struct node *head, int data) {
  if (head == NULL) {
    return head;
  }
  if (data > head->data) {
    head->right = delete(head->right, data);
  } else if (data < head->data) {
    head->left = delete(head->left, data);
  } else {
    struct node *curr = NULL;
    if (head->left == NULL) {
      curr = head->right;
      head->right = NULL;
      free(head);
      return curr;
    } else if (head->right == NULL) {
      curr = head->left;
      head->left = NULL;
      free(head);
      return curr;
    } else {
      curr = successor(head->right);
      head->data = curr->data;
      head->right = delete(head->right, curr->data); //can we do better, replace the node instead of replacing the key ?
      return head;
    }
  }
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

struct node * search(struct node *head, int data) {
  if (head == NULL) {
    NULL;
  }
  if (head->data == data) {
    head;
  }
  if (head->data > data) {
    return search(head->left, data);
  } else {
    return search(head->right, data);
  }
}
