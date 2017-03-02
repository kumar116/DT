struct node {
  int data;
  struct node *left;
  struct node *right;
};

struct node * newNode(int data);
struct node * insert(struct node *head, int data);
void inorder(struct node *head);
void preorder(struct node *head);
void postorder(struct node *head);
