package miniproject.javafiles;

public class JavaMain {
    public String  userName,streetName;
    public String [][]restData;
    public float [][]deliveryData;
    public JavaMain(String u,String st){
        userName=u;
        streetName=st;
        javaMain();
    }
    public  void javaMain() {

        BlockMap bm= new BlockMap();
        bm.createMap();
        User u=new User(userName,streetName);
        //System.out.println("Welcome "+userName+"\nThese are some restaurant recommendations near "+streetName+":");
        u.x=bm.getX(u.street);
        u.y=bm.getY(u.street);

//        String []restName= new String[40];//ACCEPT FROM DATABASE
//        String []restStreetName= new String[40];//ACCEPT FROM DATABASE

        String []restName= {"Barbeque Nation","Mc Donalds","Burger King","Olive Kitchen","Chilli's","Pop Tates","Urban Grill","Irla's Cafe","San Doitchi","Bread Bites","Chai Pe Charcha","Flax","Delhi Highway","Global Fusion","Mc Donalds","Mirchi and Mime","Aromas Cafe","Soy Street","Rice Express","Soul Curry","Tamasha","Pizza Hut","Mainland China","Joey's Pizza","Social","Subway","Wok Express","Asian Town","Asia Kitchen","Dominos Pizza","Curry Culture","Persian Durbar","The Fusion Kitchen","Vanilla Beans","Goa Portugesa","White Charcoal","Belgian Waffle","Casa de Cafe","The Finch","Tea Villa Cafe"};//ACCEPT FROM DATABASE
        String []restStreetName= {"Cama Road","Cama Road","Cama Road","Gilbert Hill Road","Juhu Lane","CHS Lane","Kripa Lane","Irla Road","Dhobi Ghat Road","Dadabhai Road","Sarojini Road","Church Road","VP Road","Kutir Road","Kutir Road","Janki Lane","Birla Road","Birla Road","Saibaba Road","Dattataray Road","Bhargav Road","Patil Road","Talmaki Road","Tilak Road","Talmaki Road","Sarojini Road","Irla Road","VP Road","Birla Road","Juhu Lane","Kutir Road","Cama Road","Dhobi Ghat Road","Dadabhai Road","Church Road","Dattataray Road","Janki Lane","Irla Road","Tukaram Road","Tilak Road"};//ACCEPT FROM DATABASE

        RestMap []rs=new RestMap[RestMap.restNo];
        for (int i=0;i<RestMap.restNo;i++){
            rs[i]=new RestMap();
            rs[i].name=restName[i];
            rs[i].street=restStreetName[i];
        }
        Search search= new Search();
        search.search(rs,bm,u);
        restData=new String[2][10];
        restData=search.getRestData();
        deliveryData=new float[2][10];
        deliveryData=search.getDeliveryData();


//        {//USE FOR LOOP HERE
//            rs[0].index = 1;
//            rs[0].name = "Ravi Rice";
//            rs[0].street = "Patel Road";
//            rs[0].x = bm.getX(rs[0].street);
//            rs[0].y = bm.getY(rs[0].street);
//            rs[1].index = 2;
//            rs[1].name = "Jay Sandwich";
//            rs[1].street = "Talmaki Road";
//            rs[1].x = bm.getX(rs[1].street);
//            rs[1].y = bm.getY(rs[1].street);
//        }

    }
}
