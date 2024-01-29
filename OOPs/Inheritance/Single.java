class Country {
    private String name;
    private String continent;
    private String capital;
    
    public Country(String name, String continent, String capital) {
        //this keyword refers to the current object
        this.name = name;
        this.continent = continent;
        this.capital = capital;
    }

    public void display() {
        System.out.println("Country Name: " + name);
        System.out.println("Continent: " + continent);
        System.out.println("Capital: " + capital);
    }
}

class State extends Country {
    private String name;
    private String governor;

    public State(String name, String countryName, String continent, String capital, String governor) {
        //super keyword is used to call parent class' variables, constructors and methods
        super(name, continent, capital);
        this.name = name;
        this.governor = governor;
    }

    public void display() {
        super.display();    //calling parent class' display method
        System.out.println("State Name: " + this.name);
        System.out.println("Governor Name: " + governor);
    }
}


public class Single {
    public static void main(String[] args) {
        State gujarat = new State("Gujarat", "India", "Asia", "New Delhi", "Acharya Devvrat");

        gujarat.display();
    }    
}
