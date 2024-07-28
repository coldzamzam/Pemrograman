package InnerOuter;

public class Outer {
    int [] bil;
    public Outer(int[] n){
        bil = n;
    }
    public void Analisa(){
        Inner ino = new Inner();
        System.out.println("Minimum : " + ino.min());
        System.out.println("Maksimum : " + ino.max());
        System.out.println("Rata-rata : " + ino.rata());
    }

    //Inner Class
    class Inner {
        int min(){
            int m = bil[0];
            for (int c = 1; c < bil.length; c++){
                if (bil[c] < m){
                    m = bil[c];
                }
            }
            return m;
        }
        int max(){
            int m = bil[0];
            for (int c = 1; c < bil.length; c++){
                if (bil[c] > m){
                    m = bil[c];
                }
            }
            return m;
        }
        double rata(){
            int m = 0;
            double rata2 = 0;
            for (int c = 0; c < bil.length; c++){
                m = m + bil[c];
                rata2 = m / bil.length;
            }
            return rata2;
        }
    }
}
