#include <iostream>
using namespace std;

class Student {
public:
  int age;

  Student(int s_age) {
    age = s_age;
  }

  int get_age() {
    return age;
  }
};

int main() {
  Student a = Student(15);
  cout << a.get_age();
}