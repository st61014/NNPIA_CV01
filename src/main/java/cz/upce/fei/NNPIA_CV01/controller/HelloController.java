package cz.upce.fei.NNPIA_CV01.controller;

import cz.upce.fei.NNPIA_CV01.objects.RequestObject;
import org.springframework.web.bind.annotation.*;

//@Controller se používá pro označení třídy jako Spring MVC Controller.
//@RestController anotace je speciální kontroler pro RESTful Web služby, je to kombinace anotací @Controller a @ResponseBody

//XML se podobá HTML, ale používá jiné značky. XML je zkratka pro eXtensible Markup Language, což znamená, že můžete vytvářet vlastní značky.
//JSON je zkratka pro JavaScript Object Notation. JSON je textový a čitelný pro člověka. Používá {} a indentace.
//YAML je zkratka pro YAML Ain't Markup Language. YAML je textový a čitelný pro člověka. Používá odsazení, pomlčky a dvojtečky.
@RestController
public class HelloController {
    @GetMapping("")
    public String helloWorld(){
        return "Hello world from Spring boot application";
    }
    @GetMapping("/2/{id}")
    public String pathVariable(@PathVariable String id){
        return "Hello world from Spring boot application with path variable: "+id;
    }
    @GetMapping("/3")
    public String queryVariable(@RequestParam String id){
        return "Hello world from Spring boot application with query variable: "+id;
    }
    @GetMapping("/4")
    public String postController(@RequestBody RequestObject body) {

        return "Hello world from Spring boot application with object body variable: "+body.toString();
    }
}
