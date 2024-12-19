package pl.wicherski.sb.mockitobeanissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockReset;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.mockito.Mockito.verify;

@SpringBootTest
class WithMockitoBeanTest {

    @Autowired
    private BeanB beanB;
    @MockitoBean(reset = MockReset.NONE)
    private BeanA beanA;

    @Test
    void shouldPass() {
        verify(beanA).doSomething();
    }

}
