// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
#define n 50
char stack[n];
int top = -1;

void push(char chr)
{
    if (top == n - 1)
    {
        cout << "Stack is overflow";
    }
    else
    {
        top++;
        stack[top] = chr;
        // cout << stack[top];
    }
}

void pop()
{
    // char chr;

    if (top == -1)
    {
        cout << "Stack is underflow";
    }
    else
    {
        stack[top];
        // cout << chr;
        top--;
    }
}

void display()
{
    int i = 0;

    if (top == -1)
    {
        cout << "Stack is underflow";
    }
    else
    {
        for (i = top; i > 0; i--)
        {
            cout << "\nStack\n";
            cout << stack[i] << endl;
        }
    }
}

int main()
{
    string str;

    cout << "Enter a string : ";
    cin >> str;

    int len = str.length();

    for (int i = 0; i < len; i++)
    {
        if (str[i] == '(' || str[i] == '[' || str[i] == '{')
        {
            push(str[i]);
        }
        else if (str[i] == ')' && stack[top] == '(')
        {
            pop();
        }
        else if (str[i] == '}' && stack[top] == '{')
        {
            pop();
        }
        else if (str[i] == ']' && stack[top] == '[')
        {
            pop();
        }
        else
        {
            cout << "Unbalanced String";
        }
    }

    // display();

    return 0;
}