package ie.tudublin;

public class Cat{

    private int numLives;
    String name;

    public void setCat(String name)
    {
        this.name = name;
    }

    public Cat(){
        this.numLives = 9;
    }

    public Cat(String name){

    }


    public void kill(){
        if(numLives > 0){
            numLives--;
            System.out.println("Ouch!");
        }
        else if(numLives == 0){
            System.out.println("Dead.");
        }
    }

}