#include <iostream>
#include <time.h>
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
            cout << temp->data <<"\t";
            temp = temp->next;
        }
    }
};

int main(){
    time_t start, end;
    time (&start);
    ios_base::sync_with_stdio(false);
    list myList;
    

    for (int i=1; i <= 100000; i++){
        myList.createNode(i);
    }
    myList.display();

    time (&end);
    double time_taken = double (end - start) / double (CLOCKS_PER_SEC);
    cout << "Time taken by program is : " << fixed << time_taken;
    cout << " sec " << endl;
}