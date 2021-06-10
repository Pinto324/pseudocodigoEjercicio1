
import java.util.Scanner;

public class pseudocodigoEjercicio1 {
    public static void main(String[] args){
        int NoR;
        int No;
        int APar = 0;
        int AImpar = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros desea generar");
        No = sc.nextInt();
        for(int i = 0 ; i <= No ; i++){
            NoR = (int) Math.round((Math.random()*100)+1);
            if(NoR%2==0){
            APar++;
            }else{
            AImpar++;
            }
        }
    System.out.println("La cantidad de numeros pares fueron: "+APar);
    System.out.println("La cantidad de numeros impares fueron: "+AImpar);
    }
}
