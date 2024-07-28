#include <iostream>
#include <array>
using namespace std;

int main(){
	int array[100] = {};
    
    for (int i = 0; i <= 100; i++){
        array[i] = i;
        cout << i << " ";
    }
}
