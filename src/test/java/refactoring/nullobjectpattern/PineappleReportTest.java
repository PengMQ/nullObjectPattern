package refactoring.nullobjectpattern;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by twer on 4/7/14.
 */
public class PineappleReportTest {

    private PineappleReport pineAppleReport;

    @Before
    public void setUp() throws Exception {
        Pineapple pineapple = new Pineapple("red", "1");
        PineappleTree pineappleTree = new PineappleTree(pineapple);
        pineAppleReport = new PineappleReport(pineappleTree);

    }

    @Test
    public void testGetColor() throws Exception {
        String color = pineAppleReport.getColor();
        assertThat(color, is("red"));

    }

    @Test
    public void testGetHeight() throws Exception {
        String height = pineAppleReport.getHeight();
        assertThat(height,is("1"));

    }
}
