#include<iostream>
using namespace std;
int main()
{
  int m,n,o,p,a,b;
  cin>>n>>m>>o>>p;
  a=n+o;
  a=a+(m+p)/100;
  cout<<a<<endl<<((m+p)%100);
  
}