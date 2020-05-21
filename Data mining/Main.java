#include<iostream>
using namespace std;
int main()
{
  int n, a, sum=0,c=0;
  cin>>n;
  while(n!=0)
  {
    a=n%10;
    if(a%2==0)
      sum=sum+a;
    else
      c=c+a;
    n=n/10;
  }
  if(sum==c)
    cout<<"Yes";
  else
    cout<<"No";
}