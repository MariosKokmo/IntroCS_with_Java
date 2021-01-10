public class WorldMap{
    
    public static void main(String[] args){
    
    int width = StdIn.readInt();
    int height = StdIn.readInt();
    String s;
    
    StdDraw.setCanvasSize(width,height);
    StdDraw.setXscale(0,width);
    StdDraw.setYscale(0,height);
    StdDraw.setPenRadius(0.005);
    
    while (!StdIn.isEmpty()){
            s = StdIn.readString();
            int i =  StdIn.readInt();
            double[] arrayx = new double[i];
            double[] arrayy = new double[i];
            for (int j=0;j<i;j++){
                arrayx[j] = StdIn.readDouble();
                arrayy[j] = StdIn.readDouble();
            }
            StdDraw.polygon(arrayx,arrayy);
        }
    }
    }