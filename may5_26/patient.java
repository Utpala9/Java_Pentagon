package may5_26;

import apr30_26.string;

public class patient {
    private int id;
    private string name;
    private int age;
    private string History;
    
    public setage(int age){
        if (age > 0 && age <150){
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 0 and 150.");
        }
        public int get id(){
            return id;
        }

        public int string name(){
            return name;
        }
         public int get age(){
            return age;
        }

        public string get History(){
            return History;
        }




    }{

