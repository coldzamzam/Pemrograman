#include <iostream>
using namespace std;

struct Node {
    int key;
    Node *left, *right, *parent;
    int height;
    Node(int key) : key(key), left(nullptr), 
    right(nullptr), parent(nullptr), height(1) {}
};

int height(Node *N) {
    return N ? N->height : 0;
}

int getBalance(Node* N) {
    return N ? height(N->left) - height(N->right) : 0;
}

Node* rightRotate(Node* y) {
    Node* x = y->left;
    Node* T2 = x->right;

    x->right = y;
    y->left = T2;

    if (T2) T2->parent = y;
    x->parent = y->parent;
    y->parent = x;

    y->height = max(height(y->left), height(y->right)) + 1;
    x->height = max(height(x->left), height(x->right)) + 1;

    return x;
}

Node* leftRotate(Node* x) {
    Node* y = x->right;
    Node* T2 = y->left;

    y->left = x;
    x->right = T2;

    if (T2) T2->parent = x;
    y->parent = x->parent;
    x->parent = y;

    x->height = max(height(x->left), height(x->right)) + 1;
    y->height = max(height(y->left), height(y->right)) + 1;

    return y;
}

Node* insert(Node* node, int key, Node* parent = nullptr) {
    if (!node) {
        Node* newNodePtr = new Node(key);
        newNodePtr->parent = parent;
        return newNodePtr;
    }

    if (key < node->key) {
        node->left = insert(node->left, key, node);
    } else if (key > node->key) {
        node->right = insert(node->right, key, node);
    } else {
        return node;
    }

    node->height = 1 + max(height(node->left), height(node->right));
    int balance = getBalance(node);

    if (balance > 1 && key < node->left->key) {
        return rightRotate(node);
    }
    if (balance < -1 && key > node->right->key) {
        return leftRotate(node);
    }
    if (balance > 1 && key > node->left->key) {
        node->left = leftRotate(node->left);
        return rightRotate(node);
    }
    if (balance < -1 && key < node->right->key) {
        node->right = rightRotate(node->right);
        return leftRotate(node);
    }

    return node;
}

void printNodeAndParent(Node* node) {
    if (node) {
        cout << "Node: " << node->key << ", Parent Node: " 
        << (node->parent ? to_string(node->parent->key) : "NULL") << endl;
        printNodeAndParent(node->left);
        printNodeAndParent(node->right);
    }
}

int main() {
    Node* root = nullptr;
    int keys[] = {56, 9, 63, 6, 10, 42};

    for (int key : keys)
        root = insert(root, key);

    cout << "Output:\n";
    printNodeAndParent(root);

    return 0;
}


