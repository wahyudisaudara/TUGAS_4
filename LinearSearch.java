public class LinearSearchExample{    
public static int linearSearch(double[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        double[] a1= {10.6,20.4,3.2,50.4,7.3,9.0};    
        double key = 9.0;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    
