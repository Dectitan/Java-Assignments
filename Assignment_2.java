public class Assignment_2 {
    // public static void main(String[] args) {
    //     char[] arr={'o','m','a','r'};
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i]);
    //     }
    // }

    public static void main(String[] args) {
        String arr="omar";
        String arr2="";
        String arr3="";
        for(int i=arr.length()-1;i>=0;i--){
            arr2=arr2+arr.charAt(i);
        }
        
        System.out.println(arr2);
        arr3 = new StringBuilder(arr).reverse().toString();
        System.out.println(arr3);
    }
    
}