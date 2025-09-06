#include <iostream>
using namespace std;

bool isp(int n) {
    if(n == 1)
        return false;
        
    for(int i=2; i*i <= n; i++) {
        if(n % i == 0)
            return false;
    }
    
    return true;
}
// int nextPrime(int n) {
//     n++;
//     while(!isp(n)) {
//         n++;
//     }
//     return n;
// }
int main() {
    for(int i=1; i<100; i++) {
        if (isp(i))
        {
            cout << i << "\n";
        }
    }
    return 1;
}