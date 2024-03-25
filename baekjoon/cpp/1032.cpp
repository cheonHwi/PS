#include <iostream>
#include <vector>

using namespace std;

int main() {
    int a = 0;
    cin >> a; 
    string cmd = "";
    string pattern = "";
    cin >> pattern;
    for(int i = 1; i < a; i++)
    {
        cin >> cmd;
        for(int j = 0; j < cmd.size(); j++)
        {
            if(cmd[j] != pattern[j]) pattern[j] = '?';
        }
    }

    cout << pattern << endl;
}

