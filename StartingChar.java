public class StartingChar {
    public static void main(String[]args)
    {
        char [] arr={'c','d','f','j'};
        char target='f';
        System.out.println(letters(arr,target));
    }
    static char letters(char[]arr, char target)
    {
      int start=0;
      int end=arr.length-1;
      while(start<=end)
      {
          int mid=start+(end-start)/2;
          if(target<arr[mid])
              end=mid-1;
          else
          start=mid+1;
      }
      return arr[start%arr.length];
    }
}
