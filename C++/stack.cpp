#include <iostream>
#include <stack>
using namespace std;

int main(){
    stack<int>st;
    int yourNumber;
    int value;
    int max = 0;

    cout << "How many numbers do you want to add? ";
    cin >> yourNumber;
    for (int i = 1; i <= yourNumber; i++){
        cout << "Add a number for your stack : ";
        cin >> value;
        st.push(value);
        if (value > max){
            max = value;
        }
    }
    while (!st.empty()){
        cout << st.top() << " ";
        st.pop();
        cout << endl;
    }
    cout << endl << "Max number is : " << max << endl;
}