package refactoring.nullobjectpattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by twer on 4/7/14.
 */
public class PineappleReportTest {

    private PineappleReport pineAppleReport;
    private Pineapple pineapple;
    private PineappleTree pineappleTree;

    @Before
    public void setUp() throws Exception {
        pineapple = new Pineapple("red","1");
        pineappleTree = new PineappleTree(pineapple);
        pineAppleReport = new PineappleReport(pineappleTree);

    }

    @Test
    public void testGetColor() throws Exception {
        pineAppleReport.getColor();

    }

    @Test
    public void testGetHeight() throws Exception {
        pineAppleReport.getHeight();

    }
}
