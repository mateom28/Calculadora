/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

/**
 *
 * @author judil
 */
public class Calculadora {
    int num1,num2;
    char signo;
    
    public char getSigno(){
        return signo;
    }
    
    public void setSigno(char signo){
        this.signo = signo;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int Suma(int num1, int num2){
        return num1+num2;
    }
    public int Resta(int num1,int num2){
        return num1-num2;
    }
    public int Producto(int num1, int num2){
        return num1*num2;
    }
    public int Cociente(int num1, int num2){
        return num1/num2;
    }
}
