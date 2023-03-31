import java.util.Scanner;

class animal{
    String name;
    double tall;
    int weight;
    double speed;
    animal (String name,double tall,int weight,double speed){
        this.name = name;
        this.tall = tall;
        this.weight = weight;
        this.speed = speed;
    }
    void show(){
        System.out.println("名字 : "+name);
        System.out.println("身高 : "+tall);
        System.out.println("體重 : "+weight);
        System.out.println("速度 : "+speed);
    }
    double distance(int time,double accel){
        return time * accel * speed;
    }
    double distance(int time){
        return time * speed;
    }
}


public class A1113355_0324_1{
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        animal animal1 = new animal("雪寶",1.1,52,100);
        animal animal2 = new animal("驢子",1.5,99,200);
        animal animal3 = new animal("安那",1.7,48,120);
        animal animal4 = new animal("愛沙",1.7,50,120);

        animal1.show();
        System.out.print("請輸入雪寶的時間(分鐘):");
        int x = scanner.nextInt();
        System.out.print("請輸入雪寶的加速度：");
        double y = scanner.nextDouble();
        System.out.println("雪寶跑步的距離：" + animal1.distance(x, y));
        
        animal2.show();
        System.out.print("請輸入驢子的時間(分鐘):");
        x = scanner.nextInt();
        System.out.print("請輸入驢子的加速度：");
        y = scanner.nextDouble();
        System.out.println("驢子跑步的距離：" + animal2.distance(x, y));
        
        animal3.show();
        System.out.print("請輸入安那的時間(分鐘):");
        x = scanner.nextInt();
        System.out.print("請輸入安那的加速度：");
        y = scanner.nextDouble();
        System.out.println("安那跑步的距離：" + animal3.distance(x, y));
        
        animal4.show();
        System.out.print("請輸入愛沙的時間(分鐘):");
        x = scanner.nextInt();
        System.out.print("請輸入愛沙的加速度：");
        y = scanner.nextDouble();
        System.out.println("愛沙跑步的距離：" + animal4.distance(x, y));
    }
}