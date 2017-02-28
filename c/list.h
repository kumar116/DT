struct node {
  char *data;
  struct node *next;
};

struct node * newNode(char *data);
void freeNode(struct node *curr);
void insert(struct node **head, char *data);
void delete(struct node **head, char *data);
int search(struct node *head, char *data);
void print(struct node *head);

int size(struct node *head);

void reverse(struct node **head);
