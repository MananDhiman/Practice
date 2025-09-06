#include <iostream>
#include <vector>
using namespace std;

bool isp(int n) {
    if (n <= 1) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}

void printPrimeFactorization(int n) {
    vector<int> v;

    // Generate all primes up to n
    for (int i = 2; i <= n; i++) {
        if (isp(i))
            v.push_back(i);
    }

    int i = 0;
    while (n > 1 && i < v.size()) {
        if (n % v[i] == 0) {
            n /= v[i];
            cout << v[i] << " ";
        } else {
            i++;
        }
    }
    cout << endl;
}

int main() {
    printPrimeFactorization(21);  // Output: 3 7
    return 0;
}

