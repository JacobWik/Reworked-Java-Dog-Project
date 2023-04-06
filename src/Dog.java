/**
* @author Jacob Wik jawi1091
*/
public class Dog {

    // need to add Owner When the Owner Class is done
    private String breed;
    private String name;

    private int age;

    private double weight;
    
    public Dog(String name, String breed , int age, double weight){
        this.name = name.toLowerCase();
        this.breed = breed.toLowerCase();
        this.age = age;
        this.weight = weight;
    }

    public void increaseAge(int years){
        if(years > 0)
        this.age += years;
    }




    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }


    public int getAge(){
        return age;
    }

    // unsure if Casting is allowed
    public int getWeight(){
        int weight = (int) this.weight;
        return weight;
    }

    // perhaps make a final attribute with 3.7 
    public double getTailLength(){
        if(breed.equals("tax") || breed.equals("dachshund")){
            return 3.7;
        } 

        double tailLength = ((age*weight)/10);

        return tailLength;
    }

    @Override
    public String toString(){
        return "The name of the pet is " + this.name + ". The age of the pet is " + this.age + ". Its breed is " + this.breed+ ". It weighs "+ getWeight() + ".It has a tail that's " + getTailLength() + "cm long.";
      }
}
