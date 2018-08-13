import java.util.Arrays;
class Array1{
public static void main(String args[]){
int[] arr1={17,18,19,21,28,15,12,234};
String[] arr2={"java","c","python","ruby","go"};

System.out.println("Original numeric array: "+Arrays.toString(arr1));
Arrays.sort(arr1);
System.out.println("Sorted numeric array: "+Arrays.toString(arr1));
System.out.println("Original string array: "+Arrays.toString(arr2));
Arrays.sort(arr2);
System.out.println("Sorted string array: "+Arrays.toString(arr2));
}
}