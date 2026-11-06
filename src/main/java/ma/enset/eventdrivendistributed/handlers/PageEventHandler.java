package ma.enset.eventdrivendistributed.handlers;

import ma.enset.eventdrivendistributed.events.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

import static org.springframework.integration.graph.LinkNode.Type.input;

@Component
public class PageEventHandler {

    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return (input)->{
            System.out.println("*************************");
            System.out.println(input.toString());
            System.out.println("*************************");
        };
    }
}
