import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Scanner;

public class Player {
    Tabla x;
    Tabla.Symbol y;

    public Player(int Tabla, String Player) {
        this.x = x;
        this.y = y;
    }
    public boolean nextMove() {
        Scanner sc = new Scanner(System.in);
        int[]=sc.nextInt();
        int a = readValidIndex(a);
        int b = readValidIndex(b);

    }// citim a si b de tip int

        public static int readValidIndex () {
            Scanner sc = new Scanner(System.in);
            int a;
            while (true) {
                a = sc.nextInt();
                if (a >= 0 && a <= 2)
                    break;
            }
            return a;
        }
}

