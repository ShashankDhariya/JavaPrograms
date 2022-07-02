package PracticeProblems;

public class RemoveDuplicate {
    public static void main(String[] args)   
    {
        int arr[] = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };
        int n = arr.length;
        int x = 0;
        int a = n;
        int temp;
        System.out.println(n);
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<(n-1)-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[x++] = arr[i];
                a--;
            }
        }
        
        if(arr[n-2] != arr[n-1])
        {
            arr[x] = arr[n-1];   
            a++;
        }
        System.out.println();
        for(int i=0;i<a+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}