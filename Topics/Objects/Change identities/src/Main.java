class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String name = p2.name;
        int age = p2.age;
        p2.name = p1.name;
        p2.age = p1.age;
        p1.name = name;
        p1.age = age;
    }
}