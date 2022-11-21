package codeonedigest.springbootasyncdemo;

import codeonedigest.springbootasyncdemo.service.SpringbootDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringbootAsyncDemoRunner implements CommandLineRunner {

    @Autowired
    SpringbootDemoService springbootDemoService;

    @Override
    public void run(String... args) throws Exception {
        springbootDemoService.processTask();
    }
}
