#include <iostream>
using namespace std;

int fact(int n) {
    if(n == 1) return 1;

    return n * fact(n-1);
}
int main() {
    int n;
    cout << "Enter number to find factorial of: ";
    cin >> n;

    printf("The factorial of %d is %d",n,fact(n));
}
