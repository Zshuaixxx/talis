package com.zxx;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class TailsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testJWT(){
        Map<String,Object> claims=new HashMap<>();
        claims.put("id",1);
        claims.put("qwer",2);
        String jwt= Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"zxxcomwqertyujhgfdddfghtjubvczxxcomwqertyujhgfdddfghtjubvczxxcomwqertyujhgfdddf")
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 600*1000))
                .compact();
        System.out.println(jwt);
    }
//    @Test
//    public void testJWT2(){
//        Jwts.parser()
//                .setSigningKey("zxxcomwqertyujhgfdddfghtjubvczxxcomwqertyujhgfdddfghtjubvczxxcomwqertyujhgfdddf")
//                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJxd2VyIjoyLCJpZCI6MSwiZXhwIjoxNzI0OTM5MDE5fQ.XXlhkTIhvSGrbafeMSnQ8g2uE0KVA_9fFEfZe7g23rc")
//                .getBody();
//    }
}
