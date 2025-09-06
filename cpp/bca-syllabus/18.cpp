#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number to find table of: ";
    cin >> n;

    for(int i=0; i<=10; i++)
        printf("2 X %d = %d\n",i,n*i);
}
