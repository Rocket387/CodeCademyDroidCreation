package org.example;

public class Droid {
        String name;
        int batteryLevel;

        public String toString() {
            return "Hello, i am the droid: " + name + ".";
        }

        public Droid(String droidName) {
            this.name = droidName;
            this.batteryLevel = 100;
        }



        public void workOnTask(String task){
            System.out.println(name + " is performing task: " + task);
            batteryLevel = batteryLevel - 10;
        }

        public void showBatteryLevel() {
            System.out.println("Battery Level is: " + batteryLevel);
        }

        public void droidRecharge() {
            System.out.println(name + "has recharged ");
            batteryLevel +=20;
            System.out.println("Battery Level has increased: " + batteryLevel);

        }

        public static void main(String[] args){
            Droid Codey = new Droid("Codey");
            System.out.println(Codey);
            Codey.workOnTask("cleaning");
            Codey.showBatteryLevel();
            Codey.workOnTask("cooking");
            Codey.showBatteryLevel();
            Codey.workOnTask("reading");
            Codey.showBatteryLevel();
            Codey.droidRecharge();
        }
}
