#include<iostream>
using namespace std;

int z(int a) {
		return (a%10)*9+a/10;//32 14 = 46
	}

int charToInt(char a){
    return a-48;
}

int firstChar(char a) {
		switch (a) {
		case 'A': 
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		case 'G':
			return 16;
		case 'H':
			return 17;
		case 'I':
			return 34;
		case 'J':
			return 18;
		case 'K':
			return 19;
		case 'L':
			return 20;
		case 'M':
			return 21;
		case 'N':
			return 22;
		case 'O':
			return 35;
		case 'P':
			return 23;
		case 'Q':
			return 24;
		case 'R':
			return 25;
		case 'T':
			return 26;
		case 'S':
			return 27;
		case 'U':
			return 28;
		case 'V':
			return 29;
		case 'W':
			return 32;
		case 'X':
			return 30;
		case 'Y':
			return 31;
		case 'Z':
			return 33;
		}
		return 0;
        }
int mian(){
    string ln1;
    cin>>ln1;
    cout<<ln1;
}