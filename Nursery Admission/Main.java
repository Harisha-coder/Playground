#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
  int i=0;
  int I=0;
  cin>>str;
  while(str[i]!='\0')
  {
    I++;
    i++;
  }
  cout<<"The number of letters in the name is"<<" "<<I;
  return 0;
}