package battleship;

import java.io.IOException;
import java.util.Scanner;

class Korabl {

    public static void enterKey() {
        System.out.println("Press Enter and pass the move to another player");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(String[][] pole1)
    {
        for (int i = 0 ; i < 11 ; i++)
        {
            for (int j = 0 ; j < 11 ; j++)
            {
                System.out.print(pole1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void zapolnenie(String[][] pole1)
    {
        int k = 65;
        for (int i = 0 ; i < 11 ; i++ )
        {
            for (int j = 0 ; j < 11 ; j++ )
            {
                pole1[0][0] = " ";
                if ( j == 0 && i != 0)
                {
                    pole1[i][j] = String.format("%c", (char) k);
                    ++k;
                } else {
                    if ( i == 0 && j != 0)
                    {
                        pole1[i][j] = String.format("%d", j);
                    } else {
                        pole1[i][j] = "~";
                    }
                }
            }
        }
    }
    public  void first_shot(String[][] pole1, String[][] pole2, String[][] pole3, String[][] pole4)
    {
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("The game starts!");
        while (true)
        {
            if (b == false)
            {
                break;
            }
            print(pole2);
            System.out.println("---------------------");
            print(pole1);
            System.out.println("Player 1, it's your turn:");
            String koord1 = sc.nextLine();
            char bukva = koord1.charAt(0);
            char cyfra = koord1.length() == 3? (char) (koord1.charAt(koord1.length() - 2) + koord1.charAt(koord1.length() - 1)) : koord1.charAt(koord1.length() - 1);
            if (bukva >= 'A' && bukva <= 'J' && cyfra >= '1' && Character.getNumericValue(cyfra) <= 10)
            {
                if (pole3[bukva - 'A' + 1][Character.getNumericValue(cyfra)] == "O")
                {
                    pole2[bukva - 'A' + 1][Character.getNumericValue(cyfra)] = "X";
                    pole3[bukva - 'A' + 1][Character.getNumericValue(cyfra)] = "X";

                    boolean t = false;
                    for (int i = 0; i < 11 ; i++)
                    {
                        for (int j = 0 ; j < 11 ; j++)
                        {
                            if (pole3[i][j] == "O")
                            {
                                t = true;
                            }
                        }
                    }
                    if (t == false)
                    {
                        System.out.println("You sank the last ship. You won. Congratulations!");
                        break;
                    } else {
                        try
                        {
                            if (bukva == 'J' && Character.getNumericValue(cyfra) != 10)
                            {
                                if (pole3[bukva - 'A' + 1][Character.getNumericValue(cyfra) + 1] != "O" && pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O" && pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O")
                                {
                                    System.out.println("You sank a ship!");
                                    enterKey();
                                    b = false;
                                }
                            } else {
                                if (bukva != 'J' && Character.getNumericValue(cyfra) == 10)
                                {
                                    if (pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O" && pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O" && pole3[bukva - 'A' + 1 + 1][Character.getNumericValue(cyfra)] != "O")
                                    {
                                        System.out.println("You sank a ship!");
                                        enterKey();
                                        b = false;
                                    }
                                } else {
                                    if (bukva == 'J' && Character.getNumericValue(cyfra) == 10)
                                    {
                                        if (pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O" && pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O")
                                        {
                                            System.out.println("You sank a ship!");
                                            enterKey();
                                            b = false;
                                        }
                                    } else {
                                        if (pole3[bukva - 'A' + 1][Character.getNumericValue(cyfra) + 1] != "O" && pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O" && pole3[bukva - 'A' + 1 - 1][Character.getNumericValue(cyfra)] != "O" && pole3[bukva - 'A' + 1 + 1][Character.getNumericValue(cyfra)] != "O")
                                        {
                                            System.out.println("You sank a ship!");
                                            enterKey();
                                            b = false;
                                        } else {
                                            System.out.println("You hit a ship!");
                                            enterKey();
                                            b = false;}
                                }
                            }

                        }
                        } catch (ArrayIndexOutOfBoundsException e)
                        {
                            continue;
                        }
                    }
                } else {
                    if (pole3[bukva - 'A' + 1][Character.getNumericValue(cyfra)] == "X")
                    {
                        System.out.println("You hit a ship! Try ");
                        enterKey();
                        b = false;
                    } else {
                        pole2[bukva - 'A' + 1][Character.getNumericValue(cyfra)] = "M";
                        pole3[bukva - 'A' + 1][Character.getNumericValue(cyfra)] = "M";
                        System.out.println("You missed!");
                        enterKey();
                        b = false;
                    }
                }
            }
            while (b == false)
            {
                print(pole4);
                System.out.println("---------------------");
                print(pole3);
                System.out.println("Player 2, it's your turn:");
                String koord11 = sc.nextLine();
                if (koord11 != "")
                {
                    char bukva1 = koord11.charAt(0);
                    char cyfra1 = koord11.length() == 3? (char) (koord11.charAt(koord11.length() - 2) + koord11.charAt(koord11.length() - 1)) : koord11.charAt(koord11.length() - 1);
                    if (bukva1 >= 'A' && bukva1 <= 'J' && cyfra1 >= '1' && Character.getNumericValue(cyfra1) <= 10)
                    {
                        if (pole1[bukva1 - 'A' + 1][Character.getNumericValue(cyfra1)] == "O")
                        {
                            pole1[bukva1 - 'A' + 1][Character.getNumericValue(cyfra1)] = "X";
                            pole4[bukva1 - 'A' + 1][Character.getNumericValue(cyfra1)] = "X";
                            boolean t = false;
                            for (int i = 0; i < 11 ; i++)
                            {
                                for (int j = 0 ; j < 11 ; j++)
                                {
                                    if (pole1[i][j] == "O")
                                    {
                                        t = true;
                                    }
                                }
                            }
                            if (t == false)
                            {
                                System.out.println("You sank the last ship. You won. Congratulations!");
                                break;
                            } else {
                                try
                                {
                                    if (bukva1 == 'J' && Character.getNumericValue(cyfra1) != 10)
                                    {
                                        if (pole1[bukva1 - 'A' + 1][Character.getNumericValue(cyfra1) + 1] != "O" && pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O" && pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O")
                                        {
                                            System.out.println("You sank a ship!");
                                            enterKey();
                                            b = true;
                                        } else {
                                            System.out.println("You hit a ship!");
                                            enterKey();
                                            b = true;
                                        }
                                    } else {
                                        if (bukva1 != 'J' && Character.getNumericValue(cyfra1) == 10)
                                        {
                                            if (pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O" && pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O" && pole1[bukva1 - 'A' + 1 + 1][Character.getNumericValue(cyfra1)] != "O")
                                            {
                                                System.out.println("You sank a ship!");
                                                enterKey();
                                                b = true;
                                            }
                                        } else {
                                            if (bukva1 == 'J' && Character.getNumericValue(cyfra1) == 10)
                                            {
                                                if (pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O" && pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O")
                                                {
                                                    System.out.println("You sank a ship!");
                                                    enterKey();
                                                    b = true;
                                                }
                                            } else {
                                                if (pole1[bukva1 - 'A' + 1][Character.getNumericValue(cyfra1) + 1] != "O" && pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O" && pole1[bukva1 - 'A' + 1 - 1][Character.getNumericValue(cyfra1)] != "O" && pole1[bukva1 - 'A' + 1 + 1][Character.getNumericValue(cyfra1)] != "O")
                                                {
                                                    System.out.println("You sank a ship!");
                                                    enterKey();
                                                    b = true;
                                                } else {
                                                    System.out.println("You hit a ship!");
                                                    enterKey();
                                                    b = true;}
                                            }
                                        }

                                    }
                                } catch (ArrayIndexOutOfBoundsException e)
                                {
                                    continue;
                                }
                            }
                        } else {
                            if (pole1[bukva1 - 'A' + 1][Character.getNumericValue(cyfra1)] == "X")
                            {
                                System.out.println("You hit a ship! Try again:");
                                enterKey();
                                b = true;
                            } else {
                                pole1[bukva1 - 'A' + 1][Character.getNumericValue(cyfra1)] = "M";
                                pole4[bukva - 'A' + 1][Character.getNumericValue(cyfra1)] = "M";
                                System.out.println("You missed.");
                                enterKey();
                                b = true;
                            }
                            //break;
                        }
                    }
                }

            }
            }
        }

    public void func1(int kletka, String name, String[][] pole1)
    {
        Scanner sc = new Scanner(System.in);
        boolean isError = true;
        while (isError)
        {
            isError = false;
            System.out.println("Enter the coordinates of the " + name + " (" + kletka + " cells):");
            String koord = sc.nextLine();
            String[] koords = koord.split(" ");
            String koord1 = koords[0];
            String koord2 = koords[1];
            char bukva1 = koord1.charAt(0);
            char bukva2 = koord2.charAt(0);
            char cyfra01 = koord1.length() == 3? (char) (koord1.charAt(koord1.length() - 2) + koord1.charAt(koord1.length() - 1)) : koord1.charAt(koord1.length() - 1);
            char cyfra02 = koord2.length() == 3? (char) (koord2.charAt(koord2.length() - 2) + koord2.charAt(koord2.length() - 1)) : koord2.charAt(koord2.length() - 1);
            int cyfra1 = Character.getNumericValue(cyfra01);
            int cyfra2 = Character.getNumericValue(cyfra02);
            if (cyfra1 >= 1 && cyfra1 <= 10 && cyfra2 >= 1 && cyfra2 <= 10 && (int) bukva1 >= 65 && (int) bukva1 <=74 && (int) bukva2 >= 65 && (int) bukva2 <=74)
            {
                if (bukva1 == bukva2 && Math.abs(cyfra2 - cyfra1) + 1 == kletka)
                {
                    for (int i = 0 ; i < kletka ; i++)
                    {
                        boolean proverka0 = true;
                        if (i == 0)
                        {
                            try
                            {
                                if (pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) +1] != "0" && pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) + 1] != "O" && pole1[bukva1 - 'A' + 1 - 1][Math.min(cyfra1, cyfra2)] != "O" && pole1[bukva1 - 'A' + 1 - 1][Math.min(cyfra1, cyfra2)] != "O" && pole1[bukva1 - 'A' + 1 + 1][Math.min(cyfra1, cyfra2)] != "O")
                                {
                                    pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) + i] = "O";
                                } else {System.out.println("Error1! You placed it too close to another one. Try again:"); proverka0 = false; isError = true;}
                            } catch(ArrayIndexOutOfBoundsException e) {
                                pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) + i] = "O";
                            }
                        }
                        else{
                            try
                            {
                                if (pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) + 1 + i] != "O" && pole1[bukva1 - 'A' + 1 - 1][Math.min(cyfra1, cyfra2) + i] != "O" && pole1[bukva1 - 'A' + 1 - 1][Math.min(cyfra1, cyfra2) + i] != "O" && pole1[bukva1 - 'A' + 1 + 1][Math.min(cyfra1, cyfra2) + i] != "O")
                                {
                                    pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) + i] = "O";
                                } else {
                                    if (proverka0 == true)
                                    {
                                        System.out.println("Error2! You placed it too close to another one. Try again:");
                                        proverka0 = false;
                                        isError = true;
                                    }
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) + i] = "O";
                            }
                        }
                        if (proverka0 == false)
                        {
                            for (int j = 0 ; j < kletka ; j++)
                            {
                                pole1[bukva1 - 'A' + 1][Math.min(cyfra1, cyfra2) + j]  = "~";
                            }
                        }
                    }
                } else {
                    if (Math.abs(bukva2 - bukva1) + 1 == kletka && cyfra1 == cyfra2)
                    {
                        for (int i = 0 ; i < kletka ; i++)
                        {
                            boolean proverka = true;
                            if (i == 0)
                            {
                                try
                                {
                                    if (pole1[Math.min(bukva1, bukva2) - 'A' + 1 - 1 + i][cyfra1] != "O" && pole1[Math.min(bukva1, bukva2) - 'A' + 1 + 1 + i][cyfra1] != "O" && pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i ][cyfra1 - 1] != "O" && pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i][cyfra1 + 1] != "O")
                                    {
                                        pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i][cyfra1] = "O";
                                    } else {
                                        if (proverka == true)
                                        {
                                            System.out.println("Error3! You placed it too close to another one. Try again:");
                                            proverka = false;
                                            isError = true;
                                        }
                                    }
                                } catch(ArrayIndexOutOfBoundsException e) {
                                    pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i][cyfra1] = "O";
                                }
                            } else {
                                try {
                                    if (pole1[Math.min(bukva1, bukva2) - 'A' + 1 + 1 + i][cyfra1] != "O" && pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i ][cyfra1 - 1] != "O" && pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i][cyfra1 + 1] != "O")
                                    {
                                        pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i][cyfra1] = "O";
                                    } else {
                                        if (proverka == true)
                                        {
                                            System.out.println("Error4! You placed it too close to another one. Try again:");
                                            proverka = false;
                                            isError = true;
                                        }
                                    }
                                } catch(ArrayIndexOutOfBoundsException e) {
                                    pole1[Math.min(bukva1, bukva2) - 'A' + 1 + i][cyfra1] = "O";
                                }
                            }
                            if (proverka == false)
                            {
                                for (int j = 0 ; j < kletka ; j++)
                                {
                                    pole1[Math.min(bukva1, bukva2) - 'A' + j][cyfra1]  = "~";
                                }
                            }
                        }
                    } else if (Math.abs(cyfra2 - cyfra1) + 1 != 5 || Math.abs(bukva2 - bukva1) + 1 != 5) {
                        System.out.println("Error! Wrong length of the " + name + " ! Try again:");
                        isError = true;
                    }
                    if (bukva2 != bukva1 && cyfra1 != cyfra2) {System.out.println("Error! Wrong ship location! Try again:");isError = true;}
                }
            }
        }
    }

}
public class Main {
    public static void main(String[] args) {
        String[][] pole1 = new String[11][11];
        String[][] pole2 = new String[11][11];
        String[][] pole3 = new String[11][11];
        String[][] pole4 = new String[11][11];
        Korabl k = new Korabl();
        k.zapolnenie(pole1);
        k.zapolnenie(pole2);
        k.zapolnenie(pole3);
        k.zapolnenie(pole4);
        System.out.println("Player 1, place your ships on the game field");
        k.print(pole1);
        k.func1(5, "Aircraft Carrier", pole1);
        k.print(pole1);
        k.func1(4, "Battleship", pole1);
        k.print(pole1);
        k.func1(3, "Submarine", pole1);
        k.print(pole1);
        k.func1(3, "Cruiser", pole1);
        k.print(pole1);
        k.func1(2, "Destroyer", pole1);
        k.print(pole1);
        k.enterKey();
        System.out.println("Player 2, place your ships on the game field");
        k.print(pole3);
        k.func1(5, "Aircraft Carrier", pole3);
        k.print(pole3);
        k.func1(4, "Battleship", pole3);
        k.print(pole3);
        k.func1(3, "Submarine", pole3);
        k.print(pole3);
        k.func1(3, "Cruiser", pole3);
        k.print(pole3);
        k.func1(2, "Destroyer", pole3);
        k.print(pole3);
        k.enterKey();
        k.first_shot(pole1, pole2, pole3, pole4);
    }

}
