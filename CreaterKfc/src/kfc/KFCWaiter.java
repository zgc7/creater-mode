package kfc;

public class KFCWaiter {
	  
    private MealBuilder mealBuilder;  
      
    public void setMealBuilder(MealBuilder mealBuilder) {  
        this.mealBuilder = mealBuilder;  
    }  
  
    public Meal construct(){  
        //׼��ʳ��  
        mealBuilder.buildFood();  
        //׼������  
        mealBuilder.buildDrink();  
          
        //׼����ϣ�����һ���������ײ͸��ͻ�  
        return mealBuilder.getMeal();  
    }  
}
