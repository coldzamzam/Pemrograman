#include <iostream>
#include <stdlib.h>
using namespace std;

struct node{
    int data;
    struct node* left;
    struct node* right;
};
// New node creation
struct node* createNode(int value){
    struct node* newNode = (struct node *)malloc(sizeof(struct node));

    newNode->data = value;

    newNode->left = NULL;
    newNode->right = NULL;
    return (newNode);
}
// Insert data
struct node* insert(struct node* root, int data){
    if (root==NULL){
        return createNode(data);
    }
    if (data < root->data){
        root->left = insert (root->left, data);
    } else if (data > root->data){
        root->right = insert(root->right, data);
    }
    return root;
}
    // Traverse Preorder
    void traversePreOrder(struct node *temp) {
        if (temp != NULL) {
            cout << " " << temp->data;
            traversePreOrder(temp->left);
            traversePreOrder(temp->right);
        }
    }
// Traverse Postorder adalah fungsi untuk mencetak data input aslinya
    void traversePostOrder(struct node *temp) {
        if (temp != NULL) {
            traversePostOrder(temp->left);
            traversePostOrder(temp->right);
            cout << " " << temp->data;
        }
    }

void inorder(struct node* root){
    if (root  == NULL) return;
    inorder(root->left);
    cout << ("%d -> ", root->data) << " ";
    inorder(root->right);
}

int main(){
    struct node* root = NULL;
    root = insert(root, 8);
    insert(root,3);
    insert(root,7);
    insert(root,10);
    insert(root,14);
    insert(root,6);
    insert(root,1);
    insert(root,4);
    cout << "Preorder : ";
    (traversePreOrder(root)); cout << endl;
    cout << "Postorder : ";
    (traversePostOrder(root)); cout << endl;
    cout << "Inorder (setelah diurutkan) : ";
    inorder(root);
}
