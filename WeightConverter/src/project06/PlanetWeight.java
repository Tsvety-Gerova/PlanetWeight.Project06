package project06;


import java.util.Scanner;

public class PlanetWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Enter your weight on Earth");
int weight = sc.nextInt();

System.out.println("Choose a planet and write it: \nMercury\nVenus\nMars\nJupiter\nSaturn\nUranus\nNeptune");
String planet = sc.next();
switch (planet) {
case "Mercury":
	weight *= 0.38;
	System.out.println("Your weight on planet " + planet + " is " + weight);
	break;
case "Venus":
	weight *= 0.91;
	System.out.println("Your weight on planet " + planet + " is " + weight);
	break;
case "Mars":
	weight *= 0.38; 
	System.out.println("Your weight on planet " + planet + " is " + weight);
	break;
case "Jupiter":
	weight *= 2.36;
	System.out.println("Your weight on planet " + planet + " is " + weight);
	break;
case "Saturn":
	weight *= 0.92;
	System.out.println("Your weight on planet " + planet + " is " + weight);
	break;
case "Uranus":
	weight *= 0.89;
	System.out.println("Your weight on planet " + planet + " is " + weight);
	break;
case "Neptune":
	weight *= 1.13;
	System.out.println("Your weight on planet " + planet + " is " + weight);
	break;
	}
	}

}
