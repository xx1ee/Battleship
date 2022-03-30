class Clock {
    int hours = 12;
    int minutes = 0;
    void next() {
        if (minutes == 59 && hours >=1 && hours < 12) {
            minutes = 0;
            hours+=1;
        } else {
            if (minutes == 59 && hours == 12) {
                minutes = 0;
                hours = 1;
            } else {
                minutes+=1;
            }
        }
    }
//    public static void main(String[] args) {
//        Clock chasi = new Clock();
//        chasi.hours = 11;
//        chasi.minutes = 59;
//        System.out.println(chasi.hours);
//        System.out.println(chasi.minutes);
//        chasi.next();
//        System.out.println(chasi.hours);
//        System.out.println(chasi.minutes);
//    }
}