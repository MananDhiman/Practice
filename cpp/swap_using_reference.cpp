#include <iostream>

using namespace std;

// void swap(int* a, int* b) {
//     int temp = *a;
//     *a = *b;
//     *b = temp;
// }

void swapp(int &a, int &b) {
    int temp = b;
    b = a;
    a = temp;
}

int main()
{
    int a = 5, b = 10;
    swapp(a, b);
    cout << a << " " << b;
    return 0;
}