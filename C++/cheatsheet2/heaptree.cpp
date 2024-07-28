#include <iostream>
#include <vector>
using namespace std;

void heapify(vector<int>& heap, int n, int i) {
    int smallest = i; // Initialize smallest as root
    int left = 2 * i + 1; // left = 2*i + 1
    int right = 2 * i + 2; // right = 2*i + 2

    // If left child is smaller than root
    if (left < n && heap[left] < heap[smallest])
        smallest = left;

    // If right child is smaller than smallest so far
    if (right < n && heap[right] < heap[smallest])
        smallest = right;

    // If smallest is not root
    if (smallest != i) {
        swap(heap[i], heap[smallest]);

        // Recursively heapify the affected sub-tree
        heapify(heap, n, smallest);
    }
}

void deleteMin(vector<int>& heap) {
    int n = heap.size();
    if (n == 0)
        return;

    // Step 1: Replace root with last element
    heap[0] = heap[n - 1];
    heap.pop_back();

    // Step 2: Heapify the tree from the root
    heapify(heap, heap.size(), 0);
}

void printHeap(const vector<int>& heap) {
    for (int val : heap) {
        cout << val << " ";
    }
    cout << endl;
}

int main() {
    vector<int> heap = {5, 9, 13, 11, 10, 29, 24, 35, 42};
    
    // Removing the smallest element
    deleteMin(heap);
    
    // Print the heap after deletion
    printHeap(heap);
    
    return 0;
}
