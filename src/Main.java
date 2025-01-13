import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numa=0,numb=0;
        prueba obj = new prueba();
        obj.setNum1(numa);
        obj.setNum2(numb);
        obj.suma();
        System.out.println("ingresa numero 1");
        numa=Integer.parseInt(br.readLine());
        System.out.println("ingresa numero 2");
        System.out.println("El resultado es:" + obj.suma());
        }
    }
