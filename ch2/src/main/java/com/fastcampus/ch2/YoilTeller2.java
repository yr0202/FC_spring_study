package com.fastcampus.ch2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@Controller
public class YoilTeller2 {
    @RequestMapping("/getYoil2")
    @ResponseBody
    public void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.입력
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        //2.작업
        Calendar cal = Calendar.getInstance();
        cal.set(yyyy, mm - 1, dd);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //DAY_OF_WEEK=요일
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        //3.출력
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println(year + "년 " + month + "월 " + day + "일은 ");
        out.println(yoil+"요일입니다");
    }
}

//public class YoilTeller {
//    public static void main(String[] args) {
//        //1.입력
////        String year = args[0];
////        String month = args[1];
////        String day = args[2];
//        String year = "2024";
//        String month = "07";
//        String day = "17";
//
//        int yyyy = Integer.parseInt(year);
//        int mm = Integer.parseInt(month);
//        int dd = Integer.parseInt(day);
//
//        //2.작업
//        Calendar cal = Calendar.getInstance();
//        cal.set(yyyy, mm - 1, dd);
//
//        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //DAY_OF_WEEK=요일
//        char yoil = " 일월화수목금토".charAt(dayOfWeek);
//
//        //3.출력
//        System.out.println(year + "년 " + month + "월 " + day + "일은 ");
//        System.out.println(yoil+"요일입니다");
//    }
//}
