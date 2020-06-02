package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("hello")
//everything now lives at /hello first. To remove redundancies, by simply deleting "hello" below
public class HelloController {
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        model.addAttribute("greeting", "Hello, " + name + "!");
        return "hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("Kyleah");
        names.add("Eleanor");
        names.add("Shaun");
        model.addAttribute("names", names);
        return "hello-list";
    }

}

////  handles request at /hello
////    @GetMapping("hello")
////    public String hello() {
////        return "Hello, Spring!";
////    }
//
//    //    lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    //    handles request of the form /hello?name=LaunchCode
////    translation: it takes a query parameter called "name" with a given value. That value should be used in the response.
////   lives at /hello/hello
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello " + name + "!";
//    }
//
//    //    handles request of the form /hello/LaunchCode
////    lives at /hello/hello/{name}
//    @GetMapping("hello/{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }
//
//    //    form that allows user to type in their name and greets accordingly
////    lives at /hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "form";
////        return "<html>" +
////                "<body>" +
////                "<form action='hello' method='post'>" + //submit request to /hello
////                "<input type='text' name='name'>" +
////                "<input type='submit' value='Greet me!'>" +
////                "</form>" +
////                "</body>" +
////                "</html>";
//    }
//
////    @GetMapping("language")
////    public static String createMessage(@PathVariable String name, String lang) {
////        if (lang.equals("English")) {
////            return "Hello " + name;
////        } else if (lang.equals("Spanish")) {
////            return "Hola " + name;
////        } else if (lang.equals("French")) {
////            return "Bonjour " + name;
////        } else if (lang.equals("German")) {
////            return "Guten tag " + name;
////        } else {
////            return "Konnichiwa" + name;
////        }
////    }
////
////    @GetMapping("langForm")
////    public String langForm() {
////        return "<html>" +
////                "<body>" +
////                "<form action='language' method='post'>" +
////                "<input type='text' name='name'>" +
////                "<select name='lang'>" +
////                "<option value='English'>English</option>" +
////                "<option value='Spanish'>Spanish</option>" +
////                "<option value='French'>French</option>" +
////                "<option value='German'>German</option>" +
////                "<option value='Japanese'>Japanese</option>" +
////                "</select>" +
////                "<input type='submit' value='Greet me!'>" +
//
//}
////                "</form>" +
////                "</body>" +
////                "</html>";
////    }
