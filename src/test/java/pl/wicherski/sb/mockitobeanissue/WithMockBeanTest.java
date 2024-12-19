package pl.wicherski.sb.mockitobeanissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockReset;

import static org.mockito.Mockito.verify;

@SpringBootTest
class WithMockBeanTest {

    @Autowired
    private BeanB beanB;
    @MockBean(reset = MockReset.NONE)
    private BeanA beanA;

    @Test
    void shouldPass() {
        verify(beanA).doSomething();
    }

}
