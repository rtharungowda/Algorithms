import java.util.*;
class Binary_Search
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the lenght of array");
    int n =sc.nextInt();
    System.out.println("enter the elements of array");
    int a[n];
    for (int i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println(" enter the element to be searched ");
    int ele= sc.nextInt();
    for (int i=0;i<n;i++)
   { for (int j = 0;j<n-1;j++)
    if(a[j]>a[j+1])
      {
      int temp = a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
      }
   }
    int flag =0;
    int b=0 , u=n-1 ,m;
    while(b<=l)
    {
      mid=(b+l)/2;
      if(a[m]==ele)
      {
       flag=1;
        break;
       }
       else if(a[m]<ele)
        b=m+1;
       else
        l=m-1;
   }
   if(flag==1)
   System.out.println("element found! :)");
   else
   System.out.println("element not found:(");
   }
}
