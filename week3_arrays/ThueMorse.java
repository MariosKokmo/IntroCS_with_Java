public class ThueMorse{
    public static void main(String[] args){
        
    int length = Integer.parseInt(args[0]);
    boolean[] array = new boolean[length*length];
    int temp=2;
    int split =0;
    array[0] = false;
    if (length>1){
    array[1] = true;
    }
    
    for (int i=2; i<length; i++){
        if (i==2*temp){temp *= 2;}
        array[i] = !(array[i-temp]);
        }
        
    temp = length;
    for (int k=length; k<length*length; k++){
        if (k==2*temp){temp *= 2;}
        array[k] = !(array[k-temp]);
    }    
    
    // print
    for (int j=0; j<length*length; j++){
        if (array[j]) {
            System.out.print("-  "); 
        }
        else System.out.print("+  ");
        split += 1;
        if (split%length==0){
                System.out.println();
        }
        }
        }
}
