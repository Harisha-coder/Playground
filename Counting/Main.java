#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[150];
  int v=0,c=0,d=0,s=0,S=0;
  gets(a);
  for(int i = 0; a[i] !='\0'; ++i)
  {
    if (a[i] == 'a' || a[i] == 'e' ||a[i] == 'i' ||
        a[i] == 'o' || a[i] == 'u' || a[i] == 'A' ||
        a[i] == 'E' || a[i] == 'I' || a[i] == 'O' ||
        a[i] == 'U') {
      ++v;
    }
    else if ((a[i] >= 'a' && a[i] <= 'z') ||
             (a[i] >= 'A' && a[i] <= 'Z')) {
              ++c;
    }
    else if (a[i] >= '0' && a[i] <= '9') {
      ++d;
    }
    else if (a[i] == ' ') {
      ++s;
  }
  else
    ++S;
}
cout<<"Vowels:"<<v;
cout<<"\nConsonants:"<<c;
  cout<<"\nWhite Spaces:"<<s;
  cout<<"\nDigits:"<<d;
cout<<"\nSymbols:"<<S;
}