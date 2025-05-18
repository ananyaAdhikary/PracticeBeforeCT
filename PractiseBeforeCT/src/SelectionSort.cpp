#include<iostream>
using namespace std;
int main()
{
     int n;
    cout<<"enter the number of element you want to insert in the array:";
    cin>>n;
    cout<<"enter the array elements:";
    int arr[n+1];
    for(int i=0;i<n;i++)
    {

        cin>>arr[i];
    }


    for(int step=0;step<n-1;step++)
    {
        int min_index=step;


        for(int i=step+1;i<n;i++)
        {
            if(arr[i]<arr[min_index])
            {
                min_index=i;
            }
        }


        int temp=arr[step];
        arr[step]=arr[min_index];
        arr[min_index]=temp;

    }

    cout<<"the sorted array:";
     for(int i=0;i<n;i++)
        {
            cout<<arr[i]<<" ";
        }

}
