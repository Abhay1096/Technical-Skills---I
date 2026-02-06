class check{
    public static void main(String[] args) {
        int[] arr = {3,-2,1,4,3,6,8};
        int k = 10;
        for(int i = 0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==k && i!=j){
                    System.out.println("Pair found");
                }
            }

        }
    }
}