#include <iostream> 
#include <bits/stdc++.h>
#include <iomanip>
using namespace std; 

struct Node{
    public:
    int data;   
    Node *next;
};
class List{
    public:
    Node *head, *tail;
    List(){
        head=NULL;             
        tail=NULL;
    }   
    void createNode(int value){
        Node *temp=new Node;
        temp->data=value;
        temp->next=NULL;
        if(head==NULL){
            head=temp;
            tail=temp;
            temp=NULL;
        }
        else{
            tail->next=temp;
            tail=temp;
        }
    }
    void display(){
        Node *temp=new Node;
        temp=head;
        while(temp!=NULL){
            cout<<temp->data<<"\t";
                temp=temp->next;
        }
    }
};

int main(){
    time_t start, end;
    time(&start); 
    ios_base::sync_with_stdio(false);
    List myList;
    for (int i=1; i <= 100000; i++){
        myList.createNode(i);
    }
    myList.display();
    time(&end); 
    double time_taken = double(end - start); 
    cout << "Time taken by program is : " << fixed 
        << time_taken << setprecision(5); 
    cout << " sec " << endl; 
    cout << "The number of Bytes taken up by the array is " << sizeof(myList)<< " Bytes" <<endl;
    return 0; 
}