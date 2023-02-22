package objectgraph;

public class One {
    int o1=10;
        Two t;
        One(Two o){
            t=o;
        }
        public double cube(int i){
            return i*t.square(i);
            
        }
}
