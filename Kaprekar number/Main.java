#include<iostream>
using namespace std;
int main()
{
  int n,m,o,p,a;
  cin>>n;
  if(n>40)
  {
    m=n*n;
    o=m%100;
    p=m/100;
    a=o+p;
  }
  if(n<40)
  {
    m=n*n;
    o=m%10;
    p=m/10;
    a=o+p;
  }
  if(a==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}