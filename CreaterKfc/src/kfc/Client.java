package kfc;

public class Client {
	  
    public static void main(String[] args) {  
        //����Ա  
        KFCWaiter waiter = new KFCWaiter();  
        //�ײ�A  
        MealA a = new MealA();  
        //����Ա׼���ײ�A  
        waiter.setMealBuilder(a);  
        //����ײ�  
        Meal mealA = waiter.construct();  
          
        System.out.print("�ײ�A����ɲ���:");  
        System.out.println(mealA.getFood()+"---"+mealA.getDrink());  
    }  
}
