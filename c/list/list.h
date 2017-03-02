struct node {
  char *data;
  struct node *next;
};

struct node * newNode(char *data);
void freeNode(struct node *curr);
void freeList(struct node *head);
void insert(struct node **head, char *data);
void delete(struct node **head, char *data);
int search(struct node *head, char *data);
void print(struct node *head);

int size(struct node *head);

void reverse(struct node **head);
void split(struct node *head, struct node **front, struct node **back);
void join(struct node *front, struct node *back);
void zip(struct node **head, struct node *front, struct node *back);
