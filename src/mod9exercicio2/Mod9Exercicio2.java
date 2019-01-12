package mod9exercicio2;

import entities.Companhia;
import entities.Contribuintes;
import entities.PessoaFisica;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Mod9Exercicio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuintes> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if(ch == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthexpend = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, healthexpend));
            }
            else{
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberEmploy = sc.nextInt();
                list.add(new Companhia(name, anualIncome, numberEmploy));
            }       
        }
        
        System.out.println();
        
        System.out.println("TAXES PAID: ");
        
        double total = 0.0;
        for(Contribuintes contri : list){
            double tax = contri.calculoImposto();
            System.out.println(contri.getName() + ": $ " 
            + String.format("%.2f", tax));
            total += tax;
        }
 		
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));
        
        sc.close();
    }
    
}
