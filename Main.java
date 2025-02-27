public class Main {
    public static void main(String[] args) {
        Audience[] audiences = {
            new Audience(200, 250),
            new Audience(120, 103, 18),
            new Audience(60, 40, 99)
        };

        System.out.println(audiences[0].bookAnAudience("Prihodko", "High Math", 100));
        System.out.println(audiences[1].bookAnAudience("Mayer", "Programming"));
        System.out.println(audiences[2].bookAnAudience("Gavrilenko", "English", 70));

        System.out.println(audiences[0].getTypeOfLesson());
        audiences[0].setTypeOfLesson("exam");
        System.out.println(audiences[0].getTypeOfLesson());

        System.out.println(Audience.getCountOfAudiences());
    }
}