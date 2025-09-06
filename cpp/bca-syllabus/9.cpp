#include <iostream>
using namespace std;

int main() {
    int amount, interest, years;
    cout << "Enter amount: \n";
    cin >> amount;
    cout << "Enter interest: \n";
    cin >> interest;
    cout << "Enter years: \n";
    cin >> years;

    printf("The interest is %d", amount*interest*years/100);
}

