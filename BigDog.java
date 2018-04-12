
public class BigDog extends Animal
{
    private String sound1;
    private String type1;
    public String getSound() {
    sound1 = "bark";
    return sound1;
    }
    public String getType() {
       type1 = "animal";
       return type1;
    }
    private String myDog;
    public void main(){
     System.out.println(getSound() + " " + getType() + );
    }
}
