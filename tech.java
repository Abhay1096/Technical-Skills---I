class tech{
    public static void main(String[] args){
        int arr[] = {-3,2,5,4,7,6,7};
        int mx = arr[0];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
                count = count+1;
            }
            else if(arr[i]!=mx){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}