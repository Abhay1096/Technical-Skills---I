class time{
    public static void main(String[] args) {
        int[] arr = {2,4,1,3};
        int time=0;
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            time+= max-arr[i];
        }

        System.err.println("Time : "+time);
    }
}