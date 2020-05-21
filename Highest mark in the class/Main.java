#include<iostream>
using namespace std;
int main()
{
  int a[100],n,i,temp;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  temp=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>temp)
    {
      temp=a[i];
    }
  }
  cout<<temp;
  // Type your code here
}