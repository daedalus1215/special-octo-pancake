package com.example.demo;

import com.example.demo.intoJavaConsumingClass.JavaConfigConsumingClass;
import com.example.demo.intoXmlConsumingClass.XmlConsumingClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final XmlConsumingClass xmlConsumingClass;
    private final JavaConfigConsumingClass javaConfigConsumingClass;

    public TestController(XmlConsumingClass xmlConsumingClass, JavaConfigConsumingClass javaConfigConsumingClass) {
        this.xmlConsumingClass = xmlConsumingClass;
        this.javaConfigConsumingClass = javaConfigConsumingClass;
    }

    @GetMapping("/api/users")
    public String request() {
        System.out.println("request came in! " + xmlConsumingClass.getConsumedClass().name);
        return "List of all users";
    }

    @GetMapping("/api/users2")
    public String request2() {
        System.out.println("request came in! " + javaConfigConsumingClass.getXmlConsumingClass().getConsumedClass().name);
        return "List of all users";
    }
}
