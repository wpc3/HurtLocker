import org.junit.Assert;
import org.junit.Test;

public class nameAndFoodTest {

    @Test
    public void nameTest(){
        HurtLockerSolution hurtLockerSolution = new HurtLockerSolution();

        String actual = hurtLockerSolution.nameAndFoodRegex();

        Assert.assertTrue(actual.contains("name"));

    }

    @Test
    public void breadTest(){
        HurtLockerSolution hurtLockerSolution = new HurtLockerSolution();

        String actual = hurtLockerSolution.nameAndFoodRegex();

        Assert.assertTrue(actual.contains("Bread"));

    }

    @Test
    public void milkTest(){
        HurtLockerSolution hurtLockerSolution = new HurtLockerSolution();

        String actual = hurtLockerSolution.nameAndFoodRegex();

        Assert.assertTrue(actual.contains("Milk"));

    }

    @Test
    public void cookiesTest(){
        HurtLockerSolution hurtLockerSolution = new HurtLockerSolution();

        String actual = hurtLockerSolution.nameAndFoodRegex();

        Assert.assertTrue(actual.contains("Cookies"));

    }

    @Test
    public void appleTest(){
        HurtLockerSolution hurtLockerSolution = new HurtLockerSolution();

        String actual = hurtLockerSolution.nameAndFoodRegex();

        Assert.assertTrue(actual.contains("Apples"));

    }






}
