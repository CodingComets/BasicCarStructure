public class Main {

    public static void main(String[] args) {
        BasicStructure toyota = new BasicStructure();
        toyota.color = "white";
        toyota.model = "corolla";
        toyota.power = "2000cc";


        Engine x= new Engine();
        x.cylinders = "5";
        x.weight = "100000";
        x.size = "Medium";

        Lights bulb = new Lights();
        bulb.color = "white";
        bulb.intensity = "1000 lumens";

        Color colors = new Color();
        colors.carColor = "white";
        colors.carWindowColor = "tinted";

    }
}
