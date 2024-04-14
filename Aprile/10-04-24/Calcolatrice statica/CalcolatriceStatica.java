public class CalcolatriceStatica {
    public static int somma (int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    public static int sottazione (int num1,int num2,int num3,int num4){
        return num1-num2-num3-num4;
    }

    public static int prodotto(int num1,int num2,int num3,int num4){
        return num1*num2*num3*num4;
    }
    public static double media(int num1,int num2,int num3,int num4){
        return somma( num1, num2, num3, num4)/4.0;
    }
    public static int maggiore (int num1,int num2,int num3,int num4){
        int max=num1;
        if (max <num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }
        if(max<num4){
            max=num4;
        }
        return  max;
    }
    public static int minore (int num1,int num2,int num3,int num4){
        int min=num1;
        if (min >num2){
            min=num2;
        }
        if(min>num3){
            min=num3;
        }
        if(min>num4){
            min=num4;
        }
        return  min;
    }
}