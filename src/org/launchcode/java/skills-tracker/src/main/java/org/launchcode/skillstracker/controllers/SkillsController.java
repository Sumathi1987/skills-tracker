package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String helloWithQueryParam(){
        String returnText="<h1>"+"Skills Tracker"+"</h1>"+
                "<h2>"+"We have a few skills we would like to learn. Here is the list!"+"</h2>"+
                "<ol>"+"<li>"+"Java"+"</li>"+
                "<li>"+"Javascript"+"</li>"+
                "<li>"+"Python"+"</li>"+
                "</ol>";

        return "<html>"+"<body>"+returnText+"</body>"+"</html>";

    }

    @GetMapping("form")
    @ResponseBody
    public String helloWithForm (){
        return "<html>"+
                "<body>"+
                "<form action='helloparam' method='post'>"+
                "<label for='name'>Name:</label><br>" +
                "<input type='text' id='name' name='name'><br>"+
                "<label for='language1'>My favorite language:</label><br>" +
                "<select name='language1' id='language1'>"+
                "<option value='Java' selected>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<label for='language2'>My second favorite language:</label><br>" +
                "<select name='language2' id='language2'>"+
                "<option value='Java' selected>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<label for='language3'>My third favorite language:</label><br>" +
                "<select name='language3' id='language3'>"+
                "<option value='Java' selected>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<input type='submit' value='Submit'>"+
                "</form>"+
                "</body>"+
                "</html>";
    }

    @PostMapping("helloparam")
    @ResponseBody
    public String helloWithFormPost (@RequestParam String name,@RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        String returnText="<h1>"+name+"</h1>"+
                "<ol>"+"<li>"+language1+"</li>"+
                "<li>"+language2+"</li>"+
                "<li>"+language3+"</li>"+
                "</ol>";

        return "<html>"+"<body>"+returnText+"</body>"+"</html>";
    }
}

