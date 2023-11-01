package co.cazadordigital;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static final int EXPIRATION_IN_MINUTES = 1;
    public static final String SECRET_KEY = "MI CLAVE es segura 123456789 ABC abc";

    public static void main(String[] args) {

        Map<String, Object> extraClaims = builExtraClaims();

        String jwt = buildJws(extraClaims);

        System.out.println(jwt);

        try {
            Thread.sleep(60 * 1000);
            Claims payload = verifyJws(jwt);
            System.out.println(payload.getSubject());
        } catch (JwtException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Claims verifyJws(String jwt) {

        return Jwts.parser()
                .verifyWith(generateKey())
                .build()
                .parseSignedClaims(jwt)
                .getPayload();
    }

    private static String buildJws(Map<String, Object> extraClaims) {
        Date issuedAt = new Date(System.currentTimeMillis());
        Date expiration = new Date(issuedAt.getTime() + (EXPIRATION_IN_MINUTES * 60 * 1000));

        String jwt = Jwts.builder()
            .header()
                .type("JWT")
                .and()
                .subject("ldiaz")
                .expiration(expiration)
                .issuedAt(issuedAt)
                .claims(extraClaims)
                .signWith(generateKey(), Jwts.SIG.HS256)
                .compact();
        return jwt;
    }

    private static Map<String, Object> builExtraClaims() {
        Map<String, Object> extraClaims = new HashMap<>();
        extraClaims.put("name", "luis diaz");
        return extraClaims;
    }

    private static SecretKey generateKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

}