package refactoring.nullobjectpattern;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

/**
* Created by twer on 4/7/14.
*/
@RunWith(MockitoJUnitRunner.class)
public class PineappleReportTest {

    private PineappleReport pineAppleReport;
    @Mock
    private PineappleInfoProviderFactory pineappleInfoProviderFactory;

    @Before
    public void setUp() throws Exception {
        Pineapple pineapple = new Pineapple("red", "1");
        PineappleTree pineappleTree = new PineappleTree(pineapple);
        PineappleInfoProvider pineappleInfoProvider = new PineappleInfoProvider(pineappleTree);
        given(pineappleInfoProviderFactory.create(any(PineappleTree.class))).willReturn(pineappleInfoProvider);
        pineAppleReport = new PineappleReport(pineappleTree, pineappleInfoProviderFactory);

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
