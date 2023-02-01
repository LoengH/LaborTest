import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class TestenTest
{
    @Test
    public void testAquivalenzklasse()
    {
        int[] feld = { };
        Testen.abc(feld);
        Testen.fill(feld);
        int[] expected = { };
        assertArrayEquals(expected, feld);
    }

    @Test
    public void testAquivalenzklasseDoppelt()
    {
        int[] feld = {6, 6, 4, 4, 2, 2};
        Testen.abc(feld);
        Testen.fill(feld);
        int[] expected = {2, 2, 4, 4, 6, 6};
        assertArrayEquals(expected, feld);
    }

    @Test
    public void testGrenzwert()
    {
        int [] feld = {Integer.MAX_VALUE, 0 , Integer.MIN_VALUE};
        Testen.abc(feld);
        int [] expected = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        assertArrayEquals(expected, feld);
    }

    @Test
    public void testRandom()
    {
        Random random = new Random();
        int [] feld = new int[6];
        for(int i = 0; i < feld.length; i++)
        {
            feld[i] = random.nextInt(1);
        }
        Testen.abc(feld);
        int [] expected = Arrays.copyOf(feld, feld.length);
        Arrays.sort(expected);
        assertArrayEquals(expected, feld);
    }
}