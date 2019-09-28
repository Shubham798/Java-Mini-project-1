package miniproject.javafiles;

public class RestMenu {
    String []dishNames=new String[10];
    int []dishPrices=new int[10];

    void getMenuFromDB(){
        dishNames=new String[]{"a","b","c","d","e","f","g","h","i","j"};//ACCEPT FROM THE DB
        dishPrices=new int[]{0,9,8,7,6,5,4,3,2,1};
    }
    String[] getDishNames(){
        return dishNames;
    }
    int[]getDishPrices(){
        return dishPrices;
    }
}
