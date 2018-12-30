class SelectionSort {
public static void main(String[] args) {

        int dummy[] = new int[5];
        int num_array[] = {1,9,7,35,89,0,5,789,45,25,44,19,5};
        int len = num_array.length;


        for(int i=0; i<len; i=i+1 ) {
                for (int j=i+1; j<len; j=j+1) {
                        if (num_array[j]<num_array[i]) {
                                int a = num_array[i];
                                num_array[i]=num_array[j];
                                num_array[j]=a;
                        }
                }

        }
        for (int i=0; i<len; i=i+1 ) {
                System.out.print(num_array[i]+" ");

        }
        

}
}
