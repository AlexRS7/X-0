import java.util.Random;
import java.util.Scanner;

public class Tabla {
    private static final String RED = "\033[0;91m";
    private static final String BLUE ="\033[0;94m";
    private static final String RESET ="\033[0m";
    public static enum Symbol {
        Sx, So, S_
    }

    Symbol[][] t;
    public Tabla(){
        t= new Symbol[3][3];
        for (int i=0; i<3;++i)
            for(int j=0;j<3;++j)
                t[i][j]= Symbol.S_;
    }

    void showt() {
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < 3; ++j)

                switch (t[i][j]) {
                    case Sx:
                        System.out.println(RED + 'x' + RESET);
                        break;
                    case So:
                        System.out.println(BLUE + '0' + RESET);
                        break;
                    default:
                        System.out.println('_');
                        break;
                }// Switch
    }
    boolean isXFirst (){
        Random r=new Random();
        return r.nextBoolean();
    }

    public boolean isDraw() {
            return  t[0][0] != Symbol.S_ && t[0][1] != Symbol.S_ && t[0][2] != Symbol.S_ &&
                    t[1][0] != Symbol.S_ && t[1][1] != Symbol.S_ && t[1][2] != Symbol.S_ &&
                    t[2][0] != Symbol.S_ && t[2][1] != Symbol.S_ && t[2][2] != Symbol.S_;
        }
    public int checkWinningState() {
        if (    t[0][0] == Symbol.So && t[0][1] == Symbol.So && t[0][2] == Symbol.So ||
                t[1][0] == Symbol.So && t[1][1] == Symbol.So && t[1][2] == Symbol.So ||
                t[2][0] == Symbol.So && t[2][1] == Symbol.So && t[2][2] == Symbol.So ||
                t[0][0] == Symbol.So && t[1][0] == Symbol.So && t[2][0] == Symbol.So ||
                t[0][1] == Symbol.So && t[1][1] == Symbol.So && t[2][1] == Symbol.So ||
                t[0][2] == Symbol.So && t[1][2] == Symbol.So && t[2][2] == Symbol.So ||
                t[0][0] == Symbol.So && t[1][1] == Symbol.So && t[2][2] == Symbol.So ||
                t[0][2] == Symbol.So && t[1][1] == Symbol.So && t[2][0] == Symbol.So){
            return 0;
        }

        if (    t[0][0] == Symbol.Sx && t[0][1] == Symbol.Sx && t[0][2] == Symbol.Sx ||
                t[1][0] == Symbol.Sx && t[1][1] == Symbol.Sx && t[1][2] == Symbol.Sx ||
                t[2][0] == Symbol.Sx && t[2][1] == Symbol.Sx && t[2][2] == Symbol.Sx ||
                t[0][0] == Symbol.Sx && t[1][0] == Symbol.Sx && t[2][0] == Symbol.Sx ||
                t[0][1] == Symbol.Sx && t[1][1] == Symbol.Sx && t[2][1] == Symbol.Sx ||
                t[0][2] == Symbol.Sx && t[1][2] == Symbol.Sx && t[2][2] == Symbol.Sx ||
                t[0][0] == Symbol.Sx && t[1][1] == Symbol.Sx && t[2][2] == Symbol.Sx ||
                t[0][2] == Symbol.Sx && t[1][1] == Symbol.Sx && t[2][0] == Symbol.Sx){
            return 1;
        }
        return 5;
    }
    public boolean Completeaza(int a,int b,Symbol s){
        boolean success=true;
        if (t[a][b]==Symbol.S_)
            t[a][b] = s;
        else
            success=false;

        return success;

    }
    }