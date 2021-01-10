public class ShannonEntropy{
    
    public static void main(String[] args){
        
        int m = Integer.parseInt(args[0]);
        double[] array = new double[m+1];
        double entropy = 0;
        int ar =0 ;
        int items = 0;
        while (!StdIn.isEmpty()){
            ar = StdIn.readInt();
            array[ar] += 1;
            items += 1;
            }
        for (int k = 0; k<array.length; k++){
            if (array[k]==0){entropy -= 0;}
            else{
                entropy = entropy - (array[k]/(double)items)*(Math.log(array[k]/(double)items))/Math.log(2);
            }
        }
    System.out.printf("%.4f",entropy);
    }
}