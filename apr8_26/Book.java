public class Book{
       String color = "blue";
       String habit = "Good";
       int cost = 1000;
       int pages = 500;
       float weight = 1;

       public static void main(String[] args){

              Book mybook = new Book();
              System.out.println("Color:" + mybook.color);
              System.out.println("Habit:" + mybook.habit);
              System.out.println("Cost:" + mybook.cost);
              System.out.println("Pages:" + mybook.pages);
              System.out.println("Weight:" + mybook.weight);
           }

}