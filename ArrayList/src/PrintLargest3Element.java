
public class PrintLargest3Element 
{
    static void print3largest(int arr[], int arr_size) 
    { 
        int i, first, second, third; 
        if (arr_size < 3) /* array size 3 chahiye hume bra bala total me se*/
        { 
            System.out.print(" Invalid Input "); 
            return; 
        } 
        
        third = first = second = Integer.MIN_VALUE; 
        for (i = 0; i < arr_size ; i ++) 
        { 
            if (arr[i] > first)  /* yaha se mera condition hai 3 ke leye bra element */
            { 
                third = second; 
                second = first; 
                first = arr[i]; 
            } 
            else if (arr[i] > second) 
            { 
                third = second; 
                second = arr[i]; 
            } 
        
            else if (arr[i] > third) 
                third = arr[i]; 
        } 
        
        System.out.println("Three largest elements are " + 
                       first + " " + second + " " + third); 
    } 
    public static void main (String[] args) 
    { 
        int arr[] = {1, 7, 90, 33, 67, 56, 20, 39, 10, 30}; 
        int n = arr.length; 
        print3largest(arr, n); 
    } 
} 