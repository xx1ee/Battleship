class Complex {

    double real;
    double image;

    public void add(Complex anotherNumber) {
         this.real = anotherNumber.real + this.real;
        this.image = anotherNumber.image + this.image;
    }
    public void subtract(Complex anotherNumber) {
        this.real = this.real - anotherNumber.real;
        this.image = this.image - anotherNumber.image;
    }
//     public static void main (String[] args) {
//        Complex number = new Complex();
//        number.real = 10;
//        number.image = 4;
//        Complex jjj = new Complex();
//        jjj.real = 6;
//        jjj.image = 6;
//        number.add(jjj);
//        System.out.println(number.real);
//    }
}