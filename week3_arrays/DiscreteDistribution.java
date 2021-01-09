public class DiscreteDistribution{

    public static void main(String[] args){
        
        int indices = Integer.parseInt(args[0]);
        int[] array = new int[args.length];
        int n =0;
        int r=0;
        
        for (int i=1;i<args.length;i++){
            array[i] = Integer.parseInt(args[i]);
            array[i] += array[i-1];
            n += 1;
            
        }
        
        for (int m=0;m<indices;m++){
            r = (int)(Math.random()*(array[n]-1));
            for (int j=0;j<n;j++){
                if (array[j]<=r && array[j+1]>r){
                    System.out.print(j+1 +"  ");
                }
            }
        }
    }
} 