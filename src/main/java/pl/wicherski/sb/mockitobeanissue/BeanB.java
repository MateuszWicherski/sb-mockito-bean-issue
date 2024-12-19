package pl.wicherski.sb.mockitobeanissue;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private final BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
    }

    @PostConstruct
    void postConstruct() {
        beanA.doSomething();
    }
}
