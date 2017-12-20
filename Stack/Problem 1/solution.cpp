#include<bits/stdc++.h>
using namespace std;

void minNext(long arr[],int length,int i)
{
    long data = arr[i];
    bool state = false;
    for(int z=i+1; z<length; z++)
    {
        if(data>arr[z])
        {
            state=true;
            cout<<arr[z]<<" ";
            return;
        }
    }
    if(!state)
    {
        cout<<"-1 ";
    }
    return;
}
int main()
{
    long length;
    cin>>length;
    long arr[length];
    
    //array elements
    for(int i=0; i<length; i++)
    {
        cin>>arr[i];
    }
    
    //finding the next greater
    bool state = false;
    long data;
    for(int i=0; i<length; i++)
    {
        state = false;
        data = arr[i];
        for(int j=i+1; j<length; j++)
        {
            if(data<arr[j])
            {
                state = true;
                minNext(arr,length,j);
                break;
            }
        }
        
        if(!state)
        {
            cout<<"-1 ";
        }
    }
    return 0;
}