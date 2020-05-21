#include<iostream>
using namespace std;
int main()
{
  int x, y,t;
  cin>>x>>y;
  cout<<"Before swapping"<<" "<<"a= "<<x<<" "<<"and"<<" "<<"b="<<y<<"\n";
  t=x;
  x=y;
  y=t;
  cout<<"After swapping"<<" "<<"a= "<<x<<" "<<"and"<<" "<<"b="<<y;
  return 0;
}