package com.fastcampus.ch2;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class TwoDice {
    @RequestMapping("/rollDice")
    @ResponseBody
    public void main(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src='/static/img/dice1.jpg'>");
        out.println("</body>");
        out.println("</html>");
    }
}
