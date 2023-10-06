package com.mycompany.novosalario;

import java.util.Scanner;
public class Novosalario {

    public static void main(String[] args) {
        Salario2 s = new Salario2();
        
        Scanner leia1 = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        s.salario = leia1.nextDouble();
        
        s.saida();
        
    }
}
