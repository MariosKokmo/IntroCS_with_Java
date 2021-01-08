public class BandMatrix{
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    int index = 0;
	
    for ( int i = 1; i <= n; i++ ) {
        index = 0;
        for ( int j = 0; j <i-width-1; j++ ) {
            System.out.print("0  ");
            index += 1;
        }
        if ( i >= 2*width + 1){
            for ( int k = 0; k < 2*width + 1 ; k++) {
            if ( index < n) {
            System.out.print("*  ");
            }
            index += 1;
        }
        }
        else{
        for ( int k = 0; k < i+width ; k++) {
            if ( index < n) {
            System.out.print("*  ");
            }
            index += 1;
        }
        }
        for ( int l = 0; l < n-index; l++ ) {
            System.out.print("0  ");
        }
        System.out.println();
    }
    }
}
