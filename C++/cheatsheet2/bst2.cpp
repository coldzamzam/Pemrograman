// Given Node Structure
struct node
{
    int key;
    struct node *left, *right;
};

// Function to create a new BST node
struct node* newNode(int item)
{
  struct node* temp = (struct node*)malloc(
    sizeof(struct node));
  temp->key = item;
  temp->left = temp->right = NULL;
  return temp;
}

// Function to insert a new node with
// given key in BST
struct node* insert(struct node* node, int key)
{
    
  // If the tree is empty, return a new node
  if (node == NULL)
    return newNode(key);

  // Otherwise, recur down the tree
  if (key < node->key)
  {
    node->left = insert(node->left, key);
  }
  else if (key > node->key)
  {
    node->right = insert(node->right, key);
  }

  // Return the node pointer
  return node;
}
