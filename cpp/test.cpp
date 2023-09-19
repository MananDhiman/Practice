#include <iostream>
using namespace std;

int main() {
    int arr[] = {1,2,3,4,5};

    for(int i=0; i<sizeof(arr)/sizeof(int); i++) {
        printf("%d index = %d\n",i,arr[i]);
    }
}
