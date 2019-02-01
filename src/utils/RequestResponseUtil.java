package utils;

import database.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class RequestResponseUtil {

    public static String getCookie(HttpServletRequest request,String cookiename) {
        Cookie[] cookies = request.getCookies();
        for(int i=0;i<cookies.length;i++) {
            Cookie cookie = cookies[i];
            System.out.println(cookie.getName() + " : " +cookie.getValue());
            if(cookie.getName().equals(cookiename)) {
                return cookie.getValue();
            }
        }
        return null;
    }


}
