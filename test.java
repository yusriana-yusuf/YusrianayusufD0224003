import javax.xml.crypto.Data;
public class test {

    public static void main(String[] args) {
        Database db = new Database();
        db.open();
        db.view();
    }
}
