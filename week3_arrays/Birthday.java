public class Birthday{
    public static void main(String[] args){
        /*
        birthdays array is a boolean array that indicates if the date is already taken
        counter is an array that indicates how many people were needed in order to find the first duplicate
        */
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int index=0;
        int birthday=0;
        int people = 0;
        double sum = 0.0;
        boolean[] birthdays = new boolean[n];
        int[] counter = new int[n];
        
        for (int i=0 ; i<trials; i++){
            // trials= number of experiments
            // for each experiment we start selecting people
            // for each experiment we start with zero people
            // and initialise the boolean table (no birthday occupied)
            people = 0;
            for (int k=0; k<n; k++){birthdays[k]=false;}
            birthday = (int)(Math.random()*(n-1));
            while (birthdays[birthday] == false){
                people += 1;
                birthdays[birthday] = true;
                birthday = (int)(Math.random()*(n-1));
            }
            counter[people+1] += 1;
            }
        counter[1]=0;
        sum = 0.0;
        for (int m=1;m<counter.length;m++){
            sum += counter[m];
            System.out.println(m + "    " + counter[m] + "    " + sum/trials);
            if (sum/trials > 0.5){break;}
        }
        }
       
}
