#include <iostream>

int main() {
    std::string name;
    std::cout << "Enter your name: ";
    std::cin >> name;
    std::cout << "\nYour name is: " << name;
    int sum = 0;
    for (int i = 0; i < name.size(); i++)
    {
        if(name[i] == ' ')
            continue;
        sum += name[i];
    }
    std::cout << "\nSum of your name is: " << sum;

}
