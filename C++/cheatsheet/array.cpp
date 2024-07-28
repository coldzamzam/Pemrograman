#include <iostream>
#include <array>
#include <iomanip>
using namespace std;

int main(){

    time_t start, end; 
    time(&start); 
    ios_base::sync_with_stdio(false);
    int array[100000]{};

    for (int i = 0; i <= 100000; i++)
    {
        array[i] = i;
        cout << i << "\t";
    }
    time(&end); 
    double time_taken = double(end - start); 
    cout << "Time taken by program is : " << fixed 
        << time_taken << setprecision(5); 
    cout << " sec " << endl; 
    cout << "The number of Bytes taken up by the array is " << sizeof(array)<< " Bytes" <<endl;
    return 0; 
}