package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Sumando {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long res(Long number1, Long number2) {
        logger.info( "Restando {} - {}", number1, number2 );
        return number1 - number2;
    }
    public Long mul(Long number1, Long number2) {
        logger.info( "Multiplicando {} * {}", number1, number2 );
        return number1 * number2;
    }
    public Long div(Long number1, Long number2) {
        logger.info( "Dividiendo {} / {}", number1, number2 );

        try {
            return number1 / number2;
        }catch (Exception e){
            System.out.println("La división sobre cero no es válida");
        }
        return null;
    }
}
