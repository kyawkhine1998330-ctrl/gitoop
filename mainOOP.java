package OOP;
public class mainOOP {
    public static void main(String[] args) {
        Person kyaw = new Person("KK", 20);
        System.out.println(kyaw.Gname());
        Person lwin = new Person("Lwin", 30);
        System.out.println(lwin.Gname());
        kyaw.Increse_age();
        lwin.Increse_age();
        System.out.println(kyaw.Gage());
        System.out.println(lwin.Gage());
        kyaw.Sound();
        lwin.Sound();
    }
        
}
