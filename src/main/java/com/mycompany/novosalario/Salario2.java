package com.mycompany.novosalario;

public class Salario2 {
    public double salario, novosalario, ajuste, valora;
    
   public double ajuste(){
               
       if (salario <= 280){
           ajuste = 0.2;
                  novosalario = salario + (salario * ajuste);
                         valora = ajuste * salario;

       }
       else if (salario > 280 && salario < 700){
          ajuste = 0.15;
                 novosalario = salario + (salario * ajuste);
                        valora = ajuste * salario; }

       else if (salario >= 700 && salario < 1500){
                  ajuste = 0.1;
                         novosalario = salario + (salario * ajuste);
                                valora = ajuste * salario;

                  }
       else{  ajuste = 0.05;
              valora = ajuste * salario;
             novosalario = salario + (salario * ajuste); 
       } return novosalario;
   }
   
   public void saida(){
        ajuste();
        System.out.println("Seu percentual de aumento foi: " +(ajuste * 100) +"%");
        System.out.println("Seu valor de aumento foi: " +valora);
        System.out.println("Seu novo salário, após o aumento, foi de: " +ajuste());
   }
}
