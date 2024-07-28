#include <iostream>
using namespace std;

struct node{
    public:
    int data;
    node *next;
};
class list{
    public:
    node *head, *tail;
    list(){
        head=NULL;
        tail=NULL;
    }
    void createNode (int value){
        node *temp = new node;
        temp->data = value;
        temp->next = NULL;
        if (head == NULL){
            head = temp;
            tail = temp;
            temp = NULL;
        } else{
            tail->next = temp;
            tail = temp;
        }
    }
    void display(){
        node *temp = new node;
        temp = head;
        while (temp != NULL){
            cout << temp->data <<" ";
            temp = temp->next;
        }
    }
};

int main(){
    list myList;
    
    for (int i=1; i <= 21; i++){
        myList.createNode(i);
    }
    myList.display();
}
