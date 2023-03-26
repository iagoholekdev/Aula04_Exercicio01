package br.com.unimater.aed2023;
import java.util.Scanner;
public class Aula04_Exercicio01 {

    public static void main(String[] args) {
       final int idadeMinima = 18;
       System.out.println("Testar dados");
       Scanner myScanner = new Scanner(System.in);

       System.out.println("Como é seu nome?");
       String name = myScanner.next();

       System.out.println("Ok "+ name +", qual é a sua idade?");
       int age = myScanner.nextInt();

       if (age < idadeMinima) {
           System.out.println("Nâo poderemos continuar com o cadastro pois você não atingiu a idade minima!");
           String dadosClient = "Nome do cliente: " + name + "\n Idade do Cliente: " + age;
           System.out.println(dadosClient);
       }


    }
}

