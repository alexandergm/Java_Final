public class Main {
    public static void main(String[] args) {
        Reader st1 = new Reader();
        Reader st2 = new Reader();

        st1.setName("Sasha");
        st1.setNumber(478);
        st1.setDate("04/01/1994");
        st1.setFacult("Программирования");
        st1.setPhone("903999999");
        System.out.println("Студент " + st1.getName() + " с чит. билетом номер " + st1.getNumber() + " который учится на факультете " + st1.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st1.getDate() + "; номер телефона: " + st1.getPhone());

        st2.setName("Pasha");
        st2.setNumber(216);
        st2.setDate("12/05/1990");
        st2.setFacult("Дизайна");
        st2.setPhone("88005553535");
        System.out.println("Студент " + st2.getName() + " с чит. билетом номер " + st2.getNumber() + " который учится на факультете " + st2.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st2.getDate() + "; номер телефона: " + st2.getPhone());

        st1.takeBook("Гарри Поттер");

        st1.returnBook("Алиса в стране чудес");

        st1.info();
        st2.info();
    }
}
