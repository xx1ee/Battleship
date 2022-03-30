class Army {

    public static void createArmy() {
        Unit a = new Unit("a");
        Unit b = new Unit("b");
        Unit c = new Unit("d");
        Unit d = new Unit("e");
        Unit e = new Unit("ee");
        Knight ru = new Knight("jopa");
        Knight rus = new Knight("jopa0");
        Knight rub = new Knight("jopa2");
        General Gavs = new General("kadetka");
        Doctor Gavs2 = new Doctor("jojo");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}