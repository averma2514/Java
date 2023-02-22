package garbage_collector;

class GCDemo {
    protected void finalize(){//do not use finalize
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args) {
        GCDemo s1 = new GCDemo();
        GCDemo s2 = new GCDemo();
        s1=null;
        s2=null;

        System.gc();
        System.out.println("rest of code");
    }
}
