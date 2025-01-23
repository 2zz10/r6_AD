public class Car {
    public static final int MAX_SPEED = 120;
    public static final int MIN_SPEED = 0;
    public static final int ADD_SPEED = 10;
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + ADD_SPEED <= MAX_SPEED) {
            speed += ADD_SPEED;
            // afficher détails
            printDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (speed - ADD_SPEED >= MIN_SPEED) {
            speed -= ADD_SPEED;
            printDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    private void printDetails() {
        // afficher détails
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }

    public void startCar(Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getName() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Driver driver) {
        System.out.println(driver.getName() + " arrête la voiture.");
    }

    public void changeSpeed(int newSpeed, Driver driver) {
        System.out.println(driver.getName() + " change la vitesse de la voiture à " + newSpeed);
        int vitesseActuelle;
        if (getSpeed() >= newSpeed) {
            while (getSpeed() > newSpeed) {
                slowDown();
            }
        } else  {
            while (getSpeed() < newSpeed) {
                accelerate();
            }
        }
    }
}

