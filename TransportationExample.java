package LLM;

//Products: Vehicles
interface Vehicle {
 double calculateCost(double distance, double time);
}

class Truck implements Vehicle {
 @Override
 public double calculateCost(double distance, double time) {
	return time;
     // Cost calculation logic for trucks
 }
}

class Ship implements Vehicle {
 @Override
 public double calculateCost(double distance, double time) {
	return time;
     // Cost calculation logic for ships
 }
}

class Airplane implements Vehicle {
 @Override
 public double calculateCost(double distance, double time) {
	return time;
     // Cost calculation logic for airplanes
 }
}

//Factories
interface TransportationFactory {
 Vehicle createVehicle();
}

class RoadwaysFactory implements TransportationFactory {
 @Override
 public Vehicle createVehicle() {
     return new Truck();
 }
}

class WaterwaysFactory implements TransportationFactory {
 @Override
 public Vehicle createVehicle() {
     return new Ship();
 }
}

class AirwaysFactory implements TransportationFactory {
 @Override
 public Vehicle createVehicle() {
     return new Airplane();
 }
}

//Strategy
interface CostCalculationStrategy {
 double calculateCost(double distance, double time);
}

class RoadwaysCostCalculationStrategy implements CostCalculationStrategy {
 @Override
 public double calculateCost(double distance, double time) {
	return time;
     // Cost calculation strategy for roadways
 }
}

class WaterwaysCostCalculationStrategy implements CostCalculationStrategy {
 @Override
 public double calculateCost(double distance, double time) {
	return time;
     // Cost calculation strategy for waterways
 }
}

class AirwaysCostCalculationStrategy implements CostCalculationStrategy {
 @Override
 public double calculateCost(double distance, double time) {
	return time;
     // Cost calculation strategy for airways
 }
}

//Client
public class TransportationExample {
 public static void main(String[] args) {
     TransportationFactory factory = new RoadwaysFactory();
     Vehicle vehicle = factory.createVehicle();
     
     CostCalculationStrategy strategy = new RoadwaysCostCalculationStrategy();
     double cost = strategy.calculateCost(100, 2);
     System.out.println("Cost of transportation: " + cost);
 }
}
