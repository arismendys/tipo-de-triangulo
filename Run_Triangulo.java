/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

/**
 *
 * @author Arismendys Marte
*/
import java.util.Scanner;
public class Run_Triangulo {
    public static void main(String[] args){
       float x,y,z;
        Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese eje x del primer punto:");
       float a=sc.nextFloat();
       System.out.println("Ingrese eje y del primer punto");
       float b=sc.nextFloat();
       System.out.println("Ingrese eje x del segundo punto");
       float c=sc.nextFloat();
       System.out.println("Ingrese eje y del segundo punto");
       float d=sc.nextFloat();
       System.out.println("Ingrese eje x del tercer punto");
       float e=sc.nextFloat();
       System.out.println("Ingrese eje y del tercer punto");
       float f=sc.nextFloat();

        Triangulo t1,pa,pb,pc;
        pa = new Triangulo(a,b);
        pb= new Triangulo(c,d);
        pc = new Triangulo(e,f);
        x=pa.distancia(pb);
        y=pb.distancia(pc);
        z=pa.distancia(pc);
        t1 = new Triangulo(x,y,z);
        System.out.println(x+","+y+","+z);
        System.out.println(t1.ftriangulo(t1));
                //set(a,b,c);
    
    }
    
}
