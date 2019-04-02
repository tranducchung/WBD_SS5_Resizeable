
public class App {
    public static void main(String[] args) {
        Cricle[] cricles = new Cricle[2];
        cricles[0] = new Cricle();
        cricles[1] = new Cricle(3);

        for (Cricle cricle : cricles) {
            System.out.println("Before : " + cricle);
        }
        for (Cricle cricle : cricles) {
            cricle.resize(Math.random() * 100);
        }
        for (Cricle cricle : cricles) {
            System.out.println(cricle);
        }
        Shape[] retangles = new Retangle[2];
        retangles[0] = new Retangle();
        retangles[1] = new Retangle(1,2);
        for(Shape x : retangles ){
            System.out.println("Before : "+ x);
        }
        for (Shape x : retangles){
            x.resize(50);
        }
        for(Shape x : retangles ){
            System.out.println("After : "+ x);
        }
    }
}

