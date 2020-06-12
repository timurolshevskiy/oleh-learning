package Poliforizm;


class Useful {
    public void f() {};
    public void g() {};
}

class MoreUsefuk extends Useful {
    public void f() {};
    public void g() {};
    public void u() {};
    public void v() {};
    public void w() {};
}


public class NicxPreob {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUsefuk()
        };
        x[0].f();
        x[1].g();
        ((MoreUsefuk) x[1]).u();
        ((MoreUsefuk) x[0]).u();
    }
}
