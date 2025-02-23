public class Main {
    public static void main(String[] args) {
        Cities[] cities = {
            new Cities("Kyiv", "troeshina", 8, 94, 1001, 5),
            new Cities("Lviv", "hmelnickogo", 1, 15, 3464),
            new Cities("Harkiv", "heroiv", 15, 1035, 6865)
        };

        for (Cities c : cities) {
            System.out.println(c.getAddress("notary"));
        }
        
        Cities doneck = new Cities("Doneck", "itjwet", 233);
        System.out.println(doneck.getAddress("123"));
        System.out.println(Cities.count);
        System.out.println(Cities.createTimes("Kyiv"));
        System.out.println(cities[0].getPeopleCount());

        System.out.println(doneck.getPeopleCount());
        doneck.deregisterPeople(1);
        System.out.println(doneck.getPeopleCount());

        var info = "We couldn't verify you mother's maiden name.";
        var intro = "Here is important information about your account security.";

        var firstName = "Joffrey";
        var greeting = "Hello";

        // BEGIN (write your solution here)
        System.out.println(greeting + ", " + firstName + "\n" + intro + "\n" + info);
    }
}