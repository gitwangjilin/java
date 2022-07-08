package com.example.signtest.controller;

import com.cntrust.phpkijni.PHPkiComm;
import com.framework.core.pki.algo.HashAlgo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*************************************************************************
 ******
 * - Copyright (c) 2021 shangzhao.com
 * - File Name: SignTest
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2021/12/28   WangJiLin     Create the current class
 *************************************************************************
 ******/
@RestController
@RequestMapping
public class SignTest {
    @GetMapping("sign1")
    public boolean verify() {
        BASE64Decoder decoder = new BASE64Decoder();

//        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        String dataStr = "{\"appCode\":\"oJYBI415IFdWVYW68I4DQ5bBylmY\",\"appId\":\"105\",\"areaCode\":\"110000\",\"attribute13\":\"91110108MA01XJYF95\",\"attribute18\":\"北京鱼群科技有限公司\",\"auth_content\":null,\"auth_idcard\":null,\"auth_name\":null,\"auth_phonenum\":null,\"auth_term\":null,\"licenceEntity\":\"MIID6DCCA42gAwIBAgIQEQAAICESKBAZNwAAAAEVRzAKBggqgRzPVQGDdTA2MTQwMgYDVQQKDCvlm73lrrbluILlnLrnm5HnnaPnrqHnkIbmgLvlsYDkv6Hmga/kuK3lv4MgMB4XDTIxMTIyODAyMTkzN1oXDTI2MTIyODAyMTkzN1owXzELMAkGA1UEBhMCQ04xJzAlBgNVBAoMHuWMl+S6rOmxvOe+pOenkeaKgOaciemZkOWFrOWPuDEnMCUGA1UEAwwe5YyX5Lqs6bG8576k56eR5oqA5pyJ6ZmQ5YWs5Y+4MFkwEwYHKoZIzj0CAQYIKoEcz1UBgi0DQgAE7KSVgvNcqz+2hxbG005JvdfS186+jnetbDgar8oPHwjCpwRaIvs0PHbzkm/81fGLUygojLjIgkxmHX932N8p26OCAlIwggJOMBsGBQYDiBANBBI5MTExMDEwOE1BMDFYSllGOTUwJwYFBgOIEBIEHuWMl+S6rOmxvOe+pOenkeaKgOaciemZkOWFrOWPuDAbBgUGA4gQEwQS55S15a2Q6JCl5Lia5omn54WnMA8GBQYDiBAUBAbmnY7mmIYwEwYFBgOIEBkECjIwMDDkuIflhYMwGwYFBgOIEB0EEua1i+ivleS9j+aJgOWcsOWdgDAaBgUGA4gQIQQRMjAyMeW5tDEy5pyIMDjml6UwDwYFBgOIECYEBumVv+acnzBPBgUGA4gQJwRG5LyB5Lia5L6d5rOV6Ieq5Li76YCJ5oup57uP6JCl6aG555uu77yM5byA5bGV57uP6JCl5rS75YqoLee7j+iQpeiMg+WbtDAeBgUGA4gQKgQV5bel5ZWG6KGM5pS/566h55CG5bGAMBkGBQYDiBArBBAyMDIw5bm0OeaciDE35pelMDMGBQYDiBAsBCpodHRwOi8vZ3VvamlhZ29uZ3MvcHVibGljL2dzZ3Mvc2VydmljZS5nb3YwJwYFBgOIEC0EHuWbveWutuW4guWcuuebkeedo+euoeeQhuaAu+WxgDANBgUGA4gQLgQEVjIuMDAbBgUGA4gQMQQS5aSW5Zu95LyB5Lia5ZCN56ewMBsGBQYDiBAyBBLlpJblm73kvIHkuJrkvY/miYAwCgYFBgOIEFoEAUEwCgYFBgOIEFsEATEwDwYFBgOIEF0EBjExMDAwMDAPBgUGA4gQOgQG5p2o55GeMAwGBQYDiBAzBAMxLjAwCgYIKoEcz1UBg3UDSQAwRgIhAIueX1BslqAuk6qlMwdEFVVxbgoKrgPrpclQVS1eyFClAiEAkoVcA9EsSWrO05ynLj6xtkABB8GqiIhLj7V076k7BNQ=\",\"licencesn\":\"11000020211228101937000000011547\",\"oper\":\"杨瑞\",\"operFlag\":\"0\",\"opertime\":\"1640658097000\",\"opertype\":\"1\",\"qrtype\":\"1405\",\"signEntity\":null,\"state\":\"1\",\"token\":\"110001U1000661405101100122810213641099237CAFAD2\"}";
        String sign = "MEYCIQCZK1bI9q5sRxEHQ7mU6HMJ+ZNutWb8ZKJX9hyidoYdnQIhAPB06scEUlXw9nLIk5qb0sFM0ceIU7lj+hPOw5OcO8hh";
        System.out.println("sign: " + sign);
        byte[] decode = new byte[0];
        try {
            decode = decoder.decodeBuffer(sign);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bytes = SignFormatter.std2ph(decode);
        System.out.println("signbytes: " + bytes);
        System.out.println("signString: " + encoder.encodeToString(bytes));
        String cert = "MIIBiTCCATCgAwIBAgIIIBkSGQAAAEYwCgYIKoEcz1UBg3UwKTEnMCUGA1UECgwe5Zu95a625bel5ZWG6KGM5pS/566h55CG5oC75bGAMCAXDTE5MTIxOTA4MTcxNFoYDzIwNjEwODE5MDgxNzE0WjBMMRswGQYDVQQDDBJTQUlDX0FVVEhFTl8xMDAwMDAxDzANBgNVBAcMBuWMl+S6rDEPMA0GA1UECAwG5YyX5LqsMQswCQYDVQQGDAJDTjBZMBMGByqGSM49AgEGCCqBHM9VAYItA0IABJBmd4R3+LoANoNaiX0f9jsKgHLQ9WCz826I7RLph+t/ko23UP5L6PCON0AerfiqXhgh1OnmfDrNSbez29xFy6SjHTAbMAwGA1UdEwQFMAMBAf8wCwYDVR0PBAQDAgEGMAoGCCqBHM9VAYN1A0cAMEQCICxm8e+PS9YrAb/7po6DwSMwIHmMuyC7CWxyrDmo4LOaAiBdaxmw/B8km+9xybN35+7+KrjmIV3qDWK2nFCQiHOUNQ==";
        PHPkiComm comm = new PHPkiComm();
        try {
            comm = new PHPkiComm();
            comm.init("libph_sdf.so");
//            BASE64Decoder decoder = new BASE64Decoder();
            boolean isPass = comm.verifySign(cert, dataStr.getBytes(StandardCharsets.UTF_8),
                    bytes, HashAlgo.hashAlgo.sm3);
            return isPass;
        } catch (Exception e) {
        } finally {
            try {
                comm.release();
            } catch (Exception e) {
            }
        }
        return false;
    }

    @GetMapping("sign2")
    public boolean sign2() {
//        final Base64.Decoder decoder = Base64.getDecoder();
//        final Base64.Encoder encoder = Base64.getEncoder();
        String dataStr = "{\"qrid\":\"11000OA100137110116010012220925112224821F73E316\",\"sys_url\":\"https://ec.95306.cn/authenticationService/appserver.do\"}";
        String sign = "MEQCHyjXQR3N0kHGpzby5X8RD/D7F5mYLfMvU2kS4cVMPZMCIQDqUdqHIH4sz7gOHcBopfOb6jl2oGqU+p4M/t8m+27NFA==";
        System.out.println("sign: " + sign);
//        byte[] decode = decoder.decode(sign);
//        byte[] bytes = SignFormatter.std2ph(decode);
//        System.out.println("signbytes: " + bytes);
//        System.out.println("signString: " + encoder.encodeToString(bytes));
        String cert = "MIIBzjCCAXSgAwIBAgIKEQEAICEGAxYICDAKBggqgRzPVQGDdTA2MQswCQYDVQQGEwJDTjEnMCUGA1UEAwwe55S15a2Q6JCl5Lia5omn54Wn566h55CG57O757ufMB4XDTIxMDYwMzE2MDgwOFoXDTI2MDYwMzE2MDgwOFowUTESMBAGA1UEBwwJ5YyX5Lqs5biCMRIwEAYDVQQIDAnljJfkuqzluIIxGjAYBgNVBAMMEVNBSUNfRlJPTlRfMTAwMTM3MQswCQYDVQQGEwJDTjBZMBMGByqGSM49AgEGCCqBHM9VAYItA0IABB7UIrE2nbL72ecYaJ5ib1WqQFAwc5mR3d/0BVPmz71QYEnDLKm3j1Eb2C16oHJAgCypkb+gwLa2lSqxVH0catajTzBNMB0GA1UdDgQWBBSw779fkO6h8uNk7NQcsd6ZWrzfAzAfBgNVHSMEGDAWgBT0z3ajiyllSwL6iZID7jPBxb/AmTALBgNVHQ8EBAMCAaIwCgYIKoEcz1UBg3UDSAAwRQIhAJgwCfghsoS8YujT2USX7/Pw4IyjP7XFBRFwfOztgI0HAiAUCDgw7h0sUtJdar/GVq5dXAFy63xxVSjQ/fh+i2jlAw==";
        PHPkiComm comm = new PHPkiComm();
        try {
            comm = new PHPkiComm();
            comm.init("libph_sdf.so");
            BASE64Decoder decoder = new BASE64Decoder();
            boolean isPass = comm.verifySign(cert, dataStr.getBytes(StandardCharsets.UTF_8),
                    decoder.decodeBuffer(sign), HashAlgo.hashAlgo.sm3);
            return isPass;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                comm.release();
            } catch (Exception e) {
            }
        }
        return false;
    }

    @GetMapping("sign3")
    public boolean sign3() {
        final Base64.Decoder decoder = Base64.getDecoder();
        final Base64.Encoder encoder = Base64.getEncoder();
        String dataStr = "{\"qrid\":\"11000OA100137110116010012220925112224821F73E316\",\"sys_url\":\"https://ec.95306.cn/authenticationService/appserver.do\"}";
        String sign = "MEQCHyjXQR3N0kHGpzby5X8RD/D7F5mYLfMvU2kS4cVMPZMCIQDqUdqHIH4sz7gOHcBopfOb6jl2oGqU+p4M/t8m+27NFA==";
        System.out.println("sign: " + sign);
        byte[] decode = decoder.decode(sign);
        byte[] bytes = SignFormatter.std2ph(decode);
        System.out.println("signbytes: " + bytes);
        System.out.println("signString: " + encoder.encodeToString(bytes));
        String cert = "MIIBzjCCAXSgAwIBAgIKEQEAICEGAxYICDAKBggqgRzPVQGDdTA2MQswCQYDVQQGEwJDTjEnMCUGA1UEAwwe55S15a2Q6JCl5Lia5omn54Wn566h55CG57O757ufMB4XDTIxMDYwMzE2MDgwOFoXDTI2MDYwMzE2MDgwOFowUTESMBAGA1UEBwwJ5YyX5Lqs5biCMRIwEAYDVQQIDAnljJfkuqzluIIxGjAYBgNVBAMMEVNBSUNfRlJPTlRfMTAwMTM3MQswCQYDVQQGEwJDTjBZMBMGByqGSM49AgEGCCqBHM9VAYItA0IABB7UIrE2nbL72ecYaJ5ib1WqQFAwc5mR3d/0BVPmz71QYEnDLKm3j1Eb2C16oHJAgCypkb+gwLa2lSqxVH0catajTzBNMB0GA1UdDgQWBBSw779fkO6h8uNk7NQcsd6ZWrzfAzAfBgNVHSMEGDAWgBT0z3ajiyllSwL6iZID7jPBxb/AmTALBgNVHQ8EBAMCAaIwCgYIKoEcz1UBg3UDSAAwRQIhAJgwCfghsoS8YujT2USX7/Pw4IyjP7XFBRFwfOztgI0HAiAUCDgw7h0sUtJdar/GVq5dXAFy63xxVSjQ/fh+i2jlAw==";
        PHPkiComm comm = new PHPkiComm();
        try {
            comm = new PHPkiComm();
            comm.init("libph_sdf.so");
//            BASE64Decoder decoder = new BASE64Decoder();
            boolean isPass = comm.verifySign(cert, dataStr.getBytes(StandardCharsets.UTF_8),
                    bytes, HashAlgo.hashAlgo.sm3);
            return isPass;
        } catch (Exception e) {
        } finally {
            try {
                comm.release();
            } catch (Exception e) {
            }
        }
        return false;
    }


}