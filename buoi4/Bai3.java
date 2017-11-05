import java.util.Scanner;

/**
 * ConVat
 */
class ConVat {
    private String giong;
    private String mauLong;
    private String canNang;

    // ham xay dung
    public ConVat() {
        giong = new String();
        mauLong = new String();
        canNang = new String();
    }
    public ConVat(ConVat cv) {
        giong = cv.giong;
        mauLong = cv.mauLong;
        canNang = cv.canNang;
    }

    // phuong thuc Keu()
    public String Keu() {
        return "";
    }
}

class Bo extends ConVat {
    // ham xay dung
    public Bo() {
        super();
    }
    public Bo(Bo b) {
        super();
    }
    // phuong thuc Keu()
    public String Keu() {
        return super.Keu() + "Bo keu";
    }
}
class Heo extends ConVat {
    // ham xay dung
    public Heo() {
        super();
    }
    public Heo(Heo h) {
        super();
    }
    // phuong thuc Keu()
    public String Keu() {
        return super.Keu() + "Heo keu";
    }
}

class De extends ConVat {
    // ham xay dung
    public De() {
        super();
    }
    public De(De d) {
        super();
    }
    // phuong thuc Keu()
    public String Keu() {
        return super.Keu() + "De keu";
    }
}

public class Bai3 {
    public static void main(String[] args) {
        // System.out.println("n = " + n);
        ConVat []cv = new ConVat[3];
        cv[0] = new Heo();
        System.out.println(cv[0].Keu());
        cv[1] = new Bo();
        System.out.println(cv[1].Keu());
        cv[2] = new De();
        System.out.println(cv[2].Keu());
    }
}
