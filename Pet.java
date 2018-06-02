public class Pet
{
    String name;


    public Pet(String name)
    {
        this.name = name;
    }


    private void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public String speak()
    {
        String output = "I cost money and I make messes";
        return output;
    }




}