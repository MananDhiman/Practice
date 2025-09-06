#include<iostream>
#include<vector>
using namespace std;

bool isp(int n) {
    for(int i=2; i*i<n; i++) {
        if(n % i == 0)
            return false;
    }
    return true;
}

void printPrimeFactorization(int n) {

    vector<int> v;

    for(int i=2; i<=n; i++) {
        if(isp(i))
            v.push_back(i);
    }

    int i = 0;
    while(i < v.size() && n > 0) {
        if(n % v[i] == 0) {
            n /= v[i];
            cout << v[i] << " ";
        }
        else
            i++;
    }
}

int main() {
    printPrimeFactorization(11);
    return 1;
}
