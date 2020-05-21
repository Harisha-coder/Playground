#include<iostream>
using namespace std;
int gcd(int a, int b)
{
  int i, n;
  if(a>b)
    n=b;
  else
    n=a;
  for(i=n;i>=1;i--)
  {
    if((a%i==0)&&(b%i==0))
      return i;
  }
}
int main()
{
  int a, b;
  cin>>a>>b;
 cout<<"G.C.D of "<<a<<" "<<"and"<<" "<<b<<" "<<"="<<" "<<gcd(a,b);
}
  
