
import java.util.*;

public class honor_roll {
    private Scanner teclado;
    private float[] arrgrade;
    private float grade;
    private String[] arrname;
    private String name;
    
    public void info(){
        System.out.println("--Welcome to \"HONOR ROLL\"-- \nIn this program you will type in the name \nand the grade of students later \nit will be shown the honor roll. \nNOTE: Only students with a grade higher than 9 will appear. \nYou can end the program by typing finish in the name input");
    }

    public void honorroll(){
        teclado=new Scanner(System.in);
        List<Float> arrgrade=new ArrayList<Float>();
        List<String> arrname=new ArrayList<String>();
        while (true){
            System.out.println("Name: ");
            String name=teclado.next();
            if(name.equals("finish")){
                break;
            }else {
                System.out.println("Grade:");
                grade=teclado.nextFloat();
                while (grade>10||grade<0){
                    System.out.println("Invalid grade, please try again: ");
                    grade=teclado.nextFloat();
                }
                arrname.add(name);
                arrgrade.add(grade);
            }
        }
        System.out.println("\n----------HONOR ROLL----------");

        for(int i=0;i<=arrgrade.size();i++){
            if(arrgrade.get(i)>=9){
                System.out.println("Student name: " + arrname.get(i) + " Grade: " + arrgrade.get(i));
            }
        }
    }

    public static void main(String[] args) {
    honor_roll gr=new honor_roll();
    gr.info();
    gr.honorroll();
    }
}