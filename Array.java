 Write a program to initialize an integer array and print the sum and average of the array
 
class Arr{
public static void main(String args[]){
int arr[]=new int[] {1,2,3};
int sum=0;
float average;
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
sum=sum+arr[i];
}
System.out.println("\nsum of array elements is "+ sum);
average=sum/arr.length;
System.out.println("\nAverage of array elements is "+ 

average);

}
}
